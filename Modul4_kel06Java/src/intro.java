public class intro {
    public void sapa() {
        System.out.println("Haloo Worldd!!");
    }

    public String perkenalan(String nama, String kota, String hobi) {
        return "Namaku " + nama + ", Aku dari " + kota + " dan hobiku adalah " + hobi;
    }

    public void umur(int umur) {
        System.out.println("Aku berumur " + umur + " tahun");
    }

    public static void main(String args[]){
        System.out.println();
        System.out.println("-----------------");
        intro objek = new intro();
        objek.sapa();
        System.out.println(objek.perkenalan("Lanjar","Blora","Ndoding(kali)"));
        objek.umur(15);
    }
}

