package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((lf3) obj).c((u1) obj2);
                break;
            default:
                m4i m4iVar = (m4i) obj2;
                AppMeasurementDynamiteService.b bVar = (AppMeasurementDynamiteService.b) obj;
                m4iVar.b();
                m4iVar.g();
                m4iVar.k();
                AppMeasurementDynamiteService.b bVar2 = m4iVar.d;
                if (bVar != bVar2) {
                    fib.k("EventInterceptor already set.", bVar2 == null);
                }
                m4iVar.d = bVar;
                break;
        }
    }
}
