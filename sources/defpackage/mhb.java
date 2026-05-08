package defpackage;

import defpackage.et7;
import defpackage.sp7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmhb;", "Lbrg;", "<init>", "()V", "push_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mhb extends brg {
    public final rqc V;
    public final p8c b = new p8c();
    public final gse c;
    public final rqc d;
    public final gse e;
    public final gse f;

    public mhb() {
        Boolean bool = Boolean.FALSE;
        gse gseVarE = hh2.e(bool);
        this.c = gseVarE;
        this.d = wg2.j(gseVarE);
        this.e = hh2.e(bool);
        gse gseVarE2 = hh2.e(null);
        this.f = gseVarE2;
        this.V = wg2.j(gseVarE2);
    }

    public static void i(et7 et7Var) {
        if (et7Var instanceof et7.b) {
            ft7 ft7Var = ((et7.b) et7Var).a;
            int iOrdinal = ft7Var.ordinal();
            String str = iOrdinal != 1 ? iOrdinal != 2 ? "cancel" : "grant" : "deny";
            if (ft7Var == ft7.c) {
                ((o2g) cr8.p(o2g.class)).b("postApplyPushPrimer", "POST_APPLY");
            } else {
                ((o2g) cr8.p(o2g.class)).c("postApplyPushPrimer", "POST_APPLY");
            }
            ((tp7) cr8.p(tp7.class)).b(new sp7.b("system-authorization-alert", str, null, null, 12));
        }
    }

    public final void g() {
        ((at7) cr8.p(at7.class)).b();
        Boolean bool = Boolean.FALSE;
        gse gseVar = this.c;
        gseVar.getClass();
        gseVar.m(null, bool);
    }

    public final void h(String str) {
        boolean zBooleanValue = ((Boolean) this.e.getValue()).booleanValue();
        this.b.getClass();
        p8c.a(str, zBooleanValue);
        g();
    }
}
