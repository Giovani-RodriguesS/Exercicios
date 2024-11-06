#!/bin/bash

# Lê a entrada do usuário
read -p "Digite o método HTTP (GET, POST, DELETE, PUT): " metodo

# Converte a entrada para maiúsculas para facilitar a comparação
metodo=${metodo^^}

# Usa case para decidir qual comando echo executar
case $metodo in
    "GET")
        curl -X GET 'http://localhost:5167/api/Products'
        ;;
    "POST")
        read -p "Id: " id
        read -p "name: " name
        read -p "quantity: " quantity
        read -p "category: " category
        curl -X POST 'http://localhost:5167/api/Products' -H 'Content-Type: application/json' -d ' { "id": '$((id+0))', "name": "$name", "quantity": '$((quantity+0))', "category": "$category", "price": 2.0 }'
        ;;
    "DELETE")
        read -p "ID: " id
        curl -X DELETE "http://localhost:5167/api/Products/$id"
        ;;
    "PUT")
        read -p "Id: " id
        read -p "name: " name
        read -p "quantity: " quantity
        read -p "category: " category
        curl -X PUT "http://localhost:5167/api/Products/$id" -H 'Content-Type: application/json' -d ' { "id": '$((id+0))', "name": "$name", "quantity": '$((quantity+0))', "category": "$category", "price": 2.0 }'

        ;;
    *)
        echo "Método inválido! Use GET, POST, DELETE ou PUT."
        ;;
esac

