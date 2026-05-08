package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jna {
    public final gu5<Map<String, Object>> a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final r d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public jna(gu5 gu5Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, r rVar, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4) {
        gu5Var.getClass();
        this.a = gu5Var;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = rVar;
        this.e = linkedHashMap3;
        this.f = linkedHashMap4;
    }

    public final fn2<qf0> a() {
        return new fn2<>(this.b.values().iterator(), this.c.values().iterator());
    }

    public final jna b(jna jnaVar) {
        if (jnaVar == null) {
            return this;
        }
        x9 x9Var = new x9(13, this, jnaVar);
        LinkedHashMap linkedHashMapC0 = lc9.c0(this.b, jnaVar.b);
        LinkedHashMap linkedHashMapC02 = lc9.c0(this.c, jnaVar.c);
        r rVar = this.d;
        if (rVar != null) {
            r rVar2 = jnaVar.d;
            if (rVar2 != null) {
                rVar = new r((String[]) pyd.K((String[]) rVar.a, (String[]) rVar2.a));
            }
        } else {
            rVar = null;
        }
        return new jna(x9Var, linkedHashMapC0, linkedHashMapC02, rVar, lc9.c0(this.e, jnaVar.e), lc9.c0(this.f, jnaVar.f));
    }
}
