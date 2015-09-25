package eu.unicate.dagger2showcase;

import android.app.Application;

import eu.unicate.dagger2showcase.di.components.ApplicationComponent;
import eu.unicate.dagger2showcase.di.modules.ApplicationModule;

public class DaggerShowCaseApplication extends Application {

	private ApplicationComponent component;

	@Override
	public void onCreate() {
		super.onCreate();
		component = ApplicationComponent.Initializer.init(new ApplicationModule(this));
	}

	public ApplicationComponent getApplicationComponent() {
		return component;
	}
}
