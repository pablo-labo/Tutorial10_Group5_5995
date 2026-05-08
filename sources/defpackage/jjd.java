package defpackage;

import defpackage.o7d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class jjd<T> implements lu2<T>, h13 {
    public static final AtomicReferenceFieldUpdater<jjd<?>, Object> b = AtomicReferenceFieldUpdater.newUpdater(jjd.class, Object.class, "result");
    public final lu2<T> a;
    private volatile Object result;

    public jjd() {
        throw null;
    }

    public jjd(lu2 lu2Var, g13 g13Var) {
        this.a = lu2Var;
        this.result = g13Var;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        g13 g13Var = g13.b;
        if (obj == g13Var) {
            AtomicReferenceFieldUpdater<jjd<?>, Object> atomicReferenceFieldUpdater = b;
            g13 g13Var2 = g13.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g13Var, g13Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != g13Var) {
                    obj = this.result;
                }
            }
            return g13.a;
        }
        if (obj == g13.c) {
            return g13.a;
        }
        if (obj instanceof o7d.a) {
            throw ((o7d.a) obj).exception;
        }
        return obj;
    }

    @Override // defpackage.h13
    public final h13 getCallerFrame() {
        lu2<T> lu2Var = this.a;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            g13 g13Var = g13.b;
            if (obj2 == g13Var) {
                AtomicReferenceFieldUpdater<jjd<?>, Object> atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, g13Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != g13Var) {
                        break;
                    }
                }
                return;
            }
            g13 g13Var2 = g13.a;
            if (obj2 != g13Var2) {
                r6.g("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater<jjd<?>, Object> atomicReferenceFieldUpdater2 = b;
            g13 g13Var3 = g13.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, g13Var2, g13Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != g13Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
