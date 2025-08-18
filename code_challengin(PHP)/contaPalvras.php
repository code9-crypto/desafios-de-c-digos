<?php

function contaPalavras($frase){
    //esta expressão regular do método preg_replace retira os espaços a mais da frase, deixando apenas com um espaço normal
    $textos = explode(" ", preg_replace("/\s+/", " ", $frase));    
    echo count($textos);
}


contaPalavras("Eu   gosto  de  Java");
?>