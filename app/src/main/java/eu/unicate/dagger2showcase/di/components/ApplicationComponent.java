package eu.unicate.dagger2showcase.di.components;

import javax.inject.Singleton;

import dagger.Component;
import eu.unicate.dagger2showcase.MainActivity;
import eu.unicate.dagger2showcase.di.modules.CharA2JModule;
import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharG;

@Singleton
@Component(modules = {CharA2JModule.class})
public interface ApplicationComponent {
	void inject(MainActivity activity);

	CharD getD();
	CharA getA();
	CharG getG();
	CharE getE();

	class Initializer {
		public static ApplicationComponent init() {
			return DaggerApplicationComponent.builder()
					.build();

		}
	}
}
