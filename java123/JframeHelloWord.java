/**
@auther:sjm
@data:2019/07/31
*/
/*import javax.swing.*;

// public class JframeHelloWord{
	// public static void main (String[] args){
        // �൱��body
		JFrame frame = new JFrame("����һ��JFrame");
		// �൱��div
		JPanel panel = new JPanel();
		// �൱������
		JLabel label = new JLabel("helloworld");
		// �����ַ���div��
		panel.add(label);
		// ��div����body��
		frame.setContentPane(panel);
		// ����body�Ŀ��
		frame.setSize(300,200);
		// ��body���ÿɼ�
		frame.setVisible(true);
		*/
import javax.swing.*;
public class JframeHelloWord{
	public static void main(String[] args){
		JFrame frame = new JFrame("����һ��JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("helloworld");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(300,100);
		frame.setVisible(true);
     
		

	}
}