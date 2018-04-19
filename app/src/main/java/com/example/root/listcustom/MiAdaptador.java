package com.example.root.listcustom;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 04-14-18.
 */

public class MiAdaptador extends ArrayAdapter {
    List<Item> listChat = new ArrayList<>();
    Context context;
    int resource;

    public MiAdaptador(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);

        listChat = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(resource, parent, false);
        TextView tvMessage = (TextView) convertView.findViewById(R.id.tvMensaje);
        TextView tvHora = (TextView) convertView.findViewById(R.id.tvHora);
        ImageView ivIcono = (ImageView) convertView.findViewById(R.id.ivIcono);

        tvMessage.setText(listChat.get(position).mensaje);
        tvHora.setText(listChat.get(position).hora);
        ivIcono.setImageResource(listChat.get(position).img);

        return convertView;
    }
}
