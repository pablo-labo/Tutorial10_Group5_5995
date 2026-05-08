package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlk implements zzkw {
    public static final zzlk zza = new zzlk();

    private zzlk() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 1) {
            b0.n(4, 3, null);
        } else {
            zzkbVar.zzc().zze(i, zzkbVar.zzc().zza(zzanuVarArr[0]));
        }
    }
}
