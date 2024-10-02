const sum = (a, b) => a+b
const sub = (a, b) => a-b
const mult = (a, b) => a*b
const div = (a, b) => a/b

function calcular(op) {
    const n1 = parseFloat(document.getElementById("n1").value)
    const n2 = parseFloat(document.getElementById("n2").value)
    const result = document.getElementById("result")

    if(isNaN(n1) ||isNaN(n2)) {
        result.innerHTML = "Valores não válidos"
        return;
    }
    const res = op(n1, n2)
    result.innerHTML = res
}

