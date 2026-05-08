package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class zsh<T> implements vsh<T>, Serializable {
    public volatile transient boolean a;

    @NullableDecl
    public transient T b;
    private final vsh<T> zza;

    public zsh(vsh<T> vshVar) {
        vshVar.getClass();
        this.zza = vshVar;
    }

    public final String toString() {
        Object objG;
        if (this.a) {
            String strValueOf = String.valueOf(this.b);
            objG = ja.g(strValueOf.length() + 25, "<supplier that returned ", strValueOf, ">");
        } else {
            objG = this.zza;
        }
        String strValueOf2 = String.valueOf(objG);
        return ja.g(strValueOf2.length() + 19, "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // defpackage.vsh
    public final T zza() {
        if (!this.a) {
            synchronized (this) {
                try {
                    if (!this.a) {
                        T tZza = this.zza.zza();
                        this.b = tZza;
                        this.a = true;
                        return tZza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
