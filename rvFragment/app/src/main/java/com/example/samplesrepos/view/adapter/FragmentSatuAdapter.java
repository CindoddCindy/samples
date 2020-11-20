package com.example.samplesrepos.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.samplesrepos.R;
import com.example.samplesrepos.model.IsiFrgamentSatu;

import java.util.List;

public class FragmentSatuAdapter extends RecyclerView.Adapter<FragmentSatuAdapter.FragmentSatuChild> {

    Context context;
    List<IsiFrgamentSatu> isiFrgamentSatuList;

    public FragmentSatuAdapter(Context context, List<IsiFrgamentSatu> isiFrgamentSatuList){
        this.context=context;
        this.isiFrgamentSatuList=isiFrgamentSatuList;
    }
    @NonNull
    @Override
    public FragmentSatuChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View views = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterfragmentsatu, null);
        FragmentSatuChild fragmentSatuChild=new FragmentSatuChild(views);
        return fragmentSatuChild;

    }

    @Override
    public void onBindViewHolder(@NonNull FragmentSatuChild holder, int position) {
        holder.textView_satu.setText(isiFrgamentSatuList.get(position).judul);
        holder.textView_dua.setText(isiFrgamentSatuList.get(position).ket);
        Glide.with(context)
                .load(isiFrgamentSatuList.get(position).image)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.imageView_satu);


    }

    @Override
    public int getItemCount() {
        return isiFrgamentSatuList.size();

    }

    public  class FragmentSatuChild extends  RecyclerView.ViewHolder{

        public ImageView imageView_satu;

        public TextView textView_satu, textView_dua;


        public FragmentSatuChild(@NonNull View itemView) {
            super(itemView);

            imageView_satu=itemView.findViewById(R.id.iv_satu);
            textView_satu=itemView.findViewById(R.id.tv_satu);
            textView_dua=itemView.findViewById(R.id.tv_dua);
        }
    }
}
