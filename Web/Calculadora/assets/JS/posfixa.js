// pos-fixa obs: os operadores vem depois dos numeros nessa notação
//ex: 1,"3,2,*",-,"4,2,/",+
// "1,6,-",2,+
//-5,2,+ = -3;

//  escopo vars
const result = document.querySelector('.result');
let  stackNumber = []
let stackOperator = []
let count = 1;
result.value = 0

// calculate

function enter () {
    stackNumber.push(result.value);
    clearDisplay();
}
function clearDisplay () {
    result.innerText = result.value = 0
    count = 1;
}

function partCalc () {
    let n2 = stackNumber.pop();
    let n1 = stackNumber.pop();
    let op = stackOperator.pop();
    let resultOfCalc = eval(n1 + op + n2)
    return resultOfCalc;
}
function operator (value) {
    stackOperator.push(value)
        if (stackNumber.length >= 2)
        {
            let resultOfCalc = partCalc();
            stackNumber.push(resultOfCalc);
            result.innerText = resultOfCalc
        }
}
function bottonNum (num) {
    if(count < 11)
    if (!(result.value == '0' && num == '0') && (num != '.' || result.value.indexOf(".") < 0))   // deter 0 a esquerda e permitir apenas um .
        if(result.value == '0' && num != ".") //  permitir apenas um . 
            result.innerText =  result.value = num;
        else
            result.innerText =  result.value += num;
        count++
}