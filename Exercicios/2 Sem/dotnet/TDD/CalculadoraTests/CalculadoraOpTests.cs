using desafio_tdd.Services;
namespace CalculadoraTests;

public class CalculadoraOpTests
{
    //Instancia da classe CalculadoraOp (implementacao da calculadora)
    CalculadoraOp _calc = new CalculadoraOp();

    [Theory]
    [InlineData(2,3,5)]
    [InlineData(2,1,3)]
    public void SomaDeveFuncionar(int num1, int num2, int num3)
    {
        //Arrange
        //Act
        var resultado = _calc.Somar(num1, num2);
        //Assert
        Assert.Equal(num3, resultado);
    }

    [Theory]
    [InlineData(2,3,-1)]
    [InlineData(2,1,1)]
    public void SubtracaoDeveFuncionar(int num1, int num2, int num3)
    {
        //Arrange
        //Act
        var resultado = _calc.Subtracao(num1, num2);
        //Assert
        Assert.Equal(num3, resultado);
    }

    [Theory]
    [InlineData(2,3,6)]
    [InlineData(3,1,3)]
    public void MultiplicacaoDeveFuncionar(int num1, int num2, int num3)
    {
        //Act
        var resultado = _calc.Multiplicao(num1, num2);
        //Assert
        Assert.Equal(num3, resultado);
    }

    [Theory]
    [InlineData(10,2,5)]
    [InlineData(2,1,2)]
    public void DivisaoDeveFuncionar(int num1, int num2, int num3)
    {
        //Act
        var resultado = _calc.Divisao(num1, num2);
        //Assert
        Assert.Equal(num3, resultado);
    }

    [Fact]
    public void ListaDeveEstarVazia ()
    {
        var resultado = _calc.historicoResultados();
        Assert.Empty(resultado);    
    }
}