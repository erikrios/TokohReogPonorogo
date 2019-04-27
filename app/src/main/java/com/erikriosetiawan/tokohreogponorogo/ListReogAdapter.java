package com.erikriosetiawan.tokohreogponorogo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListReogAdapter extends RecyclerView.Adapter<ListReogAdapter.CategoryViewHolder> {

    final static String MESSAGE_JATHIL = "MESSAGEJATHIL";
    final static String MESSAGE_WAROK = "MESSAGEWAROK";
    final static String MESSAGE_REOG = "MESSAGEREOG";
    final static String MESSAGE_KLONO_SEWANDONO = "MESSAGEKLONOSEWANDONO";
    final static String MESSAGE_BUJANG_GANONG = "MESSAGEBUJANGGANONG";

    private Context context;
    private ArrayList<Reog> listReog;

    private ArrayList<Reog> getListReog() {
        return listReog;
    }

    void setListReog(ArrayList<Reog> listPresident) {
        this.listReog = listPresident;
    }

    ListReogAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_reog, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, final int position) {
        final Reog p = getListReog().get(position);
        categoryViewHolder.tvName.setText(getListReog().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListReog().get(position).getRemarks());

        Glide.with(context)
                .load(getListReog().get(position).getPhotos())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                switch (categoryViewHolder.getAdapterPosition()) {
                    case 0: intent = new Intent(context, JathilActivity.class);
                        intent.putExtra(MESSAGE_JATHIL, p.getName());
                        context.startActivity(intent);
                        break;
                    case 1: intent = new Intent(context, WarokActivity.class);
                        intent.putExtra(MESSAGE_WAROK, p.getName());
                        context.startActivity(intent);
                        break;
                    case 2: intent = new Intent(context, ReogActivity.class);
                        intent.putExtra(MESSAGE_REOG, p.getName());
                        context.startActivity(intent);
                        break;
                    case 3: intent = new Intent(context, KlonoSewandonoActivity.class);
                        intent.putExtra(MESSAGE_KLONO_SEWANDONO, p.getName());
                        context.startActivity(intent);
                        break;
                    case 4: intent = new Intent(context, BujangGanongActivity.class);
                        intent.putExtra(MESSAGE_BUJANG_GANONG, p.getName());
                        context.startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListReog().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        RelativeLayout lv;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            lv = itemView.findViewById(R.id.relative_layout);
        }
    }

}