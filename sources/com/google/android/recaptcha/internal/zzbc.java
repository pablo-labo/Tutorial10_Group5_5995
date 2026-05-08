package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o7d;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzbc extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzif zzc;
    final /* synthetic */ zzax zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzalo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzif zzifVar, zzax zzaxVar, long j, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzifVar;
        this.zzd = zzaxVar;
        this.zze = j;
        this.zzf = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzbc(this.zzc, this.zzd, this.zze, this.zzf, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbc) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object aVar;
        zzif zzifVar;
        int i = this.zzb;
        g13 g13Var = g13.a;
        try {
        } catch (zzeg e) {
            aVar = new o7d.a(e);
        }
        if (i == 0) {
            r7d.b(obj);
            zzifVar = this.zzc;
            zzax zzaxVar = this.zzd;
            long j = this.zze;
            zzalo zzaloVar = this.zzf;
            this.zza = zzifVar;
            this.zzb = 1;
            zzip zzipVar = new zzip(zzaxVar.zzl(), new zzau(zzaxVar, j, zzaloVar, null), null);
            if (zzipVar != g13Var) {
                obj = zzipVar;
            }
            return g13Var;
        }
        if (i != 1) {
            r7d.b(obj);
            aVar = j6g.a;
            return new o7d(aVar);
        }
        zzifVar = (zzif) this.zza;
        r7d.b(obj);
        this.zza = null;
        this.zzb = 2;
        if (((zzip) obj).zza(zzifVar.zza(), this) == g13Var) {
            return g13Var;
        }
        aVar = j6g.a;
        return new o7d(aVar);
    }
}
