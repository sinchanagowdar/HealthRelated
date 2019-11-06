package com.example.hackthon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Tab1 extends Fragment {  ListView list;

    String[] maintitle ={
            "Employee1","Employee 2",
            "Employee 3","Employee 4",
            "Employee5","Employee6","Employee 7",
            "Employee 8","Employee 9",
            "Employee10"
    };

    String[] subtitle ={
            "contact 9908789543"," contact 990878983",
            "contact 9908778343","contact 9908789549",
            "contact 9008789543","contact 9908789561"," contact 990878990",
            "contact 9008778343","contact 7208789549",
            "contact 9808789598"
    };

    Integer[] imgid={
            R.drawable.girl,R.drawable.boy,
            R.drawable.girl,R.drawable.boy,
            R.drawable.girl,R.drawable.girl,R.drawable.boy,
            R.drawable.girl,R.drawable.boy,
            R.drawable.girl
    };

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        View view = inflater.inflate(R.layout.tab1, container, false);
        init(view);
        return view;
    }

        private void init(View view) {

        MyListAdapter adapter=new MyListAdapter(getActivity(), maintitle, subtitle,imgid);
        list=(ListView)view.findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getContext(),"Place Your First Option Code", Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

