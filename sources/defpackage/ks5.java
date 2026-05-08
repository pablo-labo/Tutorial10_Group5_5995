package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ks5 extends nsf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ js5 e;

    public ks5(js5 js5Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = js5Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // esf.d
    public final void d(esf esfVar) {
        esfVar.x(this);
    }

    @Override // defpackage.nsf, esf.d
    public final void e(esf esfVar) {
        js5 js5Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            js5Var.s(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            js5Var.s(obj2, this.d, null);
        }
    }
}
