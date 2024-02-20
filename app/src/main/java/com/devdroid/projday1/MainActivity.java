package com.devdroid.projday1;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    RecyclerView rvItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
        rvItemsList = findViewById(R.id.rvItemsList);
        final ArrayList<EmployeeModel> emplist = Constants.getEmployeeData();
        rvItemsList.setLayoutManager(new LinearLayoutManager(this));
        rvItemsList.setHasFixedSize(true);

        final ItemAdapter ItemAdapter = new ItemAdapter(emplist);
        rvItemsList.setAdapter(ItemAdapter);
        ItemAdapter.setOnClickListener(new ItemAdapter.OnClickListener() {
            @Override
            public void onClick(int position, EmployeeModel model) {
                Intent intent = new Intent(MainActivity.this, EmployeeDetails.class);
                intent.putExtra(NEXT_SCREEN, model);
                startActivity(intent);
            }
        });
    }

    public static final String NEXT_SCREEN = "details_screen";

}
