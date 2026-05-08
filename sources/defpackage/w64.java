package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class w64<T> extends vpd<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(w64.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public w64() {
        throw null;
    }

    @Override // defpackage.vpd, defpackage.d78
    public final void m(Object obj) {
        n(obj);
    }

    @Override // defpackage.vpd, defpackage.d78
    public final void n(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    mh2.w(ewa.v(this.d), u63.g0(obj));
                    return;
                } else {
                    r6.g("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
