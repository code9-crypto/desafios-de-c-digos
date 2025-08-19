function contarOcorrencias(ocorrencias){
    let obj = {}
    for( let ocr of ocorrencias ){
        //aqui verifica se a chave do objeto existe
        if(!obj[ocr]){
            //se não existe, então será criado a chave com o valor 0
            obj[ocr] = 0
        }
        //caso exista a chave, então o valor da chave será incrementado +1
        obj[ocr] += 1 
    }
    return obj
}

const itens = ['maçã', 'banana', 'maçã', 'laranja', 'banana', 'banana']
console.log(contarOcorrencias(itens))