package com.example.holidayslocaljson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecycleItem;

    public RecycleAdapter(Context context, List<Object> listRecycleItem) {
        this.context = context;
        this.listRecycleItem = listRecycleItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView date;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.holidayName);
            date = (TextView) itemView.findViewById(R.id.holidayDate);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item, parent, false);
        return new ItemViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
        Holidays holidays = (Holidays) listRecycleItem.get(position);
        itemViewHolder.name.setText(holidays.getName());
        itemViewHolder.date.setText(holidays.getDate());
    }

    @Override
    public int getItemCount() {
        return listRecycleItem.size();
    }
}
