package androidx.datastore.preferences.protobuf;

import defpackage.tr1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(int i, Object obj, Object obj2);

    public abstract void d(B b, int i, tr1 tr1Var);

    public abstract void e(B b, int i, long j);

    public abstract i0 f(Object obj);

    public abstract i0 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract i0 k(Object obj, Object obj2);

    public final boolean l(B b, d0 d0Var) throws InvalidProtocolBufferException {
        int iA = d0Var.a();
        int i = iA >>> 3;
        int i2 = iA & 7;
        if (i2 == 0) {
            e(b, i, d0Var.M());
            return true;
        }
        if (i2 == 1) {
            b(b, i, d0Var.b());
            return true;
        }
        if (i2 == 2) {
            d(b, i, d0Var.q());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            a(b, i, d0Var.w());
            return true;
        }
        i0 i0VarM = m();
        int i3 = 4 | (i << 3);
        while (d0Var.E() != Integer.MAX_VALUE && l(i0VarM, d0Var)) {
        }
        if (i3 != d0Var.a()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c(i, b, p(i0VarM));
        return true;
    }

    public abstract i0 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract i0 p(Object obj);

    public abstract void q(T t, k0 k0Var);

    public abstract void r(T t, k0 k0Var);
}
