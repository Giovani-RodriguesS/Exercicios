let user = document.getElementById('user').value
let password = document.getElementById('password').value
const botao = document.querySelector('#send')

botao.addEventListener("click", (evento) => {
    evento.preventDefault()

    user = document.getElementById('user').value
    password = document.getElementById('password').value 

    window.location.assign("")

})