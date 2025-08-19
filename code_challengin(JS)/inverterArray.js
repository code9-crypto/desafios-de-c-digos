function inverterArray(vetor){
    let reverse = []
    for( i = vetor.length-1; i >= 0; i-- ){
        reverse.push(vetor[i])
    }
    return reverse
}

const frutas = ['maçã', 'banana', 'laranja', 'uva'];
console.log(inverterArray(frutas))