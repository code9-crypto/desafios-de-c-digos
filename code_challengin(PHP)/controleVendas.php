<?php

function controleVendas($controle){

    //ordenando a lista do menor para o maior
    asort($controle);

    //Pegando o vendedor da maior venda
    $maiorVend = array_key_last($controle);
    $maiorValor = $controle[$maiorVend];

    //Pegando o vendedor da menor venda
    $menorVend = array_key_first($controle);
    $menorValor = $controle[$menorVend];

    //total das vendas
    $total = array_sum($controle);

    //média das vendas
    $media = $total / count($controle);

    return[
        "O(a) vendedor(a) $maiorVend teve a maior venda com R$$maiorValor",
        "O(a) vendedor(a) $menorVend teve a menor venda com R$$menorValor",
        "O total das vendas foi: R$" . number_format($total, 2, ',', '.'),
        "A média das vendas é: R$" . number_format($media, 2, ',', '.')
    ];

}

$vendas = [
    "Ana" => 1200,
    "Carlos" => 800,
    "Beatriz" => 1500,
    "João" => 950
];

$retorno = controleVendas($vendas);
echo implode("\n", $retorno);

?>