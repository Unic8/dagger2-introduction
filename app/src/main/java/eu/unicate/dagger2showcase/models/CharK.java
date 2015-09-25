package eu.unicate.dagger2showcase.models;

import android.app.Activity;
import android.util.Log;

public class CharK {
	private final CharJ ch;
	private final Activity activity;

	public CharK(Activity activity, CharJ ch) {
		this.ch = ch;
		this.activity = activity;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "K";
	}
}
