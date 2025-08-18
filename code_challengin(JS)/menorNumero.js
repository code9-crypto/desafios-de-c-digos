function menorNumero(numeros){
    let menor = numeros[0]
    numeros.forEach((n) => {
        menor = n < menor ? n : menor
    })
    return menor
}

console.log(menorNumero([10, 5, 22, 1, 9]))