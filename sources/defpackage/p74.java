package defpackage;

import defpackage.ikd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p74 implements ikd {
    public final /* synthetic */ jkd a;
    public final q74 b;

    public p74(jkd jkdVar, q74 q74Var) {
        this.a = jkdVar;
        this.b = q74Var;
    }

    @Override // defpackage.ikd
    public final boolean a(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.ikd
    public final ikd.a b(String str, gu5<? extends Object> gu5Var) {
        return this.a.b(str, gu5Var);
    }

    @Override // defpackage.ikd
    public final Map<String, List<Object>> e() {
        return this.a.e();
    }

    @Override // defpackage.ikd
    public final Object f(String str) {
        return this.a.f(str);
    }
}
