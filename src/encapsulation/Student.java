package encapsulation;

public final class Student {
    private final String ad;
    private final String soyad;
    public Student(String ad, String soyad) {

        if (ad == null || ad.isEmpty()) {
            System.out.println("Ad boş olamaz.");
        }
        if (soyad == null || soyad.isEmpty()) {
            System.out.println("Soyad boş olamaz.");git checkout -b student
        }
        this.ad = ad;
        this.soyad = soyad;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public static void main(String[] args) {
        Student ogrenci = new Student("Erhan", "Delen");
        System.out.println("Öğrencinin Adı: " + ogrenci.getAd());
        System.out.println("Öğrencinin Soyadı: " + ogrenci.getSoyad());

    }
}