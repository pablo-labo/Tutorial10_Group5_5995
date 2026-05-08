package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class f7i implements Runnable {
    public final /* synthetic */ gmi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ AppMeasurementDynamiteService e;

    public f7i(AppMeasurementDynamiteService appMeasurementDynamiteService, gmi gmiVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = gmiVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVarM = this.e.a.m();
        y8iVarM.b();
        y8iVarM.k();
        y8iVarM.p(new lbi(y8iVarM, this.b, this.c, this.d, y8iVarM.n(false), this.a));
    }
}
