import random

nomes = ['Luciano','Sheila','Victor']

numero_aleatorio = random.randint(0, 2)

match(nomes[numero_aleatorio]):
    case 'Luciano':
        print("Luciano, você foi o escolhido")        
    case 'Sheila':
        print("Sheila, você foi a escolhida")        
    case 'Victor':
        print("Victor, você foi o escolhido")