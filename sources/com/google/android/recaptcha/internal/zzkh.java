package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkh implements zzkw {
    public static final zzkh zza = new zzkh();

    private zzkh() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 3) {
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
        Object objZza3 = zzkbVar.zzc().zza(zzanuVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            b0.n(4, 5, null);
            return;
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                b0.n(4, 22, e);
            } else {
                b0.n(4, 25, e);
            }
        }
    }
}
