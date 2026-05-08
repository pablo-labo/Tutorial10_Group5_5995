package com.google.android.recaptcha.internal;

import defpackage.lu2;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzif {
    private final zziu zza;
    private final Integer zzb;
    private final String zzc = zzaje.zzd(zzaje.zzb(System.currentTimeMillis()));
    private final long zzd = System.currentTimeMillis();
    private final int zze;

    public zzif(zzet zzetVar, zziu zziuVar, int i, Integer num) {
        this.zza = zziuVar;
        this.zze = i;
        this.zzb = num;
    }

    private final zzakg zze(int i) {
        zzakg zzakgVarZzd = zzakj.zzd();
        zzakgVarZzd.zzA(this.zze);
        zzakgVarZzd.zzd(zzia.zza);
        zziu zziuVar = this.zza;
        zzakgVarZzd.zzy(zziuVar.zzc());
        zzakgVarZzd.zzg(zziuVar.zza().zzb());
        zzakgVarZzd.zzB(zziuVar.zza().zzd());
        zzakgVarZzd.zzC(i);
        zzakgVarZzd.zzx(this.zzc);
        zzakgVarZzd.zze(System.currentTimeMillis() - this.zzd);
        Integer num = this.zzb;
        if (num != null) {
            zzakgVarZzd.zzw(num.intValue());
        }
        return zzakgVarZzd;
    }

    public final zziu zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzd(zze(3), null);
    }

    public final void zzc(zzeg zzegVar) {
        zzaju zzajuVarZzb = zzajw.zzb();
        zzajuVarZzb.zzd(String.valueOf(zzegVar.zzb().zza()));
        zzajuVarZzb.zza(zzegVar.zza().zza());
        zzajuVarZzb.zzc(zzegVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzegVar.zzd();
        if (strZzd != null) {
            zzajuVarZzb.zzb(strZzd);
        }
        this.zza.zzd(zze(4), (zzajw) zzajuVarZzb.zzq());
    }

    public final Object zzd(int i, Integer num, Function2 function2, lu2 lu2Var) {
        return new zzip(54, function2, null).zza(this.zza, lu2Var);
    }
}
