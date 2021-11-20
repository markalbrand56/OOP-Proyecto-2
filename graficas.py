import matplotlib.pyplot as plt
import sys

class Grafica(object):
    """Un objeto simple para graficar datos en una gráfica de barras con los resultados del programa en Java"""
    def __init__(self, titulos, cantidades) -> None:
        self.titulos = titulos
        self.cantidades = cantidades
    
    def graficar(self):

        plt.bar(self.titulos, self.cantidades)
        #plt.xticks(rotation=45)
        plt.show()

labels = sys.argv[1]  # Primer argumento de la linea de comando
labels = labels.split(",")
cantidades = sys.argv[2]  # Segundo argumento de la linea de comando
cantidades = cantidades.split(",")
for i in range(len(cantidades)):
    cantidades[i] = int(cantidades[i])

grafica2 = Grafica(labels, cantidades)
grafica2.graficar()
