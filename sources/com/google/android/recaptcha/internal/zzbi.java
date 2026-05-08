package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.lu2;
import defpackage.xr3;
import defpackage.zrc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi extends zzax {
    private final Application zza;
    private final zzes zzb;
    private String zzc;
    private xr3 zzd;

    public zzbi(Application application, zzes zzesVar, zrc zrcVar) {
        this.zza = application;
        this.zzb = zzesVar;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzb(String str, lu2 lu2Var) {
        zzalx zzalxVarZza = zzaly.zza();
        zzalxVarZza.zza(str);
        return zzalxVarZza.zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zzc(String str, lu2 lu2Var) {
        return new zziq(new zzbg(this, str, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final Object zze(zzalo zzaloVar, lu2 lu2Var) {
        return new zziq(new zzbh(this, zzaloVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzk() {
        return 40;
    }

    @Override // com.google.android.recaptcha.internal.zzax
    public final int zzl() {
        return 39;
    }
}
