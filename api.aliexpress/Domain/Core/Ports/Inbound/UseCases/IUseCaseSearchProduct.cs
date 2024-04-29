using aliexpress.Domain.Core.Models;

namespace aliexpress.Domain.Core.Ports.Inbound.UseCases
{
    public interface IUseCaseSearchProduct
    {
        public Task<BaseReturn> Execute(ProductTransaction product);
    }
}
