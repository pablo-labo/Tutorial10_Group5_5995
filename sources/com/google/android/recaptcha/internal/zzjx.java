package com.google.android.recaptcha.internal;

import defpackage.wl7;
import defpackage.zr4;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjx extends zzjw {
    private final Function2 zza;
    private final String zzb;

    public zzjx(Function2 function2, String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List arrayList;
        if (!wl7.b(method.getName(), this.zzb)) {
            return false;
        }
        zzamv zzamvVarZza = zzamy.zza();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzamw zzamwVarZza = zzamx.zza();
                zzamwVarZza.zzw(obj2.toString());
                arrayList.add((zzamx) zzamwVarZza.zzq());
            }
        } else {
            arrayList = zr4.a;
        }
        zzamvVarZza.zza(arrayList);
        zzamy zzamyVar = (zzamy) zzamvVarZza.zzq();
        Function2 function2 = this.zza;
        byte[] bArrZzy = zzamyVar.zzy();
        function2.invoke(objArr, zzqg.zzh().zzi(bArrZzy, 0, bArrZzy.length));
        return true;
    }
}
