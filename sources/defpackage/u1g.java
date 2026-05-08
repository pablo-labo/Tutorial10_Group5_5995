package defpackage;

import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.xh8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u1g implements t1g, xh8 {
    @Override // defpackage.t1g
    public final void a() {
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("homePageHTMLLoaded");
    }

    @Override // defpackage.t1g
    public final void b() {
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        if (AppStartupTimes.W) {
            ArrayList arrayList = lz2.a;
            lz2.f("Not sending for the second time");
        } else {
            AppStartupTimes.W = true;
            ((gz4) AppStartupTimes.b.getValue()).a("droid_app_startup_times", new tr(1));
        }
        AppStartupTimes.a("homePageReady");
        AppStartupTimes.b();
    }

    @Override // defpackage.t1g
    public final void c() {
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("homePageHTMLRequest");
    }

    @Override // defpackage.t1g
    public final void e() {
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("homePageRendered");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
