import random as rand

geral = []
numeros_usados = []

for x in range(0,10):
    if len(geral) <= 20:
        geral.append([])
    
    while len(geral[x]) < 2:
        codigo = rand.randint(1,20)
        if codigo not in numeros_usados:
            geral[x].append(codigo)
            numeros_usados.append(codigo)            
        else:
            continue
        

print()

for x, y in enumerate(geral):
    print(f"Grupo {x+1}", end=" -> ")
    for senha in y:
        print(f"{senha}", end=" ")
    print()