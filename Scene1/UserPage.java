package Scene1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class UserPage implements Initializable {
    public AnchorPane userPagePane;
    public TableView<ModelTable> table;
    public TableColumn<ModelTable, String> name;
    public TableColumn<ModelTable, String> author;
    public TableColumn<ModelTable, String> pub_date;
    public TableColumn<ModelTable, Integer> quantity;
    //public Label setTextLabel;
    public Button searchBookButton;

    String email;

    ObservableList<ModelTable> objlist = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/database/database.db");
            if(conn != null){
                String query = "SELECT * from Book_Information";
                Statement stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);

                while(res.next()){
                    objlist.add(new ModelTable(res.getString("name"),
                            res.getString("author"),
                            res.getString("published_on"),
                            res.getInt("quantity")
                            ));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        pub_date.setCellValueFactory(new PropertyValueFactory<>("pub_date"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table.setItems(objlist);
    }

    public void setEmail(String email){
        this.email = email;
        //this.setTextLabel.setText(email);
    }
}
