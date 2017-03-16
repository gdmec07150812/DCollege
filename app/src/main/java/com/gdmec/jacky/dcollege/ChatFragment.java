package com.gdmec.jacky.dcollege;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class ChatFragment extends Fragment {
    private ImageButton leftButton;
    private DrawerLayout drawerLayout;
    private RelativeLayout leftDrawer;

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
