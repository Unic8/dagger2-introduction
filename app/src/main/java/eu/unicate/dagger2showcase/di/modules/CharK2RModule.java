package eu.unicate.dagger2showcase.di.modules;

import android.app.Activity;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import eu.unicate.dagger2showcase.di.ActivityScope;
import eu.unicate.dagger2showcase.models.CharJ;
import eu.unicate.dagger2showcase.models.CharK;
import eu.unicate.dagger2showcase.models.CharL;
import eu.unicate.dagger2showcase.models.CharM;
import eu.unicate.dagger2showcase.models.CharN;
import eu.unicate.dagger2showcase.models.CharO;
import eu.unicate.dagger2showcase.models.CharP;
import eu.unicate.dagger2showcase.models.CharQ;
import eu.unicate.dagger2showcase.models.CharR;

@Module
public class CharK2RModule {

	/*
	 * CharJ from ApplicationComponent
	 * Activity from ActivityModule
	 */
	@Provides
	@ActivityScope
	CharK provideK(Activity activity, CharJ j) {
		return new CharK(activity, j);
	}

	@Provides
	@ActivityScope
	CharL provideL(CharK k) {
		return new CharL(k);
	}

	@Provides
	@ActivityScope
	CharM provideM(Activity activity, CharL k) {
		return new CharM(activity, k);
	}
	@Provides
	@ActivityScope
	CharN provideN(CharM m) {
		return new CharN(m);
	}

	/*
	 * SharedPreferences from ApplicationComponent
	 */
	@Provides
	@ActivityScope
	CharO provideO(SharedPreferences preferences, CharN n) {
		return new CharO(preferences, n);
	}
	@Provides
	@ActivityScope
	CharP provideP(CharO o) {
		return new CharP(o);
	}

	@Provides
	@ActivityScope
	CharQ provideQ(Activity activity, CharP p) {
		return new CharQ(activity, p);
	}

	@Provides
	@ActivityScope
	CharR provideR(CharQ q) {
		return new CharR(q);
	}
}
