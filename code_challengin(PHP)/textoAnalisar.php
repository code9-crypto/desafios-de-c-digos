<?php

function analisarTexto($frase){
    //Contando as palavras
    $qtdPlv = count(explode(" ", $frase));

    //contando quantas vogais 'i' tem na frase
    $qtdLtr = count(array_filter(str_split(strtolower($frase)), fn($n) => $n === 'i'));

    //tirando os espaços da frase
    $frsSemEsp = preg_replace("/\s/", "", $frase);

    //invertendo a frase
    $frsInvert = implode(" ", array_reverse(explode("/\s+/",$frase)));

    return [
        "Quantidade de palavras na frase: $qtdPlv",
        "Quantidade de vogais 'i' na frase: $qtdLtr",
        "Frase sem espaços: $frsSemEsp",
        "Frase invertida: $frsInvert"
    ];
}

$frase = "PHP é incrível para iniciantes";
$resultado = analisarTexto($frase);

echo implode("\n", $resultado);

?>
