package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.IndeedWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class vq5 {
    public final FrameLayout a;
    public final ComposeView b;
    public final ComposeView c;
    public final ComposeView d;
    public final ComposeView e;
    public final ComposeView f;
    public final ComposeView g;
    public final ComposeView h;
    public final FrameLayout i;
    public final FrameLayout j;
    public final FrameLayout k;
    public final IndeedWebView l;
    public final ComposeView m;

    public vq5(FrameLayout frameLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, IndeedWebView indeedWebView, ComposeView composeView8) {
        this.a = frameLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = composeView3;
        this.e = composeView4;
        this.f = composeView5;
        this.g = composeView6;
        this.h = composeView7;
        this.i = frameLayout2;
        this.j = frameLayout3;
        this.k = frameLayout4;
        this.l = indeedWebView;
        this.m = composeView8;
    }

    public static vq5 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bottom_nav_tab_webview, viewGroup, false);
        int i = R.id.bridgeCommandToast;
        ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.bridgeCommandToast);
        if (composeView != null) {
            i = R.id.errorScreen;
            ComposeView composeView2 = (ComposeView) esg.a(viewInflate, R.id.errorScreen);
            if (composeView2 != null) {
                i = R.id.loadingScreen;
                ComposeView composeView3 = (ComposeView) esg.a(viewInflate, R.id.loadingScreen);
                if (composeView3 != null) {
                    i = R.id.overlayView;
                    ComposeView composeView4 = (ComposeView) esg.a(viewInflate, R.id.overlayView);
                    if (composeView4 != null) {
                        i = R.id.postApplyBannerContainer;
                        ComposeView composeView5 = (ComposeView) esg.a(viewInflate, R.id.postApplyBannerContainer);
                        if (composeView5 != null) {
                            i = R.id.progressIndicator;
                            ComposeView composeView6 = (ComposeView) esg.a(viewInflate, R.id.progressIndicator);
                            if (composeView6 != null) {
                                i = R.id.reportErrorToast;
                                ComposeView composeView7 = (ComposeView) esg.a(viewInflate, R.id.reportErrorToast);
                                if (composeView7 != null) {
                                    i = R.id.rn_homepage_fragment;
                                    FrameLayout frameLayout = (FrameLayout) esg.a(viewInflate, R.id.rn_homepage_fragment);
                                    if (frameLayout != null) {
                                        i = R.id.rn_search_fragment;
                                        FrameLayout frameLayout2 = (FrameLayout) esg.a(viewInflate, R.id.rn_search_fragment);
                                        if (frameLayout2 != null) {
                                            i = R.id.rn_serp_fragment;
                                            FrameLayout frameLayout3 = (FrameLayout) esg.a(viewInflate, R.id.rn_serp_fragment);
                                            if (frameLayout3 != null) {
                                                i = R.id.tabWebView;
                                                IndeedWebView indeedWebView = (IndeedWebView) esg.a(viewInflate, R.id.tabWebView);
                                                if (indeedWebView != null) {
                                                    i = R.id.topNav;
                                                    ComposeView composeView8 = (ComposeView) esg.a(viewInflate, R.id.topNav);
                                                    if (composeView8 != null) {
                                                        return new vq5((FrameLayout) viewInflate, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, composeView7, frameLayout, frameLayout2, frameLayout3, indeedWebView, composeView8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
