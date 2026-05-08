package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmm extends c1f implements Function2 {
    int zza;
    final /* synthetic */ zzmu zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zzmu zzmuVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zzb = zzmuVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzmm(this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmm) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        r7d.b(obj);
        if (i == 0) {
            zzmu zzmuVar = this.zzb;
            this.zza = 1;
            obj = zzmuVar.zzu(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return j6g.a;
    }
}
