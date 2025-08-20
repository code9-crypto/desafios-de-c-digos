<?php

function letraMaiRepete($texto){
    // 1. Converte para minúsculo e quebra em array de letras
    $texto = str_split(strtolower($texto));
    
    // 2. Array associativo para contar frequência das letras
    $maisEncontrado = [];

    foreach( $texto as $txt ){
        // Se já existir a letra, soma +1, senão inicializa com 0 + 1
        $maisEncontrado[$txt] = ($maisEncontrado[$txt] ?? 0) + 1;
    }

    // 3. Ordena o array pela frequência (valores), do maior para o menor
    arsort($maisEncontrado);

    // 4. Pega a primeira chave (letra com maior frequência)
    return array_keys($maisEncontrado)[0];
}

echo letraMaiRepete("banana"); // retorna "a"
echo letraMaiRepete("programador"); // retorna "r"
echo letraMaiRepete("teste"); // retorna "t"
?>