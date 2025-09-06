<?php

function menorNumero($numeros){
    //ordenando array do menor para o maior
    sort($numeros);

    return $numeros[0];
}

echo menorNumero([10, 5, 22, 1, 9])

?>
