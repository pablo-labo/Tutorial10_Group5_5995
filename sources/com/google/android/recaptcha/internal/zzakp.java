package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakp extends zzagg implements zzahm {
    private static final zzakp zza;
    private static volatile zzaht zzd;
    private int zze;
    private int zzf = 0;
    private Object zzg;
    private zzaks zzh;
    private int zzi;
    private zzajw zzj;
    private zzakf zzk;

    static {
        zzakp zzakpVar = new zzakp();
        zza = zzakpVar;
        zzagg.zzY(zzakp.class, zzakpVar);
    }

    private zzakp() {
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000.\u0001\u0001\u0001..\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019ဉ\u0002\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000)?\u0000*?\u0000+?\u0000,?\u0000-?\u0000.?\u0000", new Object[]{"zzg", "zzf", "zze", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzakp();
        }
        zzako zzakoVar = null;
        if (i2 == 4) {
            return new zzakn(zzakoVar);
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
        synchronized (zzakp.class) {
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
