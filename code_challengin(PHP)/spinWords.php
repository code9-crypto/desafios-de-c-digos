<?php

function spinWords($str){
    return implode(" ",array_map(fn($n) => strlen($n) > 4 ? strrev($n) : $n, explode(" ", $str)));
}

echo spinWords("Hey fellow warriors");

?>