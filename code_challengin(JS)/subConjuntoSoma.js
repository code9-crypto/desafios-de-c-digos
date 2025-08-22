function existeSubconjuntoSoma(numeros, alvo, i = 0, somaAtual = 0) {
    // Caso base: se a soma atual for igual ao alvo
    if (somaAtual === alvo) return true;

    // Se já percorreu todos os elementos
    if (i >= numeros.length) return false;

    // Opção 1: incluir o número atual na soma
    if (existeSubconjuntoSoma(numeros, alvo, i + 1, somaAtual + numeros[i])) {
        return true;
    }

    // Opção 2: pular o número atual
    return existeSubconjuntoSoma(numeros, alvo, i + 1, somaAtual);
}

// Testes
console.log(existeSubconjuntoSoma([3, 34, 4, 12, 5, 2], 9));   // true (4 + 5)
console.log(existeSubconjuntoSoma([3, 34, 4, 12, 5, 2], 30));  // false
console.log(existeSubconjuntoSoma([2, 4, 3, 5, 8], 9));              // true (2+4+3)
