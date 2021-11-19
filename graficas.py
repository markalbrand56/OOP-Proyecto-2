import matplotlib.pyplot as plt
import sys

class Grafica(object):
    def __init__(self, titulos, cantidades) -> None:
        self.titulos = titulos
        self.cantidades = cantidades
    
    def graficar(self):

        plt.bar(self.titulos, self.cantidades)
        plt.show()

labels = sys.argv[1]
labels = labels.split(",")
cantidades = sys.argv[2]
cantidades = cantidades.split(",")
for i in range(len(cantidades)):
    cantidades[i] = int(cantidades[i])

grafica2 = Grafica(labels, cantidades)
grafica2.graficar()
