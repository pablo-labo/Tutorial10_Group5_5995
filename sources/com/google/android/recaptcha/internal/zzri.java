package com.google.android.recaptcha.internal;

import defpackage.z3;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzri {
    public static zzqn zza() {
        try {
            return zzaap.zza();
        } catch (GeneralSecurityException e) {
            z3.q(e);
            return null;
        }
    }
}
