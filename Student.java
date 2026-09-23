class Student extends User {

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}
