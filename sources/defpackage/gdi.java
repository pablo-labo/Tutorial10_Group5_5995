package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class gdi implements Runnable {
    public final /* synthetic */ gmi a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public gdi(AppMeasurementDynamiteService appMeasurementDynamiteService, gmi gmiVar) {
        this.b = appMeasurementDynamiteService;
        this.a = gmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.b;
        yei yeiVar = appMeasurementDynamiteService.a.a0;
        i0i.c(yeiVar);
        gmi gmiVar = this.a;
        i0i i0iVar = appMeasurementDynamiteService.a;
        yeiVar.G(gmiVar, i0iVar.p0 != null && i0iVar.p0.booleanValue());
    }
}
