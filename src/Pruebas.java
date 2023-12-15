public class Pruebas {
    public static void main(String[] args) {
        Validacion v = new Validacion();
        String ip = "255.255.255.255";
        int mascara = 1;
        v.splitear(ip);
        v.validar(ip,mascara);
        v.setMascara(mascara);

    }
}
