package com.google.android.recaptcha.internal;

import defpackage.lu2;
import defpackage.wl7;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzcb {
    public static /* synthetic */ Object zza(zzcg zzcgVar, String str, lu2 lu2Var) {
        return new zziq(new zzcd(zzcgVar, str, null));
    }

    public static /* synthetic */ Object zzc(zzcg zzcgVar, zzalq zzalqVar, lu2 lu2Var) {
        return new zziq(new zzcf(null));
    }

    public static /* synthetic */ Object zzd(zzcg zzcgVar, Exception exc, lu2 lu2Var) {
        int i = 27;
        if (!(exc instanceof TimeoutCancellationException) && (!(exc instanceof zzeg) || !wl7.b(((zzeg) exc).zza(), zzed.zzb))) {
            i = 2;
        }
        int iZza = zzcgVar.zza();
        zzamt zzamtVarZza = zzamu.zza();
        zzamtVarZza.zzb(iZza);
        zzamtVarZza.zzd(13);
        zzamtVarZza.zzc(i);
        return zzch.zza(zzcgVar, (zzamu) zzamtVarZza.zzq());
    }
}
