<?php
function agruparPorTamanho($palavras) {
    $resultado = [];

    foreach ($palavras as $palavra) {
        $palavra = strtolower($palavra); // transforma o texto em minúsculo
        $tamanho = strlen($palavra); //pega o tamanho da palavra

        if (!isset($resultado[$tamanho])) { // se a chave não estiver setada
            $resultado[$tamanho] = []; //então será setada o array com o tamanho + valor array vazio
        }

        $resultado[$tamanho][] = $palavra; // o array com o tamanho, adiciona dentro de outro array a palavra
    }

    ksort($resultado); // ordena pelo tamanho (chave)
    return $resultado;
}

// Teste
$lista = ["casa", "sol", "carro", "mar", "lua", "floresta"];
print_r(agruparPorTamanho($lista));
?>
