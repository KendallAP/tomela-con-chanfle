precio_pan = 1000

precio_panviejo = precio_pan * 0.4

descuento = precio_pan - precio_panviejo

print("El precio del pan viejo es:", precio_panviejo, "colones")

cantidad_panviejo = int(input("Ingrese la cantidad de panes viejos vendidos: "))

print("Cantidad de panes viejos vendidos:", cantidad_panviejo)

print("El precio habitual del pan es:", precio_pan, "colones")

print("Su descuento al comprar pan viejo:", descuento * cantidad_panviejo, "colones")

coste_total = (cantidad_panviejo * precio_panviejo) 

print("El coste total de la compra es:", coste_total, "colones")





