package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import defpackage.p6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaz {
    public static final /* synthetic */ int zza = 0;
    private static final zzadm zzb;
    private static final zzadm zzc;
    private static final zztw zzd;
    private static final zzts zze;
    private static final zzsm zzf;
    private static final zzsi zzg;
    private static final zzsm zzh;
    private static final zzsi zzi;

    static {
        zzadm zzadmVarZza = zzuy.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zzb = zzadmVarZza;
        zzadm zzadmVarZza2 = zzuy.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        zzc = zzadmVarZza2;
        zzd = zztw.zza(new zztu() { // from class: com.google.android.recaptcha.internal.zzaat
        }, zzxl.class, zzun.class);
        zze = zzts.zza(new zztq() { // from class: com.google.android.recaptcha.internal.zzaau
        }, zzadmVarZza, zzun.class);
        zzf = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzaav
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                zzxr zzxrVar = (zzxr) zzqpVar;
                return zzum.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzaaz.zzg(zzxrVar).zzw(), zzvs.ASYMMETRIC_PUBLIC, zzaaz.zzh(zzxrVar.zzc().zze()), zzxrVar.zzb());
            }
        }, zzxr.class, zzum.class);
        zzg = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzaaw
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzaaz.zzd((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza2, zzum.class);
        zzh = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzaax
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                return zzaaz.zza((zzxo) zzqpVar, zzraVar);
            }
        }, zzxo.class, zzum.class);
        zzi = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzaay
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzaaz.zzc((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza, zzum.class);
    }

    public static /* synthetic */ zzum zza(zzxo zzxoVar, zzra zzraVar) throws GeneralSecurityException {
        int iZzf = zzf(zzxoVar.zzc().zzb());
        zzvc zzvcVarZzb = zzve.zzb();
        zzvcVarZzb.zzb(zzg(zzxoVar.zze()));
        byte[] bArrZzb = zzrj.zzb(zzxoVar.zzf().zzb(zzraVar), iZzf);
        zzaef zzaefVar = zzaef.zzb;
        zzvcVarZzb.zza(zzaef.zzm(bArrZzb, 0, bArrZzb.length));
        return zzum.zza("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((zzve) zzvcVarZzb.zzq()).zzw(), zzvs.ASYMMETRIC_PRIVATE, zzh(zzxoVar.zzc().zze()), zzxoVar.zze().zzb());
    }

    public static /* synthetic */ zzxo zzc(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            l5.q("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzve zzveVarZzd = zzve.zzd(zzumVar.zze(), zzafr.zza());
            if (zzveVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvh zzvhVarZze = zzveVarZzd.zze();
            if (zzvhVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzxf zzxfVarZza = zzxl.zza();
            zzxfVarZza.zzb(zzi(zzvhVarZze.zzb().zzd()));
            zzxfVarZza.zzc(zzl(zzvhVarZze.zzb().zzg()));
            zzxfVarZza.zza(zzk(zzvhVarZze.zzb().zzh()));
            zzxfVarZza.zzd(zzj(zzumVar.zzc()));
            zzxl zzxlVarZze = zzxfVarZza.zze();
            zzxp zzxpVarZzd = zzxr.zzd();
            zzxpVarZzd.zzb(zzxlVarZze);
            zzxpVarZzd.zzc(new ECPoint(new BigInteger(1, zzvhVarZze.zzh().zzp()), new BigInteger(1, zzvhVarZze.zzi().zzp())));
            zzxpVarZzd.zza(zzumVar.zzf());
            zzxr zzxrVarZzd = zzxpVarZzd.zzd();
            zzxm zzxmVarZzd = zzxo.zzd();
            zzxmVarZzd.zzb(zzxrVarZzd);
            zzxmVarZzd.zza(zzadn.zza(new BigInteger(1, zzveVarZzd.zzg().zzp()), zzraVar));
            return zzxmVarZzd.zzc();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing EcdsaPrivateKey failed");
            return null;
        }
    }

    public static /* synthetic */ zzxr zzd(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            l5.q("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzvh zzvhVarZzg = zzvh.zzg(zzumVar.zze(), zzafr.zza());
            if (zzvhVarZzg.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzxf zzxfVarZza = zzxl.zza();
            zzxfVarZza.zzb(zzi(zzvhVarZzg.zzb().zzd()));
            zzxfVarZza.zzc(zzl(zzvhVarZzg.zzb().zzg()));
            zzxfVarZza.zza(zzk(zzvhVarZzg.zzb().zzh()));
            zzxfVarZza.zzd(zzj(zzumVar.zzc()));
            zzxl zzxlVarZze = zzxfVarZza.zze();
            zzxp zzxpVarZzd = zzxr.zzd();
            zzxpVarZzd.zzb(zzxlVarZze);
            zzxpVarZzd.zzc(new ECPoint(new BigInteger(1, zzvhVarZzg.zzh().zzp()), new BigInteger(1, zzvhVarZzg.zzi().zzp())));
            zzxpVarZzd.zza(zzumVar.zzf());
            return zzxpVarZzd.zzd();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing EcdsaPublicKey failed");
            return null;
        }
    }

    public static void zze(zztn zztnVar) {
        zztnVar.zzg(zzd);
        zztnVar.zzf(zze);
        zztnVar.zze(zzf);
        zztnVar.zzd(zzg);
        zztnVar.zze(zzh);
        zztnVar.zzd(zzi);
    }

    private static int zzf(zzxg zzxgVar) throws GeneralSecurityException {
        if (zzxg.zza.equals(zzxgVar)) {
            return 33;
        }
        if (zzxg.zzb.equals(zzxgVar)) {
            return 49;
        }
        if (zzxg.zzc.equals(zzxgVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzxgVar.toString()));
    }

    private static zzvh zzg(zzxr zzxrVar) throws GeneralSecurityException {
        zzvq zzvqVar;
        int i;
        int iZzf = zzf(zzxrVar.zzc().zzb());
        ECPoint eCPointZzf = zzxrVar.zzf();
        zzvf zzvfVarZzc = zzvh.zzc();
        zzxl zzxlVarZzc = zzxrVar.zzc();
        zzuz zzuzVarZza = zzvb.zza();
        zzxh zzxhVarZzc = zzxlVarZzc.zzc();
        if (zzxh.zza.equals(zzxhVarZzc)) {
            zzvqVar = zzvq.SHA256;
        } else if (zzxh.zzb.equals(zzxhVarZzc)) {
            zzvqVar = zzvq.SHA384;
        } else {
            if (!zzxh.zzc.equals(zzxhVarZzc)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(zzxhVarZzc.toString()));
            }
            zzvqVar = zzvq.SHA512;
        }
        zzuzVarZza.zza(zzvqVar);
        zzxg zzxgVarZzb = zzxlVarZzc.zzb();
        int i2 = 4;
        if (zzxg.zza.equals(zzxgVarZzb)) {
            i = 4;
        } else if (zzxg.zzb.equals(zzxgVarZzb)) {
            i = 5;
        } else {
            if (!zzxg.zzc.equals(zzxgVarZzb)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(zzxgVarZzb.toString()));
            }
            i = 6;
        }
        zzuzVarZza.zzb(i);
        zzxi zzxiVarZzd = zzxlVarZzc.zzd();
        if (zzxi.zza.equals(zzxiVarZzd)) {
            i2 = 3;
        } else if (!zzxi.zzb.equals(zzxiVarZzd)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(zzxiVarZzd.toString()));
        }
        zzuzVarZza.zzc(i2);
        zzvfVarZzc.zza((zzvb) zzuzVarZza.zzq());
        byte[] bArrZzb = zzrj.zzb(eCPointZzf.getAffineX(), iZzf);
        zzaef zzaefVar = zzaef.zzb;
        zzvfVarZzc.zzb(zzaef.zzm(bArrZzb, 0, bArrZzb.length));
        byte[] bArrZzb2 = zzrj.zzb(eCPointZzf.getAffineY(), iZzf);
        zzvfVarZzc.zzc(zzaef.zzm(bArrZzb2, 0, bArrZzb2.length));
        return (zzvh) zzvfVarZzc.zzq();
    }

    private static zzwj zzh(zzxj zzxjVar) throws GeneralSecurityException {
        if (zzxj.zza.equals(zzxjVar)) {
            return zzwj.TINK;
        }
        if (zzxj.zzb.equals(zzxjVar)) {
            return zzwj.CRUNCHY;
        }
        if (zzxj.zzd.equals(zzxjVar)) {
            return zzwj.RAW;
        }
        if (zzxj.zzc.equals(zzxjVar)) {
            return zzwj.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzxjVar.toString()));
    }

    private static zzxh zzi(zzvq zzvqVar) throws GeneralSecurityException {
        int iOrdinal = zzvqVar.ordinal();
        if (iOrdinal == 2) {
            return zzxh.zzb;
        }
        if (iOrdinal == 3) {
            return zzxh.zza;
        }
        if (iOrdinal == 4) {
            return zzxh.zzc;
        }
        throw new GeneralSecurityException(p6.c(zzvqVar.zza(), "Unable to parse HashType: "));
    }

    private static zzxj zzj(zzwj zzwjVar) throws GeneralSecurityException {
        int iOrdinal = zzwjVar.ordinal();
        if (iOrdinal == 1) {
            return zzxj.zza;
        }
        if (iOrdinal == 2) {
            return zzxj.zzc;
        }
        if (iOrdinal == 3) {
            return zzxj.zzd;
        }
        if (iOrdinal == 4) {
            return zzxj.zzb;
        }
        throw new GeneralSecurityException(p6.c(zzwjVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzxg zzk(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return zzxg.zza;
        }
        if (i2 == 3) {
            return zzxg.zzb;
        }
        if (i2 == 4) {
            return zzxg.zzc;
        }
        throw new GeneralSecurityException(p6.c(zzvp.zza(i), "Unable to parse EllipticCurveType: "));
    }

    private static zzxi zzl(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return zzxi.zza;
        }
        if (i2 == 2) {
            return zzxi.zzb;
        }
        throw new GeneralSecurityException(p6.c(zzvi.zza(i), "Unable to parse EcdsaSignatureEncoding: "));
    }
}
