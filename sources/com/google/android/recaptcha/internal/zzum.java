package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzum implements zzuq {
    private final String zza;
    private final zzadm zzb;
    private final zzaef zzc;
    private final zzvs zzd;
    private final zzwj zze;
    private final Integer zzf;

    private zzum(String str, zzadm zzadmVar, zzaef zzaefVar, zzvs zzvsVar, zzwj zzwjVar, Integer num) {
        this.zza = str;
        this.zzb = zzadmVar;
        this.zzc = zzaefVar;
        this.zzd = zzvsVar;
        this.zze = zzwjVar;
        this.zzf = num;
    }

    public static zzum zza(String str, zzaef zzaefVar, zzvs zzvsVar, zzwj zzwjVar, Integer num) {
        if (zzwjVar == zzwj.RAW) {
            if (num != null) {
                l6.m("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            l6.m("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        int i = zzuy.zza;
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i2] = (byte) cCharAt;
        }
        return new zzum(str, zzadm.zzb(bArr), zzaefVar, zzvsVar, zzwjVar, num);
    }

    public final zzvs zzb() {
        return this.zzd;
    }

    public final zzwj zzc() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzuq
    public final zzadm zzd() {
        return this.zzb;
    }

    public final zzaef zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
