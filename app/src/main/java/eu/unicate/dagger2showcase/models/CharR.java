package eu.unicate.dagger2showcase.models;

import android.util.Log;

public class CharR {
	private final CharQ ch;

	public CharR(CharQ ch) {
		this.ch = ch;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "R";
	}
}
