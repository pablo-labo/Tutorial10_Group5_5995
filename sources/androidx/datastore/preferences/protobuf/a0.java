package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.n;
import defpackage.sp9;
import defpackage.tr1;
import defpackage.uod;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0<T> implements uod<T> {
    public final sp9 a;
    public final h0<?, ?> b;
    public final boolean c;
    public final j<?> d;

    public a0(h0<?, ?> h0Var, j<?> jVar, sp9 sp9Var) {
        this.b = h0Var;
        this.c = jVar.e(sp9Var);
        this.d = jVar;
        this.a = sp9Var;
    }

    @Override // defpackage.uod
    public final T a() {
        return (T) this.a.f().i();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.uod
    public final void b(T t, d0 d0Var, i iVar) {
        h0<?, ?> h0Var = this.b;
        i0 i0VarF = h0Var.f(t);
        j<?> jVar = this.d;
        l lVarD = jVar.d(t);
        while (d0Var.E() != Integer.MAX_VALUE) {
            try {
                a0<T> a0Var = this;
                d0 d0Var2 = d0Var;
                i iVar2 = iVar;
                if (!a0Var.j(d0Var2, iVar2, jVar, lVarD, h0Var, i0VarF)) {
                    return;
                }
                this = a0Var;
                d0Var = d0Var2;
                iVar = iVar2;
            } finally {
                h0Var.n(t, i0VarF);
            }
        }
    }

    @Override // defpackage.uod
    public final void c(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // defpackage.uod
    public final int d(a aVar) {
        h0<?, ?> h0Var = this.b;
        int i = h0Var.i(h0Var.g(aVar));
        if (this.c) {
            f0 f0Var = this.d.c(aVar).a;
            if (f0Var.b.size() > 0) {
                l.d(f0Var.d(0));
                throw null;
            }
            Iterator<Map.Entry<Object, Object>> it = f0Var.f().iterator();
            if (it.hasNext()) {
                l.d(it.next());
                throw null;
            }
        }
        return i;
    }

    @Override // defpackage.uod
    public final boolean e(T t) {
        this.d.c(t).e();
        return true;
    }

    @Override // defpackage.uod
    public final void f(n nVar, n nVar2) {
        Class<?> cls = e0.a;
        h0<?, ?> h0Var = this.b;
        h0Var.o(nVar, h0Var.k(h0Var.g(nVar), h0Var.g(nVar2)));
        if (this.c) {
            e0.y(this.d, nVar, nVar2);
        }
    }

    @Override // defpackage.uod
    public final int g(n nVar) {
        int iHashCode = this.b.g(nVar).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(nVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.uod
    public final void h(T t, k0 k0Var) {
        Iterator itG = this.d.c(t).g();
        if (itG.hasNext()) {
            ((l.a) ((Map.Entry) itG.next()).getKey()).b();
            throw null;
        }
        h0<?, ?> h0Var = this.b;
        h0Var.q(h0Var.g(t), k0Var);
    }

    @Override // defpackage.uod
    public final boolean i(n nVar, n nVar2) {
        h0<?, ?> h0Var = this.b;
        if (!h0Var.g(nVar).equals(h0Var.g(nVar2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        j<?> jVar = this.d;
        return jVar.c(nVar).equals(jVar.c(nVar2));
    }

    public final <UT, UB, ET extends l.a<ET>> boolean j(d0 d0Var, i iVar, j<ET> jVar, l<ET> lVar, h0<UT, UB> h0Var, UB ub) throws InvalidProtocolBufferException {
        int iA = d0Var.a();
        sp9 sp9Var = this.a;
        if (iA != 11) {
            if ((iA & 7) != 2) {
                return d0Var.I();
            }
            n.e eVarB = jVar.b(iVar, sp9Var, iA >>> 3);
            if (eVarB == null) {
                return h0Var.l(ub, d0Var);
            }
            jVar.h(eVarB);
            throw null;
        }
        int iJ = 0;
        n.e eVarB2 = null;
        tr1 tr1VarQ = null;
        while (d0Var.E() != Integer.MAX_VALUE) {
            int iA2 = d0Var.a();
            if (iA2 == 16) {
                iJ = d0Var.j();
                eVarB2 = jVar.b(iVar, sp9Var, iJ);
            } else if (iA2 == 26) {
                if (eVarB2 != null) {
                    jVar.h(eVarB2);
                    throw null;
                }
                tr1VarQ = d0Var.q();
            } else if (!d0Var.I()) {
                break;
            }
        }
        if (d0Var.a() != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (tr1VarQ == null) {
            return true;
        }
        if (eVarB2 == null) {
            h0Var.d(ub, iJ, tr1VarQ);
            return true;
        }
        jVar.i(eVarB2);
        throw null;
    }
}
