import random as rand

#LISTA DE GRUPOS
geral = []
numeros_usados = []

for x in range(0,10):
    if len(geral) <= 10:        
        geral.append([])
    
    while len(geral[x]) < 4:
        codigo = rand.randint(1,40)
        if codigo not in numeros_usados:
            numeros_usados.append(codigo)
            geral[x].append(codigo)
        else:
            continue
    


print()

#MOSTRANDO OS GRUPOS E SEUS RESPECTIVOS INTEGRANTES
for grupo, integrantes in enumerate(geral):
    print(f"Grupo {grupo+1}", end=" -> ")
    for nome in integrantes:
        print(nome, end=" ")
    print("\n")
