function atualizaInventario(invetario, vendas){
    const chaves = [] // array que vai armazenar as chaves do objeto inventario
    const objTotal = {} // objeto que gera a lista total da compra
    let textoMsg

    //Pegando cada chave do objeto inventario e colocando dentro do array chaves
    for( const c of Object.keys(inventario) ){
        chaves.push(c)
    }

    vendas.forEach(v => {
        chaves.forEach(c => {
            //verificando se a quantidade da venda é maior que do inventario de cada produto
            //caso seja a compra será inválida
            if( v.produto === c && v.quantidade > inventario[c].quantidade){
                return `A compra do produto ${c} foi inválida, pois sua a quantidade da venda excede do inventário`
            }

            //Fazendo a atualização do inventario com base nas vendas
            if( v.produto === c ){
                inventario[c].quantidade -= v.quantidade
            }

            //Fazendo o cálculo total da venda de cada produto
            if( v.produto === c){
                objTotal[c] = {
                    resumo: `${v.quantidade} * ${invetario[c].preco}`,
                    total: v.quantidade * inventario[c].preco
                }
            }
        })
    })

   return objTotal
}

const inventario = {
    "camiseta": { quantidade: 10, preco: 29.99 },
    "calça": { quantidade: 5, preco: 79.99 },
    "meia": { quantidade: 20, preco: 9.99 }
}

const vendas = [
    { produto: "camiseta", quantidade: 2 },
    { produto: "meia", quantidade: 5 },
    { produto: "calça", quantidade: 1 },
    { produto: "camiseta", quantidade: 1 }
]

console.log(atualizaInventario(inventario, vendas))