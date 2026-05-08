package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajw extends zzagg implements zzahm {
    private static final zzajw zza;
    private static volatile zzaht zzd;
    private int zzg;
    private int zzj;
    private int zzk;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzajw zzajwVar = new zzajw();
        zza = zzajwVar;
        zzagg.zzY(zzajw.class, zzajwVar);
    }

    private zzajw() {
    }

    public static zzaju zzb() {
        return (zzaju) zza.zzB();
    }

    public static zzajw zzd() {
        return zza;
    }

    public static /* synthetic */ void zzj(zzajw zzajwVar, String str) {
        str.getClass();
        zzajwVar.zze = str;
    }

    public final int zza() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        }
        if (i2 == 3) {
            return new zzajw();
        }
        zzajv zzajvVar = null;
        if (i2 == 4) {
            return new zzaju(zzajvVar);
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
        synchronized (zzajw.class) {
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
}
