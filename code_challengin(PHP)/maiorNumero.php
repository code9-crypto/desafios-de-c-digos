<?php

function maiorNumero($numeros){
    $maior = $numeros[0];
    foreach($numeros as $numero){
        if( $numero > $maior ){
            $maior = $numero;
        }
    }
    return $maior;
}


echo maiorNumero([10,25,3,99,47])
?>