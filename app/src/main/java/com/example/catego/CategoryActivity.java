package com.example.catego;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.quin.models.Category;
import com.quin.models.Customer;
import com.quin.models.ListCategory;
import com.quin.models.ListCustomer;

public class CategoryActivity extends AppCompatActivity {

    ListView lvCategory;
    ArrayAdapter<Category> adapter;
    ListCategory lc=new ListCategory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
    }

    private void addViews() {
        lvCategory=findViewById(R.id.lvCategory);
        adapter=new ArrayAdapter<>(
                CategoryActivity.this,
                android.R.layout.simple_list_item_1);

        lc.generate_sample_dataset();
        adapter.addAll(lc.getCategory());
        lvCategory.setAdapter(adapter);
    }
}
