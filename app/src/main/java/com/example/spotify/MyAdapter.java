package com.example.spotify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends ArrayAdapter<Artist> {

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Artist> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_library, parent, false);
        }

        Artist artist = getItem(position);
        CircleImageView artist_image = convertView.findViewById(R.id.artist_pic);
        TextView artist_name = convertView.findViewById(R.id.artist_name);
        TextView media_type = convertView.findViewById(R.id.media_type);

        artist_image.setImageResource(artist.getImage());
        artist_name.setText(artist.getName());
        media_type.setText(artist.getType());

        return convertView;
    }
}
