package com.example.kris.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   /* private String[] data = {"为什么要学数学","数学过敏症对策","导数有什么用","某一点的斜率和瞬间斜率","曲线的高峰","如何画曲线图","如何使用导数",
            "用导数处理图像","如何求斜率","怎样在曲线上取两点","使曲线上的两点不断接近","什么是极限","什么是无限接近","怎样利用数学算式表示极限",
            "极值的求法和表示方法"};*/

   private List<Chapter> chapterList = new ArrayList<Chapter>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        initChapter();
        ChapterAdapter adapter = new ChapterAdapter(MainActivity.this,R.layout.chapter_item,chapterList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Chapter chapter = chapterList.get(position);
                Intent intent = new Intent(MainActivity.this,Ch01.class);
                startActivity(intent);
            }
        });
    }

    private void initChapter(){
        Chapter ch1 = new Chapter("为什么要学数学",R.drawable.ch01);
        chapterList.add(ch1);
        Chapter ch2 = new Chapter("数学过敏症对策",R.drawable.ch02);
        chapterList.add(ch2);
        Chapter ch3 = new Chapter("导数有什么用",R.drawable.ch03);
        chapterList.add(ch3);
        Chapter ch4 = new Chapter("某一点的斜率和瞬间斜率",R.drawable.ch04);
        chapterList.add(ch4);
        Chapter ch5 = new Chapter("曲线的高峰",R.drawable.ch05);
        chapterList.add(ch5);
        Chapter ch6 = new Chapter("如何画曲线图",R.drawable.ch06);
        chapterList.add(ch6);
        Chapter ch7 = new Chapter("如何使用导数",R.drawable.ch07);
        chapterList.add(ch7);
        Chapter ch8 = new Chapter("用导数处理图像",R.drawable.ch08);
        chapterList.add(ch8);
        Chapter ch9 = new Chapter("如何求斜率",R.drawable.ch09);
        chapterList.add(ch9);
        Chapter ch10 = new Chapter("怎样在曲线上取两点",R.drawable.ch10);
        chapterList.add(ch10);
        Chapter ch11 = new Chapter("使曲线上的两点不断接近",R.drawable.ch11);
        chapterList.add(ch11);
        Chapter ch12 = new Chapter("什么是极限",R.drawable.ch12);
        chapterList.add(ch12);
        Chapter ch13 = new Chapter("什么是无限接近",R.drawable.ch13);
        chapterList.add(ch13);
        Chapter ch14 = new Chapter("怎样利用数学算式表示极限",R.drawable.ch14);
        chapterList.add(ch14);
        Chapter ch15 = new Chapter("极值的求法和表示方法",R.drawable.ch15);
        chapterList.add(ch15);
    }

}
