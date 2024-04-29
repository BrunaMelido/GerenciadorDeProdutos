using api.aliexpress.Adapters.Inbound.Configuration;
using api.aliexpress.Adapters.Outbound.DBAdapter.Configuration;
using System.Runtime;

namespace api.aliexpress.Service.Configuration
{
    public static class ConfigurationService
    {
            public static IServiceCollection ConfigureServices(this IServiceCollection services, IConfiguration configuration)
            {
                /*#region APP SETTINGS

                AppSettings appSettings = new();
                configuration.GetSection("AppSettings").Bind(appSettings);
                services.Configure<DBSettings>(configuration.GetSection("Database"));

                #endregion
                */

                #region ADAPTERS

                services.AddDataBase();
                services.AddUseCases();

                #endregion

                return services;
            }
    }
}
