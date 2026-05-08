package com.google.android.recaptcha.internal;

import defpackage.l6;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabb implements zzqz {
    static final zzrz zza;
    static final zzrz zzb;
    static final zzrz zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzacj zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzacz.SHA256, zzxh.zza);
        zzrxVarZza.zza(zzacz.SHA384, zzxh.zzb);
        zzrxVarZza.zza(zzacz.SHA512, zzxh.zzc);
        zza = zzrxVarZza.zzb();
        zzrx zzrxVarZza2 = zzrz.zza();
        zzrxVarZza2.zza(zzacj.IEEE_P1363, zzxi.zza);
        zzrxVarZza2.zza(zzacj.DER, zzxi.zzb);
        zzb = zzrxVarZza2.zzb();
        zzrx zzrxVarZza3 = zzrz.zza();
        zzrxVarZza3.zza(zzaci.NIST_P256, zzxg.zza);
        zzrxVarZza3.zza(zzaci.NIST_P384, zzxg.zzb);
        zzrxVarZza3.zza(zzaci.NIST_P521, zzxg.zzc);
        zzc = zzrxVarZza3.zzb();
    }

    private zzabb(ECPublicKey eCPublicKey, zzacz zzaczVar, zzacj zzacjVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzrg.zza(2)) {
            l6.m("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            throw null;
        }
        this.zzh = zzadk.zzb(zzaczVar);
        this.zzg = eCPublicKey;
        this.zzi = zzacjVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzqz zzb(zzxr zzxrVar, Provider provider) {
        return new zzabb((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzacq.zzc.zza("EC")).generatePublic(new ECPublicKeySpec(zzxrVar.zzf(), zzack.zza((zzaci) zzc.zzb(zzxrVar.zzc().zzb())))), (zzacz) zza.zzb(zzxrVar.zzc().zzc()), (zzacj) zzb.zzb(zzxrVar.zzc().zzd()), zzxrVar.zze().zzd(), zzxrVar.zzc().zze().equals(zzxj.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzabb.zzc(byte[], byte[]):void");
    }

    @Override // com.google.android.recaptcha.internal.zzqz
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else if (zzuy.zzd(bArr3, bArr)) {
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            l6.m("Invalid signature (output prefix mismatch)");
        }
    }
}
