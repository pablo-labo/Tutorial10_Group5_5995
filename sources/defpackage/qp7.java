package defpackage;

import android.content.Context;
import android.os.Build;
import com.indeed.android.jobsearch.backend.util.a;
import defpackage.xh8;

/* JADX INFO: loaded from: classes2.dex */
public final class qp7 implements pp7, xh8 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pp7
    public final gr7 a() {
        int i = ((Context) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null)).getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? gr7.c : gr7.b : gr7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pp7
    public final String b() {
        return ((g87) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(g87.class), null)).b();
    }

    @Override // defpackage.pp7
    public final void c() {
        Build.MANUFACTURER.getClass();
    }

    @Override // defpackage.pp7
    public final String e() {
        return a.a();
    }

    @Override // defpackage.pp7
    public final void f() {
        Build.VERSION.RELEASE.getClass();
    }

    @Override // defpackage.pp7
    public final void getDeviceModel() {
        Build.PRODUCT.getClass();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
