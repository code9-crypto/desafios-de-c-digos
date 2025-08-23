function inverteString(palavra){
    //1º transformando a palavra toda em minúsculo
    //2º desmembrando a palavra num array de letras
    //3º invertendo o array de letras de trás para frente
    //4º unindo o array numa string novamente, mas agora invertido
    return palavra.toLowerCase().split("").reverse().join("")
}

console.log(inverteString("javascript"))