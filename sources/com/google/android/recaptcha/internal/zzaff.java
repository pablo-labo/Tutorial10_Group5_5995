package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaff extends zzagg implements zzahm {
    private static final zzaff zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;

    static {
        zzaff zzaffVar = new zzaff();
        zza = zzaffVar;
        zzagg.zzY(zzaff.class, zzaffVar);
    }

    private zzaff() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaer zzaerVar = zzaer.EDITION_UNKNOWN;
            zzagk zzagkVar = zzaeq.zza;
            return new zzahx(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zze", "zzf", zzagkVar, "zzg", zzagkVar, "zzh", "zzi", zzagkVar});
        }
        if (i2 == 3) {
            return new zzaff();
        }
        zzafk zzafkVar = null;
        if (i2 == 4) {
            return new zzafe(zzafkVar);
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
        synchronized (zzaff.class) {
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
