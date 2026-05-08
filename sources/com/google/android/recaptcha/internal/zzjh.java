package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjh extends c1f implements Function2 {
    final /* synthetic */ zzji zza;
    final /* synthetic */ zzer zzb;
    final /* synthetic */ zzamf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjh(zzji zzjiVar, zzer zzerVar, zzamf zzamfVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzjiVar;
        this.zzb = zzerVar;
        this.zzc = zzamfVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzjh(this.zza, this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjh) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zziv zzivVarZza = null;
        try {
            try {
                zzivVarZza = this.zza.zza.zza(this.zzb.zzd());
                zzivVarZza.zzc();
                zzivVarZza.zze(this.zzc.zzy());
                zzamh zzamhVar = (zzamh) zzivVarZza.zza(zzamh.zzc());
                zzivVarZza.zzd();
                return zzamhVar;
            } catch (zzeg e) {
                throw e;
            } catch (Exception e2) {
                throw new zzeg(zzee.zzc, zzed.zzF, e2.getMessage(), null, 8, null);
            }
        } finally {
        }
    }
}
