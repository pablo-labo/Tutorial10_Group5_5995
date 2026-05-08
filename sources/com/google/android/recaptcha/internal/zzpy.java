package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzpy extends zzpp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzpy(MessageDigest messageDigest, int i, zzpz zzpzVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzc() {
        zzmz.zzg(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzpp
    public final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    public final zzpt zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        MessageDigest messageDigest = this.zza;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = zzpt.zzb;
            return new zzps(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = zzpt.zzb;
        return new zzps(bArrCopyOf);
    }
}
