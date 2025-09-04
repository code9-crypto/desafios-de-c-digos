<?php

function analisarTexto($texto){
    // 1 - Contar vogais
    $vogais = ['a','e','i','o','u','á','é','í','ó','ú'];
    $contadorVogais = 0;
    $contadorConsoantes = 0;

    // Quebrando a string em caracteres
    $chars = mb_str_split(mb_strtolower($texto)); 

    foreach($chars as $ch){
        if(ctype_alpha($ch)){ // só considera letras
            if(in_array($ch, $vogais)){
                $contadorVogais++;
            } else {
                $contadorConsoantes++;
            }
        }
    }

    // 2 - Transformar em maiúsculo
    $maiusculo = mb_strtoupper($texto);

    // 3 - Inverter ordem das palavras
    $palavras = explode(" ", $texto);
    $invertida = implode(" ", array_reverse($palavras));

    // Retorno
    return [
        "vogais" => $contadorVogais,
        "consoantes" => $contadorConsoantes,
        "maiusculo" => $maiusculo,
        "invertida" => $invertida
    ];
}

// Testando
$texto = "Programar em PHP é divertido";
$resultado = analisarTexto($texto);

print_r($resultado);

?>
