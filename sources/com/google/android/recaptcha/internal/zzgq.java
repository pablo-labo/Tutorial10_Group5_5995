package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaException;
import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgq extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzgu zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzfv zze;
    final /* synthetic */ zzir zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgq(zzgu zzguVar, String str, long j, zzfv zzfvVar, zzir zzirVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzguVar;
        this.zzc = str;
        this.zzd = j;
        this.zze = zzfvVar;
        this.zzf = zzirVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzgq zzgqVar = new zzgq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
        zzgqVar.zzg = obj;
        return zzgqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgq) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws RecaptchaException {
        try {
            if (this.zza != 0) {
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zziu zziuVar = (zziu) this.zzg;
                zzgp zzgpVar = new zzgp(this.zzb, zziuVar, this.zzc, this.zzd, this.zze, this.zzf, null);
                this.zza = 1;
                obj = zziuVar.zzf(6, null, zzgpVar, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            return (zzgk) obj;
        } catch (zzeg e) {
            throw e.zzc();
        } catch (Exception e2) {
            throw new zzeg(zzee.zzb, zzed.zza, e2.getMessage(), null, 8, null).zzc();
        }
    }
}
