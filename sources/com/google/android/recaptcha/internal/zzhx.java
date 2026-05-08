package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.lu2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhx implements zzgb {
    private final zzhj zza;
    private zzga zzb = zzga.zza;
    private zzalo zzc;

    public zzhx(zzhj zzhjVar) {
        this.zza = zzhjVar;
    }

    @Override // com.google.android.recaptcha.internal.zzgb
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, String str2, lu2 lu2Var) {
        return new zziq(new zzhv(this, j, str, recaptchaAction, null, null));
    }

    @Override // com.google.android.recaptcha.internal.zzgb
    public final Object zzb(long j, lu2 lu2Var) {
        return new zziq(new zzhw(this, j, null));
    }
}
