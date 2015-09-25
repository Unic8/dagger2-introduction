package eu.unicate.dagger2showcase.di.components;

import dagger.Subcomponent;
import eu.unicate.dagger2showcase.MainActivity;
import eu.unicate.dagger2showcase.di.ActivityScope;
import eu.unicate.dagger2showcase.di.modules.ActivityModule;
import eu.unicate.dagger2showcase.di.modules.CharK2RModule;

@ActivityScope
@Subcomponent(modules = {ActivityModule.class, CharK2RModule.class})
public interface ActivityComponent {
	void inject(MainActivity activity);
}
