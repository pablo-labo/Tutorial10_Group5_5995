package com.google.android.recaptcha.internal;

import defpackage.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzut {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzut(Class cls, Class cls2, zzuu zzuuVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzut)) {
            return false;
        }
        zzut zzutVar = (zzut) obj;
        return zzutVar.zza.equals(this.zza) && zzutVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return z3.m(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
