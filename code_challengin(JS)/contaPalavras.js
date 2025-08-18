function contaPalavras(frase){
    let textos = frase.trim().replace(/\s+/g, " ").split(" ") //esta expressão regular do método replace, retira qualquer espaço em dobro
    return textos.length
}

console.log(contaPalavras("Eu gosto  de  Java"))