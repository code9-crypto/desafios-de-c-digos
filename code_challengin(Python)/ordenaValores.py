numeros = [5, 1, 4, 2, 8] 
print("Lista Desordenada: ") 
print (numeros) 
#print("Lista Ordenada:\n" + ordenacao(numeros))

def ordenacao(numeros):
 for x in range(len(numeros)): 
    for y in range(len(numeros)-1): 
        if(numeros[y] > numeros[y+1]): 
             temp = numeros[y] # a variável tmp recebe o valor da posição atual(que é o maior valor)
             numeros[y] = numeros[y+1] # a posição atual recebe o valor da posição seguinte(menor valor)
             numeros[y+1] = temp # a posição seguinte recebe o valor da variável tmp(a qual está com o maior valor)
 print(numeros)
 
ordenacao(numeros)