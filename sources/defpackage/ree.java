package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import defpackage.pgd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ree implements qee {
    public final k1 a;

    public ree(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // defpackage.qee
    public final void j(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        if (yhg.a.b(string, string) instanceof pgd.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("ShouldInterceptRequestComponent", "Apply success", false, null);
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            z zVar = bu8.g0;
            qf8<Object>[] qf8VarArr = bu8.b;
            int iIntValue = ((Number) zVar.d(qf8VarArr[16], bu8Var)).intValue();
            int iC = bu8Var.c();
            zVar.e(qf8VarArr[16], bu8Var, Integer.valueOf(iIntValue + 1));
            bu8Var.j(iIntValue == 0 ? iC + 20 : iC + 5);
            this.a.invoke(Boolean.TRUE);
        }
    }
}
