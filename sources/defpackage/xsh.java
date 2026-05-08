package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public final class xsh<T> extends ssh<T> {
    private final T zza;

    public xsh(T t) {
        this.zza = t;
    }

    @Override // defpackage.ssh
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ssh
    public final T b() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof xsh) {
            return this.zza.equals(((xsh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        return ja.g(strValueOf.length() + 13, "Optional.of(", strValueOf, ")");
    }
}
