package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class c64 extends pa1 {
    public final /* synthetic */ AtomicBoolean a;

    public c64(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // defpackage.qpb
    public final void b() {
        this.a.set(true);
    }
}
