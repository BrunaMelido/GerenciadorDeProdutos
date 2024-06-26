﻿using Domain.Core.Base;
using System.Net;

public record BaseReturn
{
    public object? Body;
    public BaseError? Error;
    public HttpStatusCode StatusCode = HttpStatusCode.OK;

    public BaseReturn()
    {

    }

    public void HttpSuccess<TBody>(TBody successObject)
    {
        Body = successObject;
    }


    public BaseReturn Success(object successObject)
    {
        Body = successObject;

        return this;
    }


    public BaseReturn ErrorBussiness(string message)
    {
        StatusCode = HttpStatusCode.BadRequest;

        Error = new()
        {
            code = "400",
            message = $"{message}",
        };

        return this;
    }
    public BaseReturn ErrorSystem(Exception ex)
    {
        StatusCode = HttpStatusCode.InternalServerError;

        Error = new()
        {
            code = "500",
            message = $"System Error: {ex.Message}",
            info = ex.StackTrace,
        };

        return this;
    }

    public object? GetBody()
    {
        if (StatusCode is HttpStatusCode.OK) return Body;
        return Error;
    }

    public IResult GetResponse()
    {
        if (StatusCode is HttpStatusCode.OK) return Results.Ok(Body);
        return Results.Json(Error, statusCode: (int)StatusCode);
    }
}