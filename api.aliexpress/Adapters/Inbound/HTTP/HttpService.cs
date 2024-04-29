using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using api.aliexpress.Adapters.Inbound.HTTP.Mapping;
using api.aliexpress.Adapters.Inbound.HTTP.VM;

namespace api.aliexpress.Adapters.Inbound.HTTP
{
    public static class HttpService
    {
        public static void AddHttpRoute(this WebApplication app)
        {
            app.MapPost("/register", RegisterProduct);
            app.MapPost("/search", SearchProduct);
            app.MapPost("/update", UpdateProduct);
        }

        public async static Task<IResult> RegisterProduct(IUseCaseRegisterProduct _useCase, HttpContext context, RequestRegister request)
        {
            try
            {
                var response = await _useCase.Execute(MappingRequestRegister.toProduct(request));
                return response.GetResponse();
            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex).GetResponse();
            }
        }
        public async static Task<IResult> SearchProduct(IUseCaseSearchProduct _useCase, HttpContext context, RequestSearch request)
        {
            try
            {
                var response = await _useCase.Execute(MappingRequestSearch.toProduct(request));
                return response.GetResponse();
            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex).GetResponse();
            }
        }
        public async static Task<IResult> UpdateProduct(IUseCaseUpdateProduct _useCase, HttpContext context, RequestUpdate request)
        {
            try
            {
                var response = await _useCase.Execute(MappingRequestUpdate.toProduct(request));
                return response.GetResponse();
            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex).GetResponse();
            }
        }
    }
}
