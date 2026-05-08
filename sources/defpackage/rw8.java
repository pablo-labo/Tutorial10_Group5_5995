package defpackage;

import android.os.SystemClock;
import defpackage.t44;

/* JADX INFO: loaded from: classes.dex */
public final class rw8 extends v1 {
    @Override // defpackage.v1
    public final boolean M(hie hieVar) {
        t44 t44Var = hieVar.a;
        if ((t44Var instanceof t44.a ? ((t44.a) t44Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        t44 t44Var2 = hieVar.b;
        return (t44Var2 instanceof t44.a ? ((t44.a) t44Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.v1
    public final boolean N() {
        boolean z;
        synchronized (l95.a) {
            try {
                int i = l95.c;
                l95.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > l95.d + 30000) {
                    l95.c = 0;
                    l95.d = SystemClock.uptimeMillis();
                    String[] list = l95.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    l95.e = list.length < 800;
                }
                z = l95.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
