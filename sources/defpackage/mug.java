package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class mug<T> extends WeakReference<qpg> {
    public final aoa<T> a;
    public final int b;
    public T c;

    public mug(qpg qpgVar, int i, aoa<T> aoaVar, ReferenceQueue<qpg> referenceQueue) {
        super(qpgVar, referenceQueue);
        this.b = i;
        this.a = aoaVar;
    }

    public final boolean a() {
        boolean z;
        T t = this.c;
        if (t != null) {
            this.a.b(t);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
