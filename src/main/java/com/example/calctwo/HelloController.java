package com.example.calctwo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;
    @FXML
    private Button result;
    @FXML
    private Button clearField;
    @FXML
    private TextField window;
    @FXML
    private Button zero;
    @FXML
    private Button dot;


    private String operation;
    private Double total;

    @FXML
    protected void setDot(){
        String input = window.getText() + dot.getText();
        window.setText(input);
    }

    @FXML
    protected void setZero(){
        String input = window.getText() + zero.getText();
        window.setText(input);
    }

    @FXML
    protected void setOne(){
        String input = window.getText() + one.getText();
        window.setText(input);
    }

    @FXML
    protected void setTwo(){
        String input = window.getText() + two.getText();
        window.setText(input);
    }

    @FXML
    protected void setThree(){
        String input = window.getText() + three.getText();
        window.setText(input);
    }

    @FXML
    protected void setFour(){
        String input = window.getText() + four.getText();
        window.setText(input);
    }

    @FXML
    protected void setFive(){
        String input = window.getText() + five.getText();
        window.setText(input);
    }

    @FXML
    protected void setSix(){
        String input = window.getText() + six.getText();
        window.setText(input);
    }

    @FXML
    protected void setSeven(){
        String input = window.getText() + seven.getText();
        window.setText(input);
    }

    @FXML
    protected void setEight(){
        String input = window.getText() + eight.getText();
        window.setText(input);
    }

    @FXML
    protected void setNine(){
        String input = window.getText() + nine.getText();
        window.setText(input);
    }

    @FXML
    protected void setPlus(){
        operation = "+";
        total = Double.parseDouble(String.valueOf(window.getText()));
        window.clear();
        SetPromtTextNumberTwo();
    }

    @FXML
    protected void setMinus(){
        operation = "-";
        total = Double.parseDouble(String.valueOf(window.getText()));
        window.clear();
        SetPromtTextNumberTwo();
    }

    @FXML
    protected void setMultiply(){
        operation = "*";
        total = Double.parseDouble(String.valueOf(window.getText()));
        window.clear();
        SetPromtTextNumberTwo();
    }

    @FXML
    protected void setDivide(){
        operation = "/";
        total = Double.parseDouble(String.valueOf(window.getText()));
        window.clear();
        SetPromtTextNumberTwo();
    }

    @FXML
    protected void setPlusOrMinus(){
        window.setText(String.valueOf(Double.parseDouble(String.valueOf(window.getText())) * (-1)));
    }

    private void SetPromtTextNumberTwo(){
        window.setPromptText("Введите второе число");
    }

    @FXML
    protected void getResult(){
        double numTwo = Double.parseDouble(String.valueOf(window.getText()));
            switch (operation){
                case ("+"):
                    total += Double.parseDouble(String.valueOf(window.getText()));
                    break;
                case ("-"):
                    total -= Double.parseDouble(String.valueOf(window.getText()));
                    break;
                case ("*"):
                    if (total == 0.0 || numTwo == 0.0){
                        window.setText("");
                        total = 0.0;
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ошибка");
                        alert.setHeaderText("Найдена ошибка умнижения на 0");
                        alert.show();
                        break;
                    }
                    total *= numTwo;
                    break;
                case ("/"):
                    if (total == 0.0 || numTwo == 0.0){
                        window.setText("");
                        total = 0.0;
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ошибка");
                        alert.setHeaderText("Найдена ошибка деления на 0");
                        alert.show();
                        break;
                    }
                    total /= Double.parseDouble(String.valueOf(window.getText()));
                    break;
            }
            window.setText(String.valueOf(total));
    }

    @FXML
    protected void clearField(){
        window.clear();
        window.setPromptText("Введите первое число");
    }

    @FXML
    protected void backSpace(){
        try {
            window.setText(String.valueOf(window.getText().substring(0, window.getText().length() - 1)));
        } catch (Exception e){
            window.setPromptText("Удаление не возможно");
        }
    }
}