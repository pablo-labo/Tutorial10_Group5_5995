package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import java.util.Timer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcx extends c1f implements Function2 {
    final /* synthetic */ zzda zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzda zzdaVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzdaVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzcx zzcxVar = new zzcx(this.zza, lu2Var);
        zzcxVar.zzb = obj;
        return zzcxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcx) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zziu zziuVar = (zziu) this.zzb;
        zzda zzdaVar = this.zza;
        if (!zzdaVar.zzf) {
            new Timer().schedule(new zzcw(zzdaVar, zziuVar), 28800000L, 28800000L);
            zzdaVar.zzf = true;
        }
        return j6g.a;
    }
}
