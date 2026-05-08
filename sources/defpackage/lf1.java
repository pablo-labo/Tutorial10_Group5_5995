package defpackage;

import defpackage.kf1;
import defpackage.me8;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lf1 extends kf1.a {
    public final HashMap<n8a, up2<?>> b;
    public final /* synthetic */ kf1 c;
    public final /* synthetic */ t52 d;
    public final /* synthetic */ a62 e;
    public final /* synthetic */ List<af0> f;
    public final /* synthetic */ qne g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(kf1 kf1Var, t52 t52Var, a62 a62Var, List<af0> list, qne qneVar) {
        super();
        this.c = kf1Var;
        this.d = t52Var;
        this.e = a62Var;
        this.f = list;
        this.g = qneVar;
        this.b = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oi8.a
    public final void a() {
        HashMap<n8a, up2<?>> map = this.b;
        map.getClass();
        a62 a62Var = soe.b;
        a62 a62Var2 = this.e;
        boolean zEquals = a62Var2.equals(a62Var);
        kf1 kf1Var = this.c;
        boolean zO = false;
        if (zEquals) {
            up2<?> up2Var = map.get(n8a.h("value"));
            me8 me8Var = up2Var instanceof me8 ? (me8) up2Var : null;
            if (me8Var != null) {
                T t = me8Var.a;
                me8.a.b bVar = t instanceof me8.a.b ? (me8.a.b) t : null;
                if (bVar != null) {
                    zO = kf1Var.o(bVar.a.a);
                }
            }
        }
        if (zO || kf1Var.o(a62Var2)) {
            return;
        }
        this.f.add(new bf0(this.d.o(), map, this.g));
    }
}
