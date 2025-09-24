function menorNumero(numeros){
    /*let menor = numeros[0]
    numeros.forEach((n) => {
        menor = n < menor ? n : menor
    })*/
    
    let menor = numeros.sort((a, b) => a - b)
    return menor[0]
}

console.log(menorNumero([10, 5, 22, 1, 9]))