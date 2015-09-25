package eu.unicate.dagger2showcase.di.modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

	private final Context context;

	public ApplicationModule(Context context) {
		this.context = context;
	}

	@Singleton
	@Provides
	SharedPreferences providePreferences() {
		Log.i(ApplicationModule.class.getSimpleName(), "Get SharedPreferences");
		return PreferenceManager.getDefaultSharedPreferences(context);
	}

	/*

	OR

	@Singleton
	@Provides
	Context provideContext() {
		return context;
	}

	@Singleton
	@Provides
	SharedPreferences providePreferences(Context context) {
		Log.i(ApplicationModule.class.getSimpleName(), "Get SharedPreferences");
		return PreferenceManager.getDefaultSharedPreferences(context);
	}


	*/
}
