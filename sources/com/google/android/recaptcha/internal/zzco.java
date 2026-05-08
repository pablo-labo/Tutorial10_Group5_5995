package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import defpackage.lu2;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzco implements zzcg {
    private final Application zza;
    private final zzda zzb;
    private boolean zzc = true;
    private String zzd = "";
    private final zzes zze;

    public zzco(Application application, zzfa zzfaVar, StandardIntegrityManager standardIntegrityManager, zzda zzdaVar, zzes zzesVar) {
        this.zza = application;
        this.zzb = zzdaVar;
        this.zze = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzp(zzaef zzaefVar) {
        zzqg zzqgVarZzg = zzqg.zzg();
        byte[] bArrZzp = zzaefVar.zzp();
        byte[] bArrZzd = zzpx.zza().zza(zzqgVarZzg.zzi(bArrZzp, 0, bArrZzp.length), StandardCharsets.UTF_8).zzd();
        zzaef zzaefVarZzm = zzaef.zzm(bArrZzd, 0, bArrZzd.length);
        zzqg zzqgVarZzh = zzqg.zzh();
        byte[] bArrZzp2 = zzaefVarZzm.zzp();
        return zzqgVarZzh.zzi(bArrZzp2, 0, bArrZzp2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzc(String str, lu2 lu2Var) {
        return zzcb.zza(this, str, lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final /* synthetic */ Object zzd(zzalq zzalqVar, lu2 lu2Var) {
        return zzis.zzb(36, zza(), new zzce(this, zzalqVar, null), lu2Var);
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zze(String str, lu2 lu2Var) {
        return new zziq(new zzcm(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zzf(zzalq zzalqVar, lu2 lu2Var) {
        return new zziq(new zzcn(this, zzalqVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final Object zzg(Exception exc, lu2 lu2Var) {
        int i;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i = 44;
            } else if (errorCode == -12) {
                i = 39;
            } else if (errorCode == -3) {
                i = 30;
            } else if (errorCode == -2) {
                i = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i = 54;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i = 53;
                        break;
                    case -17:
                        i = 52;
                        break;
                    case -16:
                        i = 43;
                        break;
                    case -15:
                        i = 42;
                        break;
                    case -14:
                        i = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i = 36;
                                break;
                            case -8:
                                i = 35;
                                break;
                            case -7:
                                i = 34;
                                break;
                            case -6:
                                i = 33;
                                break;
                            case -5:
                                i = 32;
                                break;
                            default:
                                i = 2;
                                break;
                        }
                        break;
                }
            } else {
                i = 28;
            }
        } else {
            i = 45;
        }
        zzamt zzamtVarZza = zzamu.zza();
        zzamtVarZza.zzc(i);
        zzamtVarZza.zzd(15);
        return zzch.zza(this, (zzamu) zzamtVarZza.zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final void zzh(zzamh zzamhVar) {
        this.zzd = zzp(zzamhVar.zza());
    }

    @Override // com.google.android.recaptcha.internal.zzcg
    public final boolean zzi() {
        return this.zzc;
    }

    public final void zzn(boolean z) {
        this.zzc = false;
    }
}
