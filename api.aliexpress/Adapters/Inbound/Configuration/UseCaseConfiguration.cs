using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using aliexpress.Domain.UseCases;

namespace api.aliexpress.Adapters.Inbound.Configuration
{
    public static class UseCaseConfiguration
    {
        public static IServiceCollection AddUseCases(this IServiceCollection services)
        {
            services.AddSingleton<IUseCaseRegisterProduct, UseCaseRegisterProduct>();
            services.AddSingleton<IUseCaseSearchProduct, UseCaseSearchProduct>();
            services.AddSingleton<IUseCaseUpdateProduct, UseCaseUpdateProduct>();


            return services;
        }
    }
}
