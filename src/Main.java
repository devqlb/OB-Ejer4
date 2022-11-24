public class Main {
    public static void main(String[] args) {

/*
Consigna=
Usando un if, crear una condición que compare si la variable numeroIf es
positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
*/
        System.out.println("***Ejercicio con if=");


        int numeroIf = 80;

        if (numeroIf > 0) {
            System.out.println(numeroIf);
            System.out.println(" es positivo, ya que es mayor a cero");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf);
            System.out.println("es negativo, ya que es menor a cero ");
        } else if (numeroIf == 0) {
            System.out.println(numeroIf);
            System.out.println("es igual a cero");
        }


/*
Consigna=
* Crea un bucle While, este bucle tendrá que tener como condición que la
* variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
1.Incrementar el valor de la variable en uno cada vez que se ejecute.
2.Mostrarlo por pantalla cada vez que se ejecute.
* */
        System.out.println("***Ejercicio con while=");


        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


/*
Consigna=
Para el bucle Do While, deberás crear la misma estructura que en el While, pero
solo se debe ejecutar una vez.
*/
        System.out.println("***Ejercicio con do while=");


        int numeroDoWhile = 5;

        do {
            numeroDoWhile++;
            System.out.println("se imprime una sola vez el número:");
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 6);



/*
Para el bucle For, crea una variable numeroFor,
esta variable tendrá como valor 0 y su condición será
que la variable sea igual o menor que 3, se irá incrementando
en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
 */

        System.out.println("***Ejercicio con for=");


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);

        }

/*
Por último, para el Switch, deberás crear la variable estacion, y
distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá
mandar un mensaje por consola informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la
 variable no sea una estación.
 */

        System.out.println("***Ejercicio con switch=");


        String estacion = "Invierno";

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;

            case "Otoño":
                System.out.println("Es Otoño");
                break;

            case "Invierno":
                System.out.println("Es Invierno");
                break;

            case "Primavera":
                System.out.println("Es Primavera");
                break;


            default:
                System.out.println("El valor de la variable no pertence a una estación del año");
        }

    }

}
