package com.example.cmannote;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.cmannote.fragment.MFragmentDailyBible;
import com.example.cmannote.fragment.adapter.MPagerAdapter;
import com.example.cmannote.utils.MDEBUG;

public class MainActivity extends AppCompatActivity {
    /**
     * 뷰 페이저
     */
//    @BindView(R.id.vpMain)
    ViewPager vpMain;
    /**
     * 페이지 어댑터
     */
    private MPagerAdapter mPagerAdapter;

    /**
     * 페이지 어댑터
     */
    public Fragment mFragmentDailyBible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpMain = findViewById(R.id.vpMain);

        mPagerAdapter = new MMPagerAdapter(getSupportFragmentManager(), 0, this);
        MDEBUG.debug("oncreate !!!!!!!!! : ");

        vpMain.setAdapter(mPagerAdapter);
    }

    private class MMPagerAdapter extends MPagerAdapter {
        /**
         * Instantiates a new Mm pager adapter.
         *
         * @param fm       fragment manager that will interact with this adapter
         * @param behavior determines if only current fragments are in a resumed state
         * @param _context the context
         */
        public MMPagerAdapter(@NonNull FragmentManager fm, int behavior, Context _context) {
            super(fm, behavior, _context);
        }

        @Override
        public Fragment getItem(int position) {
            MDEBUG.debug("getitem!!!!!!!!! : " + position);
            switch (position) {
                case 0:
                    return MFragmentDailyBible.newInstance(MainActivity.this);
                default:
                    return null;
            }
            /*
            if(position == FD_MENU.DEVICE_LIST) {
                if(mFragmentDeviceList == null)
                    mFragmentDeviceList = new MFragmentDeviceList(MainActivity.this, mBtDeviceList);
                return mFragmentDeviceList;
            }
            */
        }
    }
}