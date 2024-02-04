package AssignThree;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<Integer, String> studentMap;

    public StudentRegistry() {
        this.studentMap = new HashMap<>();
    }

    public void addStudent(int studentID, String studentName) {
        studentMap.put(studentID, studentName);
    }

    public String getStudentName(int studentID) {
        return studentMap.get(studentID);
    }

    public void removeStudent(int studentID) {
        studentMap.remove(studentID);
    }

    public void displayAllStudents() {
        for (int studentID : studentMap.keySet()) {
            System.out.println("ID: " + studentID + ", Name: " + studentMap.get(studentID));
        }
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        registry.addStudent(11, "Sohit");
        registry.addStudent(12, "Ishita");
        registry.addStudent(13, "Ashish");

        registry.displayAllStudents();

        int studentIDToRetrieve = 12;
        String studentName = registry.getStudentName(studentIDToRetrieve);
        System.out.println("\nName of Student with ID " + studentIDToRetrieve + ": " + studentName);

        int studentIDToRemove = 11;
        registry.removeStudent(studentIDToRemove);

        System.out.println("\nAfter removing student with ID " + studentIDToRemove + ":");
        registry.displayAllStudents();
    }
}
