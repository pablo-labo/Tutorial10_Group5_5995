package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwi extends zzagg implements zzahm {
    private static final zzwi zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzagn zzf = zzagg.zzP();

    static {
        zzwi zzwiVar = new zzwi();
        zza = zzwiVar;
        zzagg.zzY(zzwi.class, zzwiVar);
    }

    private zzwi() {
    }

    public static zzwe zza() {
        return (zzwe) zza.zzB();
    }

    public static /* synthetic */ void zzc(zzwi zzwiVar, zzwg zzwgVar) {
        zzwgVar.getClass();
        zzagn zzagnVar = zzwiVar.zzf;
        if (!zzagnVar.zzc()) {
            zzwiVar.zzf = zzagg.zzQ(zzagnVar);
        }
        zzwiVar.zzf.add(zzwgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwg.class});
        }
        if (i2 == 3) {
            return new zzwi();
        }
        zzwh zzwhVar = null;
        if (i2 == 4) {
            return new zzwe(zzwhVar);
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
        synchronized (zzwi.class) {
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
