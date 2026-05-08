package com.google.android.recaptcha.internal;

import defpackage.lu2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf {
    private final List zza;

    public zzbf(List list) {
        this.zza = list;
    }

    public final zzane zza() {
        List list = this.zza;
        zzand zzandVarZza = zzane.zza();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzandVarZza.zzn(((zzax) it.next()).zza());
        }
        return (zzane) zzandVarZza.zzq();
    }

    public final Object zzb(String str, long j, lu2 lu2Var) {
        return new zzip(31, new zzbb(this, str, j, null), null);
    }

    public final Object zzc(long j, zzalo zzaloVar, lu2 lu2Var) {
        return new zzip(30, new zzbe(this, j, zzaloVar, null), null);
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zze(zzamh zzamhVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzax) it.next()).zzi(zzamhVar);
        }
    }
}
