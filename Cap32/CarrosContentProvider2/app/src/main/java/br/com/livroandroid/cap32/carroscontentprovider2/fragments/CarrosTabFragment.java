package br.com.livroandroid.cap32.carroscontentprovider2.fragments;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.samples.apps.iosched.ui.widget.SlidingTabLayout;
import br.com.livroandroid.cap32.carroscontentprovider2.R;
import br.com.livroandroid.cap32.carroscontentprovider2.adapter.TabsAdapter;
import livroandroid.lib.utils.Prefs;

/**
 * Fragment que controla as Tabs dos carros (classicos,esportivos,luxo)
 */
public class CarrosTabFragment extends BaseFragment {

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_carros_tab, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(new TabsAdapter(getContext(), getChildFragmentManager()));
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setCustomTabView(R.layout.tab_layout, R.id.tabText);
        // Deixa as tabs com mesmo tamanho (layout_weight=1)
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setViewPager(viewPager);
        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int i) {
                // Cor do indicador da tab
                return getResources().getColor(R.color.accent);
            }
        });
        mSlidingTabLayout.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // Salva o índice da página/tab selecionada
                Prefs.setInteger(getContext(), "tabIdx", viewPager.getCurrentItem());
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        // Inicia o aplicativo com o índice da última tab/página selecionada
        int tabIdx = Prefs.getInteger(getContext(), "tabIdx");
        viewPager.setCurrentItem(tabIdx);
        return view;
    }
}