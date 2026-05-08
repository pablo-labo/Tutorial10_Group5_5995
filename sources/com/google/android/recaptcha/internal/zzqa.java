package com.google.android.recaptcha.internal;

import defpackage.g7;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
final class zzqa extends zzpq implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzqa(String str, String str2) {
        MessageDigest messageDigestZzc = zzc("SHA-256");
        this.zza = messageDigestZzc;
        this.zzb = messageDigestZzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(messageDigestZzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            g7.l(e);
            return null;
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzpu
    public final zzpv zzb() {
        zzpz zzpzVar = null;
        if (this.zzc) {
            try {
                return new zzpy((MessageDigest) this.zza.clone(), this.zzb, zzpzVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzpy(zzc(this.zza.getAlgorithm()), this.zzb, zzpzVar);
    }
}
