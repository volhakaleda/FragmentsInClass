package nyc.c4q.fragmentsinclass.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.fragmentsinclass.R;

import static nyc.c4q.fragmentsinclass.MainActivity.MAIN_FRAGMENT_KEY;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View rootView;
    private EditText editText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        editText = (EditText) rootView.findViewById(R.id.edittext);
        button1 = (Button) rootView.findViewById(R.id.button01);
        button2 = (Button) rootView.findViewById(R.id.button02);
        button3 = (Button) rootView.findViewById(R.id.button03);
        button4 = (Button) rootView.findViewById(R.id.button04);
        button5 = (Button) rootView.findViewById(R.id.button05);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment1 fragment1 = new Fragment1();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(MAIN_FRAGMENT_KEY, textFromMainFragment);
                fragment1.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, fragment1).addToBackStack(MAIN_FRAGMENT_KEY);
                fragmentTransaction.commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment2 fragment2 = new Fragment2();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(MAIN_FRAGMENT_KEY, textFromMainFragment);
                fragment2.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, fragment2).addToBackStack(MAIN_FRAGMENT_KEY);
                fragmentTransaction.commit();


            }
        });

        return rootView;
    }
}
