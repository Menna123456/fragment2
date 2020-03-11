package com.example.fragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragB extends Fragment {

    TextView textView;
    String message = "";
    String value = "";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_b_layout,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

          textView = getActivity().findViewById(R.id.textView);

          if (savedInstanceState!=null && savedInstanceState.getString("message")!=null)
        {
            value =savedInstanceState.getString("message");
            textView.setText(value);

        }




    }



    public void showMessage (int count)
    {

        message = "This the message No:  " + count + "!";
         textView.setText(message);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("message" , message);


    }
}
