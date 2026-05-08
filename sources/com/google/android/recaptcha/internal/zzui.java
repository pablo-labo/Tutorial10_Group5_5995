package com.google.android.recaptcha.internal;

import defpackage.z3;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzui {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzui(Class cls, Class cls2, zzuj zzujVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzui)) {
            return false;
        }
        zzui zzuiVar = (zzui) obj;
        return zzuiVar.zza.equals(this.zza) && zzuiVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return z3.m(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
