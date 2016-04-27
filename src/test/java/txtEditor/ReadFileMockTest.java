package txtEditor;

import java.awt.TextField;

import javax.swing.JTextArea;

import org.junit.Test;
import org.mockito.Mockito;

import events.NoFileToReadException;
import events.ReadFile;

public class ReadFileMockTest {

	@Test(expected = NoFileToReadException.class)
	public void shouldThrowExceptionWhenPathIsMissing() throws NoFileToReadException {
		//given
		TextField textFieldMock = Mockito.mock(TextField.class);
		ReadFile readFile = new ReadFile();
		//when
		Mockito.when(textFieldMock.getText()).thenReturn("missingPath");
		//then
		readFile.fileInArea(Mockito.mock(JTextArea.class), textFieldMock.getText());
	}

	@Test
	public void shouldNotThrowExceptionWhenPathExist() throws NoFileToReadException {
		//given
		TextField textFieldMock = Mockito.mock(TextField.class);
		ReadFile readFile = new ReadFile();
		String path = "C:/Users/wkondrat/workspace/mocking_homework2/txtEditor/src/test/resources/test.txt";
		//when
		Mockito.when(textFieldMock.getText()).thenReturn(path);
		//then
		readFile.fileInArea(Mockito.mock(JTextArea.class), textFieldMock.getText());
	}

	/**
	 * TODO 4: Przetestuj metode ReadFile.fileInArea(JTextArea, String).
	 * Sprawdz, czy zwraca ona wyjatek zaleznie od danych wejsciowych. Mozesz
	 * uzyc mockow lub danych przygotowanych.
	 */

	/*
	 * TODO 5: Przetestuj metode actionPerformed w klasie ReadFile. Chcemy
	 * sprawic, by PathPanel.sayFileOpened() nie zostalo wywolane. Utworz mock
	 * obiektu ActionEvent i wywolaj metode actionPerformed. Zamockuj tez
	 * odpowiednio TextField.getText(), tak by if w metodzie actionPerformed
	 * zwrocil true. Nie zapomnij o mocku dla metody areaInFile tak, by metoda
	 * zwrocila wyjatek.
	 */
}
