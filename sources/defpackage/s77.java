package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s77 extends wpa {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s77(Fragment fragment, int i) {
        super(true);
        this.d = i;
        this.e = fragment;
    }

    @Override // defpackage.wpa
    public final void b() {
        dqa dqaVarR;
        int i = this.d;
        Fragment fragment = this.e;
        switch (i) {
            case 0:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) fragment;
                if (((Boolean) ((gme) indeedApplyWebViewFragment.Q().c).getValue()).booleanValue()) {
                    indeedApplyWebViewFragment.O();
                } else if (!indeedApplyWebViewFragment.N().canGoBack()) {
                    indeedApplyWebViewFragment.Q().g(true);
                } else {
                    indeedApplyWebViewFragment.N().goBack();
                }
                break;
            default:
                ArrayList arrayList = lz2.a;
                lz2.d("ProfileFragment", "OnBackPressedCallback.handleOnBackPressed", false, null);
                if (!((j2g) cr8.p(j2g.class)).b()) {
                    f(false);
                    g activity = ((crb) fragment).getActivity();
                    if (activity != null && (dqaVarR = activity.r()) != null) {
                        dqaVarR.d();
                    }
                    f(true);
                } else {
                    ((j2g) cr8.p(j2g.class)).c();
                }
                break;
        }
    }
}
