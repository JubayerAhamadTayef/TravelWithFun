package com.example.travelwithfun.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travelwithfun.Adapters.PopularAdapter;
import com.example.travelwithfun.Adapters.CategoryAdapter;
import com.example.travelwithfun.Domains.PopularDomain;
import com.example.travelwithfun.Domains.CategoryDomain;
import com.example.travelwithfun.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
private  RecyclerView.Adapter adapterPopular, adapterCat;
private RecyclerView recyclerViewPopular, recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain>items = new ArrayList<>();
        items.add(new PopularDomain("Rest In Resturant","Kusumvag, Moulvibazar","This is a on of the best resturant in Moulvibazar",2,true,5.0,"pic1",true,1000));
        items.add(new PopularDomain("Western Resturant","Sentral Road, Moulvibazar","This is a on of the best resturant in Moulvibazar",1,false,3.0,"pic2",false,2500));
        items.add(new PopularDomain("Rest In Resturant","Kusumvag, Moulvibazar","This is a on of the best resturant in Moulvibazar",2,true,4.0,"pic1",true,1000));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

        ArrayList<CategoryDomain> catsList = new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1"));
        catsList.add(new CategoryDomain("Camps","cat2"));
        catsList.add(new CategoryDomain("Forest","cat3"));
        catsList.add(new CategoryDomain("aldkf","cat4"));
        catsList.add(new CategoryDomain("afdghjre","cat5"));

        recyclerViewCategory=findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat=new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);
    }
}