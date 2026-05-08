package defpackage;

import defpackage.ikd;

/* JADX INFO: loaded from: classes.dex */
public final class dkd<T> implements vld, k0d {
    public final nv V = new nv(this, 19);
    public uld<T, Object> a;
    public ikd b;
    public String c;
    public T d;
    public Object[] e;
    public ikd.a f;

    public dkd(uld<T, Object> uldVar, ikd ikdVar, String str, T t, Object[] objArr) {
        this.a = uldVar;
        this.b = ikdVar;
        this.c = str;
        this.d = t;
        this.e = objArr;
    }

    @Override // defpackage.vld
    public final boolean a(Object obj) {
        ikd ikdVar = this.b;
        return ikdVar == null || ikdVar.a(obj);
    }

    @Override // defpackage.k0d
    public final void b() {
        c();
    }

    public final void c() {
        String strV;
        ikd ikdVar = this.b;
        if (this.f != null) {
            o6.m("entry(", this.f, ") is not null");
            return;
        }
        if (ikdVar != null) {
            nv nvVar = this.V;
            Object objInvoke = nvVar.invoke();
            if (objInvoke == null || ikdVar.a(objInvoke)) {
                this.f = ikdVar.b(this.c, nvVar);
                return;
            }
            if (objInvoke instanceof fme) {
                fme fmeVar = (fme) objInvoke;
                if (fmeVar.d() == zkd.f || fmeVar.d() == wab.a0 || fmeVar.d() == wg2.Z) {
                    strV = "MutableState containing " + fmeVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strV = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strV = ypd.v(objInvoke);
            }
            throw new IllegalArgumentException(strV);
        }
    }

    @Override // defpackage.k0d
    public final void d() {
        ikd.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.k0d
    public final void e() {
        ikd.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }
}
