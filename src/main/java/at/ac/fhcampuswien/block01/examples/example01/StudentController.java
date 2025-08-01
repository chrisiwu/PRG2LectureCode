package at.ac.fhcampuswien.block01.examples.example01;

public class StudentController {
    // holds reference to model and view
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }

    public String getStudentName() {
        return this.model.getName();
    }

    public void setStudentRollNo(int rollNo) {
        this.model.setRollNo(rollNo);
    }

    public int getStudentRollNo() {
        return this.model.getRollNo();
    }

    // updates view according to data changes
    public void updateView() {
        this.view.printStudentDetails(this.model.getName(), this.model.getRollNo());
    }
}