package DBTEST.controller;

import DBTEST.dao.StudentDAO;
import DBTEST.model.Student;
import DBTEST.view.StudentView;

public class StudentController {

    private StudentDAO dao;
    private StudentView view;

    public StudentController(StudentDAO dao, StudentView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() throws Exception {
        while (true) {
            int menu = view.showMenu();

            switch (menu) {
                case 1:
                    Student s = view.inputStudent();
                    dao.insert(s);
                    break;

                case 2:
                    view.printResult(dao.selectAll());
                    break;

                case 3:
                    view.printResult(dao.selectByName(view.inputName()));
                    break;

                case 4:
                    view.printResult(dao.selectById(view.inputId()));
                    break;

                case 5:
                    dao.delete(view.inputName());
                    break;

                default:
                    return;
            }
        }
    }
}
