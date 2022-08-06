package com.example.aplikasilistview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //Deklakrasi ListView variabel dan menginisialisasi array tipe data string
    private ListView lvItem;
    private String[] namanegara = new String[]{
            "Indonesia","Malaysia","Singapore","Italia","Inggris",
            "Belanda","Argentina","Chile","Mesir","Uganda","Taiwan",
            "Korea Selatan","Japan","Spanyol","Perancis","Netherlands"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvItem = (ListView)findViewById(R.id.list_view );
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, namanegara);

        lvItem.setAdapter(adapter);

        getSupportActionBar().setTitle("List View Sederhana");//Judul

        lvItem.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Memilih : " + namanegara[position], Toast.LENGTH_SHORT).show();
    }
}