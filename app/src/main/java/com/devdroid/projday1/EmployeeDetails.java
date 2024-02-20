package com.devdroid.projday1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class EmployeeDetails extends AppCompatActivity {
    Toolbar toolbar;
    TextView name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emplyee_details);

        toolbar = findViewById(R.id.toolbar);
        name = findViewById(R.id.display_name);
        email = findViewById(R.id.display_email);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
        EmployeeModel emplist = null;
        if (getIntent().hasExtra(MainActivity.NEXT_SCREEN)) {
            emplist = (EmployeeModel) getIntent().getSerializableExtra(MainActivity.NEXT_SCREEN);
        }
        if (emplist != null) {
            name.setText(emplist.getName()); // displaying name
            email.setText(emplist.getEmail()); // displaying email
        }
    }
}

