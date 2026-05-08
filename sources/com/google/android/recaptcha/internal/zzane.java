package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzane extends zzagg implements zzahm {
    private static final zzane zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzi;
    private boolean zzm;
    private boolean zzn;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzo = "";
    private String zzp = "";

    static {
        zzane zzaneVar = new zzane();
        zza = zzaneVar;
        zzagg.zzY(zzane.class, zzaneVar);
    }

    private zzane() {
    }

    public static zzand zza() {
        return (zzand) zza.zzB();
    }

    public static zzane zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzo = str;
    }

    public static /* synthetic */ void zzh(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzl = str;
    }

    public static /* synthetic */ void zzi(zzane zzaneVar, String str) {
        zzaneVar.zze |= 1;
        zzaneVar.zzp = str;
    }

    public static /* synthetic */ void zzj(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzk = str;
    }

    public static /* synthetic */ void zzk(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzg = str;
    }

    public static /* synthetic */ void zzl(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzh = str;
    }

    public static /* synthetic */ void zzm(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzj = str;
    }

    public static /* synthetic */ void zzn(zzane zzaneVar, String str) {
        str.getClass();
        zzaneVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000bȈ\fለ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzane();
        }
        zzanw zzanwVar = null;
        if (i2 == 4) {
            return new zzand(zzanwVar);
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
        synchronized (zzane.class) {
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
