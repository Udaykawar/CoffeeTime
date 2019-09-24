package andi.uday.coffeetime;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public abstract class DrinkCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks=getListView();
        ArrayAdapter<Drinks> listAdapter=new ArrayAdapter<Drinks>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                Drinks.drinks
        );
        listDrinks.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity.class);

        startActivity(intent);

    }


}
