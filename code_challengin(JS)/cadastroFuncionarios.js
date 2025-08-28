/*function cadastroFuncionarios(funcionarios){
    let maiorSalario = 0 //variavel que terá o maior salário
    let funcionario //nome do funcionario com maior salário
    let somaSalarios = 0 //esta variavel irá receber o total dos salários para depois tirar a média
    let funcPerCargo = {} //Este será um objeto que contará quantos funcionários tem por cargo
    let nomes = Object.keys(funcionarios)
    
    //verificando o funcionário com o maior salário e atrelando a variável o nome do funcionário junto com seu salário
    for( const nome of nomes ){
        if( funcionarios[nome].salario > maiorSalario ){
            maiorSalario = funcionarios[nome].salario
            funcionario = `Funcionário com maior salário é o ${nome} e recebe R$${maiorSalario} por mês`
        }

        //Somando os salários dos funcionários
        somaSalarios += funcionarios[nome].salario

        //Fazendo a contagem de quantos funcionários tem por cargo
        funcPerCargo[funcionarios[nome].cargo] = (funcPerCargo[funcionarios[nome].cargo] ?? 0) +1
        
    }

    //Calculando a média dos salários
    let media = somaSalarios / nomes.length

    return [
        `${funcionario}`,
        `Salário médio dos funcionários R$${media}`,
        `Quantidade de funcionários por cada cargo ${JSON.stringify(funcPerCargo)}`
    ]
}*/

//🔹 Versão otimizada e limpa
function cadastroFuncionarios(funcionarios) {
    let maiorSalario = -Infinity;
    let nomeMaiorSalario = "";
    let somaSalarios = 0;
    let funcPerCargo = {};

    for (const [nome, { cargo, salario }] of Object.entries(funcionarios)) {
        // Maior salário
        if (salario > maiorSalario) {
            maiorSalario = salario;
            nomeMaiorSalario = nome;
        }

        // Soma dos salários
        somaSalarios += salario;

        // Contagem por cargo
        funcPerCargo[cargo] = (funcPerCargo[cargo] ?? 0) + 1;
    }

    const media = somaSalarios / Object.keys(funcionarios).length;

    return [
        `Funcionário com maior salário: ${nomeMaiorSalario} (R$${maiorSalario})`,
        `Salário médio dos funcionários: R$${media.toFixed(2)}`,
        `Quantidade de funcionários por cargo: ${JSON.stringify(funcPerCargo)}`
    ];
}

const funcionarios = {
    Ana: { cargo: "Analista", salario: 3200 },
    Bruno: { cargo: "Gerente", salario: 5500 },
    Carla: { cargo: "Assistente", salario: 2200 },
    Daniel: { cargo: "Analista", salario: 3100 }
}

console.log(cadastroFuncionarios(funcionarios))
