<?php

function controleEstoque($produtos){
    //Produto mais caro
    arsort($produtos); //ordenando os produtos do mais caro para o mais barato com base no valor
    $nomeCaroProd = array_key_first($produtos); //pegando nome da primeira chave
    $valCaroProd = $produtos[$nomeCaroProd]; //pegando o valor da primeira chave

    //Produto mais barato    
    $nomeBaratoProd = array_key_last($produtos);
    $valBaratoProd = $produtos[$nomeBaratoProd];

    //Valor total do estoque
    $totalEstoque = array_sum($produtos);

    //Média de preço dos produtos
    $mediaPreco = $totalEstoque / count($produtos);

    return [ 
        "Produto mais caro: $nomeCaroProd (R$ $valCaroProd)\n",
        "Produto mais barato: $nomeBaratoProd (R$ $valBaratoProd)\n",
        "Valor total do estoque: R$ $totalEstoque\n",
        "Preço médio dos produtos: R$ $mediaPreco"
    ];
}

$produtos = [
    "Notebook" => 3500,
    "Mouse" => 80,
    "Teclado" => 120,
    "Monitor" => 900,
    "Impressora" => 750
];

$retorno = controleEstoque($produtos);
echo implode("", $retorno);

?>