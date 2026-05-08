package com.google.android.recaptcha.internal;

import defpackage.m6;
import defpackage.u40;

/* JADX INFO: loaded from: classes2.dex */
final class zzoj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzoj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(m6.h(u40.f("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
