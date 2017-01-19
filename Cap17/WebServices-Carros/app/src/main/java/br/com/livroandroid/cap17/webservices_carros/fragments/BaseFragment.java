package br.com.livroandroid.cap17.webservices_carros.fragments;

import android.support.v4.app.Fragment;

public class BaseFragment extends livroandroid.lib.fragment.BaseFragment {

    @Override
    protected boolean isLogLifecycle() {
        return false;
    }

    @Override
    protected boolean isLogOn() {
        return false;
    }
}
