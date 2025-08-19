<?php

function filtrarPares($numeros){
    $pares = array_filter($numeros, fn($n) => $n % 2 === 0);
    return $pares;
}

$numeros = [1, 2, 3, 4, 5, 6, 7, 8];
print_r(filtrarPares($numeros));

?>