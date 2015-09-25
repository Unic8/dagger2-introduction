package eu.unicate.dagger2showcase.di.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import eu.unicate.dagger2showcase.MainActivity;
import eu.unicate.dagger2showcase.di.modules.ApplicationModule;
import eu.unicate.dagger2showcase.di.modules.CharA2JModule;
import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharG;

@Singleton
@Component(modules = {CharA2JModule.class, ApplicationModule.class})
public interface ApplicationComponent {
	void inject(MainActivity activity);

	CharD getD();
	CharA getA();
	CharG getG();
	CharE getE();

	SharedPreferences getPreferences();

	class Initializer {
		public static ApplicationComponent init(ApplicationModule appModule) {
			return DaggerApplicationComponent.builder()
					.applicationModule(appModule)
					.build();

		}
	}
}
