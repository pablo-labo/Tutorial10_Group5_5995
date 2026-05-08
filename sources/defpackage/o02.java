package defpackage;

import com.indeed.android.jobsearch.webview.IndeedWebView;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o02 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ o02(Object obj, boolean z, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Serializable serializable = this.d;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = (String) serializable;
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, ((n97) obj2).b + (!z ? l5.l(". ", str) : ""));
                p5e.a(s5eVar);
                break;
            default:
                ut5 ut5Var = (ut5) obj2;
                huc hucVar = (huc) serializable;
                String str2 = (String) obj;
                if (str2 != null) {
                    if (ut5.R()) {
                        kt5 kt5Var = (kt5) ut5Var.h0.getValue();
                        r97.a.getClass();
                        ((gme) kt5Var.d).setValue(Boolean.valueOf(r97.x(str2)));
                        kt5Var.l();
                    } else {
                        lt5 lt5Var = (lt5) ut5Var.g0.getValue();
                        r97.a.getClass();
                        ((gme) lt5Var.b).setValue(Boolean.valueOf(r97.x(str2)));
                    }
                    if (z && !hucVar.element) {
                        hucVar.element = true;
                        vq5 vq5Var = ut5Var.a0;
                        vq5Var.getClass();
                        IndeedWebView indeedWebView = vq5Var.l;
                        indeedWebView.postDelayed(new p9(1, new nt5(ut5Var, 0), indeedWebView), 1000L);
                    }
                }
                break;
        }
        return j6g.a;
    }
}
