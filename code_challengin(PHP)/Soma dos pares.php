<?php
//Minha solução
/*function somaPares($arrNums){
    $total = 0;
    foreach ( $arrNums as $num ){
        if( $num % 2 == 0 ){
            $total += $num;
        }
    }
    print($total);
}*/

//Função otimizada e avançada
function somaPares($arrNums) {
    $pares = array_filter($arrNums, fn($n) => $n % 2 === 0); //este array_filter retorna o valor do filtro para dentro de outro array
    return array_sum($pares);
}


echo somaPares([1,2,3,4,5]);

?>