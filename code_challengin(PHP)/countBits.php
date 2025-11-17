<?php

function countBits($n){
    return substr_count(decbin($n), 1);
}

echo countBits(1234);

?>