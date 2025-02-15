package com.example.praktikum5_1;

import static android.text.TextUtils.isEmpty;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private final ArrayList<Post> posts;

    private ClickListener clickListener;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_post_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        Post post = posts.get(position);
        holder.setData(post, context);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_fullname;
        private final TextView tv_username;
        private final ImageView iv_post_image;
        private final TextView tv_post_text;
        private final CircleImageView civ_post;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_fullname = itemView.findViewById(R.id.tv_fullname);
            tv_username = itemView.findViewById(R.id.tv_username);
            iv_post_image = itemView.findViewById(R.id.iv_post);
            tv_post_text = itemView.findViewById(R.id.tv_post);
            civ_post = itemView.findViewById(R.id.civ_post);
        }

        public void setData(Post post, Context context) {
            String fullname = post.getFullname();
            String username = post.getUsername();
            String postImage = post.getPostPicture();
            String postText = post.getPostText();
            String postProfile = post.getPostProfile();

            tv_fullname.setText(fullname);
            tv_username.setText(username);
            Glide.with(context)
                    .load(postImage)
                    .into(iv_post_image);

            if (postProfile != null){
                Glide.with(context)
                        .load(postProfile)
                        .into(civ_post);
            }
            else {
                Glide.with(context)
                        .load(R.drawable.profile)
                        .into(civ_post);
            }

            if (isEmpty(postText)) {
                tv_post_text.setVisibility(View.GONE);
            }
            else {
                tv_post_text.setText(postText);
            }

            itemView.setOnClickListener(view -> {
                clickListener.onItemClicked(post);
            });

            iv_post_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Launch the new activity here
                    Intent intent = new Intent(itemView.getContext(), ProfileActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

    interface ClickListener {

        void onItemClicked(Post post);

    }
}