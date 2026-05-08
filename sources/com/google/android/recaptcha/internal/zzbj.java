package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends c1f implements Function2 {
    final /* synthetic */ zzbk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbk zzbkVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzbkVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbj(this.zza, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        r7d.b(obj);
        zzbk zzbkVar = this.zza;
        String strZza = zzdz.zza(zzbkVar.zza);
        if (strZza.length() == 0) {
            if (Build.VERSION.SDK_INT > 34) {
                throw new zzeg(zzee.zzb, zzed.zzaD, null, null, 12, null);
            }
            throw new zzeg(zzee.zzb, zzed.zzaE, null, null, 12, null);
        }
        zzamv zzamvVarZza = zzamy.zza();
        zzamw zzamwVarZza = zzamx.zza();
        zzamwVarZza.zzw(strZza);
        zzamvVarZza.zza(u63.Z(zzamwVarZza.zzq()));
        return zzch.zzb(zzbkVar, (zzamy) zzamvVarZza.zzq());
    }
}
