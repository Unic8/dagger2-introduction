package eu.unicate.dagger2showcase.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharB;
import eu.unicate.dagger2showcase.models.CharC;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharF;
import eu.unicate.dagger2showcase.models.CharG;
import eu.unicate.dagger2showcase.models.CharH;
import eu.unicate.dagger2showcase.models.CharI;
import eu.unicate.dagger2showcase.models.CharJ;

@Module
public class CharA2JModule {
	@Provides
	@Singleton
	CharA provideA() {
		return new CharA();
	}

	@Provides
	@Singleton
	CharB provideB(CharA a) {
		return new CharB(a);
	}

	@Provides
	@Singleton
	CharC provideC(CharB b) {
		return new CharC(b);
	}

	@Provides
	@Singleton
	CharD provideD(CharC c) {
		return new CharD(c);
	}

	@Provides
	@Singleton
	CharE provideE(CharD d) {
		return new CharE(d);
	}

	@Provides
	@Singleton
	CharF provideF(CharE e) {
		return new CharF(e);
	}

	@Provides
	@Singleton
	CharG provideG(CharF f) {
		return new CharG(f);
	}

	@Provides
	@Singleton
	CharH provideH(CharG g) {
		return new CharH(g);
	}

	@Provides
	@Singleton
	CharI provideI(CharH h) {
		return new CharI(h);
	}

	@Provides
	@Singleton
	CharJ provideJ(CharI i) {
		return new CharJ(i);
	}
}
