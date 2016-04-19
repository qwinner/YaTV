package ya.yatv;

import android.app.Activity;
import android.os.Bundle;

import com.sina.sinavideo.sdk.utils.VDGravitySensorManager;

public class Test2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		VDGravitySensorManager manager = new VDGravitySensorManager();
		manager.register(this);
	}
}
