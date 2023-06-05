package sg.edu.rp.c346.id22034700.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        //fruits = new String[3];
        //fruits[0] = "apple";
        //fruits[1] = "banana";
        //fruits[2] = "cherry";

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        String theFruit = fruits.get(1);

        fruits.remove(0);

        fruits.set(fruits.size()-1,"dragon fruit");

        String text = "Fruits\n=====";

        //for (int i = 0; i < fruits.length; i++) {
        //    text += "\n"+fruits[i];
        //}

        for (int i = 0; i < fruits.size(); i++) {
            text += "\n"+fruits.get(i);
        }
        tv.setText(text);
    }
}