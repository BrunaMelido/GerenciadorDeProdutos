using aliexpress.Domain.Core.Ports.Outbound.DBAdapter;
using Npgsql;

namespace api.aliexpress.Adapters.Outbound.DBAdapter.Postgres
{
    public class PostgresConnection : IDBConnection
    {

        private readonly string _connectionString;
        private readonly string _port;
        private readonly string _database;
        private readonly string _usename;
        private readonly string _password;
        private NpgsqlConnection _connection;
        private bool _isConnect;

        public PostgresConnection()
        {
            _connectionString = "postgresql://database_owner:jQKFHORcLu31@ep-dawn-king-a5ozt85s.us-east-2.aws.neon.tech/database?sslmode=require";
            _connection = getConnection();
        }

        public NpgsqlConnection getConnection()
        {
            if (!_isConnect)
            {
                Connect();
            }
            return _connection;
        }

        private async void Connect()
        {
            try
            {
                _connection = new NpgsqlConnection(_connectionString);
                _connection.Open();
                _isConnect = true;
            }
            catch (Exception e)
            {
                throw new Exception(e.Message);
            }
        }
    }
}
