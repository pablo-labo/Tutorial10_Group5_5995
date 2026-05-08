package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlm implements zzkw {
    public static final zzlm zza = new zzlm();

    private zzlm() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 3) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            b0.n(4, 5, null);
            return;
        }
        try {
            field.set(zzkbVar.zzc().zza(zzanuVarArr[1]), zzkbVar.zzc().zza(zzanuVarArr[2]));
        } catch (Exception e) {
            b0.n(6, 11, e);
        }
    }
}
