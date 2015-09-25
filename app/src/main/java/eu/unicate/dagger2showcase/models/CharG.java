package eu.unicate.dagger2showcase.models;

import android.util.Log;

public class CharG {
	private final CharF ch;
	private final int nr;

	public CharG(CharF ch, int nr) {
		this.ch = ch;
		this.nr = nr;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s%d", name, nr));
	}

	@Override
	public String toString() {
		if(nr == 1) {
			return "G";
		} else {
			return "g";
		}
	}
}
