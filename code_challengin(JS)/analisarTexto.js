function analisarTexto(frase){
    //contando quantas palavras tem na frase
    let qtdPlv = frase.split(/\s+/).length

    //contando quantas vezes aparece a vogal 'o'
    //1º transforma tudo para minúsculo
    //2º retirando os espaços por sem espaços
    //3º transformando as palavras em letras
    //4° fazendo um filtro e verificando se a letra é igual a vogal o
    //5º retornando a quantidade que foi encontrada
    let countVog = frase.toLowerCase().replace(/\s+/g, "").split("").filter(v => v === "o").length

    //transformando o texto em minúsculo
    let fraseMinus = frase.toLowerCase()

    //Invertendo o texto
    let arrFrs = frase.split(/\s+/)
    let fraseInvert = arrFrs.reverse().join(" ")
    

    return [
        `Quantidade de palavras: ${qtdPlv}`,
        `Quantidade de letras 'o': ${countVog}`,
        `Texto em minúsculo: ${fraseMinus}`,
        `Frase invertida: ${fraseInvert}`
    ]
}

console.log(analisarTexto("O JavaScript é Poderoso e Popular").join("\n"));
