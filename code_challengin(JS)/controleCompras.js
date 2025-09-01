function controleCompras(clientes) {
    let maiorGasto = 0
    let clienteMaior = ""
    let menorCompras = Infinity
    let clienteMenor = ""
    let somaGeral = 0

    let nomes = Object.keys(clientes)

    for (const nome of nomes) {
        // Somando os valores das compras do cliente
        let totalGasto = clientes[nome].reduce((acc, val) => acc + val, 0)

        // Verificando quem gastou mais
        if (totalGasto > maiorGasto) {
            maiorGasto = totalGasto
            clienteMaior = nome
        }

        // Verificando quem fez menos compras
        if (clientes[nome].length < menorCompras) {
            menorCompras = clientes[nome].length
            clienteMenor = nome
        }

        // Somando os gastos para calcular a média depois
        somaGeral += totalGasto
    }

    let media = somaGeral / nomes.length

    return [
        `Cliente que mais gastou: ${clienteMaior} (R$ ${maiorGasto})`,
        `Cliente com menos compras: ${clienteMenor} (${menorCompras} compra(s))`,
        `Média de gastos por cliente: R$ ${media.toFixed(2)}`
    ]
}

// Exemplo de uso
const clientes = {
    Ana: [120, 300, 50],
    Bruno: [500, 20],
    Carla: [70, 80, 30, 20],
    Daniel: [400]
}

console.log(controleCompras(clientes).join("\n"))
