package defpackage;

import android.os.Bundle;
import defpackage.ikd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lkd implements ikd, dld {
    public final /* synthetic */ jkd a;
    public final bld b;
    public final aw8 c;
    public final ald d;

    public lkd(jkd jkdVar) {
        this.a = jkdVar;
        bld bldVar = new bld(new cld(this, new hr(this, 13)));
        this.b = bldVar;
        this.c = new aw8(this, false);
        this.d = bldVar.b;
        Object objF = jkdVar.f("androidx.savedstate.SavedStateRegistry");
        bldVar.a(objF instanceof Bundle ? (Bundle) objF : null);
        jkdVar.b("androidx.savedstate.SavedStateRegistry", new ig(this, 20));
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

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        return this.c;
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        return this.d;
    }
}
