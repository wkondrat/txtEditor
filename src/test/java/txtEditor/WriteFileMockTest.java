package txtEditor;

import java.awt.event.ActionEvent;

import org.junit.Test;
import org.mockito.Mockito;

public class WriteFileMockTest {

	/**
	 * TODO 2: Przetestuj metode actionPerformed w klasie WriteFile.
	 * Chcemy sprawdzic, czy PathPanel.sayFileSaved() zostalo wywolane raz.
	 * Utworz mock obiektu ActionEvent i wywolaj metode actionPerformed.
	 * Zamockuj tez odpowiednio TextField.getText(), tak by if w metodzie actionPerformed zwrocil true.
	 * Nie zapomnij o mocku dla metody areaInFile tak, by metoda nie probowala otwierac rzeczywistego pliku.
	 */
	
	@Test
	public void sayFileSavedIsExecutedOnce() {
		ActionEvent actionEvent = Mockito.mock(ActionEvent.class);
		
	}
}