package uz.exemple.less54_messangerui_peoplepage_java.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less54_messangerui_peoplepage_java.R;
import uz.exemple.less54_messangerui_peoplepage_java.model.StoriesModel;

public class StoriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<StoriesModel> storiesModels;
    private int TYPE_CREATE = 0;
    private int TYPE_PEOPLE = 1;

    @Override
    public int getItemViewType(int position) {
        StoriesModel item = storiesModels.get(position);
        if (item.getProfile() == null){
            return TYPE_CREATE;
        }
        return TYPE_PEOPLE;
    }

    public StoriesAdapter(ArrayList<StoriesModel> storiesModels) {
        this.storiesModels = storiesModels;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_CREATE){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_story_view,parent,false);
            return new CreateViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_add_people_view,parent,false);
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        StoriesModel item = storiesModels.get(position);
        if (holder instanceof PeopleViewHolder){
            ImageView background = ((PeopleViewHolder) holder).background;
            ImageView profile = ((PeopleViewHolder) holder).profile;
            TextView countStory = ((PeopleViewHolder) holder).countStory;
            TextView fullName = ((PeopleViewHolder) holder).fullName;

            background.setImageResource(item.getBackground());
            profile.setImageResource(item.getProfile());
            countStory.setText(String.valueOf(item.getCountStories()));
            fullName.setText(item.getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return storiesModels.size();
    }


    public class CreateViewHolder extends RecyclerView.ViewHolder{

        public CreateViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public class PeopleViewHolder extends RecyclerView.ViewHolder{
        private ImageView background;
        private ImageView profile;
        private TextView countStory;
        private TextView fullName;


        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.iv_background);
            profile = itemView.findViewById(R.id.iv_profile);
            countStory = itemView.findViewById(R.id.tv_countStories);
            fullName = itemView.findViewById(R.id.tv_fullName);
        }
    }
}
