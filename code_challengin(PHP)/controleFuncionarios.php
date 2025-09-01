<?php

function controleFuncionarios($funcionarios){
    //pegando todos os nomes dos funcionarios
    $nomes = array_keys($funcionarios);
    


    //Variáveis para os funcionarios de maior e menor salario e seus respectivos nomes
    $maiorSalario = 0;
    $nomeMaior = "";
    $menorSalario = array_values($funcionarios)[0]["salario"]; //Assume que o primeiro funcionario tem o menor salário
    $nomeMenor = "";
    $salarioMedio = 0;
    $somaSalario = 0;
    $freqCargo = [];

    foreach( $nomes as $nome ){
        //Verificando qual o funcionário com o maior salário
        if( $funcionarios[$nome]["salario"] > $maiorSalario ){
            $maiorSalario = $funcionarios[$nome]["salario"];
            $nomeMaior = $nome;
        }

        //Verificando qual o funcionário com o menor salário
        if( $funcionarios[$nome]["salario"] < $menorSalario ){
            $menorSalario = $funcionarios[$nome]["salario"];
            $nomeMenor = $nome;
        }

        //Soma dos salários
        $somaSalario += $funcionarios[$nome]["salario"];

        //Contando quantos funcionários tem por cargo
        $cargos = $funcionarios[$nome]["cargo"];
        $freqCargo[$cargos] = ($freqCargo[$cargos] ?? 0) + 1;
        
    }
    //Fazendo o cálculo da média
    $salarioMedio = $somaSalario / count($nomes);
    
    //Formatando a impressão dos cargos e suas respectivas quantidades
    $cargosFormatados = [];
    foreach ($freqCargo as $cargo => $qtd) {
        $cargosFormatados[] = "$cargo => $qtd";
    }

    return [
        "Funcionario com maior salário: $nomeMaior (R$ $maiorSalario)",
        "Funcionario com menor salário: $nomeMenor (R$ $menorSalario)",
        "Salário médio: R$ $salarioMedio",
        "Quantidade de funcionários por cargo: " . implode(", " , $cargosFormatados)
    ];
    
}

$funcionarios = [
    "Ana" => ["cargo" => "Analista", "salario" => 3200],
    "Bruno" => ["cargo" => "Gerente", "salario" => 5500],
    "Carla" => ["cargo" => "Assistente", "salario" => 2200],
    "Daniel" => ["cargo" => "Analista", "salario" => 3100]
];

$resposta = controleFuncionarios($funcionarios);
echo implode("\n", $resposta);
//controleFuncionarios($funcionarios);

?>