#le pedimos al usuario que ingrese un numero entero para acceder

for i in range(10):
    acceso = input("Ingresa el numero correcto para ingresar: ")
    if acceso == "7":
        print("Has ingresado correctamente")
        break
    if acceso != "7":
        print("Numero incorrecto, intenta de nuevo")

