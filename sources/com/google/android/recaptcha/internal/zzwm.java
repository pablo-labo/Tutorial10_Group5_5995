package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzwm extends zzagg implements zzahm {
    public static final /* synthetic */ int zza = 0;
    private static final zzwm zzd;
    private static volatile zzaht zze;
    private String zzf = "";
    private zzagn zzg = zzagg.zzP();

    static {
        zzwm zzwmVar = new zzwm();
        zzd = zzwmVar;
        zzagg.zzY(zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzf", "zzg", zzvy.class});
        }
        if (i2 == 3) {
            return new zzwm();
        }
        zzwl zzwlVar = null;
        if (i2 == 4) {
            return new zzwk(zzwlVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            throw null;
        }
        zzaht zzahtVar = zze;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzwm.class) {
            try {
                zzagbVar = zze;
                if (zzagbVar == null) {
                    zzagbVar = new zzagb(zzd);
                    zze = zzagbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzagbVar;
    }
}
