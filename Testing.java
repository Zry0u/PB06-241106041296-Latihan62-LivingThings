public class Testing {
    public static void main(String[] args) {
        HighHuman someonespecial = new HighHuman();
        HighHuman normalhuman = new HighHuman();
        normalhuman.setNama("Rizky Adam Kurniawan");
        someonespecial.setNama("R*** Y*****");

        normalhuman.jalan(normalhuman.getNama());
        normalhuman.napas(normalhuman.getNama());
        normalhuman.emam(normalhuman.getNama());

        someonespecial.love(someonespecial.getNama());
    }
}
//Muhammad Fadil Al Zabar - 241106041296
//PBO RegulerC