document.getElementById('calcular').addEventListener('click', calcularInss);

function calcularInss() {

    const salarioBruto = parseFloat(document.getElementById('Salario_Bruto').value);
    const dependentes = parseInt(document.getElementById('Dependentes').value);

    const valorInss = calcularValorInss(salarioBruto);
    const valorIrrf = calcularValorIrrf(salarioBruto, dependentes, valorInss);
    const salarioLiquido = salarioBruto - valorInss - valorIrrf;

    document.getElementById('Valor_Inss').value = valorInss.toFixed(2)
    document.getElementById('Valor_Irrf').value = valorIrrf.toFixed(2);
    document.getElementById('Salario_Liquido').value = salarioLiquido.toFixed(2);
}

function calcularValorInss(salarioBruto) {
    let inss;

    if (salarioBruto <= 1320.00) {
        inss = salarioBruto * 0.075;
    } else if (salarioBruto <= 2571.29) {
        inss = 1320.00 * 0.075 + (salarioBruto - 1320.00) * 0.09;
    } else if (salarioBruto <= 3856.94) {
        inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (salarioBruto - 2571.29) * 0.12;
    } else if (salarioBruto <= 7507.49) {
        inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (salarioBruto - 3856.94) * 0.14;
    } else {
        inss = 1320.00 * 0.075 + (2571.29 - 1320.00) * 0.09 + (3856.94 - 2571.29) * 0.12 + (7507.49 - 3856.94) * 0.14;
    }

    return inss;
}

function calcularValorIrrf(salarioBruto, dependentes, inss) {
    const deducaoDependente = dependentes * 189.59;
    const baseCalculo = salarioBruto - inss - deducaoDependente;
    let irrf;

    if (baseCalculo <= 1903.98) {
        irrf = 0;
    } else if (baseCalculo <= 2826.65) {
        irrf = (baseCalculo - 1903.98) * 0.075 - 142.80;
    } else if (baseCalculo <= 3751.05) {
        irrf = (baseCalculo - 2826.65) * 0.15 - 354.80;
    } else if (baseCalculo <= 4664.68) {
        irrf = (baseCalculo - 3751.05) * 0.225 - 636.13;
    } else {
        irrf = (baseCalculo - 4664.68) * 0.275 - 869.36;
    }

    return irrf;
}
