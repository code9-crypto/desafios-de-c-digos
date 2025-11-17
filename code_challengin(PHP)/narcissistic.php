<?php

function narcissistic($value){
    $digits = str_split($value);
    $total = 0;
    foreach($digits as $n){
        $total += pow($n, count($digits));
    }
    return $total == $value;
}

echo narcissistic(1938);

?>