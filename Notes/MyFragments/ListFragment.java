package edu.somaiya.myfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends android.support.v4.app.ListFragment {
ItemSelected activity;
public interface ItemSelected{
    void onItemSelected(int index);
}
    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ItemSelected)context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       /* ArrayList<String>data=new ArrayList<String>();
        data.add("1. This is Item 1");
        data.add("2. This is Item 2");
        data.add("3. This is Item 3");*/
       String[]data=getResources().getStringArray(R.array.pieces);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data));
        //activity.onItemSelected(0);

        if(this.getActivity().findViewById(R.id.layout_land)!=null){
            //if phone is in landscape mode show item1 selected when activity is launched
            activity.onItemSelected(0);
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
      activity.onItemSelected(position);
    }
}
