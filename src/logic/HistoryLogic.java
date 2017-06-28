package logic;

import java.util.ArrayList;

import data.DataInterface;
/**
 * Schnittstelle zwischen Gui-Schicht und Data-Schicht
 * @author Schwinn
 *
 */
public class HistoryLogic {

	DataInterface d = new DataInterface();
	/**
	 * Holt das Resultat aus der Data-Schicht und stellt es via Getter an die Gui-Schicht zur Verfuegung
	 * @return
	 */
	public String gethistory() {
		return d.gethistory();
	}

}
