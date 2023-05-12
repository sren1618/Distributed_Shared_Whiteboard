package org.dsA2;

import javax.swing.*;

/**
 * ClassName: ClientUi
 * Package: org.dsA2
 * Description:
 *
 * @Author Shiqiang Ren
 * @Create 12/5/2023 12:32
 * @Version 1.0
 */

public class ClientUi {


    public static void main(String[] args) {

        String[] choices = {"User", "Manager"};

        Object[] inputs = {"Please enter your name：", new JTextField(), "Please select your role：", new JComboBox<>(choices)};
        int option = JOptionPane.showConfirmDialog(null, inputs, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = ((JTextField) inputs[1]).getText();
            String role = (String) ((JComboBox<?>) inputs[3]).getSelectedItem();
            WhiteBoardUi wb = new WhiteBoardUi(username, role);
        }
    }
}

