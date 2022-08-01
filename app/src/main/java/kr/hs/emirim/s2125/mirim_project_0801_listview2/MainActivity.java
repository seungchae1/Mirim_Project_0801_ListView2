package kr.hs.emirim.s2125.mirim_project_0801_listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listv = findViewById(R.id.listv);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
        listv.setAdapter(adapter);
        edit1=findViewById(R.id.edit1);
        Button btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(btnAddListener);
    }
    View.OnClickListener btnAddListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            items.add(edit1.getText().toString());
            adapter.notifyDataSetChanged();
        }
    };
}