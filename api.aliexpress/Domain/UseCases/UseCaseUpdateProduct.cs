
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;

namespace aliexpress.Domain.UseCases
{

    internal class UseCaseUpdateProduct : IUseCaseUpdateProduct
    {
        public Task<BaseReturn> Execute(ProductTransaction product)
        {
            throw new NotImplementedException();
        }
    }
}
