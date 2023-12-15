public class Validacion {

    private String ip;
    private String ipString[] = new String[4];
    private int mascara;

    public String getIp() {
        return ip;
    }

    public int getMascara() {
        return mascara;
    }

    public void splitear(String ip) {
        ipString = ip.split("\\.");
    }

    public void setMascara(int mascara) {
        this.mascara = mascara;
    }

    public void validar(String ip, int mascara) {
        int cont = 0;
        boolean flag = false;
        for (int i = 0; i < ip.length() - 1; i++) {
            if (ip.charAt(i) == '.') {
                cont++;
            }
        }

        for(int i=0;i< ipString.length;i++){
            int num = Integer.parseInt(ipString[i]);
            if(num>255|| num<0){
                flag=true;
            }
        }

        if (ip.length() < 7 || ip.length() > 15) {
            System.out.println("La ip " + ip + " no es una ip válida.");
        } else if (cont > 3) {
            System.out.println("La ip " + ip + " no es una ip válida.");
        } else if (flag){
            System.out.println("La ip " + ip + " no es una ip válida.");
        } else if(mascara>32 || mascara<1){
            System.out.println("La máscara " + mascara + " no es una máscara válida.");
        }
    }
}