package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalf extends zzagg implements zzahm {
    private static final zzalf zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzi;
    private boolean zzl;
    private boolean zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzn = "";
    private String zzo = "";

    static {
        zzalf zzalfVar = new zzalf();
        zza = zzalfVar;
        zzagg.zzY(zzalf.class, zzalfVar);
    }

    private zzalf() {
    }

    public static zzale zza() {
        return (zzale) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzalf zzalfVar, String str) {
        str.getClass();
        zzalfVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzalf zzalfVar, String str) {
        zzalfVar.zze |= 2;
        zzalfVar.zzo = str;
    }

    public static /* synthetic */ void zzh(zzalf zzalfVar, String str) {
        str.getClass();
        zzalfVar.zze |= 1;
        zzalfVar.zzj = str;
    }

    public static /* synthetic */ void zzi(zzalf zzalfVar, String str) {
        str.getClass();
        zzalfVar.zzg = str;
    }

    public static /* synthetic */ void zzk(zzalf zzalfVar, String str) {
        str.getClass();
        zzalfVar.zzk = str;
    }

    public static /* synthetic */ void zzl(zzalf zzalfVar, String str) {
        str.getClass();
        zzalfVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ለ\u0000\u0006Ȉ\u0007\u0007\b\u0007\tȈ\nለ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new zzalf();
        }
        zzalg zzalgVar = null;
        if (i2 == 4) {
            return new zzale(zzalgVar);
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
        synchronized (zzalf.class) {
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
