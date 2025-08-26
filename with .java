import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyActivity", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MyActivity", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MyActivity", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MyActivity", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MyActivity", "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MyActivity", "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyActivity", "onDestroy called");
    }
}
