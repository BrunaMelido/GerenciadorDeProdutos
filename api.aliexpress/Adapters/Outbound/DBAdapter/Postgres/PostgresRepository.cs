using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Outbound.DBAdapter;
using Npgsql;

namespace api.aliexpress.Adapters.Outbound.DBAdapter.Postgres
{
    public class PostgresRepository : IDBARepository
    {
        private readonly IDBConnection _IDBConnection;
        private readonly NpgsqlConnection _connection;

        public PostgresRepository(IServiceProvider provider) 
        {
            _IDBConnection = provider.GetRequiredService<IDBConnection>();
            _connection = _IDBConnection.getConnection();
        }
        public async Task<BaseReturn> RegisterProduct(ProductTransaction product)
        {
            try{

                using NpgsqlCommand cmd = new NpgsqlCommand("CALL sp_registerProduct(ptxturl := 'value1',ptxtname:= 'value2',ptxtsku:= 'value3',ptxtprice:= 'value4'," +
                                                            "ptxtsize:= 'value5',ptxtbrand:= 'value6',ptxtDescription:= 'value7',ptxtimages:= 'value8'", _connection);
                cmd.Parameters.AddWithValue("value1", product.Url);
                cmd.Parameters.AddWithValue("value2", product.Name);
                cmd.Parameters.AddWithValue("value3", product.Sku);
                cmd.Parameters.AddWithValue("value4", product.Price);
                cmd.Parameters.AddWithValue("value5", product.Size);
                cmd.Parameters.AddWithValue("value6", product.Brand);
                cmd.Parameters.AddWithValue("value7", product.Description);
                cmd.Parameters.AddWithValue("value8", product.Images);

                int rowsAffected = cmd.ExecuteNonQuery();

                return new BaseReturn().Success(rowsAffected);

            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex);
            }
        }

        public async Task<BaseReturn> SearchProduct(ProductTransaction product)
        {
            try
            {

                using NpgsqlCommand cmd = new NpgsqlCommand("SELECT * FROM fn_searchProduct('value1');", _connection);
                cmd.Parameters.AddWithValue("value1", product.Sku);

                using NpgsqlDataReader reader = cmd.ExecuteReader();
                reader.Read();

                ProductTransaction response = new ProductTransaction
                {
                    Sku = reader["sku"].ToString(),
                    Url = reader["url"].ToString(),
                    Name = reader["product_name"].ToString(),
                    Price = reader["price"].ToString(),
                    Size = reader["product_size"].ToString(),
                    Brand = reader["brand"].ToString(),
                    Description = reader["description"].ToString(),
                    Images = reader["images"].ToString()

                };

                return new BaseReturn().Success(response);

            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex);
            }
        }

        public async Task<BaseReturn> UpdateProduct(ProductTransaction product)
        {
            try
            {

                using NpgsqlCommand cmd = new NpgsqlCommand("SELECT * FROM fn_updateProduct('value1','value2','value3','value4','value5','value6','value7','value8');", _connection);
                cmd.Parameters.AddWithValue("value1", product.Sku);
                cmd.Parameters.AddWithValue("value2", product.Url);
                cmd.Parameters.AddWithValue("value3", product.Name);
                cmd.Parameters.AddWithValue("value4", product.Price);
                cmd.Parameters.AddWithValue("value5", product.Size);
                cmd.Parameters.AddWithValue("value6", product.Brand);
                cmd.Parameters.AddWithValue("value7", product.Description);
                cmd.Parameters.AddWithValue("value8", product.Images);

                using NpgsqlDataReader reader = cmd.ExecuteReader();
                reader.Read();

                ProductTransaction response = new ProductTransaction
                {
                    Sku = reader["sku"].ToString(),
                    Url = reader["url"].ToString(),
                    Name = reader["product_name"].ToString(),
                    Price = reader["price"].ToString(),
                    Size = reader["product_size"].ToString(),
                    Brand = reader["brand"].ToString(),
                    Description = reader["description"].ToString(),
                    Images = reader["images"].ToString()

                };

                return new BaseReturn().Success(response);

            }
            catch (Exception ex)
            {
                return new BaseReturn().ErrorSystem(ex);
            }
        }
    }
}