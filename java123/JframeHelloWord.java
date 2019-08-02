/**
@auther:sjm
@data:2019/07/31
*/
/*import javax.swing.*;

// public class JframeHelloWord{
	// public static void main (String[] args){
        // 相当于body
		JFrame frame = new JFrame("这是一个JFrame");
		// 相当于div
		JPanel panel = new JPanel();
		// 相当于文字
		JLabel label = new JLabel("helloworld");
		// 将文字放入div中
		panel.add(label);
		// 将div放入body中
		frame.setContentPane(panel);
		// 设置body的宽高
		frame.setSize(300,200);
		// 将body设置可见
		frame.setVisible(true);
		*/
import javax.swing.*;
public class JframeHelloWord{
	public static void main(String[] args){
		JFrame frame = new JFrame("这是一个JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("helloworld");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(300,100);
		frame.setVisible(true);
     
		

	}
}