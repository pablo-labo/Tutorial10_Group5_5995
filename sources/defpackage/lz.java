package defpackage;

import androidx.compose.runtime.r;
import com.datadog.android.Datadog;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.GlobalRumMonitor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.cd4;
import defpackage.gva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Lazy;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lz implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ lz(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object value;
        int i = 0;
        switch (this.a) {
            case 0:
                return cs0.Companion.serializer();
            case 1:
                return j6g.a;
            case 2:
                return new gt0(gva.a.a, 0);
            case 3:
                fo0[] fo0VarArrValues = fo0.values();
                fo0VarArrValues.getClass();
                return new aw4(fo0VarArrValues, "com.indeed.android.ghostwriter.models.backend.ApplicationStatus");
            case 4:
                return j6g.a;
            case 5:
                return new gt0(d4f.Companion.serializer(), 0);
            case 6:
                return Pattern.compile("[-/ ]");
            case 7:
                return new gt0(mve.a, 0);
            case 8:
                return new gt0(ni1.a, 0);
            case DatadogLogGenerator.CRASH /* 9 */:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 10:
                return kk7.Companion.serializer();
            case 11:
                Lazy lazy = bg3.a;
                if (bg3.c && bg3.d) {
                    return GlobalRumMonitor.get(Datadog.getInstance("dd-jsma"));
                }
                return null;
            case 12:
                return j6g.a;
            case 13:
                int i2 = LaunchActivity.e1;
                gse gseVar = zk8.a;
                do {
                    value = gseVar.getValue();
                    ((yk8) value).getClass();
                } while (!gseVar.h(value, new yk8(null, false)));
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ArrayList arrayList = lz2.a;
                w40.n("URL registry refresh data failed", "LaunchViewModel", "URL registry refresh data failed", false);
                return j6g.a;
            case 15:
                return iw8._viewInstanceId_delegate$lambda$0();
            case 16:
                ne4 ne4Var = z09.a;
                return null;
            case 17:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new j7(11));
                ArrayList arrayList2 = builderE.c;
                arrayList2.add(s97Var);
                arrayList2.add(new lee());
                builderE.a(epa.c());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builderE.c(0L, timeUnit);
                builderE.A = Util.b(0L, timeUnit);
                builderE.z = Util.b(0L, timeUnit);
                return new OkHttpClient(builderE);
            case 18:
                List<cd4.a> listD = ((ed4) w8c.d.getValue()).a.d();
                ArrayList arrayList3 = new ArrayList(t92.r0(listD, 10));
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((cd4.a) it.next()).name());
                }
                return z92.E1(arrayList3);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return new hkd(i);
            case 20:
                try {
                    return aa2.a(a7e.W(v6e.L(Arrays.asList(new opa()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 21:
                return r.f(Boolean.FALSE);
            default:
                return j6g.a;
        }
    }
}
