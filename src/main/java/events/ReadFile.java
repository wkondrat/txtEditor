package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import main.MainFrame;
import panels.PathPanel;

public class ReadFile implements ActionListener {

	private JTextArea area;

	public void actionPerformed(ActionEvent arg0) {

		area = MainFrame.mainPanel.textAreaPanel.textArea;
		String path = MainFrame.mainPanel.namePanel.textField.getText();

		try {
			if (!path.equals("") && new File(path).isFile()) {
				fileInArea(area, path);

				PathPanel.sayFileOpened();
			} else {
				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Open file");
				if (ret == JFileChooser.APPROVE_OPTION) {

					path = fileopen.getSelectedFile().getAbsolutePath();
					fileInArea(area, path);
				}

				MainFrame.mainPanel.namePanel.textField.setText(path);
				PathPanel.sayFileOpened();
			}
		} catch (NoFileToReadException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Exception: can't open that file: " + e.getMessage());
		}
	}

	public void fileInArea(JTextArea area, String path) throws NoFileToReadException {
		/*
		 * TODO 3: Obsluz wyjatek tak, by go zlapac, przekazac wlasny wyjatek
		 * NoFileToReadException wyzej i obsluzyc go w metodzie nadrzednej.
		 * Podobnie jak w TODO 1, mozesz obsluzyc go w dowolny sposob.
		 */
		try {
			FileReader reader = new FileReader(path);
			BufferedReader br = new BufferedReader(reader);
			area.read(br, null);
			br.close();
		} catch (IOException e) {
			throw new NoFileToReadException();
		}
	}
}
