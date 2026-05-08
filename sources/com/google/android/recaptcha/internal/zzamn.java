package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamn extends zzagg implements zzahm {
    private static final zzamn zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzagl zzk;
    private int zzl;
    private int zzm;

    static {
        zzamn zzamnVar = new zzamn();
        zza = zzamnVar;
        zzagg.zzY(zzamn.class, zzamnVar);
    }

    private zzamn() {
        zzaef zzaefVar = zzaef.zzb;
        this.zzh = zzaefVar;
        this.zzi = zzaefVar;
        this.zzj = zzaefVar;
        this.zzk = zzagg.zzM();
    }

    public static zzaml zzb() {
        return (zzaml) zza.zzB();
    }

    public static /* synthetic */ void zzg(zzamn zzamnVar) {
        zzamnVar.zze &= -3;
        zzamnVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void zzh(zzamn zzamnVar) {
        zzamnVar.zze &= -2;
        zzamnVar.zzf = zza.zzf;
    }

    public static /* synthetic */ void zzi(zzamn zzamnVar, zzaef zzaefVar) {
        zzamnVar.zze |= 8;
        zzamnVar.zzi = zzaefVar;
    }

    public static /* synthetic */ void zzj(zzamn zzamnVar, zzaef zzaefVar) {
        zzamnVar.zze |= 4;
        zzamnVar.zzh = zzaefVar;
    }

    public static /* synthetic */ void zzk(zzamn zzamnVar, zzaef zzaefVar) {
        zzamnVar.zze |= 16;
        zzamnVar.zzj = zzaefVar;
    }

    public static /* synthetic */ void zzn(zzamn zzamnVar, int i) {
        zzamnVar.zzl = 2;
        zzamnVar.zze |= 32;
    }

    public final zzaef zza() {
        return this.zzj;
    }

    @Deprecated
    public final String zzd() {
        return this.zzg;
    }

    @Deprecated
    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0005\u0005င\u0006\u0006ည\u0002\u0007ည\u0003\bည\u0004", new Object[]{"zze", "zzf", "zzg", "zzk", "zzl", zzamm.zza, "zzm", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzamn();
        }
        zzamq zzamqVar = null;
        if (i2 == 4) {
            return new zzaml(zzamqVar);
        }
        if (i2 == 5) {
            return zza;
        }
        if (i2 != 6) {
            throw null;
        }
        zzaht zzahtVar = zzd;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzamn.class) {
            try {
                zzagbVar = zzd;
                if (zzagbVar == null) {
                    zzagbVar = new zzagb(zza);
                    zzd = zzagbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzagbVar;
    }

    @Deprecated
    public final boolean zzl() {
        return (this.zze & 2) != 0;
    }

    @Deprecated
    public final boolean zzm() {
        return (this.zze & 1) != 0;
    }
}
