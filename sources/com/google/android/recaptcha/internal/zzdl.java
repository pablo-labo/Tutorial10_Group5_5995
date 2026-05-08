package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl extends c1f implements Function2 {
    final /* synthetic */ zzalo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzdl(this.zza, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        r7d.b(obj);
        zzeg zzegVar = new zzeg(zzee.zzb, zzed.zzaV, null, null, 12, null);
        zzalo zzaloVar = this.zza;
        if (!zzaloVar.zzr() || zzaloVar.zzg().zza().zzo()) {
            throw zzegVar;
        }
        return j6g.a;
    }
}
