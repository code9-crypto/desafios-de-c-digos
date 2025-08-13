/*
//ORDENANDO O ARRAY DE OBJETOS POR MEIO DO MÉTODO sort()
function ordenarPessoas(pessoas) {
    return pessoas.sort((a, b) => { a ordenação está acontecendo aqui
        // Primeiro, compara pela idade
        if (a.idade !== b.idade) {
            return a.idade - b.idade;
        }
        // Se as idades forem iguais, compara pelo nome
        return a.nome.localeCompare(b.nome);
    });
}
  
const pessoas = [
    { nome: 'Ana', idade: 30, cidade: 'São Paulo' },
    { nome: 'Carlos', idade: 20, cidade: 'Rio de Janeiro' },
    { nome: 'Pedro', idade: 20, cidade: 'Belo Horizonte' },
    { nome: 'Maria', idade: 25, cidade: 'São Paulo' }
];

console.log(ordenarPessoas(pessoas));*/

//FUNÇÃO QUE ORDENA OS NÚMEROS USANDO O MÉTODO sort()
function ordenarNums(numeros){
    return numeros.sort((a, b) => { //a ordenação está acontecendo aqui
        if( a !== b ){
            return a - b
        }
    })
}

console.log(ordenarNums([5,6,4,8,9,2,1]))