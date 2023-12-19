public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int opinion;

    Course(String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int opinion = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }

        printTeacherInfo();

    }

    void printTeacherInfo() {
        this.teacher.print();

    }

}
