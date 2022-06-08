public class Calculadora <T extends Number> {
    private T n1;
    private T n2;

    public Calculadora(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public <T> double sumar(){
        return n1.doubleValue() + n2.doubleValue();
    }

    public <T> double restar(){
        return n1.doubleValue() - n2.doubleValue();
    }

    public <T> double multiplicar(){
        return n1.doubleValue() * n2.doubleValue();
    }

    public <T> double dividir(){
        if (n2.doubleValue() == 0)
            return 0;
        return n1.doubleValue() / n2.doubleValue();
    }
}
