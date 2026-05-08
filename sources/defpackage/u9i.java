package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzao;

/* JADX INFO: loaded from: classes2.dex */
public final class u9i implements Runnable {
    public final /* synthetic */ gmi a;
    public final /* synthetic */ zzao b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public u9i(AppMeasurementDynamiteService appMeasurementDynamiteService, gmi gmiVar, zzao zzaoVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = gmiVar;
        this.b = zzaoVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVarM = this.d.a.m();
        y8iVarM.b();
        y8iVarM.k();
        int iC = oa6.b.c(y8iVarM.e().a.a, 12451000);
        gmi gmiVar = this.a;
        if (iC == 0) {
            y8iVarM.p(new nai(y8iVarM, this.b, this.c, gmiVar));
        } else {
            y8iVarM.zzr().X.b("Not bundling data. Service unavailable or out of date");
            y8iVarM.e().H(gmiVar, new byte[0]);
        }
    }
}
