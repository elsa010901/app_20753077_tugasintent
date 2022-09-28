package com.example.app_20753077_tugasintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view) {
        String nomor = "kontak" ;
        Intent kontak = new Intent(Intent. ACTION_DIAL);
        kontak.setData(Uri. fromParts("tel",nomor,null));
        startActivity(kontak);
    }
    public void buka(View view) {
        String url = "https://shopee.co.id/?gclid=EAIaIQobChMIrpPkrMyn-gIVqJJmAh2KKAj5EAAYASAAEgJGNvD_BwE" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
}