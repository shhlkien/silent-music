package phamkien.silentMusic.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import phamkien.silentMusic.Activities.PlayerActivity;
import phamkien.silentMusic.Adapters.PlaylisAdapter;
import phamkien.silentMusic.R;

public class PlaylistInPlayerFragment extends Fragment {

    private View view;
    private RecyclerView rvPlaylist;
    private PlaylisAdapter playlistAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_playlist_in_player, container, false);
        rvPlaylist = view.findViewById(R.id.rvPlaylist);

        if (PlayerActivity.songList.size() > 0) {

            rvPlaylist.setLayoutManager(new LinearLayoutManager(getContext()));
            playlistAdapter = new PlaylisAdapter(getContext(), PlayerActivity.songList);
            rvPlaylist.setAdapter(playlistAdapter);
        }

        return view;
    }
}
