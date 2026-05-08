package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzagq extends IOException {
    private boolean zza;

    public zzagq(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzagq(String str) {
        super(str);
    }
}
