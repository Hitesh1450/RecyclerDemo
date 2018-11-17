package com.example.recyclerdemo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by USER on 31-Jul-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context ct;
    ArrayList<Person> al;
    int count =0;


    MyAdapter(Context ct1, ArrayList al1)
    {
     ct = ct1;
     al = al1;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater li = LayoutInflater.from(ct);
        View v = li.inflate(R.layout.my_layout,parent,false);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {

        Person p1 = al.get(position);

        holder.tv1.setText(p1.getName());
        holder.tv2.setText(p1.getDesc());
     holder.iv.setImageResource(p1.getImage());

      holder.ll.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(ct,"Clicked"+position,Toast.LENGTH_SHORT).show();
              count++;

          }


      });

    }
    @Override
    public int getItemCount() {return al.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tv1,tv2;
        ImageView iv;
        LinearLayout ll;

        public MyHolder(View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);

            iv = itemView.findViewById(R.id.iv);

            ll = itemView.findViewById(R.id.ll);
        }

    }
}
