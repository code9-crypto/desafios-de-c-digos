function gerenciarAlunos(alunos){
    //usando um set para tirar elementos duplicados do array alunos
    let alunosUnicos = new Set(alunos)

    //Verificando a quantidade alunos
    //Mas para isso está transformando o set em array para depois verificar a quantidade elementos
    let qtdAlunos = alunosUnicos.size

    //Verificando se determinado aluno consta na lista
    let existe = alunosUnicos.has("Ana")

    //retornando as respostas
    return [
        `A quantidade de alunos únicos ${qtdAlunos}`,
        `A verificação se ${[...alunosUnicos][0]} está na turma: ${existe}`,
        `Lista final de alunos: ${[...alunosUnicos]}`
    ]
}

const alunos = ["Ana", "Carlos", "Maria", "Ana", "João", "Carlos"];
console.log(gerenciarAlunos(alunos).join("\n"));

