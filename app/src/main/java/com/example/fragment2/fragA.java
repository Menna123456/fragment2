package com.example.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragA extends Fragment {


    Button btn;
    int count = 0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_a_layout,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState!=null)

        {
            count = savedInstanceState.getInt("count");
            //Toast.makeText(getContext(),"this a message",Toast.LENGTH_LONG).show(); // debug
        }
        btn = getActivity().findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                sendMessage();
            }
        });




    }

    private void sendMessage() {

        if(getActivity().getSupportFragmentManager().findFragmentByTag("fragB")!=null) {

            fragB fragB = (fragB) getActivity().getSupportFragmentManager().findFragmentByTag("fragB");
            fragB.showMessage(count);
        }




    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }
}
