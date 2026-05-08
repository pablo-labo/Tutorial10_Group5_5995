package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzc {
    private static final BigInteger zza;
    private static final BigInteger zzb;
    private Integer zzc = null;
    private BigInteger zzd = zzzg.zza;
    private zzzd zze = null;
    private zzze zzf = zzze.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zza = bigIntegerValueOf;
        zzb = bigIntegerValueOf.pow(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    private zzzc() {
    }

    public final zzzc zza(zzzd zzzdVar) {
        this.zze = zzzdVar;
        return this;
    }

    public final zzzc zzb(int i) {
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzzc zzc(BigInteger bigInteger) {
        this.zzd = bigInteger;
        return this;
    }

    public final zzzc zzd(zzze zzzeVar) {
        this.zzf = zzzeVar;
        return this;
    }

    public final zzzg zze() throws GeneralSecurityException {
        Integer num = this.zzc;
        if (num == null) {
            l6.m("key size is not set");
            return null;
        }
        if (this.zzd == null) {
            l6.m("publicExponent is not set");
            return null;
        }
        if (this.zze == null) {
            l6.m("hash type is not set");
            return null;
        }
        if (this.zzf == null) {
            l6.m("variant is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zzc));
        }
        BigInteger bigInteger = this.zzd;
        int iCompareTo = bigInteger.compareTo(zzzg.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zza).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzb) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzzg(this.zzc.intValue(), this.zzd, this.zzf, this.zze, null);
    }

    public /* synthetic */ zzzc(zzzf zzzfVar) {
    }
}
