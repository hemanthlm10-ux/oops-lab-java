class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Student extends Person {
    String department;
    double cgpa;

    Student(String name, int id, String department, double cgpa) {
        super(name, id);
        this.department = department;
        this.cgpa = cgpa;
    }

    void displayStudent() {
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }
}

class ResearchScholar extends Student {
    String researchTopic;
    String guideName;

    ResearchScholar(String name, int id, String department, double cgpa,
                    String researchTopic, String guideName) {

        super(name, id, department, cgpa);
        this.researchTopic = researchTopic;
        this.guideName = guideName;
    }

    void displayResearch() {
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Guide Name: " + guideName);
    }
}

public class University {
    public static void main(String[] args) {

        ResearchScholar rs = new ResearchScholar(
                "Arjun",
                101,
                "Computer Science",
                8.9,
                "Quantum Computing",
                "Dr. Sharma"
        );

        rs.displayPerson();
        rs.displayStudent();
        rs.displayResearch();
    }
}