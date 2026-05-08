package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjd extends c1f implements Function2 {
    final /* synthetic */ zzje zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjd(zzje zzjeVar, String str, String str2, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzjeVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzjd(this.zza, this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjd) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        r7d.b(obj);
        try {
            this.zza.zza.zzc("js_".concat(String.valueOf(this.zzb)), this.zzc);
            return j6g.a;
        } catch (Exception e) {
            throw new zzeg(zzee.zzk, zzed.zzT, e.getMessage(), null, 8, null);
        }
    }
}
