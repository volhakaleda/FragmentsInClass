package nyc.c4q.fragmentsinclass;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nyc.c4q.fragmentsinclass.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    public final static String MAIN_FRAGMENT_KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.main_container, mainFragment);
        fragmentTransaction.commit();
    }
}
