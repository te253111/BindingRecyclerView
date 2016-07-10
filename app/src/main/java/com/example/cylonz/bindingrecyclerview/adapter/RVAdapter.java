package com.example.cylonz.bindingrecyclerview.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.cylonz.bindingrecyclerview.R;
import com.example.cylonz.bindingrecyclerview.data.Person;
import com.example.cylonz.bindingrecyclerview.databinding.CusViewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cylonz on 9/7/2559.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.DataViewHolder>{
    CusViewBinding binding;
    List<Person> persons;

    public RVAdapter(List<Person> persons){
        this.persons=persons;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.cus_view,parent,false);
        DataViewHolder pvh = new DataViewHolder(binding);
        return pvh;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.binding.txtid.setText(persons.get(position).getId());
        holder.binding.txtname.setText(persons.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


    public static class DataViewHolder extends RecyclerView.ViewHolder {
        CusViewBinding binding;
        DataViewHolder(CusViewBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
