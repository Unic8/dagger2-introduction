package eu.unicate.dagger2showcase;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
import eu.unicate.dagger2showcase.models.CharK;
import eu.unicate.dagger2showcase.models.CharL;
import eu.unicate.dagger2showcase.models.CharM;
import eu.unicate.dagger2showcase.models.CharN;
import eu.unicate.dagger2showcase.models.CharO;
import eu.unicate.dagger2showcase.models.CharP;
import eu.unicate.dagger2showcase.models.CharQ;
import eu.unicate.dagger2showcase.models.CharR;

public class MainActivity extends AppCompatActivity {

	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView)findViewById(R.id.text);

		CharA a = new CharA();
		CharB b = new CharB(a);
		CharC c = new CharC(b);
		CharD d = new CharD(c);
		CharE e = new CharE(d);
		CharF f = new CharF(e);
		CharG g1 = new CharG(f);
		CharG g2 = new CharG(f);

		CharH h = new CharH(g1);
		CharI i = new CharI(h);
		CharJ j = new CharJ(i);

		// additional activity dependency
		CharK k = new CharK(this, j);
		CharL l = new CharL(k);
		CharM m = new CharM(this, l);
		CharN n = new CharN(m);
		CharO o = new CharO(PreferenceManager.getDefaultSharedPreferences(this), n);
		CharP p = new CharP(o);
		CharQ q = new CharQ(this, p);
		CharR r = new CharR(q);

		print(d, a, g1, g2, e, r);

	}

	private void print(CharD d, CharA a, CharG g1, CharG g2, CharE e, CharR r) {
		text.setText(String.format("%s%s%s%s%s%s2 rox",d, a, g1, g2, e, r));
	}


}
