package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bz7 extends o29 implements o74, b77 {
    public d78 d;

    @Override // defpackage.b77
    public final zia a() {
        return null;
    }

    @Override // defpackage.o74
    public final void dispose() {
        d78 d78VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d78.a;
            Object obj = atomicReferenceFieldUpdater.get(d78VarH);
            if (obj instanceof bz7) {
                if (obj != this) {
                    return;
                }
                qr4 qr4Var = pnb.h0;
                while (!atomicReferenceFieldUpdater.compareAndSet(d78VarH, obj, qr4Var)) {
                    if (atomicReferenceFieldUpdater.get(d78VarH) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof b77) || ((b77) obj).a() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o29.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof r1d) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                o29 o29Var = (o29) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = o29.c;
                r1d r1dVar = (r1d) atomicReferenceFieldUpdater3.get(o29Var);
                if (r1dVar == null) {
                    r1dVar = new r1d(o29Var);
                    atomicReferenceFieldUpdater3.set(o29Var, r1dVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, r1dVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                o29Var.d();
                return;
            }
        }
    }

    public ex7 getParent() {
        return h();
    }

    public final d78 h() {
        d78 d78Var = this.d;
        if (d78Var != null) {
            return d78Var;
        }
        wl7.g("job");
        throw null;
    }

    public abstract boolean i();

    @Override // defpackage.b77
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // defpackage.o29
    public final String toString() {
        return getClass().getSimpleName() + '@' + pi3.f(this) + "[job@" + pi3.f(h()) + ']';
    }
}
