package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamx extends zzagg implements zzahm {
    private static final zzamx zza;
    private static volatile zzaht zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzamx zzamxVar = new zzamx();
        zza = zzamxVar;
        zzagg.zzY(zzamx.class, zzamxVar);
    }

    private zzamx() {
    }

    public static zzamw zza() {
        return (zzamw) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzamx zzamxVar, boolean z) {
        zzamxVar.zze = 1;
        zzamxVar.zzf = Boolean.valueOf(z);
    }

    public static /* synthetic */ void zzd(zzamx zzamxVar, zzaef zzaefVar) {
        zzamxVar.zze = 2;
        zzamxVar.zzf = zzaefVar;
    }

    public static /* synthetic */ void zze(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze = 3;
        zzamxVar.zzf = str;
    }

    public static /* synthetic */ void zzg(zzamx zzamxVar, double d) {
        zzamxVar.zze = 10;
        zzamxVar.zzf = Double.valueOf(d);
    }

    public static /* synthetic */ void zzh(zzamx zzamxVar, float f) {
        zzamxVar.zze = 9;
        zzamxVar.zzf = Float.valueOf(f);
    }

    public static /* synthetic */ void zzi(zzamx zzamxVar, int i) {
        zzamxVar.zze = 4;
        zzamxVar.zzf = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzj(zzamx zzamxVar, int i) {
        zzamxVar.zze = 5;
        zzamxVar.zzf = Integer.valueOf(i);
    }

    public static /* synthetic */ void zzk(zzamx zzamxVar, long j) {
        zzamxVar.zze = 7;
        zzamxVar.zzf = Long.valueOf(j);
    }

    public static /* synthetic */ void zzl(zzamx zzamxVar, String str) {
        str.getClass();
        zzamxVar.zze = 11;
        zzamxVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new zzamx();
        }
        zzamz zzamzVar = null;
        if (i2 == 4) {
            return new zzamw(zzamzVar);
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
        synchronized (zzamx.class) {
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
