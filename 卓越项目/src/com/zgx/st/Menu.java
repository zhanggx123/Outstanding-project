package com.zgx.st;

import com.zgx.st.BasicActivity.Building;
import com.zgx.st.BasicActivity.Pay;
import com.zgx.st.BasicActivity.RoomManage;
import com.zgx.st.BasicActivity.StudentInfoManage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
  private JPanel jpanel;
  private JPanel jpanel_left;
  public  JPanel jpanel_right;
  private JButton stu_button;
  private JButton roomMang;
  private JButton roomInfo;
  private JButton pay;
  private JButton updataButton;
  private static JFrame frame;

  public Menu() {
 //   Timer timer =new Timer(1000,this);
    stu_button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jpanel_right.removeAll();
        jpanel_right.add(new StudentInfoManage().jpanel);
        jpanel_right.validate();
        jpanel_right.repaint();
      }
    });
    roomMang.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jpanel_right.removeAll();
        jpanel_right.add(new RoomManage().jpanel);
        jpanel_right.validate();
        jpanel_right.repaint();

      }
    });
    roomInfo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jpanel_right.removeAll();
        jpanel_right.add(new Building().jpanel);
        jpanel_right.validate();
        jpanel_right.repaint();
      }
    });
    pay.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jpanel_right.removeAll();
        jpanel_right.add(new Pay().Pay());
        jpanel_right.validate();
        jpanel_right.repaint();
      }
    });
  }
  public  void creat(){
    frame = new JFrame("Menu");
    frame.setContentPane(new Menu().jpanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  frame.setLocationRelativeTo(null);
//   frame.setResizable(false);
    frame.setBounds(740,300,600,500);
    frame.setVisible(true);
  }


  private void createUIComponents() {
    // TODO: place custom component creation code here
  }
}
