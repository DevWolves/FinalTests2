package com.example.finaltests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

        private Context context;
        private List<Book> data;

        BooksAdapter(Context context, List<Book> data) {
            this.context = context;
            this.data = data;
        }

        @Override
        @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
            holder.nameView.setText(data.get(position).bookName);
            holder.genreView.setText(data.get(position).genre);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }


        class ViewHolder extends RecyclerView.ViewHolder {
            TextView nameView;
            TextView genreView;

            ViewHolder(View view) {
                super(view);
                nameView = view.findViewById(R.id.name_view);
                genreView = view.findViewById(R.id.genre_view);
            }
        }
    }

