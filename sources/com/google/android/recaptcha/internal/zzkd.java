package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkd {
    private final zzka zza;
    private final zzkc zzb;
    private final HashMap zzc;
    private final zzjv zzd;
    private final zzfg zze;

    public zzkd(zzka zzkaVar, zzkc zzkcVar, zzjv zzjvVar, zzfg zzfgVar, zzem zzemVar) {
        this.zza = zzkaVar;
        this.zzb = zzkcVar;
        this.zzd = zzjvVar;
        this.zze = zzfgVar;
        HashMap map = new HashMap();
        this.zzc = map;
        zzkcVar.zzd(173, map);
    }

    public final zzka zza() {
        return this.zza;
    }

    public final zzkc zzb() {
        return this.zzb;
    }

    public final void zzc() {
        zzkc zzkcVar = this.zzb;
        zzkcVar.zzc();
        zzkcVar.zzd(173, this.zzc);
    }

    public final zzfg zzd() {
        return this.zze;
    }

    public final zzjv zze() {
        return this.zzd;
    }

    public final void zzf(int i, Object obj) {
        this.zzc.put(Integer.valueOf(i - 2), obj);
    }
}
