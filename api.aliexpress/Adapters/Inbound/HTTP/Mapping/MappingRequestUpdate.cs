using aliexpress.Domain.Core.Models;
using api.aliexpress.Adapters.Inbound.HTTP.VM;

namespace api.aliexpress.Adapters.Inbound.HTTP.Mapping
{
    public class MappingRequestUpdate
    {
        public static ProductTransaction toProduct(RequestUpdate request)
        {
            return new ProductTransaction
            {
                Url = request.Url,
                Brand = request.Brand,
                Description = request.Description,
                Images = request.Images,
                Name = request.Name,
                Price = request.Price,
                Size = request.Size,
                Sku = request.Sku
            };
        }
    }
}
