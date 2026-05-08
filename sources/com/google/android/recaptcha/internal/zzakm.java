package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakm extends zzagg implements zzahm {
    private static final zzakm zza;
    private static volatile zzaht zzd;
    private int zze;
    private zzagn zzf = zzagg.zzP();
    private zzagn zzg = zzagg.zzP();
    private zzajt zzh;

    static {
        zzakm zzakmVar = new zzakm();
        zza = zzakmVar;
        zzagg.zzY(zzakm.class, zzakmVar);
    }

    private zzakm() {
    }

    public static zzakk zzc() {
        return (zzakk) zza.zzB();
    }

    public static /* synthetic */ void zzg(zzakm zzakmVar, zzakj zzakjVar) {
        zzakjVar.getClass();
        zzagn zzagnVar = zzakmVar.zzf;
        if (!zzagnVar.zzc()) {
            zzakmVar.zzf = zzagg.zzQ(zzagnVar);
        }
        zzakmVar.zzf.add(zzakjVar);
    }

    public static /* synthetic */ void zzh(zzakm zzakmVar, zzaky zzakyVar) {
        zzakyVar.getClass();
        zzagn zzagnVar = zzakmVar.zzg;
        if (!zzagnVar.zzc()) {
            zzakmVar.zzg = zzagg.zzQ(zzagnVar);
        }
        zzakmVar.zzg.add(zzakyVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final List zze() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzagg
    public final Object zzf(int i, Object obj, Object obj2) {
        zzaht zzagbVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzagg.zzV(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzakj.class, "zzg", zzaky.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzakm();
        }
        zzakl zzaklVar = null;
        if (i2 == 4) {
            return new zzakk(zzaklVar);
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
        synchronized (zzakm.class) {
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
