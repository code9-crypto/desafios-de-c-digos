function removerDuplicatas(numeros){
    let integro = []
    for( let num of numeros ){
        if(!integro.includes(num)){
            integro.push(num)
        }
    }
    return integro
}

//Versão bem mais otimizada e performatica
function removeDuplicatas(numeros){
    return [...new Set(numeros)]
}

const numeros = [1, 2, 2, 3, 4, 4, 5]
console.log(removerDuplicatas(numeros))