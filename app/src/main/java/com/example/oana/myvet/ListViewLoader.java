package com.example.oana.myvet;
import android.widget.*;
import android.content.*;
import android.app.Dialog;
import android.graphics.Color;
import android.os.*;
import android.app.ActionBar.*;
import android.view.*;

import java.util.ArrayList;
import android.app.Activity;
import java.util.ArrayList.*;
/**
 * Created by oana on 08/11/2017.
 */

public class ListViewLoader extends Activity{
    String[] items={"All paws & claws","Little Paws","Trustivet","DrPawPaw"};
    // This is the Adapter being used to display the list's data
    ArrayAdapter<String> adapter;
    ListView myListView=null;



    private void populateListView(){
        adapter=new ArrayAdapter<String>(this,R.layout.data_item,R.id.edit_item,items);
        myListView =(ListView)findViewById(R.id.myListView);
        myListView.setAdapter(adapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        setTitle("Veterinary clinics available");
        // Create a progress bar to display while the lis loads
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        progressBar.setIndeterminate(true);
        populateListView();
        registerClickCallBack();
    }

    public void registerClickCallBack(){
        final ListView list =(ListView)findViewById(R.id.myListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent,View viewclicked,int position,long id){
                showInputBox(items[position],position);
            }
        });

    }

    public void showInputBox(String oldItem, final int index){
        final Dialog dialog=new Dialog(ListViewLoader.this);
        dialog.setTitle("Input Box");
        dialog.setContentView(R.layout.edit_item_activity);
        TextView txtMessage=(TextView)dialog.findViewById(R.id.txtmessage);
        txtMessage.setText("Update item");
        txtMessage.setTextColor(Color.parseColor("#ff2222"));
        final EditText editText=(EditText)dialog.findViewById(R.id.txtinput);
        editText.setText(oldItem);
        Button bt=(Button)dialog.findViewById(R.id.btdone);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items[index]=editText.getText().toString();
                adapter.notifyDataSetChanged();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}


