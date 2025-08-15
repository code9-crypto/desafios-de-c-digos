function contarPalavras(frase) {
    // 1. Normalizar a frase
    const textoLimpo = frase
        .toLowerCase()                  // tudo minúsculo
        .replace(/[.,!?]/g, "");         // remove pontuação

    // 2. Quebrar em palavras
    const palavras = textoLimpo.split(/\s+/);

    // 3. Objeto para armazenar contagem
    const contagem = {};

    // 4. Percorrer as palavras e contar
    for (const palavra of palavras) {
        contagem[palavra] = (contagem[palavra] || 0) + 1; //Se a palavra já existe incrementa  +1, se não inicia com 1
    }

    return contagem;
}

// Teste
const frase = "Eu gosto de programar e eu gosto de aprender";
console.log(contarPalavras(frase));
