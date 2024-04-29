using aliexpress.Domain.Core.Models;

namespace aliexpress.Domain.Core.Ports.Outbound.DBAdapter
{
    public interface IDBARepository
    {
        public Task<BaseReturn> RegisterProduct(ProductTransaction product);
        public Task<BaseReturn> SearchProduct(ProductTransaction product);
        public Task<BaseReturn> UpdateProduct(ProductTransaction product);
    }
}
