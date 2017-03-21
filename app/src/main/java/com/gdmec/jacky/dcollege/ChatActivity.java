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
        list = new ArrayList<>();
        list.add(new ChatData("Jacky", R.drawable.black, "你好"));
        list.add(new ChatData("Ding", R.drawable.clean, "你好哦"));
        list.add(new ChatData("Jacky", R.drawable.black, "我在机电"));
        list.add(new ChatData("Jacky", R.drawable.black, "四饭"));
        list.add(new ChatData("Ding", R.drawable.clean, "我也是啊"));
        list.add(new ChatData("Ding", R.drawable.clean, "等我吧"));
        list.add(new ChatData("Jacky", R.drawable.black, "好哒"));
        messageAdapter = new MessageAdapter(this, bundle.getString("friendUserName"));
        messageAdapter.setDataList(list);
        chatListView.setAdapter(messageAdapter);

    }

    protected void backTo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}