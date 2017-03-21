package com.gdmec.jacky.dcollege;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MessageAdapter extends MyAdapter<ChatData> {
    private String friendUserName;

    public MessageAdapter(Context context, String friendUserName) {
        super(context);
        this.friendUserName = friendUserName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatData chatData = getDataList().get(position);
        if (convertView == null) {
            if (chatData.getUserName().equals(friendUserName)) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.left_message, null);
            } else {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.right_message, null);
            }
        }
        TextView chatMessage = MyViewHolder.get(convertView, R.id.chatMessage);
        ImageView chatUserIcon = MyViewHolder.get(convertView, R.id.chatUserIcon);
        chatMessage.setText(chatData.getMessage());
        chatUserIcon.setImageResource(chatData.getUserIcon());
        return convertView;
    }
}
