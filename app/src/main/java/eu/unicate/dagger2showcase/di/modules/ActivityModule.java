package eu.unicate.dagger2showcase.di.modules;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import eu.unicate.dagger2showcase.di.ActivityScope;

@Module
public class ActivityModule {
	private final Activity activity;

	public ActivityModule(Activity activity) {
		this.activity = activity;
	}

	@Provides
	@ActivityScope
	Activity provideActivity() {
		return activity;
	}
}
