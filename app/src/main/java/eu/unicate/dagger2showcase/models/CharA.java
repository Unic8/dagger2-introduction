package eu.unicate.dagger2showcase.models;

import android.util.Log;

public class CharA {

	public CharA() {
		String name = this.getClass().getSimpleName();
		Log.d(name, String.format("Constructor of: %s", name));
	}
	@Override
	public String toString() {
		return "A";
	}
}
