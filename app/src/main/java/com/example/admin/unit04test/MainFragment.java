package com.example.admin.unit04test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private Button mainFragButton;
    private View rootview;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_main, container, false);

        mainFragButton = rootview.findViewById(R.id.mainfrag_button);
        mainFragButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayFragment displayFragment = new DisplayFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainfrag_container, displayFragment);
                fragmentTransaction.addToBackStack("DisplayFragment");
                fragmentTransaction.commit();

            }
        });
          return rootview;
    }

}
