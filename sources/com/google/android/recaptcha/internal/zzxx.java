package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxx extends zzaaq {
    private final zzxw zza;

    private zzxx(zzxw zzxwVar) {
        this.zza = zzxwVar;
    }

    public static zzxx zzb(zzxw zzxwVar) {
        return new zzxx(zzxwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzxx) && ((zzxx) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzxx.class, this.zza);
    }

    public final String toString() {
        return l5.m("Ed25519 Parameters (variant: ", this.zza.toString(), ")");
    }

    public final zzxw zza() {
        return this.zza;
    }
}
