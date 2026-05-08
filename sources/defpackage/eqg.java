package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.viewjob.a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eqg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ eqg(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                nhb nhbVar = (nhb) obj;
                int i2 = a.H0;
                nhbVar.getClass();
                LaunchActivity launchActivity = aVar.A0;
                if (launchActivity != null) {
                    launchActivity.I(nhbVar);
                    return j6g.a;
                }
                wl7.g("launchActivity");
                throw null;
            default:
                jde jdeVar = (jde) obj;
                int i3 = a.H0;
                jdeVar.getClass();
                try {
                    if (!aVar.isDetached() && (str = jdeVar.a) != null && !zve.U(str)) {
                        aVar.w0 = jdeVar;
                        lqg lqgVarQ = aVar.Q();
                        ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), true, false, false, false, null, false, null, null, 0.0f, false, false, 4094));
                    }
                    break;
                } catch (Exception e) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("view-job-bottom-sheet", bg.e(e, "Error in PageMetadataExtractorComponent: "), false, null, 12);
                }
                return j6g.a;
        }
    }
}
