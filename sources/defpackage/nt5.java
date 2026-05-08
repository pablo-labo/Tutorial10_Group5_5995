package defpackage;

import com.indeed.android.jobsearch.webview.IndeedWebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nt5 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ut5 b;

    public /* synthetic */ nt5(ut5 ut5Var, int i) {
        this.a = i;
        this.b = ut5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ut5 ut5Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ut5Var.a0 != null);
            default:
                String strB = ut5Var.G().b();
                if (strB == null) {
                    strB = "";
                }
                IndeedWebView indeedWebView = ut5Var.G().V;
                if (!(indeedWebView == null ? false : indeedWebView.canGoBack())) {
                    r97.a.getClass();
                    if (!r97.h(strB) && !r97.f(strB)) {
                        lr5 lr5VarU = ut5Var.requireActivity().u();
                        lr5VarU.getClass();
                        web.D(lr5VarU, "FsdvFragment");
                        ArrayList arrayList = lz2.a;
                        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
                    }
                }
                return j6g.a;
        }
    }
}
