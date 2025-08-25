<?php

function estatisticaVenda($vendas){
    //Ordenando o array do maior para o menor baseado no valor
    arsort($vendas);

    //Pegando o nome e valor do vendedor da maior venda
    $nomeMaior = array_keys($vendas)[0];
    $maiorValor = array_values($vendas)[0];

    //Pegando o nome e valor vendedor da menor venda
    $nomeMenor = array_keys($vendas)[count($vendas)-1];
    $menorValor = array_values($vendas)[count($vendas)-1];

    //Somando todos os valores
    $soma = array_sum(array_values($vendas));

    //Fazendo a média
    $media = $soma / count($vendas);

    echo "Vendedor(a) $nomeMaior tem mais vendas; no valor R$ $maiorValor\n";
    echo "Vendedor(a) $nomeMenor tem menos vendas; no valor R$ $menorValor\n";
    echo "A média de vendas é de R$ $media";
}

//✅ Mais claro, reutilizável e fácil de manter.
function estatisticaVenda($vendas){
    //Maior venda
    arsort($vendas); 
    $nomeMaior = array_key_first($vendas);
    $maiorValor = $vendas[$nomeMaior];

    //Menor venda
    asort($vendas);
    $nomeMenor = array_key_first($vendas);
    $menorValor = $vendas[$nomeMenor];

    //Média
    $media = array_sum($vendas) / count($vendas);

    return [
        "maior" => "Vendedor(a) $nomeMaior tem mais vendas: R$ $maiorValor",
        "menor" => "Vendedor(a) $nomeMenor tem menos vendas: R$ $menorValor",
        "media" => "A média de vendas é de R$ $media"
    ];
}

$vendas = [
    "Ana" => 1200,
    "Carlos" => 800,
    "Beatriz" => 1500,
    "João" => 950
];

$resultado = estatisticaVenda($vendas);

echo implode("\n", $resultado);


$vendas = [
    "Ana" => 1200,
    "Carlos" => 800,
    "Beatriz" => 1500,
    "João" => 950
];

estatisticaVenda($vendas);

?>