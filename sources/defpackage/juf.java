package defpackage;

import defpackage.ade;
import defpackage.z91;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class juf implements ks2, z91.a {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final ade.a c;
    public final di5 d;
    public final di5 e;
    public final di5 f;

    public juf(ba1 ba1Var, ade adeVar) {
        this.a = adeVar.e;
        this.c = adeVar.a;
        di5 di5VarT = adeVar.b.t();
        this.d = di5VarT;
        di5 di5VarT2 = adeVar.c.t();
        this.e = di5VarT2;
        di5 di5VarT3 = adeVar.d.t();
        this.f = di5VarT3;
        ba1Var.f(di5VarT);
        ba1Var.f(di5VarT2);
        ba1Var.f(di5VarT3);
        di5VarT.a(this);
        di5VarT2.a(this);
        di5VarT3.a(this);
    }

    @Override // z91.a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((z91.a) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // defpackage.ks2
    public final void b(List<ks2> list, List<ks2> list2) {
    }

    public final void f(z91.a aVar) {
        this.b.add(aVar);
    }
}
