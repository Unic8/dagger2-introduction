package eu.unicate.dagger2showcase.models;

import android.app.Activity;
import android.util.Log;

public class CharP {
	private final CharO ch;
	private final Activity activity;

	public CharP(Activity activity, CharO ch) {
		this.ch = ch;
		this.activity = activity;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "P";
	}
}
