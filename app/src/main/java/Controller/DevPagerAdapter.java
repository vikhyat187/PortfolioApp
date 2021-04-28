package Controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import View.AboutFragment;
import View.ContactFragment;
import View.SkillsFragment;
import View.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new AboutFragment();
            case 1:return new WorkFragment();
            case 2:return new SkillsFragment();
            case 3:return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:return "About";
            case 1:return "Work";
            case 2:return "Skills";
            case 3:return "Contact";
        }
        return null;
    }
}
