#le pedimos al usuario que ingrese un numero entero

num = int(input("Ingresa un número entero: "))

if num > 0 and num <100:
    print("El numero es positivo y menor que 100")    
else:
    print("El numero no cumple las condiciones")