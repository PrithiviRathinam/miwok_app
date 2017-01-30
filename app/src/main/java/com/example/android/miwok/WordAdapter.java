package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP-PC on 19-01-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResourceId;
    public WordAdapter(Activity vContext, ArrayList<Word> words, int colorResourceId){
        super(vContext,0 ,words);
        mColorResourceId = colorResourceId;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if(listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word w = getItem(position);
        TextView defaultTextView = (TextView)listViewItem.findViewById(R.id.default_text_view);
        TextView miwokTextView = (TextView) listViewItem.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(w.getMiwokTranslation());
        defaultTextView.setText(w.getDefaultTranslation());
        ImageView iconView = (ImageView) listViewItem.findViewById(R.id.image);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        LinearLayout layout = (LinearLayout) listViewItem.findViewById(R.id.list_item_id);
        if(w.hasImage()){
            iconView.setImageResource(w.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }
        layout.setBackgroundColor(color);
        return listViewItem;
    }
}
