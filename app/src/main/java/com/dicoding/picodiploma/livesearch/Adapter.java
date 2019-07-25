package com.dicoding.picodiploma.livesearch;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.MyViewHolder>{

    private List<Pos> pos;
    private Context context;

    public Adapter(List<Pos> pos, Context context) {
        this.pos = pos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.nama.setText(pos.get(position).getNama());
        holder.alamat.setText(pos.get(position).getAlamat());
        holder.kecamatan.setText(pos.get(position).getKecamatan());
        holder.kota.setText(pos.get(position).getKota());
        holder.keterangan.setText(pos.get(position).getKeterangan());
        holder.penerima.setText(pos.get(position).getPenerima());
        holder.tgl_kirim.setText(pos.get(position).getTgl_kirim());
        holder.tgl_terima.setText(pos.get(position).getTgl_terima());

    }

    @Override
    public int getItemCount() {
        return pos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nama, alamat, kecamatan, kota, keterangan, penerima, tgl_kirim, tgl_terima;

        public MyViewHolder( View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.textViewNama);
            alamat = itemView.findViewById(R.id.textViewAlamat);
            kecamatan = itemView.findViewById(R.id.textViewKecamatan);
            kota = itemView.findViewById(R.id.textViewKota);
            keterangan = itemView.findViewById(R.id.textViewKeterangan);
            penerima = itemView.findViewById(R.id.textViewPenerima);
            tgl_kirim = itemView.findViewById(R.id.textViewTglKirim);
            tgl_terima =itemView.findViewById(R.id.textViewTglTerima);
        }
    }
}
