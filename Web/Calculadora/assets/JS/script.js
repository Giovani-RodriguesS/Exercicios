const result = document.querySelector('.result');
const botton = document.querySelector('.buttons button');
const resultIn = result.innerText;
result.value = ''

function clearDisplay () {
    result.innerText = '0'
    result.value = '';
}
function bottonNum (num) {
    result.innerText =  result.value += num;
}
