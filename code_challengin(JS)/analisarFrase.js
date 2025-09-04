function analisarFrase(frase){
    //contando quantas palavras tem na frase
    let qtdPlv = frase.trim().split(/\s+/).length

    //contando quantas vezes aparece a vogal e
    //NOTA: transformando a frase para minúsculo, em array, usando o filter para a verificação das letras e por último o length
    let counter = frase.toLowerCase().split("").filter(ch => ch === "e").length
    

    //deixando a frase sem espaços usando a expressão regular
    let fSemEsp = frase.replace(/\s+/g, "")

    return [
        `Quantidade de palavras: ${qtdPlv}`,
        `Quantidade de letras: ${counter}`,
        `Frase sem espaços: ${fSemEsp}`
    ]
}

console.log(analisarFrase("Estudar JavaScript é essencial").join("\n"));
