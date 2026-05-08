package com.google.android.recaptcha.internal;

import defpackage.wl7;
import defpackage.zr4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjz extends zzjw {
    private final zzjy zza;
    private final String zzb;

    public zzjz(zzjy zzjyVar, String str, Object obj) {
        super(obj);
        this.zza = zzjyVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listAsList;
        if (!wl7.b(method.getName(), this.zzb)) {
            return false;
        }
        zzjy zzjyVar = this.zza;
        if (objArr != null) {
            listAsList = Arrays.asList(objArr);
            listAsList.getClass();
        } else {
            listAsList = zr4.a;
        }
        zzjyVar.zzb(listAsList);
        return true;
    }
}
