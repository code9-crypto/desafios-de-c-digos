//SOLUÇÃO COM A FUNÇÃO MAP
//OBS.: esta opção não é a mais indicada, pois o map retorna um array do mesmo tamanho
/*function maiorNumero(numeros){
    let maior = numeros[0]
    numeros.map((n) => {
        if( n > maior ){
            maior = n
        }
    })

    return maior
}*/

//SOLUÇÃO COM A FUNÇÃO FOREACH -> esta é a mais indicada
function maiorNumero(numeros) {
    /*let maior = numeros[0];
    numeros.forEach((n) => {
        if (n > maior) {
            maior = n;
        }
       maior = n > maior ? n : maior 
    });*/
    
    let maior = numeros.sort((a, b) => b - a)
    return maior[0];
}

console.log(maiorNumero([10,25,3,99,47]))