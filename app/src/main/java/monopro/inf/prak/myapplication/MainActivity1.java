package monopro.inf.prak.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity1 extends AppCompatActivity {
TextView texs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        texs = (TextView) findViewById(R.id.teks);
    }
}
