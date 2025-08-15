<?php

/*function contarLetras($palavra){
    $padrao = ["/\s/","/\W/"]; //expressão regular que procura por pontuação e espaços
    $encontrado = [];
    //aqui está(tudo numa mesma linha) retirando pontuação e espaços, convertendo tudo para minúsculo e dividindo a string em array
    $arrPal = str_split(strtolower(preg_replace($padrao, "", $palavra)));
    //Fazendo um loop entre as letras da array criada a partir da palavra
    foreach( $arrPal as $ltr ){
        //aqui verifica se o chave no array já foi setada        
        if( !isset($encontrado[$ltr]) ){
            //Caso não, será setada a chave no array com o valor 1
            $encontrado[$ltr] = 1;
        }else{
            //Caso tenha, então o valor daquela chave será somada +1
            $encontrado[$ltr] += 1;
        }
        
    }
    return $encontrado;
}*/


//🔹 Versão ajustada e um pouco mais compacta:
function contarLetras($palavra){
    $arrPal = str_split(strtolower(preg_replace("/[^a-z]/", "", $palavra)));
    $encontrado = [];
    foreach($arrPal as $ltr){
        //(tudo numa linha só) caso a chave não esteja setada, então será criada mas com o valor 0 + 1; caso contrário,
        //o valor daquela chave será somada + 1 até o término do loop
        $encontrado[$ltr] = ($encontrado[$ltr] ?? 0) + 1;
    }
    ksort($encontrado); // ordena por letra
    return $encontrado;
}

print_r(contarLetras("banana"));
?>