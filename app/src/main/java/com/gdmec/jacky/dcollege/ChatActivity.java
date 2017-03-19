package com.gdmec.jacky.dcollege;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ChatActivity extends Activity {
    private ImageView chatUserIcon;
    private TextView chatUserName;
    private TextView chatInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);
        chatUserName = (TextView) findViewById(R.id.chatUserName);
        Bundle bundle = this.getIntent().getExtras();
        chatUserName.setText(bundle.getString("userName"));

    }

    protected void backTo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}