function contarLetras(texto){
    freq = {}
    texto = texto.toLowerCase().split("")
    for( txt of texto ){
        freq[txt] = (freq[txt] || 0 ) + 1
    }
    return freq
}

console.log(contarLetras("banana"))