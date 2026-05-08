package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ zzax zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaz(zzif zzifVar, zzax zzaxVar, String str, long j, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzifVar;
        this.zzd = zzaxVar;
        this.zze = str;
        this.zzf = j;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzaz(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaz) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        zzif zzifVar;
        int i = this.zzb;
        g13 g13Var = g13.a;
        if (i == 0) {
            r7d.b(obj);
            zzifVar = this.zzc;
            zzax zzaxVar = this.zzd;
            String str = this.zze;
            long j = this.zzf;
            this.zza = zzifVar;
            this.zzb = 1;
            obj = new zziq(new zzas(zzaxVar, str, j, null));
            if (obj != g13Var) {
            }
        }
        if (i != 1) {
            r7d.b(obj);
            return obj;
        }
        zzifVar = (zzif) this.zza;
        r7d.b(obj);
        this.zza = null;
        this.zzb = 2;
        Object objZza = ((zziq) obj).zza(zzifVar.zza(), this);
        return objZza == g13Var ? g13Var : objZza;
    }
}
