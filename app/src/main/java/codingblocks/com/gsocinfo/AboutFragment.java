package codingblocks.com.gsocinfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by harshit on 25/08/17.
 */

public class AboutFragment extends Fragment {

    private ArrayList<String> date = new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<String> description = new ArrayList<>();

    public static AboutFragment newInstance() {

        Bundle args = new Bundle();

        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");
        date.add("27-01-2017");

        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");
        title.add("Hey, this is a title");

        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");
        description.add("Hi, I'm the description");

        RecyclerView recyclerView = view.findViewById(R.id.rv_timeline);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        TimelineAdapter timelineAdapter = new TimelineAdapter(date, title, description);

        recyclerView.setAdapter(timelineAdapter);
        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
