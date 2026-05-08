package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import java.util.Timer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzii extends c1f implements Function2 {
    final /* synthetic */ zzik zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzii(zzik zzikVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzikVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzii(this.zza, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzii) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzik zzikVar = this.zza;
        synchronized (zzig.class) {
            try {
                zzid zzidVar = zzikVar.zzc;
                if (zzidVar != null && zzidVar.zzb() == 0) {
                    Timer timer = zzik.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzik.zza = null;
                }
                zzikVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6g.a;
    }
}
