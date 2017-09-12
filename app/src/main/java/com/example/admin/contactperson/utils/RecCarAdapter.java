package com.example.admin.contactperson.utils;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.admin.contactperson.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：created  by jash on 2017/9/12
 * 版本：1.0.0.
 */

public class RecCarAdapter  extends RecyclerView.Adapter<RecCarAdapter.Holder>{
    private List<CarBean.CarInfo> mList;

    private Activity mActivity;

    public RecCarAdapter( Activity mActivity) {
        mList = new ArrayList<>();
        this.mActivity = mActivity;
    }
    public void addDatas(List<CarBean.CarInfo> data) {
        this.mList.clear();
        this.mList.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        CarBean.CarInfo car = mList.get(position);
        holder.item_tv.setText(car.getName());
        Glide.with(mActivity).load(car.getLogoUrl()).into(holder.mimageView);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "点击了"+mList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class  Holder extends RecyclerView.ViewHolder{
        private ImageView mimageView;
        private TextView item_tv;
        private LinearLayout linearLayout;
        public Holder(View itemView) {
            super(itemView);
            mimageView= (ImageView) itemView.findViewById(R.id.item_iv);
            item_tv= (TextView) itemView.findViewById(R.id.item_tv);
            linearLayout= (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
