package br.com.livroandroid.cap38.carrosgradle.fragments;

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
