package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class dth<T> implements vsh<T> {
    public volatile vsh<T> a;
    public volatile boolean b;

    @NullableDecl
    public T c;

    public final String toString() {
        Object objG = this.a;
        if (objG == null) {
            String strValueOf = String.valueOf(this.c);
            objG = ja.g(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objG);
        return ja.g(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // defpackage.vsh
    public final T zza() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        T tZza = this.a.zza();
                        this.c = tZza;
                        this.b = true;
                        this.a = null;
                        return tZza;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}
