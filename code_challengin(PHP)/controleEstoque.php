<?php

function controleEstoque($estoque){
    //reordenando o array de estoque
    arsort($estoque);

    //pegando o produto com  a maior quantidade
    $maiorProduto = array_key_first($estoque);
    $maiorQtd = $estoque[$maiorProduto];

    //pegando o produto com  a menor quantidade
    $menorProduto = array_key_last($estoque);
    $menorQtd = $estoque[$menorProduto];

    //Quantidade total dos produtos
    $total = array_sum(array_values($estoque));

    //Média do estoque
    $media = $total / count($estoque);


    return [
        "Produto com maior quantide: $maiorProduto ($maiorQtd unidades)",
        "Produto com menor quantide: $menorProduto ($menorQtd unidades)",
        "Quantidade total em estoque: $total",
        "Média de itens por produto $media"
    ];
}

$estoque = [
    "Notebook" => 15,
    "Mouse" => 50,
    "Teclado" => 30,
    "Monitor" => 10,
    "Impressora" => 5
];

$retorno = controleEstoque($estoque);
echo implode("\n", $retorno);

?>