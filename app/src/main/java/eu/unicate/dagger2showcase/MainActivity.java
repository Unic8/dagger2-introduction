package eu.unicate.dagger2showcase;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import eu.unicate.dagger2showcase.models.CharA;
import eu.unicate.dagger2showcase.models.CharD;
import eu.unicate.dagger2showcase.models.CharE;
import eu.unicate.dagger2showcase.models.CharG;
import eu.unicate.dagger2showcase.models.CharJ;
import eu.unicate.dagger2showcase.models.CharK;
import eu.unicate.dagger2showcase.models.CharL;
import eu.unicate.dagger2showcase.models.CharM;
import eu.unicate.dagger2showcase.models.CharN;
import eu.unicate.dagger2showcase.models.CharO;
import eu.unicate.dagger2showcase.models.CharP;
import eu.unicate.dagger2showcase.models.CharQ;
import eu.unicate.dagger2showcase.models.CharR;

public class MainActivity extends AppCompatActivity {

	@Inject
	CharD d;
	@Inject
	CharA a;
	@Inject
	CharG g;
	@Inject
	CharE e;
	@Inject
	CharJ j;

	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView) findViewById(R.id.text);

		((DaggerShowCaseApplication) getApplication()).getApplicationComponent().inject(this);


		// additional activity dependency
		CharK k = new CharK(this, j);
		CharL l = new CharL(k);
		CharM m = new CharM(this, l);
		CharN n = new CharN(m);
		CharO o = new CharO(PreferenceManager.getDefaultSharedPreferences(this), n);
		CharP p = new CharP(o);
		CharQ q = new CharQ(this, p);
		CharR r = new CharR(q);

		print(d, a, g, g, e, r);

	}

	private void print(CharD d, CharA a, CharG g1, CharG g2, CharE e, CharR r) {
		text.setText(String.format("%s%s%s%s%s%s2 rox", d, a, g1, g2, e, r));
	}


}
