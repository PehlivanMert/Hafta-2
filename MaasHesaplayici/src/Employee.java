public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    // Nitelikleri ve Kurucu methodu oluşturuyoruz

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax;

    void tax() {                          // Burada vergiyi hesaplamak için tax methodunu oluşturuyoruz.

        if (this.salary > 1000) {
            tax = this.salary * 0.03;
            System.out.println("Vergi Miktarı: " + tax);
        } else {
            System.out.println("Vergi Miktarı: 0 ");
        }
    }

    double bonusPrice;

    void bonus() {                                // Bonusları hesaplamak için bonus methodu oluşturuyoruz.
        if (workHours > 40) {
            int overtime = (this.workHours - 40);
            bonusPrice = (overtime * 30);
            System.out.println("Bonus Miktarı: " + bonusPrice);
        } else {
            System.out.println("Bonus Miktarı: 0");
        }
    }

    double raise;
    int now = 2021;

    void raiseSalary() {                    // Yıl 2021 olduğu için bunu bir değişkene atayıp yıla göre maaş artışı hesaplayan
        int year = (now - this.hireYear);   // raiseSalary methodunu oluşturuyoruz
        if (year < 10) {
            raise = (this.salary * 0.05);
            System.out.println("Maaş Artışı: " + raise);
        } else if (10 <= year && year < 20) {
            raise = (this.salary * 0.1);
            System.out.println("Maaş Artışı: " + raise);
        } else {
            raise = (this.salary * 0.15);
            System.out.println("Maaş Artışı: " + raise);
        }
    }

    void totalSalary() {                    // Bonus + maaş - vergi ve totalSalary ile maaş artışını da ekleyip total maaşı bulan methodu oluşturuyoruz.
        double taxBonus = salary + bonusPrice - tax;
        double totalSalary = salary + raise + bonusPrice - tax;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + taxBonus);
        System.out.println("Toplam Maaş: " + totalSalary);


    }

    public String toString() {                //Bu methot ile tüm bilgileri ekrana yazdırıyoruz.
        System.out.println("=============");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        totalSalary();
        System.out.println("=============");

        return null;
    }

}
