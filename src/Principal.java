public class Principal {
    public static void main(String[] args) {
        Calculadora objCal = new Calculadora(4,5);

        Number valor = objCal.sumar();
        System.out.println("Suma: "+valor);
        valor = objCal.restar();
        System.out.println("Resta: "+valor);
        valor = objCal.multiplicar();
        System.out.println("Multiplicacion: "+valor);
        valor = objCal.dividir();
        System.out.println("Division: "+valor);

    }
}
