package eu.unicate.dagger2showcase.di.components;

import javax.inject.Singleton;

import dagger.Component;
import eu.unicate.dagger2showcase.di.modules.ActivityModule;
import eu.unicate.dagger2showcase.di.modules.ApplicationModule;
import eu.unicate.dagger2showcase.di.modules.CharA2JModule;

@Singleton
@Component(modules = {CharA2JModule.class, ApplicationModule.class})
public interface ApplicationComponent {
	ActivityComponent subcomponent(ActivityModule am);

	class Initializer {
		public static ApplicationComponent init(ApplicationModule appModule) {
			return DaggerApplicationComponent.builder()
					.applicationModule(appModule)
					.build();

		}
	}
}
