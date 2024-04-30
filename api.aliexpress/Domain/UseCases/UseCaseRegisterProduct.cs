
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using aliexpress.Domain.Core.Ports.Outbound.DBAdapter;

namespace aliexpress.Domain.UseCases
{
    public class UseCaseRegisterProduct : IUseCaseRegisterProduct
    {
        private readonly IDBARepository _IDBRepository;
        public UseCaseRegisterProduct(IDBARepository dbRepository)
        {
            _IDBRepository = dbRepository;
        }
        public async Task<BaseReturn> Execute(ProductTransaction product)
        {
            try
            {
                var response = await _IDBRepository.RegisterProduct(product);
                return new BaseReturn().Success(response);
            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex);
            }
        }
    }
}
