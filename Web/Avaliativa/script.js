// estilos na Main
var main = document.querySelector('main')
main.style.display = "flex";
main.style.flexDirection = "column";
main.style.alignItems = "center";
main.style.marginTop = "50px";

// variaveis inputs e tabela
var caixa1 = document.querySelector('#caixa1')
var caixa2 = document.querySelector('#caixa2')
var caixa3 = document.querySelector('#caixa3')
var elementosCriados = document.querySelector('#elementosCriados');
var table = document.querySelector('table');

// colunas
var coluna1 = document.querySelector('#coluna1');
var coluna2 = document.querySelector('#coluna2');
var coluna3 = document.querySelector('#coluna3');

var i,j,k
i=1
j=1
k=1

coluna1.style.border = "1px solid #000"
coluna2.style.border = "1px solid #000"
coluna3.style.border = "1px solid #000"

// estilos tabela
table.style.display = "flex"
table.style.backgroundColor = "#f0f0f0"
table.style.border = "2px solid #000"
table.style.backgroundColor = "#f0f0f0"
table.style.height = "100%"
table.style.width = "100%"
table.style.justifyContent = "center"
table.style.padding = "20px"
// estilos div elementos
elementosCriados.style.height = "100px"
elementosCriados.style.padding = "20px"

valor = document.getElementById(editar_remover).value

function remover () {
    coluna1.removeChild("tr")
    coluna2.removeChild("tr")
    coluna3.removeChild("tr")
}

function addElemento() {
    
    var novaCaixa = document.createElement("tr");

    if(caixa1.value != ''){
            
            novaCaixa.innerHTML = caixa1.value
            novaCaixa.style.border = "1px solid #000"
            novaCaixa.style.backgroundColor = "#fff"
            novaCaixa.style.textAlign = "center"
            novaCaixa.id = i
            coluna1.appendChild(novaCaixa)
            i++
    }

    if(caixa2.value != '' ){
            
            novaCaixa.innerHTML = caixa2.value
            novaCaixa.style.border = "1px solid #000"
            novaCaixa.style.backgroundColor = "#fff"
            novaCaixa.style.textAlign = "center"
            novaCaixa.id = j
            coluna2.appendChild(novaCaixa)
            j++
    }

    if(caixa3.value != '' ){
            
            novaCaixa.innerHTML = caixa3.value
            novaCaixa.style.border = "1px solid #000"
            novaCaixa.style.backgroundColor = "#fff"
            novaCaixa.style.textAlign = "center"
            novaCaixa.id = k
            coluna3.appendChild(novaCaixa)
            k++
    }
    caixa1.value = ""
    caixa2.value = ""
    caixa3.value = ""
        //alert(novaCaixa.value)
   //elementosCriados.appendChild(novaCaixa)
}
