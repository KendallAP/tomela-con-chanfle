#le pedimos al usuario que ponga un numero entero

numero = int(input("Ingresa un número entero: "))

contador = 0

for i in range (numero + 1):
    if contador % 2 == 0:
        print(contador)
    contador += 1
