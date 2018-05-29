package com.example.gu.map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by FengHuiHuang on 2018/5/20.
 */
public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        PieceViewGroup dragViewGroup=(PieceViewGroup) this.findViewById(R.id.dragViewGroup);
        float scale = getResources().getDisplayMetrics().density;
        float X=156*scale+0.5f;
        float Y=231*scale+0.5f;
        Log.d("GameActivity",""+X+" "+Y);
        dragViewGroup.setXY(X,Y);
    }
}
