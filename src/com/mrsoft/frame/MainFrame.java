package com.mrsoft.frame;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.mrsoft.music.AudioPlayWave;
import com.mrsoft.panel.GamePanel;
public class MainFrame extends JFrame {
	public static void main(String args[]) {
		MainFrame frame = new MainFrame(); // 创建主窗体
		frame.setVisible(true); // 使主窗体可见
		// 根据路径找到音乐路径，并创建音乐播放类
		AudioPlayWave audioPlayWave = new AudioPlayWave("src/music/讨喜.wav");
		audioPlayWave.start(); // 播放音乐
	}
	public MainFrame() { // 主窗体的构造方法
		// 设置窗体内容面板的布局为边界布局
		getContentPane().setLayout(new BorderLayout());
		setTitle("拼图游戏"); // 设置窗体的标题
		setBounds(300, 300, 358, 414); // 设置窗体的位置和宽高
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体的关闭方式
		// 实例化一个用来摆放“开始”按钮的面板
		final JPanel panel = new JPanel();
		// 把用来摆放“开始”按钮的面板添加到内容面板的上方（北部）
		getContentPane().add(panel, BorderLayout.NORTH);
		// 实例化游戏面板
		final GamePanel gamePanel = new GamePanel();
		// 把游戏面板添加到内容面板的中间
		getContentPane().add(gamePanel, BorderLayout.CENTER);
		// 实例化“开始”按钮
		final JButton button = new JButton();
		// 为“开始”按钮添加动作事件监听器
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) { // “开始”按钮发生动作时
				// 开始游戏
				gamePanel.random();
			}
		});
		button.setText("开始"); // 设置按钮中的文本内容
		panel.add(button); // 把按钮添加到面板中
	}
}
