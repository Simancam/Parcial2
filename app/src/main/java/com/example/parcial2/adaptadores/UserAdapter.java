package com.example.parcial2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2.R;
import com.example.parcial2.clases.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{

    private List<User> data;

    public UserAdapter(List<User> data){
        this.data = data;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        User user = data.get(position);
        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button btn_botonsito;
        TextView txt_name_user, txt_age_user;
        ImageView img_user;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name_user = itemView.findViewById(R.id.txt_name_user);
            txt_age_user = itemView.findViewById(R.id.txt_age_user);
            img_user = itemView.findViewById(R.id.img_user);
            btn_botonsito = itemView.findViewById(R.id.btn_botonsito);
        }

        public void bind(User user) {
            txt_name_user.setText(user.getName());
            txt_age_user.setText(String.valueOf(user.getAge()));
            Picasso.get().load(user.getImage()).into(img_user);
        }


    }
}
