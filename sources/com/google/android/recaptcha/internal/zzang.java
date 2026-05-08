package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzang extends zzagg implements zzahm {
    private static final zzang zza;
    private static volatile zzaht zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzang zzangVar = new zzang();
        zza = zzangVar;
        zzagg.zzY(zzang.class, zzangVar);
    }

    private zzang() {
    }

    public static zzanf zza() {
        return (zzanf) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzang zzangVar, String str) {
        str.getClass();
        zzangVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzang();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzanf(zzanwVar);
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
        synchronized (zzang.class) {
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
