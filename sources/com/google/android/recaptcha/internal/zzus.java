package com.google.android.recaptcha.internal;

import defpackage.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzus {
    private final Class zza;
    private final zzadm zzb;

    public /* synthetic */ zzus(Class cls, zzadm zzadmVar, zzuu zzuuVar) {
        this.zza = cls;
        this.zzb = zzadmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzus)) {
            return false;
        }
        zzus zzusVar = (zzus) obj;
        return zzusVar.zza.equals(this.zza) && zzusVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return z3.m(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
