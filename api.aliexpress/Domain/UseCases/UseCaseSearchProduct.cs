
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;

namespace aliexpress.Domain.UseCases
{
    public class UseCaseSearchProduct : IUseCaseSearchProduct
    {
        public Task<BaseReturn> Execute(ProductTransaction product)
        {
            throw new NotImplementedException();
        }
    }
}
