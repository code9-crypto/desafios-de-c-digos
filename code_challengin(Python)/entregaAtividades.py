import random as rand

geral = []

for x in range(0,10):
    if len(geral) <= 9:
        geral.append([])
    
    while len(geral[x]) < 2:
        if geral[x] == rand.randint(1,10):
            continue
        else:
            geral[x].append(rand.randint(1,10))
        

print()

for x, y in enumerate(geral):
    print(f"Grupo {x+1} => {y[0]} -> {y[1]} ")