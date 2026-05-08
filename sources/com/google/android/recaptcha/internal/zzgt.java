package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.wl7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzgt extends c1f implements Function2 {
    final /* synthetic */ zzgk zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgt(zzgk zzgkVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzgkVar;
        this.zzb = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzgt(this.zza, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgt) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        r7d.b(obj);
        zzgk zzgkVar = this.zza;
        if (wl7.b(zzgkVar.zzc(), this.zzb)) {
            return zzgkVar;
        }
        throw new zzeg(zzee.zzd, zzed.zzam, null, null, 12, null);
    }
}
