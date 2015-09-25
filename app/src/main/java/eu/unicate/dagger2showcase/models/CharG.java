package eu.unicate.dagger2showcase.models;

import android.util.Log;

public class CharG {
	private final CharF ch;

	public CharG(CharF ch) {
		this.ch = ch;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "G";
	}
}
