package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    /*
   Public constructor that passes the context and the source of information for the adapter
   @param context is the context of the activity
   @param article is the List that contains objects of type Article
    */
    public ArticleAdapter(Context context, List<Article> article) {
        super(context, 0, article);

    }

    /**
     * Returns a list item view that displays information about the article.
     */
    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }
        //Find the article at the given position in the list article
        Article currentArticle = getItem(position);

        // Find the TextView with view ID title for setting title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the current article in that TextView
        titleTextView.setText(currentArticle.getTitle());

        // Find the TextView with view ID section for setting section
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);
        // Display the section of the current article in that TextView
        sectionTextView.setText(currentArticle.getSection());

        // Find the TextView with view ID date for setting date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current article in that TextView
        String date = currentArticle.getDate();
        dateTextView.setText(currentArticle.getDate());

        // Find the TextView with view ID author for setting section
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);
        // Display the author of the current article in that TextView
        authorTextView.setText(currentArticle.getAuthor());


        return listItemView;
    }

}

