package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class cth<T> implements vsh<T>, Serializable {

    @NullableDecl
    private final T zza;

    public cth(@NullableDecl T t) {
        this.zza = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof cth)) {
            return false;
        }
        T t = this.zza;
        T t2 = ((cth) obj).zza;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        return ja.g(strValueOf.length() + 22, "Suppliers.ofInstance(", strValueOf, ")");
    }

    @Override // defpackage.vsh
    public final T zza() {
        return this.zza;
    }
}
