package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import defpackage.wve;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjc extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzje zzb;
    final /* synthetic */ zzalo zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzje zzjeVar, zzalo zzaloVar, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzjeVar;
        this.zzc = zzaloVar;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        zzjc zzjcVar = new zzjc(this.zzb, this.zzc, lu2Var);
        zzjcVar.zzd = obj;
        return zzjcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((zziu) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Exception {
        zziu zziuVar;
        int i = this.zza;
        g13 g13Var = g13.a;
        try {
            if (i == 0) {
                r7d.b(obj);
                zziuVar = (zziu) this.zzd;
                zzje zzjeVar = this.zzb;
                zzalo zzaloVar = this.zzc;
                String strZzi = zzaloVar.zzi();
                String strZzj = zzaloVar.zzj();
                this.zzd = zziuVar;
                this.zza = 1;
                obj = new zziq(new zzja(zzjeVar, strZzj, strZzi, null));
                if (obj != g13Var) {
                }
                return g13Var;
            }
            if (i != 1) {
                r7d.b(obj);
                return wve.I(this.zzc.zzh(), "JAVASCRIPT_TAG", (String) obj);
            }
            zziuVar = (zziu) this.zzd;
            r7d.b(obj);
            this.zzd = null;
            this.zza = 2;
            obj = ((zziq) obj).zza(zziuVar, this);
            if (obj == g13Var) {
                return g13Var;
            }
            return wve.I(this.zzc.zzh(), "JAVASCRIPT_TAG", (String) obj);
        } catch (Exception e) {
            if (e instanceof zzeg) {
                throw e;
            }
            throw new zzeg(zzee.zzb, zzed.zzL, e.getMessage(), null, 8, null);
        }
    }
}
