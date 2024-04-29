
using aliexpress.Domain.Core.Models;

namespace aliexpress.Domain.Core.Ports.Inbound.UseCases
{
    public interface IUseCaseRegisterProduct
    {
        public Task<BaseReturn> Execute(ProductTransaction product);
    }
}
