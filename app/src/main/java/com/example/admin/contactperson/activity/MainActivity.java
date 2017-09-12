package com.example.admin.contactperson.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.admin.contactperson.R;
import com.example.admin.contactperson.utils.CarBean;
import com.example.admin.contactperson.utils.RecCarAdapter;
import com.example.admin.contactperson.utils.Utils;
import com.example.admin.contactperson.view.IndexBar;
import com.example.admin.contactperson.view.IndexLayout;

import java.util.ArrayList;
import java.util.List;

import qdx.stickyheaderdecoration.NormalDecoration;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private IndexLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        mRecyclerView= (RecyclerView) findViewById(R.id.recView);
        CarBean carBean = new Utils().readFromAssets(MainActivity.this);
        final List<CarBean.CarInfo> carList = carBean.getData();


        RecCarAdapter adapter = new RecCarAdapter(this);
        adapter.addDatas(carList);

        final NormalDecoration decoration = new NormalDecoration() {
            @Override
            public String getHeaderName(int pos) {
                return carList.get(pos).getInitial();
            }
        };

        decoration.setOnHeaderClickListener(new NormalDecoration.OnHeaderClickListener() {
            @Override
            public void headerClick(int pos) {
                Toast.makeText(MainActivity.this, "点击到头部" + carList.get(pos).getInitial(), Toast.LENGTH_SHORT).show();
            }
        });

        final LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.addItemDecoration(decoration);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(adapter);


        //侧边导航栏
        IndexLayout indexLayout = (IndexLayout) findViewById(R.id.index_layout);
        List<String> heads = new ArrayList<>();
        for (CarBean.CarInfo car : carList) {
            if (!heads.contains(car.getInitial())) {
                heads.add(car.getInitial());
            }
        }
        indexLayout.setIndexBarHeightRatio(0.9f);
        indexLayout.getIndexBar().setIndexsList(heads);
        indexLayout.getIndexBar().setIndexChangeListener(new IndexBar.IndexChangeListener() {
            @Override
            public void indexChanged(String indexName) {
                for (int i = 0; i < carList.size(); i++) {
                    if (indexName.equals(carList.get(i).getInitial())) {
                        manager.scrollToPositionWithOffset(i, 0);
                        return;
                    }
                }
            }
        });

    }
}
