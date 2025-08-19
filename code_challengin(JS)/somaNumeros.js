function somaNumeros(numeros){
    let sum = numeros.reduce((total, valor) => total + valor, 0) //fazendo a soma dos valores com a função reduce(); OBS.: o valor do acumulador total começa em 0
    console.log(sum)
}

somaNumeros([10, 20, 30, 40, 50])