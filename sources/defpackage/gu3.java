package defpackage;

import defpackage.ha;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gu3 implements ga {
    public static final gu3 b = new gu3(0);
    public static final gu3 c = new gu3(1);
    public static final gu3 d = new gu3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ gu3(int i) {
        this.a = i;
    }

    @Override // defpackage.ga
    public final Object a(mb8 mb8Var, lb3 lb3Var) {
        switch (this.a) {
            case 0:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            case 1:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
            default:
                throw ja.e(mb8Var, lb3Var, "Input type used in output position");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, Object obj) {
        switch (this.a) {
            case 0:
                fu3 fu3Var = (fu3) obj;
                hc8Var.getClass();
                lb3Var.getClass();
                fu3Var.getClass();
                hc8Var.u0("resumeId");
                ha.g gVar = ha.a;
                gVar.b(hc8Var, lb3Var, fu3Var.a);
                hc8Var.u0("associationIds");
                List<String> list = fu3Var.b;
                list.getClass();
                hc8Var.m();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    gVar.b(hc8Var, lb3Var, it.next());
                }
                hc8Var.l();
                break;
            case 1:
                hc8Var.getClass();
                lb3Var.getClass();
                ((s85) obj).getClass();
                hc8Var.u0("contextKey");
                ha.g gVar2 = ha.a;
                gVar2.b(hc8Var, lb3Var, null);
                hc8Var.u0("contextValue");
                gVar2.b(hc8Var, lb3Var, null);
                break;
            default:
                hc8Var.getClass();
                lb3Var.getClass();
                ((yyd) obj).getClass();
                hc8Var.u0("countryCode");
                ha.g gVar3 = ha.a;
                f.a(hc8Var, "US");
                hc8Var.u0("languageCode");
                f.a(hc8Var, "en");
                break;
        }
    }
}
