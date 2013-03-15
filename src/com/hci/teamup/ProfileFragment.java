package com.hci.teamup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class ProfileFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String TAG = "ProfileFragment";
	public static final String ARG_SECTION_NUMBER = "section_number";
	public static final String TAB_MEMBERS = "Members";
	public static final String TAB_TASKS = "Tasks";
	public static final String TAB_MEETINGS = "Meetings";
	    
    private View rootView;
    private TabHost mTabHost;
    
	public ProfileFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_profile,
				container, false);
		//Was trying to follow this http://android.codeandmagic.org/2011/07/android-tabs-with-fragments/ 
		return rootView;
	}
	
	
    
}
