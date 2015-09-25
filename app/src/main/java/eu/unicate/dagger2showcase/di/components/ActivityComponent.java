package eu.unicate.dagger2showcase.di.components;

import dagger.Component;
import eu.unicate.dagger2showcase.MainActivity;
import eu.unicate.dagger2showcase.di.ActivityScope;
import eu.unicate.dagger2showcase.di.modules.ActivityModule;
import eu.unicate.dagger2showcase.di.modules.CharK2RModule;
import eu.unicate.dagger2showcase.models.CharR;

@ActivityScope
@Component(modules = {ActivityModule.class, CharK2RModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent {
	void inject(MainActivity activity);

	CharR getR();

	class Initializer {
		public static ActivityComponent init(ApplicationComponent applicationComponent, ActivityModule activityModule) {
			return DaggerActivityComponent.builder()
					.applicationComponent(applicationComponent)
					.activityModule(activityModule).build();
		}
	}
}
