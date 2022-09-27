package com.example.bookfirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

        private Context context;
        private List<Book> books;
        private ValueEventListener valueEventListener;

        public BookAdapter(List<Book> books, Context context) {
            this.books = books;
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_book, parent, false);
            ViewHolder viewHolder = new ViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Book upload = books.get(position);
            holder.textViewName.setText(upload.getName());
            holder.textViewPrice.setText(upload.getPage() + " หน้า");
            Glide.with(context).load(upload.getUrl()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return books.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            public TextView textViewName, textViewPrice;
            public ImageView imageView;

            public ViewHolder(View itemView) {
                super(itemView);

                textViewName = (TextView) itemView.findViewById(R.id.name);
                textViewPrice = (TextView) itemView.findViewById(R.id.page);
                imageView = (ImageView) itemView.findViewById(R.id.icon);
            }
        }
}
