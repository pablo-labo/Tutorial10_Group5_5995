package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.cd4;
import defpackage.kbc;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f24 implements Activity.ScreenCaptureCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f24(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        jde jdeVar;
        int i = this.a;
        String string = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    ((gu5) obj).invoke();
                } catch (Exception unused) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("MyJobs_ScreenCapture", "Error in screenshot callback", false, null, 12);
                    return;
                }
                break;
            case 1:
                kbc.a aVar = kbc.p0;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g(((kbc) obj).S(), "screenshot", null, null, 12));
                if (((kr7) cr8.p(kr7.class)).e("droid_native_magua_screenshot_share_tst").a == 2) {
                    ((JSTBroadcast) cr8.p(JSTBroadcast.class)).dispatch(new JSTBroadcastEvent.Screenshot("viewjob"));
                }
                break;
            default:
                a aVar2 = (a) obj;
                int i2 = a.H0;
                Lazy<s87> lazy = s87.f;
                gz4 gz4VarP = aVar2.P();
                tx5 tx5Var = aVar2.t0;
                s87.a.a(gz4VarP, tx5.k(tx5Var, "view-job-bottom-sheet", "screenshot", null, 12));
                dd4 dd4Var = dd4.a;
                ad4 ad4Var = dd4.n().a;
                ad4Var.getClass();
                if (ad4Var.e(cd4.a.Y0) == cd4.u0.a.getValue() && (jdeVar = aVar2.w0) != null) {
                    s87.a.a(aVar2.P(), tx5.g(tx5Var, "view_job_page_native_share_screen", null, 6));
                    nn0 nn0Var = nn0.a;
                    Context contextRequireContext = aVar2.requireContext();
                    contextRequireContext.getClass();
                    String str = jdeVar.a;
                    if (str != null) {
                        Uri uri = Uri.parse(str);
                        Uri.Builder builderFragment = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                        queryParameterNames.getClass();
                        ArrayList<String> arrayList2 = new ArrayList();
                        for (Object obj2 : queryParameterNames) {
                            if (!wl7.b((String) obj2, "from")) {
                                arrayList2.add(obj2);
                            }
                        }
                        for (String str2 : arrayList2) {
                            List<String> queryParameters = uri.getQueryParameters(str2);
                            queryParameters.getClass();
                            Iterator<T> it = queryParameters.iterator();
                            while (it.hasNext()) {
                                builderFragment.appendQueryParameter(str2, (String) it.next());
                            }
                        }
                        string = builderFragment.appendQueryParameter("from", "appsharedroid_screenshot").build().toString();
                        string.getClass();
                    }
                    nn0.f(contextRequireContext, string, jdeVar.b);
                    break;
                }
                break;
        }
    }
}
