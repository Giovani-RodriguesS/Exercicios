const result = document.querySelector('.result');
const botton = document.querySelector('.buttons button');
const resultIn = result.innerText;
result.value = ''
let aux = 0;
let numbers_stack = []
let operator_stack =[]
let number_complete = false

if(number_complete)
    clearDisplay();

function clearDisplay () {
    result.innerText = '0'
    result.value = '';
}
function bottonNum (num) {
    result.innerText =  result.value += num;
}
function operator (operator) {
    if (operator == "+")
        result.value   
}
//result.value = eval(value)
//if(value != '.' || result.value.indexOf(".") < 0)
//    value = result.value + value;

function push(value) {

}
function pop() {

}
function partCalc () {
    let n2 = numbers_stack.pop();
    let n1 = numbers_stack.pop();
    let op = operator_stack.pop();
    let resultShow = eval()


}