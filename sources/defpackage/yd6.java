package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class yd6 extends pvf<AtomicLong> {
    public final /* synthetic */ pvf a;

    public yd6(pvf pvfVar) {
        this.a = pvfVar;
    }

    @Override // defpackage.pvf
    public final AtomicLong a(nb8 nb8Var) {
        return new AtomicLong(((Number) this.a.a(nb8Var)).longValue());
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, AtomicLong atomicLong) {
        this.a.b(gc8Var, Long.valueOf(atomicLong.get()));
    }
}
