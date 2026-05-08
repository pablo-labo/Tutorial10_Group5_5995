package com.google.android.recaptcha.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmc implements zzme {
    private final Context zza;

    public zzmc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzmd.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final Object zza(Object... objArr) {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
