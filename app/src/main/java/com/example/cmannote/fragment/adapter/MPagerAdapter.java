package com.example.cmannote.fragment.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by TCH on 2020/07/07
 *
 * @author think.code.help @gmail.com
 * @version 1.0
 * @since 2020 /07/07
 */
public abstract class MPagerAdapter extends FragmentPagerAdapter {
	private Context mContext;

	/**
	 * The constant MENU_EA.
	 */
	public static final int MENU_EA                     = 1;

	/**
	 * Constructor for {@link FragmentPagerAdapter}.
	 *
	 * @param fm       fragment manager that will interact with this adapter
	 * @param behavior determines if only current fragments are in a resumed state
	 * @param _context the context
	 */
	public MPagerAdapter(@NonNull FragmentManager fm, int behavior, Context _context) {
		super(fm, behavior);

		mContext = _context;
	}

	@Override
	public int getCount() { // Return the number of pages
		return MENU_EA;
	}
}
