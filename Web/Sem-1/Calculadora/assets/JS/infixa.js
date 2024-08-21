
//Bloco de escolha da função da calculadora
const infixa = document.getElementById('infixa')
const posfixa = document.getElementById('posfixa')
//Ouve as mudanças da radio
infixa.addEventListener('change', alter)
posfixa.addEventListener('change', alter)


function alter() {
    if(infixa.checked)
    {
        document.getElementById('especialBt').innerText = "()"
        document.getElementById('especialBt').value = "()"
    }
    else
    {   
        document.getElementById('especialBt').innerText = "Enter"
        document.getElementById('especialBt').value = ""
    }
}

    //  Var 
const result = document.querySelector('.result');
const subResult = document.querySelector('.subResult');


//  stacks
let numbers_stack = []
let operator_stack =[]
let number_complete = false
let historicy = ''
let count = 1;
result.value = '0'
subResult.value = ''

//  Functions

// clear display
function clearDisplay (arg) {
    if(arg == 'a') {  // limpa o subdisplay quando pressionado o botao C
       subResult.value = ''
       subResult.innerText = ''
    }
    // limpa e zero o value do result
result.innerText = '0' 
result.value = '0';
count = 1
number_complete = false

}
// botton
function bottonNum (num) {
    // limpa a tela para digitar outro numero
    if(number_complete)
        clearDisplay();
    
        // Limita o numero de algarismos
        if(count < 11){
   
        // Validações de subResult 
    if (!(result.value == '0' && num == '0') && (num != '.' || result.value.indexOf(".") < 0))   // deter 0 a esquerda e permitir apenas um .
        if(result.value == '0' && num != ".") //  permitir apenas um . 
            result.innerText =  result.value = num;
        else
            result.innerText =  result.value += num;
        count++
        
        // Validações de subResult
        if(num == '.' && subResult.value=='')
            subResult.value = subResult.innerText = '0'+num
        else if((num != '.' || subResult.value.indexOf(".") < 0)) // deter zero*
                subResult.value = subResult.innerText += num
    }
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
        historicy = result.value
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
            historicy = subResult.value
            addNumberToStack()
            while (operator_stack.length > 0 && !precedence(topOfOperatorStack(), value)){
                let resultOfCalc = partCalc();
                addResultToStack(resultOfCalc);
                result.innerText = resultOfCalc

            }
        } else{
            subResult.value = subResult.innerText = ''
            subResult.value = historicy
            operator_stack.pop(value)
        }
        addOperatorToStack(value)
        subResult.innerText = subResult.value += value
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