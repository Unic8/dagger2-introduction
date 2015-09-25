package eu.unicate.dagger2showcase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Provider;

import eu.unicate.dagger2showcase.di.GType;
import eu.unicate.dagger2showcase.di.components.ActivityComponent;
import eu.unicate.dagger2showcase.di.components.ApplicationComponent;
import eu.unicate.dagger2showcase.di.modules.ActivityModule;
import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharG;
import eu.unicate.dagger2showcase.models.CharH;
import eu.unicate.dagger2showcase.models.CharI;
import eu.unicate.dagger2showcase.models.CharR;

public class MainActivity extends AppCompatActivity {

	@Inject
	CharD d;
	@Inject
	CharA a;
	@Inject
	@GType("1")
	CharG g1;
	@Inject
	@GType("2")
	CharG g2;
	@Inject
	CharE e;
	@Inject
	CharR r;

	@Inject
	Provider<CharH> h;
	@Inject
	Provider<CharI> i;

	private TextView text;
	private TextView text2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView) findViewById(R.id.text);
		text2 = (TextView) findViewById(R.id.text2);

		ActivityComponent.Initializer
				.init(getApplicationComponent(), new ActivityModule(this))
				.inject(this);

		print(d, a, g1, g2, e, r);

		laugh();

	}

	private ApplicationComponent getApplicationComponent() {
		return ((DaggerShowCaseApplication) getApplication()).getApplicationComponent();
	}

	private void print(CharD d, CharA a, CharG g1, CharG g2, CharE e, CharR r) {
		text.setText(String.format("%s%s%s%s%s%s2 rox", d, a, g1, g2, e, r));
	}

	private void laugh() {
		StringBuilder sb = new StringBuilder("m");
		for (int z=0; z < 20; z++) {
			sb.append(z%2==0?i.get():h.get());
		}
		text2.setText(sb.toString());
	}


}
