using System.Net;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using api.aliexpress.Domain.Core.Ports;


namespace api.aliexpress.test.UseCases
{
    [TestClass]
    public class UseCaseRegisterTest
    {
        private readonly IUseCaseRegisterProduct _UseCase;
        private ProductTransaction _product;
        [TestInicialize]
        public UseCaseRegisterTest(IUseCaseRegisterProduct useCase)
        {
            useCase = Substitute.For<IUseCaseRegisterProduct>();
        }

        [TestMethod]
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

        [TestMethod]
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