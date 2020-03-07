package com.example.componentdragstatic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComponentAdapter extends RecyclerView.Adapter<ComponentAdapter.ViewHolder> {

    List<ComponentDragModel> modelData;

    public ComponentAdapter(List<ComponentDragModel> fillData) {
        this.modelData = fillData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        Button button;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview_item);
            button = itemView.findViewById(R.id.button_item);
            imageView = itemView.findViewById(R.id.image_item);
        }

        public void binData(ComponentDragModel componentDragModel) {
            textView.setText(componentDragModel.getTitle());
            button.setText(componentDragModel.getButton());
            imageView.setImageResource(componentDragModel.getImage());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.recycler_items;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.binData(modelData.get(position));
    }

    @Override
    public int getItemCount() {
        return modelData.size();
    }
}
