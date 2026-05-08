package defpackage;

import android.webkit.WebView;
import defpackage.pgd;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j84 implements i84 {
    public final Function1<Boolean, j6g> a;
    public final Function1<Boolean, j6g> b;
    public final gu5<j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public j84(Function1<? super Boolean, j6g> function1, Function1<? super Boolean, j6g> function12, gu5<j6g> gu5Var) {
        this.a = function1;
        this.b = function12;
        this.c = gu5Var;
    }

    @Override // defpackage.i84
    public final void i(WebView webView, String str, boolean z) {
        if (yhg.a.b(str, str) instanceof pgd.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("DoUpdateVisitedHistoryComponent", "Apply success", false, null);
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            z zVar = bu8.g0;
            qf8<Object>[] qf8VarArr = bu8.b;
            int iIntValue = ((Number) zVar.d(qf8VarArr[16], bu8Var)).intValue();
            int iC = bu8Var.c();
            zVar.e(qf8VarArr[16], bu8Var, Integer.valueOf(iIntValue + 1));
            bu8Var.j(iIntValue == 0 ? iC + 20 : iC + 5);
            this.b.invoke(Boolean.TRUE);
        } else {
            bu8 bu8Var2 = bu8.a;
            boolean zI = bu8Var2.i();
            boolean zA = hjg.a.a();
            if (!zI && zA) {
                bu8Var2.k(true);
                this.c.invoke();
            }
        }
        this.a.invoke(Boolean.valueOf(webView.canGoBack()));
    }
}
