package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzama extends zzagg implements zzahm {
    private static final zzama zza;
    private static volatile zzaht zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzama zzamaVar = new zzama();
        zza = zzamaVar;
        zzagg.zzY(zzama.class, zzamaVar);
    }

    private zzama() {
    }

    public static zzalz zza() {
        return (zzalz) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzama zzamaVar, String str) {
        str.getClass();
        zzamaVar.zze |= 2;
        zzamaVar.zzg = str;
    }

    public static /* synthetic */ void zzd(zzama zzamaVar, String str) {
        str.getClass();
        zzamaVar.zze |= 1;
        zzamaVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzama();
        }
        zzamd zzamdVar = null;
        if (i2 == 4) {
            return new zzalz(zzamdVar);
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
        synchronized (zzama.class) {
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
