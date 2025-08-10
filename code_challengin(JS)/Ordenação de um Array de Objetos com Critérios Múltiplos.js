function ordenarPessoas(pessoas) {
    return pessoas.sort((a, b) => {
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

console.log(ordenarPessoas(pessoas));