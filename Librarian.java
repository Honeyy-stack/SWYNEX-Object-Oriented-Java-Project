class Librarian extends User {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    void displayInfo() {
        System.out.println("Librarian ID: " + id + ", Name: " + name);
    }
}
