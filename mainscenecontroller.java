import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.stage.FileChooser;
public class mainscenecontroller {

    @FXML
    private Button btn2;

    @FXML
    private Tab btnlexical;

    @FXML
    private Tab btnsem;

    @FXML
    private Tab btnsyntax;

    @FXML
    private ListView listView;

    @FXML
    void btnFile(ActionEvent event) {

    FileChooser fc = new FileChooser();
    File selectedFile = fc.showOpenDialog(null);
    
    FileChooser.ExtensionFilter extFilter =
            new FileChooser.ExtensionFilter("Snail Files (* .Snl)","* .Snl");
    fc.getExtensionFilters().add(extFilter);
    if (selectedFile != null) { 
    
        listView.getItems().add(selectedFile.getPath());}
    else { System.out.println("not valide"); } }

    @FXML
    void btnLexicalClicked(ActionEvent event) {

    }

    @FXML
    void btnSyntaxClicked(ActionEvent event) {

    }

    @FXML
    void btnsemantiqueClicked(ActionEvent event) {

    }

}