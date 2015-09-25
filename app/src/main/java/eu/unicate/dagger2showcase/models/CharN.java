package eu.unicate.dagger2showcase.models;

import android.app.Activity;
import android.util.Log;

public class CharN {
	private final CharM ch;
	private final Activity activity;

	public CharN(Activity activity, CharM ch) {
		this.ch = ch;
		this.activity = activity;
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}

	@Override
	public String toString() {
		return "N";
	}
}
