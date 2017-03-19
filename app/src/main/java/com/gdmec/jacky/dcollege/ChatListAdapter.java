package com.gdmec.jacky.dcollege;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatListAdapter extends BaseAdapter {
    private ImageView chatListUserIcon;
    private TextView chatListUserName;
    private TextView chatListChatInfo;
    private Context context;

    private List<User> userList;

    public ChatListAdapter(Context context) {
        this.context = context;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int getCount() {
        if (userList != null) {
            return userList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.chatlist_item, null);
        chatListUserIcon = (ImageView) view.findViewById(R.id.chatListUserIcon);
        chatListUserName = (TextView) view.findViewById(R.id.chatListUserName);
        chatListChatInfo = (TextView) view.findViewById(R.id.chatListChatInfo);
        User user = userList.get(position);
        chatListUserIcon.setImageResource(user.getUserIcon());
        chatListUserName.setText(user.getName());
        chatListChatInfo.setText(user.getChatInfo());
        return view;
    }
}
