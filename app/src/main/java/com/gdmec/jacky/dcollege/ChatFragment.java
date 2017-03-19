package com.gdmec.jacky.dcollege;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {
    private ImageButton leftButton;
    private DrawerLayout drawerLayout;
    private RelativeLayout leftDrawer;
    private ListView chatListListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chatview, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        leftButton = (ImageButton) getActivity().findViewById(R.id.leftButton);
        drawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawerlayout);
        leftDrawer = (RelativeLayout) getActivity().findViewById(R.id.leftDrawer);
        chatListListView = (ListView) getActivity().findViewById(R.id.chatListListView);
        ChatListAdapter chatListAdapter = new ChatListAdapter(getContext());
        List<User> list = new ArrayList<User>();
        list.add(new User("1", R.drawable.user_icon, "1234567890"));
        list.add(new User("2", R.drawable.black, "abcdefghijklmnopq"));
        list.add(new User("3", R.drawable.clean, "3415retysgfsdfg"));
        list.add(new User("4", R.drawable.individuation, "fdkgjhgd23452345"));
        chatListAdapter.setDataList(list);
        chatListListView.setAdapter(chatListAdapter);
        setListener();
    }

    protected void setListener() {
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(leftDrawer);
            }
        });
    }
}
