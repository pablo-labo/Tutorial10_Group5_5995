package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class e6e extends myd<e6e> {
    public final /* synthetic */ AtomicReferenceArray e;

    public e6e(long j, e6e e6eVar, int i) {
        super(j, e6eVar, i);
        this.e = new AtomicReferenceArray(d6e.f);
    }

    @Override // defpackage.myd
    public final int g() {
        return d6e.f;
    }

    @Override // defpackage.myd
    public final void h(int i, v03 v03Var) {
        this.e.set(i, d6e.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
