package uz.exemple.less54_messangerui_peoplepage_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uz.exemple.less54_messangerui_peoplepage_java.adapter.StoriesAdapter;
import uz.exemple.less54_messangerui_peoplepage_java.model.StoriesModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private ArrayList<StoriesModel>storiesModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        recyclerview = findViewById(R.id.recyclerView);
        recyclerview.setLayoutManager(new GridLayoutManager(this,2));


        storiesModels = new ArrayList<StoriesModel>();
        storiesModels.add(new StoriesModel(null,R.drawable.back01,0,"Add to Story"));
        storiesModels.add(new StoriesModel(R.drawable.photo2,R.drawable.back2,4,"Barnoxon Kabirova"));
        storiesModels.add(new StoriesModel(R.drawable.photo3,R.drawable.back32,7,"Kamola Nematjonova"));
        storiesModels.add(new StoriesModel(R.drawable.photo4,R.drawable.back4,12,"Abdullatif Nematjonov"));
        storiesModels.add(new StoriesModel(R.drawable.photo1,R.drawable.back5,3,"Xushnud Boymurodov"));
        storiesModels.add(new StoriesModel(R.drawable.photo2,R.drawable.back2,4,"Barnoxon Kabirova"));
        storiesModels.add(new StoriesModel(R.drawable.photo3,R.drawable.back32,7,"Kamola Nematjonova"));
        storiesModels.add(new StoriesModel(R.drawable.photo4,R.drawable.back4,12,"Abdullatif Nematjonov"));
        storiesModels.add(new StoriesModel(R.drawable.photo1,R.drawable.back5,3,"Xushnud Boymurodov"));
        storiesModels.add(new StoriesModel(R.drawable.photo3,R.drawable.back32,7,"Kamola Nematjonova"));

        StoriesAdapter adapter = new StoriesAdapter(storiesModels);

        recyclerview.setAdapter(adapter);

    }
}