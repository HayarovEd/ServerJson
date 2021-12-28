
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class StartForm {
    @FXML
    private Label levelView;
    ReleaseServer releaseServer = new ReleaseServer();
    @FXML
    private   Button startBottom;
    @FXML
    private Button stopBottom;
    @FXML
    public void initialize(){
        levelView.setText(levelView.getText()+"Server is started");
        startBottom.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            try {
                releaseServer.startServer();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        stopBottom.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            try {
                releaseServer.stopServer();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }



}
