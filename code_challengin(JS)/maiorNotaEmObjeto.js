/*function maiorNotaObjeto(aluno){
    //aqui está pegando todas a notas da chave notas e jogando na variável notas, a qual se torna um array
    let notas = Object.values(aluno.notas) // OBS.: este é o comando para pegar apenas os valores de um objeto

    //Neste sort está ordenando as notas do maior para o menor
    notas.sort((a,b) => {
        return - (a - b)
    })

    let materias = Object.keys(aluno.notas) //Aqui está pegando as chaves da chave notas e transformando a variável materias num array


    //Aqui está verificando se o valor da matéria é o mesmo que da primeira posição de notas
    for( const m of materias ){
        if( aluno.notas[m] == notas[0] ){
            //Se for, então será retornado o nome da aluna, a matéria e a nota
            return `${aluno.nome} teve a maior nota em ${m}: ${notas[0]}`
        }
    }
    
}*/

//VERSÃO MAIS LIMPA E OTIMIZADA
function maiorNotaObj(aluno){    
    let maiorMateria = "";
    let maiorNota = -Infinity;

    //OBS.: Object.entries() transforma um objet em array e já podemos fazer o for of deste jeito    
    for (const [materia, nota] of Object.entries(aluno.notas)) {
        if (nota > maiorNota) {
        maiorNota = nota;
        maiorMateria = materia;
        }
    }

    return `${aluno.nome} teve a maior nota em ${maiorMateria}: ${maiorNota}`;
}

const aluno = {
    nome: "Ana",
    notas: {
        matematica: 8,
        portugues: 7,
        ciencias: 9,
        historia: 6
    }
}

console.log(maiorNotaObj(aluno))