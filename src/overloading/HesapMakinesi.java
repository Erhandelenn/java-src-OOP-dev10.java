package overloading;


public class HesapMakinesi {

    public static void toplama (int a ,int b){
        System.out.println("2 Sayılı Toplama İşlemi : " + (a+b));
    }
    public static void toplama (int a ,int b ,int c ){
        System.out.println("3 Sayılı Toplama İşlemi : " + (a+b+c));
    }

    public static void cikarma (int a ,int b){
        System.out.println("2 Sayılı Çıkarma İşlemi : " + (a-b));
    }
    public static void cikarma (int a ,int b ,int c){
        System.out.println("3 Sayılı Çıkarma İşlemi : " + (a-b-c));
    }
    public static void carpma (int a ,int b){
        System.out.println("2 Sayılı Çarpma İşlemi : " + (a*b));
    }
    public static void carpma (int a ,int b,int c){
        System.out.println("3 Sayılı Çarpma İşlemi : " + (a*b*c));
    }
    public static void bolme(double a, double b) {
        if (b == 0) {
            System.out.println("Bölen 0 olamaz.");
        }
        System.out.println("2 Sayılı Bölme İşlemi : " + (a/b));
    }
    public static void bolme(double a, double b, double c) {
        if (b == 0 || c == 0)  {
            System.out.println("Bölen 0 olamaz.");
            return;
        }
        System.out.println("3 Sayılı Bölme İşlemi :  " + ((a/b)/c));
    }


    public static void main(String[] args) {
        toplama(15,58);
        toplama(56,45,78);
        cikarma(36,89);
        cikarma(198,56,12);
        carpma(59,54);
        carpma(5,5,25);
        bolme(105,19);
        bolme(1682,6,2);
    }
}
