//  Var
const result = document.querySelector('.result');
const subResult = document.querySelector('.subResult');

//  stacks
let numbers_stack = []
let operator_stack =[]
let number_complete = false
let count = 1;
result.value = '0'

//  Functions

// clear display
function clearDisplay () {
    result.innerText = '0'
    result.value = '0';
    count = 1
    number_complete = false
}
    subResult.innerText = ''

// botton
function bottonNum (num) {
    if(number_complete)
        clearDisplay();
    if(count < 11)
    
    if (!(result.value == '0' && num == '0') && (num != '.' || result.value.indexOf(".") < 0))   // deter 0 a esquerda e permitir apenas um .
        if(result.value == '0' && num != ".") //  permitir apenas um . 
            result.innerText =  result.value = num;
        else
            result.innerText =  result.value += num;
        count++
        subResult.innerText += num
}

// calculate
function calculate () {
    addNumberToStack();
    let resultOfCalc=0
    while (operator_stack.length>0) {
        resultOfCalc = partCalc();
        addResultToStack(resultOfCalc);
    } 
    result.innerText = result.value = resultOfCalc;
}

// PartialCalculate
function partCalc () {
    let n2 = numbers_stack.pop();
    let n1 = numbers_stack.pop();
    let op = operator_stack.pop();
    let resultOfCalc = eval(n1 + op + n2)
    return resultOfCalc;
}

// Add number to number_stack
function addNumberToStack(){
    number_complete = true;
    numbers_stack.push(result.value);
}

// 
function operator (value) {
    if(!number_complete) {
        addNumberToStack()
        while (operator_stack.length > 0 && !precedence(topOfOperatorStack(), value)){
            let resultOfCalc = partCalc();
            addResultToStack(resultOfCalc);
            result.innerText = resultOfCalc
        }
    } else
        operator_stack.pop(value)
    addOperatorToStack(value)
    subResult.innerText += value
}

// add operator to operator_stack
function addOperatorToStack(value) {
    operator_stack.push(value);
}

// precedence
function precedence(op1, op2) {
    let operators = new Map([
        ['+',1],
        ['-',1],
        ['/',2],
        ['*',2],
        ['**',3],
        ['(',3],
        [')',3]
    ])
    return operators.get(op2) > operators.get(op1) 
}

// top of operator_stack
function topOfOperatorStack() {
    return operator_stack[operator_stack.length-1]
}

//add result of calculate to numbers_stack
function addResultToStack(number) {
    numbers_stack.push(number)
}
