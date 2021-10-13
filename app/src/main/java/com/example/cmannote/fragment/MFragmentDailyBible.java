package com.example.cmannote.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.cmannote.MainActivity;
import com.example.cmannote.R;

/**
 * Created by TCH on 2020/07/07
 *
 * @author think.code.help @gmail.com
 * @version 1.0
 * @since 2020 /07/07
 */
public class MFragmentDailyBible extends Fragment {
	private View mView;
	private MainActivity mActivity;


	/**
	 * Instantiates a new M fragment show mode.
	 *
	 * @param _activity the activity
	 */
	public MFragmentDailyBible(MainActivity _activity) {
		mActivity = _activity;
	}

	public static MFragmentDailyBible newInstance(MainActivity _activity) {
		MFragmentDailyBible mFragmentDailyBible = new MFragmentDailyBible(_activity);
		return mFragmentDailyBible;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.fragment_daily_bible, container, false);
		findViewsById(mView);
		return mView;
	}
	
	private void findViewsById(View _view) {

	}
}
