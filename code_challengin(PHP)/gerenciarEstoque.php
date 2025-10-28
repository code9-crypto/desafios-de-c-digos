<?php
function gerenciarEstoque($estoque) {
    $totalProd = 0;
    $prodMaisCaro = 0;
    $nomeProd = "";
    $baixoEstoque = [];

    foreach ($estoque as $produto => $dados) {
        $valor = $dados["quantidade"] * $dados["preco"];
        $totalProd += $valor;

        if ($valor > $prodMaisCaro) {
            $prodMaisCaro = $valor;
            $nomeProd = $produto;
        }

        if ($dados["quantidade"] < 5) {
            $baixoEstoque[] = "$produto ({$dados['quantidade']} unid.)";
        }
    }

    return [
        "Valor total do estoque: R$ " . number_format($totalProd, 2, ',', '.'),
        "Produto mais valioso: $nomeProd (R$ " . number_format($prodMaisCaro, 2, ',', '.') . ")",
        "Produtos com baixo estoque: " . (empty($baixoEstoque) ? "Nenhum" : implode(", ", $baixoEstoque))
    ];
}

$estoque = [
    "Teclado" => ["quantidade" => 10, "preco" => 120],
    "Mouse" => ["quantidade" => 3, "preco" => 80],
    "Monitor" => ["quantidade" => 7, "preco" => 900],
    "Cabo HDMI" => ["quantidade" => 2, "preco" => 35]
];

echo implode("\n", gerenciarEstoque($estoque));
?>
