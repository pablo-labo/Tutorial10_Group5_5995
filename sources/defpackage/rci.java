package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rci<T, B> {
    public abstract void a(int i, Object obj, Object obj2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, h0i h0iVar);

    public final boolean d(B b, f4b f4bVar) throws zzhq {
        a2i a2iVar = (a2i) f4bVar.d;
        int i = f4bVar.a;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f4bVar.s(0);
            b(b, i2, a2iVar.j());
            return true;
        }
        if (i3 == 1) {
            f4bVar.s(1);
            g(b, i2, a2iVar.l());
            return true;
        }
        if (i3 == 2) {
            c(b, i2, f4bVar.D());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzhq.f();
            }
            f4bVar.s(5);
            h(b, i2, a2iVar.m());
            return true;
        }
        kdi kdiVarL = l();
        int i4 = (i2 << 3) | 4;
        while (f4bVar.E() != Integer.MAX_VALUE && d(kdiVarL, f4bVar)) {
        }
        if (i4 != f4bVar.a) {
            throw new zzhq("Protocol message end-group tag did not match expected tag.");
        }
        a(i2, b, n(kdiVarL));
        return true;
    }

    public abstract kdi e(Object obj);

    public abstract kdi f(Object obj);

    public abstract void g(B b, int i, long j);

    public abstract void h(B b, int i, int i2);

    public abstract void i(Object obj, T t);

    public abstract void j(Object obj, B b);

    public abstract kdi k(Object obj, Object obj2);

    public abstract kdi l();

    public abstract void m(Object obj);

    public abstract kdi n(Object obj);
}
