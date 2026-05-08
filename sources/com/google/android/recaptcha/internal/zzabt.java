package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabt {
    public static final /* synthetic */ int zza = 0;
    private static final zzadm zzb;
    private static final zzadm zzc;
    private static final zztw zzd;
    private static final zzts zze;
    private static final zzsm zzf;
    private static final zzsi zzg;
    private static final zzsm zzh;
    private static final zzsi zzi;
    private static final zzrz zzj;
    private static final zzrz zzk;

    static {
        zzadm zzadmVarZza = zzuy.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzadmVarZza;
        zzadm zzadmVarZza2 = zzuy.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzadmVarZza2;
        zzd = zztw.zza(new zztu() { // from class: com.google.android.recaptcha.internal.zzabn
        }, zzzg.class, zzun.class);
        zze = zzts.zza(new zztq() { // from class: com.google.android.recaptcha.internal.zzabo
        }, zzadmVarZza, zzun.class);
        zzf = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzabp
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                zzzm zzzmVar = (zzzm) zzqpVar;
                return zzum.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzabt.zzf(zzzmVar).zzw(), zzvs.ASYMMETRIC_PUBLIC, (zzwj) zzabt.zzj.zzb(zzzmVar.zzc().zzd()), zzzmVar.zzb());
            }
        }, zzzm.class, zzum.class);
        zzg = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzabq
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzabt.zzd((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza2, zzum.class);
        zzh = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzabr
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                return zzabt.zzb((zzzj) zzqpVar, zzraVar);
            }
        }, zzzj.class, zzum.class);
        zzi = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzabs
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzabt.zzc((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza, zzum.class);
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzwj.RAW, zzze.zzd);
        zzrxVarZza.zza(zzwj.TINK, zzze.zza);
        zzrxVarZza.zza(zzwj.CRUNCHY, zzze.zzb);
        zzrxVarZza.zza(zzwj.LEGACY, zzze.zzc);
        zzj = zzrxVarZza.zzb();
        zzrx zzrxVarZza2 = zzrz.zza();
        zzrxVarZza2.zza(zzvq.SHA256, zzzd.zza);
        zzrxVarZza2.zza(zzvq.SHA384, zzzd.zzb);
        zzrxVarZza2.zza(zzvq.SHA512, zzzd.zzc);
        zzk = zzrxVarZza2.zzb();
    }

    public static /* synthetic */ zzum zzb(zzzj zzzjVar, zzra zzraVar) {
        zzwq zzwqVarZzb = zzws.zzb();
        zzwqVarZzb.zzh(0);
        zzwqVarZzb.zzf(zzf(zzzjVar.zze()));
        byte[] bArrZza = zzrj.zza(zzzjVar.zzk().zzb(zzraVar));
        zzaef zzaefVar = zzaef.zzb;
        zzwqVarZzb.zzb(zzaef.zzm(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzrj.zza(zzzjVar.zzi().zzb(zzraVar));
        zzwqVarZzb.zze(zzaef.zzm(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzrj.zza(zzzjVar.zzj().zzb(zzraVar));
        zzwqVarZzb.zzg(zzaef.zzm(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzrj.zza(zzzjVar.zzg().zzb(zzraVar));
        zzwqVarZzb.zzc(zzaef.zzm(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzrj.zza(zzzjVar.zzh().zzb(zzraVar));
        zzwqVarZzb.zzd(zzaef.zzm(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzrj.zza(zzzjVar.zzf().zzb(zzraVar));
        zzwqVarZzb.zza(zzaef.zzm(bArrZza6, 0, bArrZza6.length));
        return zzum.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzws) zzwqVarZzb.zzq()).zzw(), zzvs.ASYMMETRIC_PRIVATE, (zzwj) zzj.zzb(zzzjVar.zzc().zzd()), zzzjVar.zze().zzb());
    }

    public static /* synthetic */ zzzj zzc(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            l5.q("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzws zzwsVarZzd = zzws.zzd(zzumVar.zze(), zzafr.zza());
            if (zzwsVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzwv zzwvVarZze = zzwsVarZzd.zze();
            if (zzwvVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzwvVarZze.zzi().zzp());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzwvVarZze.zzh().zzp());
            zzzc zzzcVarZzb = zzzg.zzb();
            zzzcVarZzb.zza((zzzd) zzk.zzc(zzwvVarZze.zzb().zza()));
            zzzcVarZzb.zzc(bigInteger2);
            zzzcVarZzb.zzb(iBitLength);
            zzzcVarZzb.zzd((zzze) zzj.zzc(zzumVar.zzc()));
            zzzg zzzgVarZze = zzzcVarZzb.zze();
            zzzk zzzkVarZzd = zzzm.zzd();
            zzzkVarZzd.zzc(zzzgVarZze);
            zzzkVarZzd.zzb(bigInteger);
            zzzkVarZzd.zza(zzumVar.zzf());
            zzzm zzzmVarZzd = zzzkVarZzd.zzd();
            zzzh zzzhVarZzd = zzzj.zzd();
            zzzhVarZzd.zze(zzzmVarZzd);
            zzzhVarZzd.zzc(zzg(zzwsVarZzd.zzk(), zzraVar), zzg(zzwsVarZzd.zzl(), zzraVar));
            zzzhVarZzd.zzd(zzg(zzwsVarZzd.zzh(), zzraVar));
            zzzhVarZzd.zzb(zzg(zzwsVarZzd.zzi(), zzraVar), zzg(zzwsVarZzd.zzj(), zzraVar));
            zzzhVarZzd.zza(zzg(zzwsVarZzd.zzg(), zzraVar));
            return zzzhVarZzd.zzf();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing RsaSsaPkcs1PrivateKey failed");
            return null;
        }
    }

    public static /* synthetic */ zzzm zzd(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            l5.q("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzwv zzwvVarZzg = zzwv.zzg(zzumVar.zze(), zzafr.zza());
            if (zzwvVarZzg.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzwvVarZzg.zzi().zzp());
            int iBitLength = bigInteger.bitLength();
            zzzc zzzcVarZzb = zzzg.zzb();
            zzzcVarZzb.zza((zzzd) zzk.zzc(zzwvVarZzg.zzb().zza()));
            zzzcVarZzb.zzc(new BigInteger(1, zzwvVarZzg.zzh().zzp()));
            zzzcVarZzb.zzb(iBitLength);
            zzzcVarZzb.zzd((zzze) zzj.zzc(zzumVar.zzc()));
            zzzg zzzgVarZze = zzzcVarZzb.zze();
            zzzk zzzkVarZzd = zzzm.zzd();
            zzzkVarZzd.zzc(zzzgVarZze);
            zzzkVarZzd.zzb(bigInteger);
            zzzkVarZzd.zza(zzumVar.zzf());
            return zzzkVarZzd.zzd();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing RsaSsaPkcs1PublicKey failed");
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

    private static zzwv zzf(zzzm zzzmVar) {
        zzwt zzwtVarZzc = zzwv.zzc();
        zzzg zzzgVarZzc = zzzmVar.zzc();
        zzwn zzwnVarZzb = zzwp.zzb();
        zzwnVarZzb.zza((zzvq) zzk.zzb(zzzgVarZzc.zzc()));
        zzwtVarZzc.zzc((zzwp) zzwnVarZzb.zzq());
        byte[] bArrZza = zzrj.zza(zzzmVar.zzf());
        zzaef zzaefVar = zzaef.zzb;
        zzwtVarZzc.zzb(zzaef.zzm(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzrj.zza(zzzmVar.zzc().zze());
        zzwtVarZzc.zza(zzaef.zzm(bArrZza2, 0, bArrZza2.length));
        return (zzwv) zzwtVarZzc.zzq();
    }

    private static zzadn zzg(zzaef zzaefVar, zzra zzraVar) {
        return zzadn.zza(new BigInteger(1, zzaefVar.zzp()), zzraVar);
    }
}
