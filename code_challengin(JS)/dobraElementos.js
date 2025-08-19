function dobraElementos(numeros){
    //a função map gera um novo array com a mesma quantidade de elementos
    //O .map() é imutável e retorna o novo array diretamente, sem necessidade de usar push().
    return numeros.map((n) => n * 2)
}

const valores = [1, 2, 3, 4]
console.log(dobraElementos(valores))