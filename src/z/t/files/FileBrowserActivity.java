package z.t.files;

import android.app.Activity;
import android.os.Bundle;
import android.os.StatFs;
import android.view.Menu;
import android.view.MenuItem;

public class FileBrowserActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_browser);
	}
}
