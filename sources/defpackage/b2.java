package defpackage;

import defpackage.a2;
import defpackage.wna;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements gze<ye3<Object>> {
    public final /* synthetic */ nab a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ a2.b e;
    public final /* synthetic */ a2 f;

    public b2(a2 a2Var, nab nabVar, String str, Object obj, Object obj2, a2.b bVar) {
        this.f = a2Var;
        this.a = nabVar;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = bVar;
    }

    @Override // defpackage.gze
    public final ye3<Object> get() {
        return this.f.b(this.a, this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.b(this.c.toString(), "request");
        return aVarB.toString();
    }
}
