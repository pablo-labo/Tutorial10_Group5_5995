package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzr {
    private static final BigInteger zza;
    private static final BigInteger zzb;
    private Integer zzc = null;
    private BigInteger zzd = zzzv.zza;
    private zzzs zze = null;
    private zzzs zzf = null;
    private Integer zzg = null;
    private zzzt zzh = zzzt.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zza = bigIntegerValueOf;
        zzb = bigIntegerValueOf.pow(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    private zzzr() {
    }

    public final zzzr zza(zzzs zzzsVar) {
        this.zzf = zzzsVar;
        return this;
    }

    public final zzzr zzb(int i) {
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzzr zzc(BigInteger bigInteger) {
        this.zzd = bigInteger;
        return this;
    }

    public final zzzr zzd(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final zzzr zze(zzzs zzzsVar) {
        this.zze = zzzsVar;
        return this;
    }

    public final zzzr zzf(zzzt zzztVar) {
        this.zzh = zzztVar;
        return this;
    }

    public final zzzv zzg() throws GeneralSecurityException {
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
            l6.m("signature hash type is not set");
            return null;
        }
        if (this.zzf == null) {
            l6.m("mgf1 hash type is not set");
            return null;
        }
        if (this.zzh == null) {
            l6.m("variant is not set");
            return null;
        }
        if (this.zzg == null) {
            l6.m("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.zzc, 2048));
        }
        if (this.zze != this.zzf) {
            l6.m("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.zzd;
        int iCompareTo = bigInteger.compareTo(zzzv.zza);
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
        return new zzzv(this.zzc.intValue(), this.zzd, this.zzh, this.zze, this.zzf, this.zzg.intValue(), null);
    }

    public /* synthetic */ zzzr(zzzu zzzuVar) {
    }
}
