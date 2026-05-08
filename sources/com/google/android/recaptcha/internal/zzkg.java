package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkg implements zzkw {
    public static final zzkg zza = new zzkg();

    private zzkg() {
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
            zzkbVar.zzc().zze(i, objZza instanceof String ? String.valueOf(((String) objZza).charAt(iIntValue)) : objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue));
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                b0.n(4, 22, e);
            } else {
                b0.n(4, 23, e);
            }
        }
    }
}
