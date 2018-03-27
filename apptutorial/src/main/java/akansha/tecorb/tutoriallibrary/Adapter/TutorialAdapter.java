package akansha.tecorb.tutoriallibrary.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import akansha.tecorb.tutoriallibrary.Fragment.TutorialFragment;
import akansha.tecorb.tutoriallibrary.TutorialPages;

/**
 * Created by tecorb on 26/3/18.
 */

public class TutorialAdapter extends FragmentPagerAdapter {

    private List<TutorialPages>pages = new ArrayList<>();
    private List<TutorialFragment> mTutorialFragment = new ArrayList<>();

    public TutorialAdapter(List<TutorialPages> pages, FragmentManager fm) {
        super(fm);
        this.pages = pages;
        for (int i = 0; i < pages.size(); i++) {
            addDataFragment(pages.get(i));
        }
    }

    private void addDataFragment(TutorialPages tutorialPages) {
        mTutorialFragment.add(TutorialFragment.newInstance(tutorialPages));
    }

    @Override
    public Fragment getItem(int position) {
        return mTutorialFragment.get(position);
    }

    @Override
    public  int getCount() {
        return pages.size();
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Object fragment = super.instantiateItem(container, position);
        mTutorialFragment.set(position, (TutorialFragment) fragment);
        return fragment;
    }
}
