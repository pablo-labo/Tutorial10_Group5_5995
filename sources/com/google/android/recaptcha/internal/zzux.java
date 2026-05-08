package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzux extends RuntimeException {
    public zzux(String str) {
        super(str);
    }

    public static Object zza(zzuw zzuwVar) {
        try {
            return zzuwVar.zza();
        } catch (Exception e) {
            throw new zzux(e);
        }
    }

    public zzux(Throwable th) {
        super(th);
    }
}
