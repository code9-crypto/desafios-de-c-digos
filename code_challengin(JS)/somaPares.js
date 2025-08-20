/*function somaPares(nums){
    let newNums = nums.filter(n => n % 2 == 0) == "" ? 0 : nums.filter(n => n % 2 == 0) //aqui está fazendo um filtro dos números pares e já verificando; caso o retorno do array seja vazio, retornará 0, senão voltará o valor
    if( newNums == 0 ){
        return newNums
    }
    let sum = newNums.reduce((total, value) => total + value) //aqui está fazendo a somatória do valores do array newNums
    return sum
}*/

// Versão corrigida e otimizada
function somaPares(nums) {
    let newNums = nums.filter(n => n % 2 === 0).reduce((total, valor) => total + valor, 0); // Filtra os números pares
    /*if (newNums.length === 0) {
        return 0; // Se não houver pares, retorna 0
    }
    let sum = newNums.reduce((total, value) => total + value, 0); // Soma os pares*/
    return newNums;
}

console.log(somaPares([10, 15, 20, 25]))

