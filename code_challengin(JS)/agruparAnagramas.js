function agruparAnagramas(palavras) {
    const grupos = {};

    for (let palavra of palavras) {
        // 1. Ordena as letras da palavra (ex: "amor" → "amor", "roma" → "amor")
        /*
        "roma" → ["r", "o", "m", "a"]
        Ordenado → ["a", "m", "o", "r"]
        Resultado: "amor"
        ✅ Assim, "roma" e "amor" geram a mesma chave: "amor"
        */
        const chave = palavra.split('').sort().join('');

        // 2. Usa a palavra ordenada como chave no objeto
        //Se não existe esse grupo ainda, criamos
        if (!grupos[chave]) {
            grupos[chave] = [];
        }

        // 3. Adiciona a palavra original ao grupo correspondente
        //Adicionamos a palavra original (não a ordenada).
        grupos[chave].push(palavra);
    }

    // 4. Retorna apenas os grupos (valores do objeto)
    return Object.values(grupos);
}

const entrada = ["amor", "roma", "carro", "racor", "bolo", "lobo"];
console.log(agruparAnagramas(entrada));