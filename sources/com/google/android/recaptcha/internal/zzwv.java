package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwv extends zzagg implements zzahm {
    private static final zzwv zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private zzwp zzg;
    private zzaef zzh;
    private zzaef zzi;

    static {
        zzwv zzwvVar = new zzwv();
        zza = zzwvVar;
        zzagg.zzY(zzwv.class, zzwvVar);
    }

    private zzwv() {
        zzaef zzaefVar = zzaef.zzb;
        this.zzh = zzaefVar;
        this.zzi = zzaefVar;
    }

    public static zzwt zzc() {
        return (zzwt) zza.zzB();
    }

    public static zzwv zze() {
        return zza;
    }

    public static zzwv zzg(zzaef zzaefVar, zzafr zzafrVar) {
        return (zzwv) zzagg.zzK(zza, zzaefVar, zzafrVar);
    }

    public static zzaht zzj() {
        return (zzaht) zza.zzf(7, null, null);
    }

    public static /* synthetic */ void zzm(zzwv zzwvVar, zzwp zzwpVar) {
        zzwpVar.getClass();
        zzwvVar.zzg = zzwpVar;
        zzwvVar.zze |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwp zzb() {
        zzwp zzwpVar = this.zzg;
        return zzwpVar == null ? zzwp.zzd() : zzwpVar;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzwv();
        }
        zzwu zzwuVar = null;
        if (i2 == 4) {
            return new zzwt(zzwuVar);
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
        synchronized (zzwv.class) {
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

    public final zzaef zzh() {
        return this.zzi;
    }

    public final zzaef zzi() {
        return this.zzh;
    }
}
