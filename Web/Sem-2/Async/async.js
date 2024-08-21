
async function buscarEndereco () {
    const cep = document.getElementById("cep").value.trim();

    if(cep.length !== 8 || isNaN(cep)) {
        alert("Digite um CEP válido")
        return;
    }

    const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
    const dados = await resposta.json() 

    if (!resposta.ok) {
        throw new Error('Erro ao buscar o endereco.')
    }
    console.log(dados)
    document.getElementById('resultado').innerText = `Logradouro: ${dados.logradouro} \n Bairro: ${dados.bairro}`
   
}