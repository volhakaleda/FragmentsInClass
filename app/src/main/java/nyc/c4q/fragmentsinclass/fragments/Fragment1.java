package nyc.c4q.fragmentsinclass.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.fragmentsinclass.MainActivity;
import nyc.c4q.fragmentsinclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    private View rootview;
    private TextView textView;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_fragment1, container, false);

        textView = (TextView) rootview.findViewById(R.id.fragment1_textview);

        Bundle bundle = getArguments();
        String savedText1 = bundle.getString(MainActivity.MAIN_FRAGMENT_KEY);
        textView.setText(savedText1);

        return rootview;
    }

}
