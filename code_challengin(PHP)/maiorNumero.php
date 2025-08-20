<?php

function maiorNumero($numeros){
    $maior = $numeros[0];
    foreach($numeros as $numero){
        /*if( $numero > $maior ){
            $maior = $numero;
        }*/
        $maior = $numero > $maior ? $numero : $maior;
    }
    return $maior;
}


echo maiorNumero([10,25,3,99,47])
?>