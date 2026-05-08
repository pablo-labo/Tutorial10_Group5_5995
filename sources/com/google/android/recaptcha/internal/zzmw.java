package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r7d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzmw extends c1f implements Function2 {
    final /* synthetic */ zzmx zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmw(zzmx zzmxVar, Context context, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = zzmxVar;
        this.zzb = context;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzmw(this.zza, this.zzb, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzmw) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        zzmx zzmxVar = this.zza;
        WebView webView = zzmxVar.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        zzmxVar.zza = webView;
        return webView;
    }
}
