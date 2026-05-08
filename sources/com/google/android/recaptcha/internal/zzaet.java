package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaet extends zzagd implements zzahm {
    private static final zzaet zzd;
    private static volatile zzaht zze;
    private int zzf;
    private boolean zzg;
    private zzafd zzh;
    private boolean zzi;
    private zzaff zzj;
    private byte zzl = 2;
    private zzagn zzk = zzahw.zze();

    static {
        zzaet zzaetVar = new zzaet();
        zzd = zzaetVar;
        zzagg.zzY(zzaet.class, zzaetVar);
    }

    private zzaet() {
    }

    public static zzaet zzb() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new zzahx(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzafj.class});
        }
        if (i2 == 3) {
            return new zzaet();
        }
        zzafk zzafkVar = null;
        if (i2 == 4) {
            return new zzaes(zzafkVar);
        }
        if (i2 == 5) {
            return zzd;
        }
        if (i2 != 6) {
            this.zzl = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzaht zzahtVar = zze;
        if (zzahtVar != null) {
            return zzahtVar;
        }
        synchronized (zzaet.class) {
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
