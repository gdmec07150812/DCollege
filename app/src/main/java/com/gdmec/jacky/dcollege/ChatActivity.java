package com.gdmec.jacky.dcollege;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends Activity {
    private TextView friendUserName;
    private ListView chatListView;
    private List<ChatData> list;
    private MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);
        friendUserName = (TextView) findViewById(R.id.friendUserName);
        Bundle bundle = this.getIntent().getExtras();
        friendUserName.setText(bundle.getString("friendUserName"));
        chatListView = (ListView) findViewById(R.id.chatListView);
        list = new ArrayList<ChatData>();
        messageAdapter = new MessageAdapter(this, bundle.getString("friendUserName"));
        list.add(new ChatData("Jacky", R.drawable.back, "你好"));
        list.add(new ChatData("Ding", R.drawable.clean, "你好啊"));
        list.add(new ChatData("Jacky", R.drawable.back, "我在机电312"));
        list.add(new ChatData("Jacky", R.drawable.back, "你呢？"));
        list.add(new ChatData("Ding", R.drawable.clean, "我也是啊"));
        list.add(new ChatData("Ding", R.drawable.clean, "你叫什么名字啊？"));
        list.add(new ChatData("Jacky", R.drawable.back, "管你嘿事啊！"));
        list.add(new ChatData("Ding", R.drawable.clean, "也对，扑街啦！"));
        list.add(new ChatData("Jacky", R.drawable.back, "oaky，88"));
        list.add(new ChatData("Ding", R.drawable.clean, "88"));
        messageAdapter.setDataList(list);
        chatListView.setAdapter(messageAdapter);
    }

    private void backTo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}