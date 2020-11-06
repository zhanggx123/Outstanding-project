package com.zgx.st.BasicActivity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfoManage {
  public JPanel jpanel;
  private JLabel jlabel;
  private JLabel jlabel1;
  private JTextField textField1;
  private JButton searchButton;

  public JPanel getJFrame() {

    JPanel j=new StudentInfoManage().jpanel;
    searchButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          
      }
    });

    return  j;
  }


}
