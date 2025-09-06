<?php

function maiorNumero($numeros){
    //ordenando array do maior para o menor
    rsort($numeros);

    //retornando o maior valor
    return $numeros[0];
}


echo maiorNumero([10,25,3,99,47])
?>
