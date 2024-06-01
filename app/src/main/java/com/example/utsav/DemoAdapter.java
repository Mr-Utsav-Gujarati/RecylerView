package com.example.utsav;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview.R;

import java.util.List;
/**
 * Code BY MR.Gujarati
 */
public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ViewHolder> {

    /**
     *Add List of Data model and create constructor.
     * */
    List<DemoModel> demoModelList;
    Activity activity;

    public DemoAdapter(List<DemoModel> demoModelList, MainActivity activity) {
        this.demoModelList = demoModelList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public DemoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View photoView = inflater.inflate(R.layout.item_demo, parent, false);
        ViewHolder viewHolder = new ViewHolder(photoView);
        return viewHolder;
    }

    /**
     * onBindViewHolder method in get your data in model.
     *
     * and ClickEvents decler.
     * */
    @Override
    public void onBindViewHolder(@NonNull DemoAdapter.ViewHolder holder, int position) {
        holder.txtDemo.setText(demoModelList.get(position).getName());
        holder.ivDemo.setImageResource(demoModelList.get(position).getImage());
        holder.ivDemo.setOnClickListener(view -> {
/**
 * Click Image to highlight Image.
 * */
            if (holder.rlborder.getBackground() == null) {
                holder.rlborder.setBackgroundResource(R.drawable.shap);
            } else {
                holder.rlborder.setBackground(null);
            }
        });
    }

    @Override
    public int getItemCount() {
        return demoModelList.size();
    }
/**
 * decler your items file xml data variable and,
 * find ids.
 * */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivDemo;
        TextView txtDemo;
        RelativeLayout rlborder;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivDemo = itemView.findViewById(R.id.ivDemo);
            txtDemo = itemView.findViewById(R.id.txtDemo);
            rlborder = itemView.findViewById(R.id.rlborder);
        }
    }
}
