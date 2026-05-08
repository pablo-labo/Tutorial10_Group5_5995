package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ybe {
    public final SparseArray<koc<?>> a = new SparseArray<>();
    public final SparseBooleanArray b = new SparseBooleanArray();
    public final a c = new a();

    public final class a {
        public Thread a;

        public final void a() {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.a == null) {
                this.a = threadCurrentThread;
            }
            hh1.l(wl7.b(this.a, threadCurrentThread));
        }
    }

    public final koc<?> a(int i) {
        this.c.a();
        return this.a.get(i);
    }
}
