package edu.somaiya.myfragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFragment.ItemSelected {
TextView textView;
    //ArrayList<String>description;
    String[]description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView=(TextView)findViewById(R.id.textView);
     /*   description=new ArrayList<String>();
        description.add("This is description of Item 1");
        description.add("This is description of Item 2");
        description.add("This is description of Item 3");*/
     description=getResources().getStringArray(R.array.descriptions);
     if(findViewById(R.id.layout_portrait)!=null){
         //phone is in portrait mode
         FragmentManager manager=this.getSupportFragmentManager();
         manager.beginTransaction()
                 .hide(manager.findFragmentById(R.id.detailFrag))
                 .show(manager.findFragmentById(R.id.listFrag))
                 .commit();
     }
        if(findViewById(R.id.layout_land)!=null){
            //phone is in landscape mode
            FragmentManager manager=this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .show(manager.findFragmentById(R.id.listFrag))
                    .commit();
        }
    }

    @Override
    public void onItemSelected(int index) {
        //textView.setText(description.get(index));
        textView.setText(description[index]);
        if(findViewById(R.id.layout_portrait)!=null){
            //if phone is in portrait mode
            FragmentManager manager=this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .hide(manager.findFragmentById(R.id.listFrag))
                    .addToBackStack(null)
                    .commit();
        }
    }
}
