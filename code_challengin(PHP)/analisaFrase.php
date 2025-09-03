<?php

function analisaFrase($frase){
    // Quantidade de palavras
    $qtdPlv = str_word_count($frase);

    // Contagem de 'a' (maiúscula e minúscula)
    $ctA = substr_count(strtolower($frase), 'a');

    // Invertendo a frase (palavra por palavra)
    $fraseInvertida = implode(" ", array_reverse(explode(" ", $frase)));

    return [
        "Quantidade de palavras => $qtdPlv",
        "Quantidade de letras 'a' => $ctA",
        "Frase invertida => $fraseInvertida"
    ];
}

$frase = "Aprender PHP é muito divertido";
$resultado = analisaFrase($frase);

print_r($resultado);

?>