package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.k63;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vy2 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ vy2(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return j6g.a;
            case 1:
                return new gt0(k63.a.a, 0);
            case 2:
                return d4f.Companion.serializer();
            case 3:
                Collection collectionValues = e87.a().values();
                ArrayList arrayList = new ArrayList(t92.r0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ck6) it.next()).a);
                }
                return z92.z1(z92.E1(arrayList));
            case 4:
                return new gt0(mve.a, 0);
            case 5:
                return JSTBroadcastEvent._init_$_anonymous_();
            case 6:
                return x7a.Companion.serializer();
            case 7:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                return dd4.a.a();
            case 8:
                return new ss8(0, 0);
            case DatadogLogGenerator.CRASH /* 9 */:
                return n3f.Companion.serializer();
            case 10:
                OkHttpClient.Builder builderE = ((v1g) cr8.p(v1g.class)).c().e();
                builderE.c.add(new kq9());
                return new OkHttpClient(builderE);
            case 11:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE2 = epa.e().e();
                builderE2.c.add(new s97(new pl0(9)));
                builderE2.a(epa.c());
                builderE2.b(15L, TimeUnit.SECONDS);
                y77 y77Var = (y77) epa.c.getValue();
                y77Var.getClass();
                builderE2.j = y77Var;
                return new OkHttpClient(builderE2);
            case 12:
                m2c.b(hvb.e0, "");
                return j6g.a;
            case 13:
                throw new IllegalStateException("OnImpressionCallback not provided");
            default:
                return j6g.a;
        }
    }
}
