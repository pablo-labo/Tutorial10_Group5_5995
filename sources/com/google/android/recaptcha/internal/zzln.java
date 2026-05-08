package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class zzln implements zzkw {
    public static final zzln zza = new zzln();

    private zzln() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 2) {
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
            field.set(null, zzkbVar.zzc().zza(zzanuVarArr[1]));
        } catch (Exception e) {
            b0.n(6, 11, e);
        }
    }
}
