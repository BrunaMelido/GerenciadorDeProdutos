using aliexpress.Domain.Core.Models;
using api.aliexpress.Adapters.Inbound.HTTP.VM;

namespace api.aliexpress.Adapters.Inbound.HTTP.Mapping
{
    public class MappingRequestSearch
    {
        public static ProductTransaction toProduct(RequestSearch request)
        {
            return new ProductTransaction
            {
                Sku = request.Sku
            };
        }
    }
}
