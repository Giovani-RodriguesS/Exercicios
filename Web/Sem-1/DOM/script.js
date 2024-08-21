const texto = document.getElementsByTagName('p')
document.getElementsByTagName('button')

function alterar_texto () {
    document.querySelectorAll('p').innerHTML = "J QUERY"

    var novo = document.createElement("p");
    novo.textContent = "Novo paragrafo";
    novo.style.background = "#0f0f0f"
    novo.style.color = "#fff"
    novo.style.borderRadius = "6px"
    document.body.appendChild(novo)
    
    tabela = "<table><tr>"
    tabela += "<td>ID</td></tr></table>"
    
    var tabela = document.createElement("table");
    var linha1 = document.createElement("tr");
    var l1col1 = document.createElement("td");
    var l1col2 = document.createElement("td");
    var linha2 = document.createElement("tr");
    var l2col1 = document.createElement("td");
    var l2col2 = document.createElement("td");

    ntabela.appendChild(linha1);
  ntabela.appendChild(linha2);

  l1col1.style.border = "1px solid #000";
  l1col2.style.border = "1px solid #000";
  l2col1.style.border = "1px solid #000";
  l2col2.style.border = "1px solid #000";
  ntabela.style.border = "1px solid #000";

  document.body.appendChild(ntabela);


  var tabela  = "<table border='1'>";
      tabela +=  "<tr>";
      tabela +=   "<td>ID</td>";
      tabela +=   "<td>Name</td>";
      tabela +=  "</tr>";
      tabela +=  "<tr>";
      tabela +=   "<td>1</td>";
      tabela +=   "<td>Carlos Alberto</td>";
      tabela +=  "</tr>";
      tabela += "</table>";

  // tr = linha da tabela
  // td = célula
  var span = document.createElement("span");
  span.innerHTML = tabela;
  document.body.appendChild(span);

    
}
