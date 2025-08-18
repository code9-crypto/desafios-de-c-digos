<?php
function isPalindromo($texto){
    $padroes = ["/\s/", "/\W/"]; //aqui a é um array de expressões regulares; \s -> procura por espaços entre o texto, \W -> procura por pontuações e outros caracteres especiais
    $newNome = strtolower(preg_replace($padroes, "", $texto));// -> aqui está trocando os caracteres encontrados no texto por "sem espaçamento"
    $revTxt = strrev($texto); //pega o texto e inverte
    return $revTxt;
}

echo isPalindromo("php");
?>