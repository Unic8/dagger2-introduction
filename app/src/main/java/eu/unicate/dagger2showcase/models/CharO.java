package eu.unicate.dagger2showcase.models;

import android.content.SharedPreferences;
import android.util.Log;

public class CharO {
	private final CharN ch;
	private final SharedPreferences preferences;

	public CharO(SharedPreferences preferences, CharN ch) {
		this.ch = ch;
		this.preferences = preferences;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "O";
	}
}
