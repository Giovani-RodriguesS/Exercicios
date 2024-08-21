
async function buscarEndereco () {
    const cep = document.getElementById("cep").value.trim();

    if(cep.length !== 8 || isNaN(cep)) {
        alert("Digite um CEP válido")
        return;
    }


        const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);

        if (!resposta.ok) {
            throw new Error('Erro ao buscar o endereco.')
        }
        
        const dados = await resposta.json();
    
        document.getElementById('resultado').innerHTML = <p>`${dados.logradouro}`</p>

   
}