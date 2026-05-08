package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jsmappservices.bridge.OpenOnboardingModalData;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.jq7;
import defpackage.v03;
import defpackage.xh8;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wy2 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ wy2(IanMainFragment ianMainFragment) {
        this.a = 3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return j6g.a;
            case 1:
                return new gt0(mve.a, 0);
            case 2:
                return j6g.a;
            case 3:
                bu8 bu8Var = bu8.a;
                bu8Var.getClass();
                bu8.L0.b(bu8.b[49], bu8Var, Boolean.FALSE);
                return j6g.a;
            case 4:
                return j6g.a;
            case 5:
                return j6g.a;
            case 6:
                return j6g.a;
            case 7:
                return new a17();
            case 8:
                Collection collectionValues = e87.a().values();
                ArrayList arrayList = new ArrayList(t92.r0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ck6) it.next()).b);
                }
                return z92.z1(z92.E1(arrayList));
            case DatadogLogGenerator.CRASH /* 9 */:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
            case 10:
                return new gt0(mve.a, 0);
            case 11:
                return JSTBroadcastEvent.ApplyStart._childSerializers$_anonymous_();
            case 12:
                return new rna("PrivacyPolicy", jq7.t.INSTANCE, new Annotation[0]);
            case 13:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                return ep5.a.e();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                int i = LaunchActivity.e1;
                return j6g.a;
            case 15:
                xh8 xh8Var = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                builderE.c.add(new s97(new l7(15)));
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                builderE.j = (CookieJar) (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(fed.class), null);
                return new OkHttpClient(builderE);
            case 16:
                OpenOnboardingModalData.Companion companion = OpenOnboardingModalData.Companion;
                return new by8(mve.a, na8.a);
            case 17:
                return j6g.a;
            case 18:
                SearchType[] searchTypeArrValues = SearchType.values();
                searchTypeArrValues.getClass();
                return new aw4(searchTypeArrValues, "com.indeed.android.jsmappservices.bridge.SearchType");
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                throw new IllegalStateException("OnClickedCallback not provided");
            default:
                return j6g.a;
        }
    }

    public /* synthetic */ wy2(int i) {
        this.a = i;
    }
}
