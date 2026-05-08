package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.j6g;
import java.lang.reflect.Proxy;
import java.util.Objects;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkr implements zzkw {
    public static final zzkr zza = new zzkr();

    private zzkr() {
    }

    @Override // com.google.android.recaptcha.internal.zzkw
    public final void zza(int i, final zzkb zzkbVar, zzanu... zzanuVarArr) throws zzeu {
        final int iIntValue;
        int length = zzanuVarArr.length;
        if (length != 4 && length != 5) {
            b0.n(4, 3, null);
            return;
        }
        Object objZza = zzkbVar.zzc().zza(zzanuVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        final String str = (String) objZza;
        if (str == null) {
            b0.n(4, 5, null);
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
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            b0.n(4, 5, null);
            return;
        }
        String strZza = zzkbVar.zzj().zza(str2);
        Object objZza4 = zzkbVar.zzc().zza(zzanuVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzkbVar.zzc().zza(zzanuVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                b0.n(4, 5, null);
                return;
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        try {
            if (objZza2 instanceof String) {
                objZza2 = zzkbVar.zzj().zza((String) objZza2);
            }
            Class clsZzd = zzkbVar.zzd(objZza2);
            zzkbVar.zzc().zze(i, Proxy.newProxyInstance(clsZzd.getClassLoader(), new Class[]{clsZzd}, new zzjx(new Function2() { // from class: com.google.android.recaptcha.internal.zzkq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zzkb zzkbVar2 = zzkbVar;
                    Object[] objArr = (Object[]) obj;
                    zzkbVar2.zzk().zzb(str, (String) obj2);
                    int i2 = iIntValue;
                    if (i2 != -1) {
                        zzkbVar2.zzc().zze(i2, objArr);
                    }
                    return j6g.a;
                }
            }, strZza, objZza4)));
        } catch (Exception e) {
            b0.n(6, 20, e);
        }
    }
}
