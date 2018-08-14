package mashapps.jester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterApp(View view) {
        // Declaring intent to move to NavPage
        Intent intent = new Intent(this, NavPage.class);
        // Starting that intent
        startActivity(intent);
    }
}
