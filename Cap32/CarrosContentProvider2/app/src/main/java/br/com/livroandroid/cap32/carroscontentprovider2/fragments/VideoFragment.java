package br.com.livroandroid.cap32.carroscontentprovider2.fragments;


import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import br.com.livroandroid.cap32.carroscontentprovider2.R;
import br.com.livroandroid.cap32.carroscontentprovider2.domain.Carro;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class VideoFragment extends BaseFragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        VideoView videoView = (VideoView) view.findViewById(R.id.videoView);

        Carro c = (Carro) getArguments().getSerializable("carro");

        if (c != null && c.urlVideo != null) {
            videoView.setVideoURI(Uri.parse(c.urlVideo));
            videoView.setMediaController(new MediaController(getContext()));
            videoView.start();
            toast("start: " + c.urlVideo);
        }

        return view;
    }
}
