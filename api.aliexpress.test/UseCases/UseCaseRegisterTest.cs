
using aliexpress.Domain.Core.Models;
using aliexpress.Domain.Core.Ports.Inbound.UseCases;
using NSubstitute;
using System.Net;
using Moq;
using Xunit;


namespace api.aliexpress.test.UseCases
{
    public class UseCaseRegisterTest
    {
        private readonly IUseCaseRegisterProduct _UseCase;
        private ProductTransaction _product;
        public UseCaseRegisterTest(IUseCaseRegisterProduct useCase)
        {
            useCase = Substitute.For<IUseCaseRegisterProduct>();
        }


        [Fact(DisplayName = "Register product sucess")]
        public void RegisterProduct_Success()
        {
            #region ARRANGE
            _product = Substitute.For<ProductTransaction>();
            #endregion

            #region ACTION
            var response = _UseCase.Execute(_product).Result;
            #endregion

            #region ASSERT
            Assert.Equal(response.StatusCode, HttpStatusCode.OK);
            #endregion
        }

        [Fact(DisplayName = "Register product failed")]
        public void RegisterProduct_Error()
        {
            #region ARRANGE
            _product = Substitute.For<ProductTransaction>();
            #endregion

            #region ACTION
            var response = _UseCase.Execute(_product).Result;
            #endregion

            #region ASSERT
            Assert.Equal(response.StatusCode, HttpStatusCode.InternalServerError);
            #endregion
        }
    }
}