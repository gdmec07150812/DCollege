package com.gdmec.jacky.dcollege;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ChatListAdapter extends MyAdapter<User> {
    public ChatListAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chatlist_item, null);
        }
        ImageView chatListUserIcon = MyViewHolder.get(convertView, R.id.chatListUserIcon);
        TextView chatListUserName = MyViewHolder.get(convertView, R.id.chatListUserName);
        TextView chatListChatInfo = MyViewHolder.get(convertView, R.id.chatListChatInfo);
        User user = getDataList().get(position);
        chatListUserIcon.setImageResource(user.getUserIcon());
        chatListUserName.setText(user.getName());
        chatListChatInfo.setText(user.getChatInfo());
        return convertView;
    }

}

//    private Context context;
//
//    private List<User> dataList;
//
//    public ChatListAdapter(Context context) {
//        this.context = context;
//    }
//
//    public List<User> getDataList() {
//        return dataList;
//    }
//
//    public void setDataList(List<User> dataList) {
//        this.dataList = dataList;
//    }
//
//    @Override
//    public int getCount() {
//        if (dataList != null) {
//            return dataList.size();
//        }
//        return 0;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return position;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder = null;
//        if (convertView == null) {
//            convertView = LayoutInflater.from(context).inflate(R.layout.chatlist_item, null);
//            viewHolder = new ViewHolder();
//            viewHolder.chatListUserIcon = (ImageView) convertView.findViewById(R.id.chatListUserIcon);
//            viewHolder.chatListUserName = (TextView) convertView.findViewById(R.id.chatListUserName);
//            viewHolder.chatListChatInfo = (TextView) convertView.findViewById(R.id.chatListChatInfo);
//            convertView.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//        User user = dataList.get(position);
//        viewHolder.chatListUserIcon.setImageResource(user.getUserIcon());
//        viewHolder.chatListUserName.setText(user.getName());
//        viewHolder.chatListChatInfo.setText(user.getChatInfo());
//        return convertView;
//    }
//
//    class ViewHolder {
//        private ImageView chatListUserIcon;
//        private TextView chatListUserName;
//        private TextView chatListChatInfo;
//    }

