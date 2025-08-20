<?php

//ESTE É O CÓDIGO DO BUBBLE SORT
function ordenaValores($numeros){
    for( $i = 0; $i < count($numeros); $i++ ){
        for( $j = 0; $j < count($numeros)-1; $j++ ){
            if( $numeros[$j] > $numeros[$j+1] ){
                $tmp = $numeros[$j]; //a variável tmp recebe o valor da posição atual(que é o maior valor)
                $numeros[$j] = $numeros[$j+1]; //a posição atual recebe o valor da posição seguinte(menor valor)
                $numeros[$j+1] = $tmp;//a posição seguinte recebe o valor da variável tmp(a qual está com o maior valor)
            }
        }
    }
    return $numeros;
}

print_r(ordenaValores([9,4,3,10,15,35]));


?>