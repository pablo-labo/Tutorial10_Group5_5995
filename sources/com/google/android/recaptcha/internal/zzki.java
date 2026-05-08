package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzki implements zzkw {
    public static final zzki zza = new zzki();

    private zzki() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        if (zzanuVarArr.length != 3) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            b0.n(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            b0.n(4, 6, null);
            return;
        }
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            b0.n(4, 5, null);
            return;
        }
        Object objZza3 = zzkbVar.zzc().zza(zzanuVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            b0.n(4, 5, null);
        } else if (objZza2.equals(objZza3)) {
            zzkbVar.zzh(zzkbVar.zza() + iIntValue);
        }
    }
}
