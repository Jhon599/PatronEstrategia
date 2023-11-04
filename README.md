# Patron Estrategia :rocket:

Strategy es un patrón de diseño de comportamiento con el ámbito de objeto. Su finalidad es la de poder cambiar el algoritmo o comportamiento de un objeto en tiempo de ejecución. Esto ayuda cuando tenemos una aplicación en la que varían solo ciertas partes de la lógica. Con este patrón podemos aislar estos comportamiento o algoritmos en clases diferentes y elegir entre uno u otro en tiempo de ejecución.

# Objetivo o intención del patrón

1.  Definir una familia de algoritmos, encapsular cada uno y volverlos intercambiables.
2.  Permitir que el algoritmo cambie (o se seleccione) dependiendo del cliente que lo utilice.

# Implementación

Para implementar Strategy debemos realizar los siguientes pasos:

1.  Definir una interface, o clase abstracta, Strategy. Esta interface puede tener varios métodos que serán los que se invoquen para ejecutar el algoritmo.
2.  Crear un conjunto de clases concretas que implementen la interface Strategy. Estas son las que contendrán las diferentes operaciones lógicas que aplicaremos. En el ejemplo de envíos, las clases concretas serían las diferentes formas que tenemos de empaquetar los artículos.
3.  Crear una clase "contexto". Contexto es el nombre formal que se le da a la clase que hace uso de Strategy. En el ejemplo anterior, el contexto sería el módulo o parte de la aplicación que ejecuta los 4 pasos para realizar el envío.
4.  Inyectar o crear la instancia de Strategy adecuada para la operación que queremos realizar. La forma en la que se obtiene esta instancia queda fuera del alcance del patrón, pero podemos usar Factory Method para decidir cuál instancia debemos usar.

## Diagrama

![PatronEstrategia](https://github.com/Jhon599/PatronEstrategia/assets/143898470/352ce216-3732-41c8-ab41-79b2469e0f14)
