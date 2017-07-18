package com.example.kris.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 38348 on 2017/7/17.
 */

public class ChapterAdapter extends ArrayAdapter<Chapter> {

    private int resourceId;

    public ChapterAdapter(Context context, int textViewResourceId, List<Chapter> objects){
        super(context, textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Chapter chapter = getItem(position);
        //View view = LayoutInflater.from(getContext()).inflate(rosourceId,null);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.chapterImage = (ImageView) view.findViewById(R.id.chapter_image);
            viewHolder.chapterName = (TextView) view.findViewById(R.id.chapter_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        /*
        ImageView chapterImage = (ImageView) view.findViewById(R.id.chapter_image);
        TextView chapterName = (TextView) view.findViewById(R.id.chapter_name);
        chapterImage.setImageResource(chapter.getImageId());
        chapterName.setText(chapter.getName());
        */
        viewHolder.chapterImage.setImageResource(chapter.getImageId());
        viewHolder.chapterName.setText(chapter.getName());
        return view;
    }

    class ViewHolder {
        ImageView chapterImage;
        TextView chapterName;
    }
}
