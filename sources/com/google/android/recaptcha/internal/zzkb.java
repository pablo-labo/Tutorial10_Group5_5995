package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkb {
    public zzel zza;
    private final zzkd zzb;
    private int zzd;
    private final zzkc zze;
    private final zzjv zzg;
    private final zzfg zzh;
    private String zzc = "recaptcha.m.Main.rge";
    private final zzel zzf = new zzel();

    public zzkb(zzkd zzkdVar) {
        this.zzb = zzkdVar;
        this.zze = zzkdVar.zzb();
        this.zzg = zzkdVar.zze();
        this.zzh = zzkdVar.zzd();
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzel zzb() {
        return this.zzf;
    }

    public final zzkc zzc() {
        return this.zze;
    }

    public final Class zzd(Object obj) {
        return this.zzb.zza().zza(obj);
    }

    public final String zze() {
        return this.zzc;
    }

    public final void zzf() {
        this.zzb.zzc();
    }

    public final void zzg(String str) {
        this.zzc = str;
    }

    public final void zzh(int i) {
        this.zzd = i;
    }

    public final boolean zzi(Object obj) throws zzeu {
        try {
            this.zzb.zza().zza(obj);
            return true;
        } catch (zzeu e) {
            if (e.zzb() == 8 || e.zzb() == 6) {
                return false;
            }
            if (e.zzb() == 47) {
                return true;
            }
            throw e;
        }
    }

    public final zzfg zzj() {
        return this.zzh;
    }

    public final zzjv zzk() {
        return this.zzg;
    }
}
