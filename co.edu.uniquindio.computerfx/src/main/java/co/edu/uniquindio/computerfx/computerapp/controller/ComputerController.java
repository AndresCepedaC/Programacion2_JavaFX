package co.edu.uniquindio.computerfx.computerapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.computerfx.computerapp.model.Computer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ComputerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton buttonOffice;

    @FXML
    private TextField motherboardtxt;

    @FXML
    private TextArea getResult;

    @FXML
    private Button buttonAddComputer;

    @FXML
    private RadioButton buttonGamer;

    @FXML
    private RadioButton butonComputerHome;

    @FXML
    private TextField memoryramtxt;

    @FXML
    private TextField graphiccardtxt;

    @FXML
    private TextField ssdtxt;

    @FXML
    private TextField processortxt;

    @FXML
    private TextField powersourcetxt;
    @FXML
    void onAddComputer(ActionEvent event) {
        createComputer();
    }

    @FXML
    void initialize() {
        assert buttonOffice != null : "fx:id=\"buttonOffice\" was not injected: check your FXML file 'Computer.fxml'.";
        assert motherboardtxt != null : "fx:id=\"motherboardtxt\" was not injected: check your FXML file 'Computer.fxml'.";
        assert getResult != null : "fx:id=\"getResult\" was not injected: check your FXML file 'Computer.fxml'.";
        assert buttonAddComputer != null : "fx:id=\"buttonAddComputer\" was not injected: check your FXML file 'Computer.fxml'.";
        assert buttonGamer != null : "fx:id=\"buttonGamer\" was not injected: check your FXML file 'Computer.fxml'.";
        assert butonComputerHome != null : "fx:id=\"butonComputerHome\" was not injected: check your FXML file 'Computer.fxml'.";
        assert memoryramtxt != null : "fx:id=\"memoryramtxt\" was not injected: check your FXML file 'Computer.fxml'.";
        assert graphiccardtxt != null : "fx:id=\"graphiccardtxt\" was not injected: check your FXML file 'Computer.fxml'.";
        assert ssdtxt != null : "fx:id=\"ssdtxt\" was not injected: check your FXML file 'Computer.fxml'.";
        assert processortxt != null : "fx:id=\"processortxt\" was not injected: check your FXML file 'Computer.fxml'.";
        assert powersourcetxt != null : "fx:id=\"powersourcetxt\" was not injected: check your FXML file 'Computer.fxml'.";

    }
    private void createComputer() {
        Computer computer = new Computer();
        computer.setProcessor(processortxt.getText());
        computer.setGraphicCard(motherboardtxt.getText());
        computer.setMemoryRAM(Integer.parseInt(memoryramtxt.getText()));
        computer.setSsd(Integer.parseInt(ssdtxt.getText()));
        computer.setPowerSource(Integer.parseInt(powersourcetxt.getText()));
        computer.setMotherBoard(motherboardtxt.getText());

        if (buttonGamer.isSelected()){
            computer.setVelocityMemoryRam(6400);
            computer.setGenerationProssesor("Ultimate Generation");
            computer.setModelMotherboard("Ultimate generation");
        }else if (butonComputerHome.isSelected()){
            computer.setVelocityMemoryRam(1600);
            if (computer.getProcessor().equalsIgnoreCase("intel")){
                computer.setGenerationProssesor("8th generation");
                computer.setModelMotherboard("B360");
            }else{
                computer.setGenerationProssesor("2th generation");
                computer.setModelMotherboard("B320");
            }
        } else if (buttonOffice.isSelected()) {
            computer.setVelocityMemoryRam(3600);
            if (computer.getProcessor().equalsIgnoreCase("intel")){
                computer.setGenerationProssesor("11th generation");
                computer.setModelMotherboard("B460 Intel");
            }else {
                computer.setGenerationProssesor("3th generation AMD");
                computer.setModelMotherboard("B550m");
            }
        }
        getResult.setText(computer.toString());
    }

}
