package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import defpackage.lu2;
import defpackage.u63;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn {
    public static final zzgn zza = new zzgn();
    private static zzgu zzb;

    private zzgn() {
    }

    public static final Task zzd(Application application, String str) {
        zzfu zzfuVar = zzfu.zza;
        return zzfi.zza(u63.l(zzfu.zzb(application, zzft.zza, null).zzd().zza(), null, new zzgl(application, str, null), 3));
    }

    public static final Task zze(Application application, String str, long j) {
        zzfu zzfuVar = zzfu.zza;
        return zzfi.zza(u63.l(zzfu.zzb(application, zzft.zza, null).zzd().zza(), null, new zzgm(application, str, j, null), 3));
    }

    public final zzgu zza(Application application, zzhy zzhyVar) {
        zzgu zzguVar;
        synchronized (this) {
            try {
                zzguVar = zzb;
                if (zzguVar == null) {
                    zzguVar = new zzgu(application, zzhyVar);
                }
                if (zzb == null) {
                    zzb = zzguVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzguVar;
    }

    public final Object zzb(Application application, String str, lu2 lu2Var) {
        zzfu zzfuVar = zzfu.zza;
        return zzgu.zzd(zza(application, zzfu.zzb(application, zzft.zza, null)), str, 0L, zzfv.zzb, lu2Var, 2, null);
    }

    public final Object zzc(Application application, String str, long j, lu2 lu2Var) {
        zzfu zzfuVar = zzfu.zza;
        return zzgu.zzd(zza(application, zzfu.zzb(application, zzft.zza, null)), str, j, null, lu2Var, 4, null);
    }
}
