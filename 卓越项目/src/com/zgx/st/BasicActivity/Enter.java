package com.zgx.st.BasicActivity;
import com.zgx.st.Dao.Log_us;
import com.zgx.st.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Enter extends JFrame{

  private JPanel panel;
  private JLabel label, username, sex, pwd, repwd, prompt;
  private JTextField usernameFid;
  private JPasswordField pwdFid, repwdFid;
  private JRadioButton mRbtn, wRbtn;
  private ButtonGroup buttonGroup;
  private ImageIcon icon = new ImageIcon("res/picture.jpg");
  private JButton back, confirm;
  private Font font = new Font("宋体", Font.BOLD, 13);


  public Enter() throws HeadlessException {
    setTitle("宿舍登录系统");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(690,390,450,450);
    setLocationRelativeTo(null);


    panel = (JPanel) getContentPane();
    panel.setOpaque(false);//将面板设置为透明
    label = new JLabel(icon);
    getLayeredPane().add(label, Integer.valueOf(Integer.MIN_VALUE));
    label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
    panel.setLayout(null);

    //用户名
    username = new JLabel("管理员账号:");
    username.setBounds(120, 100, 80, 28);
    panel.add(username);

    usernameFid = new JTextField();
    usernameFid.setBounds(202, 100, 150, 23);

    usernameFid.setFont(new Font("楷体", Font.BOLD, 13));
    panel.add(usernameFid);




    //密码
    pwd = new JLabel("管理员密码:");
    pwd.setBounds(120, 150, 80, 28);
    pwdFid = new JPasswordField();
    pwdFid.setBounds(202, 150, 150, 23);
    panel.add(pwd);
    panel.add(pwdFid);

    //按钮
    confirm = new JButton("登录");
    confirm.setBackground(Color.BLUE);
    confirm.setForeground(Color.YELLOW);
    confirm.setFocusPainted(false);
    confirm.setFont(font);
    confirm.setBounds(153, 278, 75, 32);
    panel.add(confirm);
    confirm.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String u=usernameFid.getText();
        String p=pwdFid.getText();
        if(Log_us.checked(u,p)){
          Menu menu=new Menu();
          menu.creat();
          setVisible(false);
        }else {

        }
      }
    });

    setVisible(true);
    confirm.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });

  }


  public static void main(String[] args) {
    new Enter();

  }
}
