package sample.digitalia.be.contextthemewrapperissuesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Custom inner layout inflation with a dark theme
		ViewGroup container = (ViewGroup) findViewById(R.id.inner_layout_container);

		ContextThemeWrapper wrapper = new ContextThemeWrapper(this, R.style.ThemeOverlay_AppCompat_Dark);
		LayoutInflater.from(wrapper).inflate(R.layout.inner_layout, container, true);
	}
}