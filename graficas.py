import matplotlib.pyplot as plt
import sys

class Grafica(object):
    """Un objeto simple para graficar datos en una gráfica de barras con los resultados del programa en Java"""
    def __init__(self, titulos:list, cantidades:list) -> None:
        self.titulos = titulos
        self.cantidades = cantidades
    
    def graficar(self) -> None:
        """Método para generar una gráfica de barraas"""
        plt.bar(self.titulos, self.cantidades)
        plt.title("Cantidad de semillas registradas para reforestación")
        plt.ylabel("Cantidad de semillas")
        plt.show()

## EJECUCIÓN ##
labels = sys.argv[1]  # Primer argumento de la linea de comando
labels = labels.split(",")

cantidades = sys.argv[2]  # Segundo argumento de la linea de comando
cantidades = cantidades.split(",")

for i in range(len(cantidades)):
    cantidades[i] = int(cantidades[i])  # Conversión de los datos numéricos

grafica2 = Grafica(labels, cantidades)
grafica2.graficar()
