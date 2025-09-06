<?php

function somaNumerosPares($numeros){
    /*$sum = 0;
    $pares = array_filter($numeros, fn($n) => $n % 2 === 0);
    foreach($pares as $par){
        $sum += $par;
    }
    echo $sum;*/

    //Código otimizado e refatorado
    $sum = array_sum(array_filter($numeros, fn($n) => $n % 2 === 0));    
    echo $sum;
}

somaNumerosPares([1, 2, 3, 4, 5, 6]);

?>
