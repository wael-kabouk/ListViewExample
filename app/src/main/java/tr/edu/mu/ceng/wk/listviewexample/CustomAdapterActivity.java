package tr.edu.mu.ceng.wk.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Cat", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Dog", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Elephant", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Tiger", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Lion", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Jaguar", R.mipmap.ic_animal_foreground));
        animals.add(new Animal("Bear", R.mipmap.ic_animal_foreground));

        ListView listView = findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(animals, this);

        listView.setAdapter(adapter);

    }
}