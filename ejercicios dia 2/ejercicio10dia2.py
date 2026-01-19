#le pedimos al usuario que ponga dos numeros enteros

numero1 = int(input("Ingresa el primer número entero: "))

numero2 = int(input("Ingresa el segundo número entero: "))

if numero1 < numero2:
    for i in range (numero1, numero2 + 1):
        if i % 2 == 0: