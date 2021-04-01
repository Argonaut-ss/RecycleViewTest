package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder> {

    private ArrayList<Siswa> dataList;

    public SiswaAdapter(ArrayList<Siswa> dataList) {
        this.dataList = dataList;
    }

    @Override
    public SiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemview, parent, false);
        // method ini gunanya untuk menghubungkan ke layout itemview
        return new SiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SiswaViewHolder holder, int position) {
        // 0 : Ani , 1 : Budi
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNim());
        holder.txtNoHp.setText(dataList.get(position).getNohp());
        holder.txtemail.setText(dataList.get(position).getEmail());
    }

    // data nya berapa = 2, index 0 dan 1
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class SiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp , txtemail;

        public SiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
            txtemail = (TextView) itemView.findViewById(R.id.txtemail);
        }
    }
}