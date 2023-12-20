public class Main {
    public static void main(String[] args) {

        // Employee sınıfında personelleri oluşturuyoruz. Ve toString methotu ile bilgilerini yazdırıyoruz.

        Employee personel1 = new Employee("Ahmet",2000,45,1985);
        Employee personel2 = new Employee("Mert",2500,60,2015);
        Employee personel3 = new Employee("John",5000,40,2009);

        personel1.toString();
        personel2.toString();
        personel3.toString();
    }
}