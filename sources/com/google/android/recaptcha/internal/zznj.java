package com.google.android.recaptcha.internal;

import defpackage.ja;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
final class zznj {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            ja.k("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            ja.k(l5.m("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
