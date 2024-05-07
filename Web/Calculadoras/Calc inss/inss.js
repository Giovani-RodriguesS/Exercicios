const salarioBruto = document.getElementById("Salario_Bruto");
const dependentes = document.getElementById("Dependentes");
const valorInss = document.getElementById("Valor_Inss");
const valorIrrf = document.getElementById("Valor_Irrf");
const salarioLiquido = document.getElementById("Salario_Liquido");
const calcular = document.getElementById("send");

function clear () { 
    salarioBruto.value = '';
    dependentes.value = ''; 
    valorInss.value = '';
    valorIrrf.value = '';
    salarioLiquido.value = '';
}

calcular.addEventListener("click", () => calcularValores())

function calcularValores () {
    alert(salarioBruto.value)
    clear()
}