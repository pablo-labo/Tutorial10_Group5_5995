package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkt implements zzkw {
    public static final zzkt zza = new zzkt();

    private zzkt() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 2) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            b0.n(4, 5, null);
            return;
        }
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            b0.n(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzkbVar.zzj().zza((String) objZza);
            }
            zzkbVar.zzc().zze(i, Array.newInstance((Class<?>) zzkbVar.zzd(objZza), iIntValue));
        } catch (Exception e) {
            b0.n(6, 21, e);
        }
    }
}
