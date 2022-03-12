package com.example.daboyatask.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.daboyatask.R;
import com.example.daboyatask.model.UserModel;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserView> {
    List<UserModel> userModels;
    Context context;


    public UserAdapter(List<UserModel> userModels, Context context) {
        this.userModels = userModels;
        this.context = context;
    }

    @NonNull
    @Override
    public UserView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.user_data_layout, parent, false);
        return new UserAdapter.UserView(view);
    }


    @Override
    public void onBindViewHolder(@NonNull UserView holder, int position) {

        holder.author.setText(userModels.get(position).getAuthor());
        Glide.with(context)
                .load(userModels.get(position).getUrl())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return userModels.size();
    }

    public class UserView extends RecyclerView.ViewHolder {
        TextView author;
        ImageView imageView;
        public UserView(@NonNull View itemView) {
            super(itemView);
            author=itemView.findViewById(R.id.author);
            imageView=itemView.findViewById(R.id.image);

        }
    }

}
