function somaImpares(n){
    let result = 0
    for( i = 1; i <= n; i++ ){
        if( i % 2 != 0 ){
            result += i
        }
    }
    return result
}

console.log(somaImpares(10))