package defpackage;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class h0b implements uqa {
    public final gu5<j6g> a;

    public h0b(gu5 gu5Var) {
        this.a = gu5Var;
    }

    @Override // defpackage.uqa
    public final void f(WebView webView, String str) {
        bu8 bu8Var = bu8.a;
        boolean zI = bu8Var.i();
        boolean zA = hjg.a.a();
        if (zI || !zA) {
            return;
        }
        bu8Var.k(true);
        gu5<j6g> gu5Var = this.a;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }
}
