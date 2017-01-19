package br.com.livroandroid.cap19.actionbar_compartilhamento_carros.fragments;

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
