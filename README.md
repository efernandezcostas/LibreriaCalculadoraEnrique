## Raíz cuadrada y raíz cúbica
Para crear una nueva operación que haga las dos raices (cuadrada y cúbica), sólo tenemos que añadir un nueva constante estatica que represente esta operación en el método que hace los cálculos.
Asignamos el radicando a una variable y, dependiendo de si es 2 o 3, realizamos Math.sqrt o Math.cbrt, respectivamente.


## Cualquier raíz
Para hacer la raíz genérica y que sirva con cualquier radicando e índice, tenemos que recoger ambos números en variables y realizamos la operación: \
```resultado = (float) Math.pow(radicando, 1/indice)``` \
Con esta operación podemos realizar la raíz con cualquier combinación de números.

## Merge --squash
Hago checkout a main y ```git merge --squash raices```. \
Después hago un commit y push.

## Creamos .jar
Creamos el .jar en Opciones>Project Structure>Artifacts>.jar \
Construimos el jar con Build>Build Artifact

## Lanzamos release
