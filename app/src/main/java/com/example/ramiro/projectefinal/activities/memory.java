package com.example.ramiro.projectefinal.activities;

import android.os.Bundle;
import android.view.Menu;

import com.example.ramiro.projectefinal.R;

public class memory extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
        super.setItemChecked();
        toolbar.setTitle("MEMORY");
    }

    @Override
    protected int whatIsMyId() {
        return R.id.nav_memory;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_extra,menu);
        setTitle("MEMORY");
        return true;
    }
}
