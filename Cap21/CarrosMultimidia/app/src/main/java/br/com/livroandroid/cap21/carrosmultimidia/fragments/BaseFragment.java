package br.com.livroandroid.cap21.carrosmultimidia.fragments;

public class BaseFragment extends livroandroid.lib.fragment.BaseFragment {

    @Override
    protected boolean isLogLifecycle() {
        return true;
    }

    @Override
    protected boolean isLogOn() {
        return false;
    }
}
