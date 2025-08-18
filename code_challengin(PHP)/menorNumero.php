<?php

function menorNumero($numeros){
    $menor = $numeros[0];
    foreach( $numeros as $numero ){
        $menor = $numero < $menor ? $numero : $menor;
    }
    return $menor;
}

echo menorNumero([10, 5, 22, 1, 9])

?>