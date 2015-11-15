package Pentomino;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Configuration {
	
	protected static String rotate ="Up", left= "Left", right="Right", down="Down", pause="P";
	private static ArrayList<Choice> choices;
	
	public static void openConfig(JFrame frame){
		
		choices= new ArrayList<Choice>();
		final JFrame options = new JFrame("Options");
		options.setSize(400,300);
		options.setResizable(false);
		options.setLocationRelativeTo(frame);
		options.setLayout(null);
		
		Choice left =addChoice("Left", options, 30, 30);
		left.select(Configuration.left);		
		Choice right =addChoice("Right", options, 150, 30);
		right.select(Configuration.right);
		Choice down =addChoice("Down", options, 30, 80);
		down.select(Configuration.down);
		Choice rotate =addChoice("Rotate", options, 150, 80);
		rotate.select(Configuration.rotate);
		Choice pause =addChoice("Pause", options, 30, 130);
		pause.select(Configuration.pause);
		
		JButton done = new JButton("Done");
		done.setBounds(150, 220, 100, 30);
		done.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				options.dispose();
				saveChanges();
			}
		});
		options.add(done);
		options.setVisible(true);
	}
	
	public static void saveChanges(){
		Choice left = choices.get(0) ;
		Choice right = choices.get(1);
		Choice down = choices.get(2);
		Choice rotate = choices.get(3);
		Choice pause = choices.get(4);
		
		Configuration.left = left.getSelectedItem();
		Configuration.right = right.getSelectedItem();
		Configuration.down = down.getSelectedItem();
		Configuration.rotate = rotate.getSelectedItem();
		Configuration.pause = pause.getSelectedItem();
		
		try{
			saveConfig();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static Choice addChoice(String name, JFrame options, int x, int y){
		JLabel label = new JLabel(name);
		label.setBounds(x, y-20, 100, 20);
		Choice key= new Choice();
		for(String s: getKeyNames()){
			key.add(s);
		}
		key.setBounds(x, y, 100, 20);
		options.add(key);
		options.add(label);
		choices.add(key);
		return key;
	}
	
	public static ArrayList<String>	getKeyNames(){
		ArrayList<String> result = new ArrayList<String>();
		for(String s: KeyGetter.keyNames){
			result.add(s);
			if (s.equalsIgnoreCase("F24")){
				break;
			}
		}
		return result;
	}
	
	public static void loadConfig() throws Exception{
		String path = Paths.get(".").toAbsolutePath().normalize().toString();
		File directory = new File(path, "/Text Files");
		if (!directory.exists()){
			directory.mkdirs();
		}
		File config = new File(directory, "/config.txt");
		if (!config.exists()){
			config.createNewFile();
			System.out.println("File not found, saving defaults");
			saveConfig();
			return;
		}
		Scanner s = new Scanner(config);
		HashMap<String, String> values = new HashMap<String, String>();
		while(s.hasNextLine()){
			String[] entry = s.nextLine().split(":");
			String key = entry[0];
			String value = entry[1];
			values.put(key, value);
		}
		if(values.size() != 5){
			System.out.println("Config is unnusable, saving defaults");
			saveConfig();
			return;
		}
		if(!values.containsKey("left") || !values.containsKey("right") || !values.containsKey("rotate") || !values.containsKey("down") || !values.containsKey("pause")){
			System.out.println("Invalid names in config, saving defaults");
			saveConfig();
			return;
		}
		String left = values.get("left");
		String right = values.get("right");
		String rotate = values.get("rotate");
		String down = values.get("down");
		String pause = values.get("pause");
		
		if (!(getKeyNames().contains(left) && getKeyNames().contains(right) && getKeyNames().contains(rotate) && getKeyNames().contains(down) && getKeyNames().contains(pause))){
			System.out.println("Invalid key in config, saving defaults");
			return;
		}
		Configuration.left = left;
		Configuration.right = right;
		Configuration.rotate = rotate;
		Configuration.down = down;
		Configuration.pause = pause;
		
		
	}
	
	public static void saveConfig() throws Exception{
		String path = Paths.get(".").toAbsolutePath().normalize().toString();
		
		File directory = new File(path, "/Text Files");
		if (!directory.exists()){
			directory.mkdirs();
		}
		File config = new File(directory, "/config.txt");
		if (!config.exists()){
			config.createNewFile();
			System.out.println("File not found, saving defaults");
			saveConfig();
			return;
		}
		
		PrintWriter pw = new PrintWriter(config);
		pw.println("right:" + right);
		pw.println("left:" + left);
		pw.println("rotate:" + rotate);
		pw.println("down:" + down);		
		pw.println("pause:" + pause);
		pw.close();
	}
	
	
	
}
