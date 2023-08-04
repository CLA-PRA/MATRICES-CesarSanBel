# Proyecto - Evidencia-Proyecto configurado para Autograding

La evidencia para acreditar el curso es la configuración de una tarea con Autograding para ser resuelta por los alumnos.
El presente repositorio incluye los requisitos y recomendaciones para su implementación.

## Instrucciones.
Configura una tarea con Autograding para que los alumnos puedan resolver una tarea de manejo básico de matrices en base a los siguientes requisitos:

1.- Se debería crear una clase Matriz para manejar matrices de números enteros. Las variables de
instancia de esta clase deberían incluir:

(1) Número de renglones 
(2) Número de columnas 
(3) Elementos de la matriz.

2.- La Matriz debería construirse a partir de la lectura de un archivo mX.mat. Este sería un archivo
de texto que incluiría información de las dimensiones de la matriz y sus elementos.
Ej.- Para una matriz de 2x2 el archivo mX.mat tendría la siguiente estructura:

      2x2
       1   3
      -1   0
      

3.-La corrida del programa debería mostrar en consola (pantalla):

      Suma y multiplicacion de matrices.
      ==================================
      Leyendo matriz A…
      Leyendo matriz B…

      Sumando matrices:
      1  3
      -1  0
      +
      4  5
      -1  0
      =
      5  8
      -2  0
      
      Multiplicando matrices:
      1  3
      -1  0
      x
      4  5
      -1  0
      =
      1  5
      -4 -5
      
3.- Los métodos de la clase Matriz los define el programador acorde a lo necesario para satisfacer
los requisitos (Ej.- suma(), multiplica(), getRenglones(), getColumnas(), esIgualA(), etc).

## CONFIGURACIÓN PARA AUTOGRADING
I.- DESARROLLO DE 1 PLANTILLA BASE PARA 1 EJERCICIO DE TAREA (20% DE LA EVIDENCIA)

a) A partir del repositorio plantilla para ejercicios de Autograding diseña el repositorio solución
para implementar esta tarea. Agrega los dos archivos matriz1.txt y matriz2.txt para que el alumno pueda
probar su tarea de acuerdo a los requisitos.

b) Toma 1 o 2 capturas de pantalla de lo que has hecho y agrégalo a la evidencia.

II.-EXTENSIÓN DE 1 PLANTILLA BASE PARA 1 EJERCICIO DE TAREA PARA AUTOGRADING (50% DE
LA EVIDENCIA)

a) Crea las siguientes pruebas para calificar tu proyecto:

1) Prueba 1: que valida que se ha programado correctamente la suma de matrices. Se configurará
como prueba Java en GitHub Classroom. (Valor: 25 puntos).

2) Prueba 2: que valida que si desean multiplicar matrices, se cumple con la condición de
multiplicación (las columnas de la primer matriz deben coincidir con los renglones de la segunda
matriz). Se configurará como prueba Java en GitHub Classroom. (Valor: 25 puntos)

3) Prueba 3: que valida que se ha programado correctamente la multiplicación de matrices. Se
configurará como prueba Java en GitHub Classroom. (Valor: 25 puntos)

4) Prueba 4: que valida que la salida del programa del alumno es de acuerdo a la corrida indicada
en los requisitos. Se configurará como prueba Input/Output en GitHub Classroom. (Valor: 25 puntos)

b) A partir del repositorio anterior, obtén una copia *.tmp para preparar el repositorio que
distribuirás como código inicial en GitHub Classroom para las tareas de los alumnos.

c) Determina el nivel de dificultad de tu tarea. Acorde a tu decisión, elimina lo que consideres
conveniente en el código inicial de tu repositorio *.tmp. No elimines las pruebas.

d) Toma 1, 2 o 3 capturas de pantalla de lo que has hechoM agrégalo a la evidencia.

III.- CONFIGURACIÓN DE 1 EJERCICIO DE AUTOGRADING PARA GITHUB CLASSROOM: (30% DE LA EVIDENCIA)

a) Dentro de la clase que tienes disponible por el curso en GitHub Classroom, crea la tarea
MATRICES y configura todo lo necesario para su habilitación como Autograding.

b) Prueba la liga que te ofrece GitHub Classroom y resuelve el ejercicio mostrando el
resultado obtenido en las pruebas locales y en el Autograding de GitHub, deberían coincidir.

c) Toma 1 o 2 capturas de pantalla de lo que has hecho y agrégalo a la evidencia.

IV.-ENTREGA DE EVIDENCIA EN TEAMS.

a) Suba tu evidencia en el apartado de tareas del curso en Microsoft Teams.

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
