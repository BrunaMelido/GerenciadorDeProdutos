
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using aliexpress.Domain.Core.Ports.Outbound.DBAdapter;

namespace aliexpress.Domain.UseCases
{ 
    public class UseCaseUpdateProduct : IUseCaseUpdateProduct
    {
        private readonly IDBARepository _IDBRepository;

        public UseCaseUpdateProduct(IDBARepository dbRepository)
        {
            _IDBRepository = dbRepository;
        }
        public async Task<BaseReturn> Execute(ProductTransaction product)
        {
            try
            {
                var response = await  _IDBRepository.UpdateProduct(product);
                return new BaseReturn().Success(response);
            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex);
            }
        }
    }
}
