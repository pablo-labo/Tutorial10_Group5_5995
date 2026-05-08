package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlh implements zzkw {
    public static final zzlh zza = new zzlh();

    private zzlh() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        Object array;
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
        if (objZza instanceof Integer) {
            array = Integer.valueOf(((Number) objZza).intValue() * iIntValue);
        } else {
            if (!(objZza instanceof int[])) {
                b0.n(4, 5, null);
                return;
            }
            int[] iArr = (int[]) objZza;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2 * iIntValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzkbVar.zzc().zze(i, array);
    }
}
