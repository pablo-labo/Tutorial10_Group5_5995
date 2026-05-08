package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.l6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabi {
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

    static {
        zzadm zzadmVarZza = zzuy.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zzadmVarZza;
        zzadm zzadmVarZza2 = zzuy.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zzadmVarZza2;
        zzd = zztw.zza(new zztu() { // from class: com.google.android.recaptcha.internal.zzabc
        }, zzxx.class, zzun.class);
        zze = zzts.zza(new zztq() { // from class: com.google.android.recaptcha.internal.zzabd
        }, zzadmVarZza, zzun.class);
        zzf = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzabe
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                zzye zzyeVar = (zzye) zzqpVar;
                return zzum.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzabi.zzf(zzyeVar).zzw(), zzvs.ASYMMETRIC_PUBLIC, (zzwj) zzabi.zzj.zzb(zzyeVar.zzc().zza()), zzyeVar.zzb());
            }
        }, zzye.class, zzum.class);
        zzg = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzabf
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzabi.zzd((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza2, zzum.class);
        zzh = zzsm.zzb(new zzsk() { // from class: com.google.android.recaptcha.internal.zzabg
            @Override // com.google.android.recaptcha.internal.zzsk
            public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                return zzabi.zzb((zzxy) zzqpVar, zzraVar);
            }
        }, zzxy.class, zzum.class);
        zzi = zzsi.zzb(new zzsg() { // from class: com.google.android.recaptcha.internal.zzabh
            @Override // com.google.android.recaptcha.internal.zzsg
            public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
                return zzabi.zzc((zzum) zzuqVar, zzraVar);
            }
        }, zzadmVarZza, zzum.class);
        zzrx zzrxVarZza = zzrz.zza();
        zzrxVarZza.zza(zzwj.RAW, zzxw.zzd);
        zzrxVarZza.zza(zzwj.TINK, zzxw.zza);
        zzrxVarZza.zza(zzwj.CRUNCHY, zzxw.zzb);
        zzrxVarZza.zza(zzwj.LEGACY, zzxw.zzc);
        zzj = zzrxVarZza.zzb();
    }

    public static /* synthetic */ zzum zzb(zzxy zzxyVar, zzra zzraVar) {
        zzvj zzvjVarZzb = zzvl.zzb();
        zzvjVarZzb.zzb(zzf(zzxyVar.zze()));
        byte[] bArrZzc = zzxyVar.zzf().zzc(zzraVar);
        zzvjVarZzb.zza(zzaef.zzm(bArrZzc, 0, bArrZzc.length));
        return zzum.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzvl) zzvjVarZzb.zzq()).zzw(), zzvs.ASYMMETRIC_PRIVATE, (zzwj) zzj.zzb(zzxyVar.zzc().zza()), zzxyVar.zze().zzb());
    }

    public static /* synthetic */ zzxy zzc(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            l5.q("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzvl zzvlVarZzd = zzvl.zzd(zzumVar.zze(), zzafr.zza());
            if (zzvlVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvo zzvoVarZze = zzvlVarZzd.zze();
            if (zzvoVarZze.zza() == 0) {
                return zzxy.zzd(zzye.zzd((zzxw) zzj.zzc(zzumVar.zzc()), zzadm.zzb(zzvoVarZze.zzg().zzp()), zzumVar.zzf()), zzado.zzb(zzvlVarZzd.zzg().zzp(), zzraVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzagq unused) {
            l6.m("Parsing Ed25519PrivateKey failed");
            return null;
        }
    }

    public static /* synthetic */ zzye zzd(zzum zzumVar, zzra zzraVar) throws GeneralSecurityException {
        if (!zzumVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            l5.q("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzumVar.zzg())));
            return null;
        }
        try {
            zzvo zzvoVarZze = zzvo.zze(zzumVar.zze(), zzafr.zza());
            if (zzvoVarZze.zza() == 0) {
                return zzye.zzd((zzxw) zzj.zzc(zzumVar.zzc()), zzadm.zzb(zzvoVarZze.zzg().zzp()), zzumVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzagq unused) {
            l6.m("Parsing Ed25519PublicKey failed");
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

    private static zzvo zzf(zzye zzyeVar) {
        zzvm zzvmVarZzb = zzvo.zzb();
        byte[] bArrZzd = zzyeVar.zzf().zzd();
        zzvmVarZzb.zza(zzaef.zzm(bArrZzd, 0, bArrZzd.length));
        return (zzvo) zzvmVarZzb.zzq();
    }
}
