<?php

function analisarFuncionarios($funcs){
    $total = 0;
    $maiorSalario = array_values($funcs)[0]["salario"];
    $funcMaiorSal = "";
    $menorSalario = array_values($funcs)[0]["salario"];
    $funcMenorSal = "";
    $funcsAcimaMedia = [];

    foreach($funcs as $funcionario => $dados){
        $total += $dados["salario"];

        if ($dados["salario"] > $maiorSalario) {
            $maiorSalario = $dados["salario"];
            $funcMaiorSal = $funcionario;
        }

        if ($dados["salario"] < $menorSalario) {
            $menorSalario = $dados["salario"];
            $funcMenorSal = $funcionario;
        }
    }

    $salarioMedio = $total / count($funcs);

    foreach ($funcs as $funcionario => $dados) {
        if ($dados["salario"] > $salarioMedio) {
            $funcsAcimaMedia[] = $funcionario;
        }
    }

    return [
        "Funcionário com maior salário: $funcMaiorSal - R$" . number_format($maiorSalario, 2, ",","."),
        "Funcionário com menor salário: $funcMenorSal - R$" . number_format($menorSalario, 2, ",","."),
        "Salário médio: R$" . number_format($salarioMedio, 2, ",","."),
        "Funcionários acima da média: " . implode(", ", $funcsAcimaMedia)
    ];
}

$funcionarios = [
    "Ana" => ["salario" => 3500, "setor" => "Financeiro"],
    "Carlos" => ["salario" => 2800, "setor" => "RH"],
    "Beatriz" => ["salario" => 4200, "setor" => "TI"],
    "João" => ["salario" => 2500, "setor" => "Logística"]
];

$result = analisarFuncionarios($funcionarios);
echo implode("\n", $result);

?>
