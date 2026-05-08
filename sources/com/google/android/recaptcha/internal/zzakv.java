package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakv extends zzagg implements zzahm {
    private static final zzakv zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzajz zzg;
    private zzajq zzh;
    private zzakc zzi;
    private String zzf = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzakv zzakvVar = new zzakv();
        zza = zzakvVar;
        zzagg.zzY(zzakv.class, zzakvVar);
    }

    private zzakv() {
    }

    public static zzakt zza() {
        return (zzakt) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzakv zzakvVar, zzajq zzajqVar) {
        zzajqVar.getClass();
        zzakvVar.zzh = zzajqVar;
        zzakvVar.zze |= 2;
    }

    public static /* synthetic */ void zzd(zzakv zzakvVar, String str) {
        str.getClass();
        zzakvVar.zzk = str;
    }

    public static /* synthetic */ void zze(zzakv zzakvVar, String str) {
        str.getClass();
        zzakvVar.zzj = str;
    }

    public static /* synthetic */ void zzg(zzakv zzakvVar, String str) {
        str.getClass();
        zzakvVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzakv();
        }
        zzaku zzakuVar = null;
        if (i2 == 4) {
            return new zzakt(zzakuVar);
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
        synchronized (zzakv.class) {
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
