public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "512");
        Teacher t2 = new Teacher("Graham","FZK","556");
        Teacher t3 = new Teacher("Celal Hoca","GEO","553");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course cografya = new Course("Coğrafya","103","GEO");
        cografya.addTeacher(t3);




        Student s1 = new Student("Mert","597","4",tarih,fizik,cografya);
        s1.addBulkExamNote(85,45,85);
        s1.addBulkOpinionNote(85,70,100);
        s1.isPass();

        Student s2 = new Student("Rabia","757","4",tarih,fizik,cografya);
        s1.addBulkExamNote(70,90,95);
        s1.addBulkOpinionNote(80,100,100);
        s1.isPass();

        Student s3 = new Student("Hayri","123","4",tarih,fizik,cografya);
        s1.addBulkExamNote(25,45,65);
        s1.addBulkOpinionNote(50,70,85);
        s1.isPass();


    }

}
