package at.ac.fhcampuswien.block01.examples.example01;

public class Main {
    public static void main(String[] args) {
        // create a model of type Student
        Student model = new Student("John Doe", 1);
        // create a view to display student details
        StudentView view = new StudentView();

        // create a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        // controller updates the view
        controller.updateView();

        // controller updates the model data
        controller.setStudentName("Jane Doe");
        controller.setStudentRollNo(2);

        // controller updates the view again
        controller.updateView();
    }
}