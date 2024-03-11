## Raíz cuadrada y raíz cúbica
Para crear una nueva operación que haga las dos raices (cuadrada y cúbica), sólo tenemos que añadir un nueva constante estatica que represente esta operación en el método que hace los cálculos.
Asignamos el radicando a una variable y, dependiendo de si es 2 o 3, realizamos Math.sqrt o Math.cbrt, respectivamente.


## Cualquier raíz
Para hacer la raíz genérica y que sirva con cualquier radicando e índice, tenemos que recoger ambos números en variables y realizamos la operación: \
```resultado = (float) Math.pow(radicando, 1/indice)``` \
Con esta operación podemos realizar la raíz con cualquier combinación de números.