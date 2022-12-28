package com.example.polinela;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.example.polinela.R;

import java.util.ArrayList;
import java.util.HashMap;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    Context context;
    ArrayList<HashMap<String, String>> list_data;

    public AdapterList(EkonomiBisnis ekonomiBisnis, ArrayList<HashMap<String, String>> list_data) {
        this.context = ekonomiBisnis;
        this.list_data = list_data;
    }

    public AdapterList(Perkebunan perkebunan, ArrayList<HashMap<String, String>> list_data) {
        this.context = perkebunan;
        this.list_data = list_data;
    }

    public AdapterList(BudidayaTanaman budidayaTanaman, ArrayList<HashMap<String, String>> list_data) {
        this.context = budidayaTanaman;
        this.list_data = list_data;
    }

    public AdapterList(Pertanian pertanian, ArrayList<HashMap<String, String>> list_data) {
        this.context = pertanian;
        this.list_data = list_data;
    }

    public AdapterList(Peternakan peternakan, ArrayList<HashMap<String, String>> list_data) {
        this.context = peternakan;
        this.list_data = list_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_prodi, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txthape.setText(list_data.get(position).get("nm_prodi"));

    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox txthape;

        public ViewHolder(View itemView) {
            super(itemView);


        }
    }
}