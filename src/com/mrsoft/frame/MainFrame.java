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
		MainFrame frame = new MainFrame(); // ����������
		frame.setVisible(true); // ʹ������ɼ�
		// ����·���ҵ�����·�������������ֲ�����
		AudioPlayWave audioPlayWave = new AudioPlayWave("src/music/��ϲ.wav");
		audioPlayWave.start(); // ��������
	}
	public MainFrame() { // ������Ĺ��췽��
		// ���ô����������Ĳ���Ϊ�߽粼��
		getContentPane().setLayout(new BorderLayout());
		setTitle("ƴͼ��Ϸ"); // ���ô���ı���
		setBounds(300, 300, 358, 414); // ���ô����λ�úͿ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���Ĺرշ�ʽ
		// ʵ����һ�������ڷš���ʼ����ť�����
		final JPanel panel = new JPanel();
		// �������ڷš���ʼ����ť�������ӵ����������Ϸ���������
		getContentPane().add(panel, BorderLayout.NORTH);
		// ʵ������Ϸ���
		final GamePanel gamePanel = new GamePanel();
		// ����Ϸ�����ӵ����������м�
		getContentPane().add(gamePanel, BorderLayout.CENTER);
		// ʵ��������ʼ����ť
		final JButton button = new JButton();
		// Ϊ����ʼ����ť��Ӷ����¼�������
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) { // ����ʼ����ť��������ʱ
				// ��ʼ��Ϸ
				gamePanel.random();
			}
		});
		button.setText("��ʼ"); // ���ð�ť�е��ı�����
		panel.add(button); // �Ѱ�ť��ӵ������
	}
}
