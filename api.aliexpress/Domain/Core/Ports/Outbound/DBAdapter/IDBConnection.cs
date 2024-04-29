using Npgsql;

namespace aliexpress.Domain.Core.Ports.Outbound.DBAdapter
{
    public interface IDBConnection
    {

        public NpgsqlConnection getConnection();
    }
}
