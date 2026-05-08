package com.google.android.recaptcha.internal;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.o6;
import defpackage.r7d;
import defpackage.z92;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzju extends c1f implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzjv zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzju(String[] strArr, zzjv zzjvVar, String str, lu2 lu2Var) {
        super(2, lu2Var);
        this.zza = strArr;
        this.zzb = zzjvVar;
        this.zzc = str;
    }

    @Override // defpackage.x81
    public final lu2 create(Object obj, lu2 lu2Var) {
        return new zzju(this.zza, this.zzb, this.zzc, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzju) create((e13) obj, (lu2) obj2)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        r7d.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(o6.f(this.zzc, "(", z92.W0(arrayList, ",", null, null, null, 62), ")"), null);
        return j6g.a;
    }
}
