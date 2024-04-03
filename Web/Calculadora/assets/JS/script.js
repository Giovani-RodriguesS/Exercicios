//  Var
const result = document.querySelector('.result');
const botton = document.querySelector('.buttons button');

//  stack
let numbers_stack = []
let operator_stack =[]
let number_complete = false
let count = 1;
result.value = ''


//  Functions
function clearDisplay () {
    result.innerText = '0'
    result.value = '';
    count = 1
    number_complete = false

}

function bottonNum (num) {
    if(number_complete)
        clearDisplay();
    if(count < 10)
    if (!(result.value == '0' && num == '0') && (num != ',' || result.value.indexOf(",") < 0))   
        if(result.value == '0' && num != ",")
            result.innerText =  result.value = num;
        else
            result.innerText =  result.value += num;
        count++
}

function calculate () {
    addNumberToStack();
    let result=0;
    
    while (operator_stack.length()>0) {
        result = partCalc();
        addResultToStack(result);
    } 
    alert(result);
    result.innerText = result.valueOf = resultOfCalc;
}

function partCalc () {
    let n2 = numbers_stack.pop();
    let n1 = numbers_stack.pop();
    let op = operator_stack.pop();
    let resultOfCalc = eval(n1 + op + n2)
    return resultOfCalc;
       
}

function addNumberToStack(){
    number_complete = true;
    numbers_stack.push(result.value);
}

function operator (value) {
    if(!number_complete) {
        addNumberToStack()
        while (operator_stack.length() > 0 && !precedence(topOfOperartorStack(), value)){
            let resultOfCalc = partCalc();
            addResultToStack(resultOfCalc);
        }
    } 
    else {
        operator_stack.pop()
    }
    addOperatorToStack(value)
    alert(operator_stack)
}

function addOperatorToStack(value) {
    operator_stack.push(value);
}

function precedence() {
    let operators = new Map([
        ['+',1],
        ['-',1],
        ['/',2],
        ['*',2],
        ['(',3],
        [')',3]
    ])
    return operators.get(op2) > operators.get(op1) 
}
function topOfOperartorStack() {
    return operator_stack[operator_stack.length-1]
}

//adiciona na pilha o numero
function addResultToStack(number) {
    numbers_stack.push(number)
}
