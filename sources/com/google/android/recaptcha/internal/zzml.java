package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.c1f;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzml extends c1f implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzmu zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzml(zzmu zzmuVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzc = zzmuVar;
        this.zzd = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzml(this.zzc, this.zzd, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzml) create((zzif) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws zzeg {
        String strZza;
        try {
            if (this.zzb != 0) {
                strZza = (String) this.zza;
                r7d.b(obj);
            } else {
                r7d.b(obj);
                zzmu zzmuVar = this.zzc;
                strZza = zzmuVar.zzf.zza();
                this.zza = strZza;
                this.zzb = 1;
                obj = zzmuVar.zzu(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            }
            ((WebView) obj).loadDataWithBaseURL(strZza, this.zzd, "text/html", "utf-8", null);
            return j6g.a;
        } catch (Exception e) {
            zzeg zzegVar = new zzeg(zzee.zzb, zzed.zzU, e.getMessage(), null, 8, null);
            this.zzc.zzy().h0(zzegVar);
            throw zzegVar;
        }
    }
}
