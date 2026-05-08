package com.google.android.recaptcha.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzia {
    private static final String zza = UUID.randomUUID().toString();
    private final zzig zzb;
    private final zzhz zzc;
    private final zzec zzd;

    public zzia(zzig zzigVar, zzhz zzhzVar, zzec zzecVar) {
        this.zzb = zzigVar;
        this.zzc = zzhzVar;
        this.zzd = zzecVar;
    }

    public final void zzb(zzakg zzakgVar, String str, zzajw zzajwVar) {
        if (zzajwVar != null) {
            zzakgVar.zzf(zzajwVar);
        }
        for (zzea zzeaVar : this.zzd.zza()) {
            zzakgVar.zzc(0);
        }
        if (zzakgVar.zzz()) {
            int i = zzej.zza;
            zzej.zza(zzakgVar.zza() + 20000, zzakgVar.zzb() * 1000);
        } else {
            int i2 = zzej.zza;
            int iZzD = zzakgVar.zzD();
            zzej.zza(zzakh.zza(iZzD) + 10000, zzakgVar.zzb() * 1000);
        }
        zzakgVar.zzh(this.zzc.zza(str));
        zzanm zzanmVarZzc = zzann.zzc();
        zzanmVarZzc.zza(zzakgVar);
        this.zzb.zza((zzann) zzanmVarZzc.zzq());
    }
}
