package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacc {
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
        zzadm zzadmVarZza = zzuy.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzadmVarZza;
        zzadm zzadmVarZza2 = zzuy.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzadmVarZza2;
        zzd = zztw.zza(new zztu() { // from class: com.google.android.recaptcha.internal.zzabw
        }, zzzv.class, zzun.class);
        zze = zzts.zza(new zztq() { // from class: com.google.android.recaptcha.internal.zzabx
        }, zzadmVarZza, zzun.class);
        zzf = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzaby
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                zzaab zzaabVar = (zzaab) zzqpVar;
                return zzum.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzacc.zzf(zzaabVar).zzw(), zzvs.ASYMMETRIC_PUBLIC, (zzwj) zzacc.zzj.zzb(zzaabVar.zzc().zzf()), zzaabVar.zzb());
            }
        }, zzaab.class, zzum.class);
        zzg = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzabz
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzacc.zzd((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza2, zzum.class);
        zzh = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzaca
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                return zzacc.zzb((zzzy) zzqpVar, zzraVar);
            }
        }, zzzy.class, zzum.class);
        zzi = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzacb
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzacc.zzc((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza, zzum.class);
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzwj.RAW, zzzt.zzd);
        zzrxVarZza.zza(zzwj.TINK, zzzt.zza);
        zzrxVarZza.zza(zzwj.CRUNCHY, zzzt.zzb);
        zzrxVarZza.zza(zzwj.LEGACY, zzzt.zzc);
        zzj = zzrxVarZza.zzb();
        zzrx zzrxVarZza2 = zzrz.zza();
        zzrxVarZza2.zza(zzvq.SHA256, zzzs.zza);
        zzrxVarZza2.zza(zzvq.SHA384, zzzs.zzb);
        zzrxVarZza2.zza(zzvq.SHA512, zzzs.zzc);
        zzk = zzrxVarZza2.zzb();
    }

    public static /* synthetic */ zzum zzb(zzzy zzzyVar, zzra zzraVar) {
        zzwz zzwzVarZzb = zzxb.zzb();
        zzwzVarZzb.zzh(0);
        zzwzVarZzb.zzf(zzf(zzzyVar.zze()));
        byte[] bArrZza = zzrj.zza(zzzyVar.zzk().zzb(zzraVar));
        zzaef zzaefVar = zzaef.zzb;
        zzwzVarZzb.zzb(zzaef.zzm(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzrj.zza(zzzyVar.zzi().zzb(zzraVar));
        zzwzVarZzb.zze(zzaef.zzm(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzrj.zza(zzzyVar.zzj().zzb(zzraVar));
        zzwzVarZzb.zzg(zzaef.zzm(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzrj.zza(zzzyVar.zzg().zzb(zzraVar));
        zzwzVarZzb.zzc(zzaef.zzm(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzrj.zza(zzzyVar.zzh().zzb(zzraVar));
        zzwzVarZzb.zzd(zzaef.zzm(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzrj.zza(zzzyVar.zzf().zzb(zzraVar));
        zzwzVarZzb.zza(zzaef.zzm(bArrZza6, 0, bArrZza6.length));
        return zzum.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzxb) zzwzVarZzb.zzq()).zzw(), zzvs.ASYMMETRIC_PRIVATE, (zzwj) zzj.zzb(zzzyVar.zzc().zzf()), zzzyVar.zze().zzb());
    }

    public static /* synthetic */ zzzy zzc(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            l5.q("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzxb zzxbVarZzd = zzxb.zzd(zzumVar.zze(), zzafr.zza());
            if (zzxbVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzxe zzxeVarZze = zzxbVarZzd.zze();
            if (zzxeVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzxeVarZze.zzi().zzp());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, zzxeVarZze.zzh().zzp());
            zzzr zzzrVarZzc = zzzv.zzc();
            zzrz zzrzVar = zzk;
            zzzrVarZzc.zze((zzzs) zzrzVar.zzc(zzxeVarZze.zzb().zzc()));
            zzzrVarZzc.zza((zzzs) zzrzVar.zzc(zzxeVarZze.zzb().zzb()));
            zzzrVarZzc.zzc(bigInteger2);
            zzzrVarZzc.zzb(iBitLength);
            zzzrVarZzc.zzd(zzxeVarZze.zzb().zza());
            zzzrVarZzc.zzf((zzzt) zzj.zzc(zzumVar.zzc()));
            zzzv zzzvVarZzg = zzzrVarZzc.zzg();
            zzzz zzzzVarZzd = zzaab.zzd();
            zzzzVarZzd.zzc(zzzvVarZzg);
            zzzzVarZzd.zzb(bigInteger);
            zzzzVarZzd.zza(zzumVar.zzf());
            zzaab zzaabVarZzd = zzzzVarZzd.zzd();
            zzzw zzzwVarZzd = zzzy.zzd();
            zzzwVarZzd.zze(zzaabVarZzd);
            zzzwVarZzd.zzc(zzg(zzxbVarZzd.zzk(), zzraVar), zzg(zzxbVarZzd.zzl(), zzraVar));
            zzzwVarZzd.zzd(zzg(zzxbVarZzd.zzh(), zzraVar));
            zzzwVarZzd.zzb(zzg(zzxbVarZzd.zzi(), zzraVar), zzg(zzxbVarZzd.zzj(), zzraVar));
            zzzwVarZzd.zza(zzg(zzxbVarZzd.zzg(), zzraVar));
            return zzzwVarZzd.zzf();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing RsaSsaPssPrivateKey failed");
            return null;
        }
    }

    public static /* synthetic */ zzaab zzd(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            l5.q("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzxe zzxeVarZzg = zzxe.zzg(zzumVar.zze(), zzafr.zza());
            if (zzxeVarZzg.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, zzxeVarZzg.zzi().zzp());
            int iBitLength = bigInteger.bitLength();
            zzzr zzzrVarZzc = zzzv.zzc();
            zzrz zzrzVar = zzk;
            zzzrVarZzc.zze((zzzs) zzrzVar.zzc(zzxeVarZzg.zzb().zzc()));
            zzzrVarZzc.zza((zzzs) zzrzVar.zzc(zzxeVarZzg.zzb().zzb()));
            zzzrVarZzc.zzc(new BigInteger(1, zzxeVarZzg.zzh().zzp()));
            zzzrVarZzc.zzb(iBitLength);
            zzzrVarZzc.zzd(zzxeVarZzg.zzb().zza());
            zzzrVarZzc.zzf((zzzt) zzj.zzc(zzumVar.zzc()));
            zzzv zzzvVarZzg = zzzrVarZzc.zzg();
            zzzz zzzzVarZzd = zzaab.zzd();
            zzzzVarZzd.zzc(zzzvVarZzg);
            zzzzVarZzd.zzb(bigInteger);
            zzzzVarZzd.zza(zzumVar.zzf());
            return zzzzVarZzd.zzd();
        } catch (zzagq | IllegalArgumentException unused) {
            l6.m("Parsing RsaSsaPssPublicKey failed");
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

    private static zzxe zzf(zzaab zzaabVar) {
        zzxc zzxcVarZzc = zzxe.zzc();
        zzzv zzzvVarZzc = zzaabVar.zzc();
        zzww zzwwVarZzd = zzwy.zzd();
        zzrz zzrzVar = zzk;
        zzwwVarZzd.zzc((zzvq) zzrzVar.zzb(zzzvVarZzc.zze()));
        zzwwVarZzd.zza((zzvq) zzrzVar.zzb(zzzvVarZzc.zzd()));
        zzwwVarZzd.zzb(zzzvVarZzc.zzb());
        zzxcVarZzc.zzc((zzwy) zzwwVarZzd.zzq());
        byte[] bArrZza = zzrj.zza(zzaabVar.zzf());
        zzaef zzaefVar = zzaef.zzb;
        zzxcVarZzc.zzb(zzaef.zzm(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzrj.zza(zzaabVar.zzc().zzg());
        zzxcVarZzc.zza(zzaef.zzm(bArrZza2, 0, bArrZza2.length));
        zzxcVarZzc.zzd(0);
        return (zzxe) zzxcVarZzc.zzq();
    }

    private static zzadn zzg(zzaef zzaefVar, zzra zzraVar) {
        return zzadn.zza(new BigInteger(1, zzaefVar.zzp()), zzraVar);
    }
}
