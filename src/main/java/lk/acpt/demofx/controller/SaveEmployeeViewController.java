package lk.acpt.demofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.acpt.demofx.dto.Employee;
import lk.acpt.demofx.service.EmployeeService;
import lk.acpt.demofx.service.impl.EmployeeServiceImpl;

public class SaveEmployeeViewController {
    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNic;

    @FXML
    private TextField txtSalary;

    @FXML
    void save(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double salary = Double.parseDouble(txtSalary.getText());

        Employee employee = new Employee(nic, name, age, salary);

        EmployeeService service = new EmployeeServiceImpl();
        boolean saved = service.saveEmployee(employee);

        if(saved){
            //success alert
        }else{
            //error alert
        }
    }

}
