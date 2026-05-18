import random as rand

#LISTA DE GRUPOS
geral = []

for x in range(0,10):
    if len(geral) <= 10:        
        geral.append([])
    
    while len(geral[x]) < 4:
        geral[x].append(rand.randint(1,41))

print()

#MOSTRANDO OS GRUPOS E SEUS RESPECTIVOS INTEGRANTES
for grupo, integrantes in enumerate(geral):
    print(f"Grupo:{grupo+1} são os integrantes: {integrantes}")
