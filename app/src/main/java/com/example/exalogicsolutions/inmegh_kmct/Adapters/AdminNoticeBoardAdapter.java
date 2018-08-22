package com.example.exalogicsolutions.inmegh_kmct.Adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.exalogicsolutions.inmegh_kmct.Models.NoticeBoardResponse.NoticeBoard;
import com.example.exalogicsolutions.inmegh_kmct.R;

import java.util.ArrayList;

public class AdminNoticeBoardAdapter extends RecyclerView.Adapter<AdminNoticeBoardAdapter.ViewHolder> {

    private ArrayList<NoticeBoard> arrayList;
    private Activity activity;

    public AdminNoticeBoardAdapter(Activity activity, ArrayList<NoticeBoard> arrayList) {
        this.arrayList = arrayList;
        this.activity = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notice_cardview_list, parent, false);

        return new ViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        NoticeBoard notice = arrayList.get(position);

        holder.tvTitleName.setText("" + notice.getTitle());

        holder.tvNoticeDate.setText("" + notice.getPostedOn());

        holder.tvDepartment.setText("" + notice.getMessage());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView tvTitleName, tvNoticeDate, tvDepartment;


        public ViewHolder(View v) {
            super(v);

            this.tvTitleName = v.findViewById(R.id.txNoticeTitle);
            this.tvNoticeDate = v.findViewById(R.id.txNoticeDate);
            this.tvDepartment = v.findViewById(R.id.txNoticeDepartment);

        }


    }
}
