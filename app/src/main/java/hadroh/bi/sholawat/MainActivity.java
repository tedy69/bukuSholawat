package hadroh.bi.sholawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void teksSholawat(View view){

    Intent teks = new Intent(MainActivity.this,teksSholawat.class);
    startActivity(teks);
    }

public void tombolUpload (View view) {

    Intent menuUpload = new Intent( MainActivity.this , upload.class);
    startActivity(menuUpload);
    }

public void masukMenuFavorit (View view){
        Intent bukaFavorit = new Intent( MainActivity.this , favorit.class );
        startActivity(bukaFavorit);
    }
}
