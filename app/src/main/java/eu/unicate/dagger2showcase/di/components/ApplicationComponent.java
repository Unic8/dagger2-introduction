package eu.unicate.dagger2showcase.di.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import eu.unicate.dagger2showcase.di.GType;
import eu.unicate.dagger2showcase.di.modules.ApplicationModule;
import eu.unicate.dagger2showcase.di.modules.CharA2JModule;
import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharG;
import eu.unicate.dagger2showcase.models.CharJ;

@Singleton
@Component(modules = {CharA2JModule.class, ApplicationModule.class})
public interface ApplicationComponent {

	CharD getD();
	CharA getA();
	@GType("1")
	CharG getG1();
	@GType("2")
	CharG getG2();
	CharE getE();
	CharJ getJ();

	SharedPreferences getPreferences();

	class Initializer {
		public static ApplicationComponent init(ApplicationModule appModule) {
			return DaggerApplicationComponent.builder()
					.applicationModule(appModule)
					.build();

		}
	}
}
