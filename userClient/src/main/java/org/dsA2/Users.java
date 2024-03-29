package org.dsA2;

import javax.swing.*;

/**
 * ClassName: Users
 * Package: org.dsA2
 *
 * @Author Shiqiang Ren
 * @Create 16/5/2023 09:46
 * @Version 1.0
 */
public class Users {

    private  JList<String>  usersList;
    private DefaultListModel<String> model;

    public Users(JList<String>  usersList){
        this.usersList= usersList;
        model = (DefaultListModel<String>) usersList.getModel();
    }

    public String[] getUserArrayList (){
        String[] elements = new String[model.getSize()];
        for (int i = 0; i < model.getSize(); i++) {
            String element = model.getElementAt(i);
            elements[i] = element;
        }
        return elements;
    }

    public void setUserList (String[] userArrayList){
        usersList.setListData(userArrayList);
    }

}
