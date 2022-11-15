public class Main {
    public static void main(String[] args) {
        System.out.println("---Ejercicio 1_IF---");
        var numerolf = 0;
        if (numerolf==0) {
            System.out.println("La variable es cero");
        }
        else if (numerolf < 0) {
            System.out.println("La variable es negativa");
        }
        else
        System.out.println("La variable es positiva");

        System.out.println("---Ejercicio 2_WHILE---");
        var numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println("Valor variable: "+numeroWhile);
            numeroWhile++;
        }
        System.out.println("---Ejercicio 3_DO WHILE---");
        var numero = 2;
        do {
            System.out.println("Valor variable: "+numero);
            numero++;
        } while (numero<3);
        System.out.println("---Ejercicio 4_FOR---");
        for (int numFor = 0; numFor<=3; numFor++){
            System.out.println(numFor);
        }
        System.out.println("---Ejercicio 5_SWITCH CASE---");
        var estacion = "Pri";
        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No corresponde a una de las cuatro estaciones");
        }
    }
}