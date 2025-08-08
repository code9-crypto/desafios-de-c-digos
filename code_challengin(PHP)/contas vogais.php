<?php

/*function contarVogais($texto){
    $counter = 0;
    $arrVogais = ["a","e","i","o","u"];
    $arrVogaisEncontradas = [];
    $newTxt = strtolower($texto);
    $newArrTxt = str_split($newTxt);   
    foreach($arrVogais as $ltr){
        foreach($newArrTxt as $newltr){
            if( $ltr == $newltr ){
                $arrVogaisEncontradas[] = $newltr;
                $counter++;
            }
        }
    }
    return "retorna " . $counter . " (".join(", ", $arrVogaisEncontradas).")";
}

echo contarVogais("Programador");*/

function contarVogais($texto){
    $counter = 0;
    $vogais = ["a","e","i","o","u"];
    $encontradas = [];

    foreach (str_split(strtolower($texto)) as $letra) { //aqui estou fazendo um único loop com forEach e já colocando o str_split e o strtolower
        if (in_array($letra, $vogais)) {
            $encontradas[] = $letra;
            $counter++;
        }
    }

    return "retorna $counter (" . implode(", ", $encontradas) . ")";
}

echo contarVogais("Programador");

?>