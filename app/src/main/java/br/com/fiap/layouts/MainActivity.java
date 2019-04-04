package br.com.fiap.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exemploLinearLayout(View view) {
        Toast.makeText(this, R.string.ja_esta_linear, Toast.LENGTH_SHORT).show();
    }

    public void exemploRelativeLayout(View view) {
        Intent it = new Intent(this, ExemploRelativeLayoutActivity.class);
        startActivity(it);
    }

    public void exemploAbsoluteLayout(View view) {
        Intent it = new Intent(this, ExemploAbsoluteLayoutActivity.class);
        startActivity(it);
    }

    public void exemploFrameLayout(View view) {
        Intent it = new Intent(this, ExemploFrameLayoutActivity.class);
        startActivity(it);
    }
}
