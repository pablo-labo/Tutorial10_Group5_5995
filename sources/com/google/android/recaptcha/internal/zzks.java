package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class zzks implements zzkw {
    public static final zzks zza = new zzks();

    private zzks() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        int length = zzanuVarArr.length;
        if (length != 4 && length != 5) {
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
        Object objZza2 = zzkbVar.zzc().zza(zzanuVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num2 = (Integer) objZza2;
        if (num2 == null) {
            b0.n(4, 5, null);
            return;
        }
        int iIntValue2 = num2.intValue();
        Object objZza3 = zzkbVar.zzc().zza(zzanuVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str = (String) objZza3;
        if (str == null) {
            b0.n(4, 5, null);
            return;
        }
        String strZza = zzkbVar.zzj().zza(str);
        Object objZza4 = zzkbVar.zzc().zza(zzanuVarArr[3]);
        if (true != (objZza4 instanceof String)) {
            objZza4 = null;
        }
        String str2 = (String) objZza4;
        if (str2 == null) {
            b0.n(4, 5, null);
            return;
        }
        String strZza2 = zzkbVar.zzj().zza(str2);
        Object objZza5 = length == 5 ? zzkbVar.zzc().zza(zzanuVarArr[4]) : null;
        zzjy zzjyVar = new zzjy(iIntValue2);
        try {
            Class clsZzd = zzkbVar.zzd(strZza);
            zzkbVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZzd.getClassLoader(), new Class[]{clsZzd}, new zzjz(zzjyVar, strZza2, objZza5)));
            zzkbVar.zzc().zze(i, zzjyVar);
        } catch (Exception e) {
            b0.n(6, 20, e);
        }
    }
}
