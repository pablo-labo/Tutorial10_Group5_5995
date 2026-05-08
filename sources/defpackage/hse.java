package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hse extends i4<gse<?>> {
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // defpackage.i4
    public final boolean a(g4 g4Var) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(hh2.Y);
        return true;
    }

    @Override // defpackage.i4
    public final lu2[] b(g4 g4Var) {
        this.a.set(null);
        return h4.b;
    }
}
