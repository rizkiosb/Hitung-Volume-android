package com.example.jurussehatrosulullah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListObat extends RecyclerView.Adapter<ListObat.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    private ArrayList<Obat> ListObat;
    public ListObat(ArrayList<Obat> list){
        this.ListObat = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar_jsr, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Obat obat = ListObat.get(position);
        Glide.with(holder.itemView.getContext()).load(obat.getFoto()).apply(new RequestOptions().override(100,100)).into(holder.Foto);
        holder.Nama.setText(obat.getNama());
        holder.Deskripsi.setText(obat.getDescripsi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(ListObat.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return ListObat.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView Foto;
        TextView Deskripsi, Nama;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            Foto = itemView.findViewById(R.id.photo_obat);
            Nama = itemView.findViewById(R.id.nama);
            Deskripsi = itemView.findViewById(R.id.desc);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Obat data);
    }
}
