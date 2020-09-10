package hw24;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

public class testApp {
    public static class Window extends JFrame {
        private final ArrayList<FileNameExtensionFilter> fnefilter;

        public Window() {
            super("testApp");
            fnefilter = new ArrayList<>();

            MenuBar menuBar = new MenuBar();
            this.setMenuBar(menuBar);
            Menu menuFile = new Menu("File", true);
            Menu menuType = new Menu("Type", true);
            menuBar.add(menuFile);
            //create items for File
            MenuItem menuItemOpen = new MenuItem("Open");
            MenuItem menuItemQuit = new MenuItem("Quit");
            menuFile.add(menuItemOpen);
            menuFile.add(menuItemQuit);
            //bind open file button
            menuItemOpen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showFile();
                    //System.exit(0);
                }
            });
            //bind quit button
            menuItemQuit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            //create items for Type
            menuBar.add(menuType);
            CheckboxMenuItem menuItemTxt = new CheckboxMenuItem("txt");
            CheckboxMenuItem menuItemJpg = new CheckboxMenuItem("jpg");
            CheckboxMenuItem menuItemExe = new CheckboxMenuItem("exe");
            menuType.add(menuItemTxt);
            menuType.add(menuItemJpg);
            menuType.add(menuItemExe);
            //bind buttons
            menuItemTxt.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    FileNameExtensionFilter fef = new FileNameExtensionFilter("txt(*.txt, *.TXT)", "txt");
                    if (menuItemTxt.getState()) fnefilter.add(fef);
                    else fnefilter.remove(fef);
                    System.out.println(menuItemTxt.getState());
                }
            });
            menuItemJpg.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    FileNameExtensionFilter fef = new FileNameExtensionFilter("jpg(*.jpg, *.JPG, *.jpeg, *.JPEG)", "jpg", "jpeg");
                    if (menuItemJpg.getState()) fnefilter.add(fef);
                    else fnefilter.remove(fef);
                }
            });
            menuItemExe.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    FileNameExtensionFilter fef = new FileNameExtensionFilter("exe(*.exe, *.EXE)", "exe");
                    if (menuItemExe.getState()) fnefilter.add(fef);
                    else fnefilter.remove(fef);
                }
            });
            //set basic param
            setSize(800, 600);
            setVisible(true);
            this.setLocationRelativeTo(null);
            this.setResizable(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        private void showFile() {
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new File("./src/hw24"));//set to current folder
            jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//set selection mode
            jfc.setMultiSelectionEnabled(true);
            if (this.fnefilter.size() != 0) {
                for (FileNameExtensionFilter fef : fnefilter) {
                    jfc.addChoosableFileFilter(fef);
                }
            }
            jfc.showOpenDialog(Window.this);
        }
    }

    public static void main(String[] args) {
        new Window();
    }
}
