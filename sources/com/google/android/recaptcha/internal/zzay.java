package com.google.android.recaptcha.internal;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    public static final zzeg zza(Exception exc, zzeg zzegVar) {
        return exc instanceof TimeoutCancellationException ? new zzeg(zzee.zzb, zzed.zzb, exc.getMessage(), null, 8, null) : exc instanceof zzeg ? (zzeg) exc : zzegVar;
    }
}
