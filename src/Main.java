public class Main {
    public static void main(String[] args) {
        Cuentas micuenta = new Cuentas("131031", "Credito",150000);
        System.out.println("Saldo Minimo es de: "+micuenta.getSaldoMinimo());
        micuenta.consignar(80000);
        System.out.println("Saldo Actual es de : "+micuenta.getSaldoActual());
        micuenta.retirar(250000);
        System.out.println("saldo Actual: "+micuenta.getSaldoActual());
        System.out.println(micuenta.toString());
        Cuentas pedro = new Cuentas("131031", "Ahorro",2500000);
        System.out.println(pedro.toString());

    }


}
