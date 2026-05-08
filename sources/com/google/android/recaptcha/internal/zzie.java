package com.google.android.recaptcha.internal;

import defpackage.wl7;

/* JADX INFO: loaded from: classes2.dex */
public final class zzie {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzie(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzie)) {
            return false;
        }
        zzie zzieVar = (zzie) obj;
        return wl7.b(zzieVar.zza, this.zza) && zzieVar.zzb == this.zzb && zzieVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
