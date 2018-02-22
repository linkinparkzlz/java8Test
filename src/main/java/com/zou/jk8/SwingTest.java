package com.zou.jk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest {


    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My  JFrame");
        JButton jButton = new JButton("My Button");


        //使用呢名内部类
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button  Pressed");
            }
        });

        //使用lambda表达式 e:参数     -> ：箭头符号      System.out.println("Button  Pressed")  ： 执行体
        // jButton.addActionListener(e -> System.out.println("Button  Pressed"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

/*

Lambda表达式的基本结构：

(param1,param2,param3) -> {


}

 */