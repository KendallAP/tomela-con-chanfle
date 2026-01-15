payaso = 112

muneca = 75 

gramo = 1000

cantidad_payasos = int(input("Ingrese la cantidad de payasos vendidos: "))

cantidad_munecas = int(input("Ingrese la cantidad de muñecas vendidas: "))

print("Cantidad de payasos vendidos:", cantidad_payasos)

print("Cantidad de muñecas vendidas:", cantidad_munecas)

peso_payasos = cantidad_payasos * payaso

peso_munecas = cantidad_munecas * muneca

peso_total = peso_payasos + peso_munecas

print("El peso total del paquete es:", peso_total, "gramos")

precio_total = peso_total * gramo

print("El precio total del paquete es:", precio_total, "colones")
