package defpackage;

import androidx.compose.runtime.d;
import androidx.compose.runtime.h;

/* JADX INFO: loaded from: classes.dex */
public final class i6c<T> {
    public final h a;
    public final boolean b;
    public final hme<T> c;
    public final boolean d;
    public final T e;
    public boolean f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public i6c(h hVar, Object obj, boolean z, hme hmeVar, boolean z2) {
        this.a = hVar;
        this.b = z;
        this.c = hmeVar;
        this.d = z2;
        this.e = obj;
    }

    public final T a() {
        if (this.b) {
            return null;
        }
        T t = this.e;
        if (t != null) {
            return t;
        }
        d.d("Unexpected form of a provided value");
        r40.e();
        return null;
    }
}
