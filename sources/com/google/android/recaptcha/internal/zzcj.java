package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.u63;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcj extends c1f implements Function2 {
    final /* synthetic */ zzck zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcj(zzck zzckVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzckVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzcj(this.zza, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzck zzckVar = this.zza;
        int i = Build.VERSION.SDK_INT;
        zzamv zzamvVarZza = zzamy.zza();
        zzamw zzamwVarZza = zzamx.zza();
        zzamwVarZza.zzw(String.valueOf(i));
        zzamvVarZza.zza(u63.Z(zzamwVarZza.zzq()));
        return zzch.zzb(zzckVar, (zzamy) zzamvVarZza.zzq());
    }
}
