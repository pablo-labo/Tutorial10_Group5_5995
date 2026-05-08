package defpackage;

import android.os.Looper;
import defpackage.pz8;

/* JADX INFO: loaded from: classes.dex */
public class g3a<T> extends pz8<T> {
    public final void k(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == pz8.k;
            this.f = t;
        }
        if (z) {
            yr0 yr0VarJ1 = yr0.J1();
            pz8.a aVar = this.j;
            sq3 sq3Var = yr0VarJ1.d;
            if (sq3Var.f == null) {
                synchronized (sq3Var.d) {
                    try {
                        if (sq3Var.f == null) {
                            sq3Var.f = sq3.J1(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            sq3Var.f.post(aVar);
        }
    }
}
