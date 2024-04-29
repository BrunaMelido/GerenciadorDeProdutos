using aliexpress.Domain.Core.Ports.Outbound.DBAdapter;
using api.aliexpress.Adapters.Outbound.DBAdapter.Postgres;

namespace api.aliexpress.Adapters.Outbound.DBAdapter.Configuration
{
    public static class DBConfiguration
    {
        public static IServiceCollection AddDataBase(this IServiceCollection services)
        {
            services.AddSingleton<IDBConnection, PostgresConnection>();
            services.AddSingleton<IDBARepository, PostgresRepository>();
            return services;
        }
    }
}
