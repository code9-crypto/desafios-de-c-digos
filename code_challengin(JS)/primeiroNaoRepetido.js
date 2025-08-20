/*function primeiroNaoRepetido(texto){
    letras = [...texto] //transformando texto em array usando o destruct
    letraNotRept = []
    arrRept = []
    for( let i = 0; i <= letras.length; i++ ){
        if( arrRept.length == 0 ){
            arrRept.push(letras[i])
        }else if( arrRept.length > 0 && arrRept.includes(letras[i]) ){
            arrRept.push(letras[i])
        }else if( !arrRept.includes(letras[i]) && letraNotRept.length == 0 ){
            letraNotRept.push(letras[i])
        }else if( !arrRept.includes(letras[i]) && letraNotRept.includes(letras[i]) ){
            letraNotRept = []
        }else{
            continue
        }
    }
    console.log(letraNotRept[0] ?? null)
}*/

//VERSÃO OTIMIZADA E LIMPA
function primeiroNaoRepetido(texto) {
    const letras = texto.split("");
    const freq = {};

    // 1. Conta a frequência de cada letra
    for (let l of letras) {
        freq[l] = (freq[l] ?? 0) + 1;
    }

    // 2. Retorna a primeira letra que aparece só 1 vez
    for (let l of letras) {
        if (freq[l] === 1) {
            return l;
        }
    }

    return null; // caso nenhuma letra seja única
}

console.log(primeiroNaoRepetido("abacaxi"));  // b
console.log(primeiroNaoRepetido("aabbcc"));   // null
console.log(primeiroNaoRepetido("javascript")); // j
