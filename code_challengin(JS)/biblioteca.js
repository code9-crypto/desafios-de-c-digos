function sistemaBiblioteca(bb){
    let menorAno = Infinity
    let livroMaisAntigo = ""
    let counter = 0
    let autores = new Set() //esta função Set() permite adicionar itens na lista sem que seja repetido os elementos
    for( const [nome, {autor, ano, emprestado}] of Object.entries(bb)){
        //verificando qual o livro é o mais antigo
        if( ano < menorAno ){
            menorAno =  ano
            livroMaisAntigo = nome
        }

        //Contando quantos livros estão disponíveis
        if( !emprestado ){
            counter++
        }
        
        //Criando a lista dos autores
        autores.add(autor)
    }

    return[
        `O livro mais antigo é ${livroMaisAntigo} de ${menorAno}`,
        `A quantidade de livros disponíveis é ${counter}`,
        `Lista de autores ${[...autores].join(", ")}`
    ]
}

const biblioteca = {
    "Dom Casmurro": { autor: "Machado de Assis", ano: 1899, emprestado: false },
    "1984": { autor: "George Orwell", ano: 1949, emprestado: true },
    "Memórias Póstumas": { autor: "Machado de Assis", ano: 1881, emprestado: false },
    "O Hobbit": { autor: "J.R.R. Tolkien", ano: 1937, emprestado: false }
};

console.log(sistemaBiblioteca(biblioteca))