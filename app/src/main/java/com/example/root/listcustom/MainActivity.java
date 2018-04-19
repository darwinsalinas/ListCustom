package com.example.root.listcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


//    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> listChat = new ArrayList<>();
//        Item nuevo = new Item("Hola", "2.20 pm", android.R.drawable.ic_dialog_email);
//        listChat.add(nuevo);


        listChat.add(new Item("Hola", "2.20 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Casi llego", "2.21 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Yo igual", "2.22 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));
        listChat.add(new Item("Adios", "2.23 pm", android.R.drawable.ic_dialog_email));

        MiAdaptador adapter = new MiAdaptador(this, R.layout.itemvista, listChat);

        ListView lvChat = (ListView) findViewById(R.id.lvChat);

        lvChat.setAdapter(adapter);


    }
}
