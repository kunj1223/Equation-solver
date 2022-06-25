import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Main {

    @FXML
    private Button btnClear; //to create clear button created

    @FXML
    private Button btnExit; //to create exit button 

    @FXML
    private Button btnSolve;//to create solve button

    @FXML
    private Label labelA;// to create label of a

    @FXML
    private Label labelB;// to create label of b

    @FXML
    private Label labelC;// to create label of c

    @FXML
    private Label labelans;// to create label of ans

    @FXML
    private TextArea txtaraans; // to create txt area to display result

    @FXML
    private TextField txtflda; // to create txt field to enter a

    @FXML
    private TextField txtfldb; // to create txt field to enter b


    @FXML
    private TextField txtfldc;  // to create txt field to enter c


    @FXML
    void ButtonThree(ActionEvent event) // to declare function of exit button
     {
    
        Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
        a.setTitle("Confirmation Message ");  //to set title of exit page
        a.setContentText("Click Ok to exit! "); 
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });


    }

    @FXML
    void buttonOne(ActionEvent event) // to declare functions of solve button
     {
        
        
        if(txtflda.getText().isEmpty() || txtfldb.getText().isEmpty() || txtfldc.getText().isEmpty()) //to display error when anyone of field is empty.
        {
              Alert a=new Alert(Alert.AlertType.ERROR);
              a.setTitle("Error message");
              a.setContentText("The Value of A or B Or C can't be black. You can insert 00 instead.");
              a.show();  
        }
        else // to count and siplay the result
        {
            double val1=Double.parseDouble(txtflda.getText()); // to get input and store it in local variable
            double val2=Double.parseDouble(txtfldb.getText()); // to get input and store it in local variable
            double val3=Double.parseDouble(txtfldc.getText()); // to get input and store it in local variable
            double d=(val2*val2) - (4*val1*val3);

            if (d<0) // to show error message when Discrimainant is less than zero.
        {
            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information message");
            a.setContentText("The discriminant is less than 0, there is no solution for this question :) ");
            a.show(); 
            txtflda.clear();
            txtfldb.clear();
            txtfldc.clear();
        }  
            else // to caclculate answer if the discriminant is greater zero
        {
            double k=Math.sqrt(d);
            double ans=(-val2+k)/(2*val1); 
            double ans2=(-val2-k)/(2*val1);

            if (ans==ans2) // to display the result if answer is only one.
            {
                txtaraans.setText("Value of X is " + ans );
            }
            else // to display if the result is two.
            {
                txtaraans.setText("Value of X is " + ans + " & " + ans2);
            }
            
        }         
    } 
}



    @FXML
    void buttonTwo(ActionEvent event) // to clear all the fields.
    
    {

        txtflda.clear();
        txtfldb.clear();
        txtfldc.clear();
        txtaraans.clear();
    }

}

