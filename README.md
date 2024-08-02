# Conjetura de Collatz

## Descripción

El programa **Conjetura de Collatz** es una aplicación de consola en Java que implementa la conjetura de Collatz, también conocida como la conjetura 3n + 1. La conjetura establece que, comenzando con cualquier número entero positivo, la secuencia generada a partir de la siguiente regla siempre llegará al número 1:

- Si el número es par, divídelo entre 2.
- Si el número es impar, multiplícalo por 3 y súmale 1.

El programa muestra cada paso de la secuencia hasta que el número se convierte en 1.

## Funcionalidades

- Solicita al usuario un número entero positivo.
- Genera y muestra la secuencia de la conjetura de Collatz.
- Indica si el número es par o impar en cada paso.
- Maneja errores para entradas no numéricas y números no positivos.

## Uso

1. Al ejecutar el programa, se te pedirá que ingreses un número entero positivo.
2. El programa generará y mostrará la secuencia de números de acuerdo con las reglas de la conjetura de Collatz hasta llegar al número 1.

## Ejemplo de Ejecución

```plaintext
=================================================== <[Entrada]> =================================================
Escriba un numero: 17
=================================================== <[Conjetura]> ================================================
1 Impar - 17X3+1=52
2 Par   - 52/2=26
3 Par   - 26/2=13
4 Impar - 13X3+1=40
5 Par   - 40/2=20
6 Par   - 20/2=10
7 Par   - 10/2=5
8 Impar - 5X3+1=16
9 Par   - 16/2=8
10 Par   - 8/2=4
11 Par   - 4/2=2
12 Par   - 2/2=1
==================================================================================================================