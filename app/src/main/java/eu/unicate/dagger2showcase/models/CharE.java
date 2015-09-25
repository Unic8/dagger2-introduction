package eu.unicate.dagger2showcase.models;

import android.util.Log;

public class CharE {
	private final CharD ch;
	public CharE(CharD ch) {
		this.ch = ch;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "E";
	}
}
