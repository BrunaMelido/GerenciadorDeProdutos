using api.aliexpress.Adapters.Inbound.HTTP;
using api.aliexpress.Service.Configuration;


var builder = WebApplication.CreateBuilder(args);

builder.Services.ConfigureServices(builder.Configuration);
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();



var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}
app.UseHttpsRedirection();
HttpService.AddHttpRoute(app);

app.Run();