package eu.unicate.dagger2showcase;

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
		CharG g = new CharG(f);

		print(d, a, g, e);

	}

	private void print(CharD d, CharA a, CharG g, CharE e) {
		text.setText(""+d + a + g + g + e);
	}


}
