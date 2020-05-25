package com.itheima;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther LiHao
 * @Date Created in 15:14 2020/5/25
 */
public class MainFrame extends JFrame{
    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public MainFrame() throws HeadlessException {
        //初始化窗体的参数
        initFrame();
        //初始化游戏棋盘
        initGamePanel();
    }

    //初始化游戏棋盘
    private void initGamePanel() {
        JPanel jpanel=new JPanel(){
            //绘制游戏棋盘的内容
            @Override
            public void paint(Graphics g) {
                //Graphics g 可以看作是一个画笔，它提供了很多方法来绘制一些基本的图形（直线、矩形）
                //绘制40条横线

                //绘制40条竖线

                //绘制蛇

                //绘制食物
                super.paint(g);
            }
        };
    }

    //初始化窗体的参数
    private void initFrame() {
        //设置窗体的宽和高
        setSize(610,640);
        //设置窗体位置
        setLocation(300,100);
        //设置关闭按钮的作用(退出)
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //设置窗体大小不可变
        setResizable(false);

    }

    public static void main(String[] args) {
        //创建窗体对象，并显示
        new MainFrame().setVisible(true);
    }


}
