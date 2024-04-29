
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using NSubstitute;
using System;

namespace api.aliexpress.test.UseCases
{
    public class UseCaseRegisterTest
    {
        private readonly IUseCaseRegisterProduct _UseCase;
        private ProductTransaction _product;
        public UseCaseRegisterTest(IUseCaseRegisterProduct useCase)
        {
            useCase = _UseCase;
        }
        [Fact(DisplayName = "Register product sucess")]
        public void RegisterProduct_Success()
        {
            _product = Substitute.For<ProductTransaction>();
            var response = _UseCase.Execute(_product);
        }
    }
}