package defpackage;

import defpackage.j22;

/* JADX INFO: loaded from: classes3.dex */
public final class io2<E> extends go1<E> {
    public final eo1 Z;

    public io2(int i, eo1 eo1Var) {
        super(i);
        this.Z = eo1Var;
        if (eo1Var == eo1.a) {
            o6.m("This implementation does not support suspension for senders, use ", fwc.a.b(go1.class).r(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        h5.k(bg.d(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public final Object L(E e, boolean z) {
        k22 k22Var;
        io2<E> io2Var;
        E e2;
        if (this.Z == eo1.c) {
            Object objF = super.f(e);
            return (!(objF instanceof j22.b) || (objF instanceof j22.a)) ? objF : j6g.a;
        }
        Object obj = ko1.d;
        k22 k22Var2 = (k22) go1.f.get(this);
        while (true) {
            long andIncrement = go1.b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zX = this.x(andIncrement, false);
            int i = ko1.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (k22Var2.c != j3) {
                k22 k22VarA = go1.a(this, j3, k22Var2);
                if (k22VarA != null) {
                    k22Var = k22VarA;
                    e2 = e;
                    io2Var = this;
                } else if (zX) {
                    return new j22.a(this.u());
                }
            } else {
                k22Var = k22Var2;
                io2Var = this;
                e2 = e;
            }
            int iG = go1.g(io2Var, k22Var, i2, e2, j, obj, zX);
            k22Var2 = k22Var;
            if (iG == 0) {
                k22Var2.a();
                return j6g.a;
            }
            if (iG == 1) {
                return j6g.a;
            }
            if (iG == 2) {
                if (zX) {
                    k22Var2.i();
                    return new j22.a(io2Var.u());
                }
                ttg ttgVar = obj instanceof ttg ? (ttg) obj : null;
                if (ttgVar != null) {
                    ttgVar.a(k22Var2, i2 + i);
                }
                io2Var.p((k22Var2.c * j2) + ((long) i2));
                return j6g.a;
            }
            if (iG == 3) {
                r6.g("unexpected");
                return null;
            }
            if (iG == 4) {
                if (j < go1.c.get(io2Var)) {
                    k22Var2.a();
                }
                return new j22.a(io2Var.u());
            }
            if (iG == 5) {
                k22Var2.a();
            }
            this = io2Var;
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.go1, defpackage.g6e
    public final Object b(lu2 lu2Var, Object obj) throws Throwable {
        if (L(obj, true) instanceof j22.a) {
            throw u();
        }
        return j6g.a;
    }

    @Override // defpackage.go1, defpackage.g6e
    public final Object f(E e) {
        return L(e, false);
    }

    @Override // defpackage.go1
    public final boolean z() {
        return this.Z == eo1.b;
    }
}
