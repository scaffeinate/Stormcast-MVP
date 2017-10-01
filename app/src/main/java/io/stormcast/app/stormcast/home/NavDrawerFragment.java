package io.stormcast.app.stormcast.home;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import io.stormcast.app.stormcast.R;
import io.stormcast.app.stormcast.views.actionbar.toggle.AnimatedActionBarDrawerToggle;

/**
 * Created by sudharti on 9/30/17.
 */

public class NavDrawerFragment extends Fragment {
    private View mDrawerFragment;
    private ListView mNavDrawerListView;
    private DrawerLayout mDrawerLayout;

    public static AnimatedActionBarDrawerToggle mActionBarToggle;

    private String[] mNavDrawerArray;
    private ArrayAdapter<String> mNavDrawerAdapter;
    private NavDrawerCallbacks mNavDrawerCallbacks;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mNavDrawerCallbacks = (NavDrawerCallbacks) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNavDrawerArray = new String[]{};
        mNavDrawerAdapter = new ArrayAdapter<>(getContext(), R.layout.item_nav_drawer_list, mNavDrawerArray);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_drawer, container, false);
        mNavDrawerListView = (ListView) view.findViewById(R.id.list_view_nav_drawer);
        mNavDrawerListView.setAdapter(mNavDrawerAdapter);
        mNavDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectItem(i);
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mNavDrawerCallbacks = null;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mActionBarToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setUp(int navDrawerFragmentId, DrawerLayout drawerLayout) {
        this.mDrawerLayout = drawerLayout;
        this.mDrawerFragment = getActivity().findViewById(navDrawerFragmentId);

        mActionBarToggle = new AnimatedActionBarDrawerToggle(getActivity(), mDrawerLayout,
                R.string.nav_drawer_open, R.string.nav_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }
        };
        mActionBarToggle.syncState();
        mDrawerLayout.addDrawerListener(mActionBarToggle);

        selectItem(0);
    }

    private void selectItem(final int position) {
        if (mNavDrawerCallbacks != null) {
            if (isDrawerOpen()) closeDrawer();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mNavDrawerCallbacks.onNavDrawerListItemClicked(position);
                }
            }, 200);
            mNavDrawerListView.setItemChecked(position, true);
        }
    }

    private boolean isDrawerOpen() {
        return mDrawerLayout.isDrawerOpen(mDrawerFragment);
    }

    private void closeDrawer() {
        mDrawerLayout.closeDrawer(mDrawerFragment);
    }

    public void toggleMenu(boolean enabled) {
        if (enabled) {
            mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNDEFINED);
            mActionBarToggle.animateToMenu();
        } else {
            mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
            mActionBarToggle.animateToBackArrow();
        }
    }

    public interface NavDrawerCallbacks {
        public void onNavDrawerListItemClicked(int position);
    }
}
