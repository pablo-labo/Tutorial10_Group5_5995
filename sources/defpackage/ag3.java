package defpackage;

import com.datadog.android.DatadogSite;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import defpackage.v03;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ag3 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ag3(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Configuration.Builder("puba2545b9469b026784ba15c57347f348c", "prod", "play", null, 8, null).setFirstPartyHosts(u63.a0("indeed.net", "indeed.tech", "indeed.com")).setCrashReportsEnabled(false).useSite(DatadogSite.US1).build();
            case 1:
                return j6g.a;
            case 2:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA, m89.a));
            case 3:
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "shareHiredScreenshot", null, 12));
                return j6g.a;
            case 4:
                eze ezeVarA2 = wea.a();
                eq3 eq3Var2 = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA2, no3.c));
            case 5:
                return new gt0(mve.a, 0);
            case 6:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 7:
                return j6g.a;
            case 8:
                jte jteVar = i09.a;
                return jv0.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new dp0(11));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new lee());
                arrayList.add(new c83());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case 10:
                return new f7d(2);
            case 11:
                ShowModalWithWebviewData.Companion companion = ShowModalWithWebviewData.Companion;
                return ModalPresentationMode.Companion.serializer();
            case 12:
                return new mfb(fwc.a.b(l3f.class), new Annotation[0]);
            case 13:
                return new nzf();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return (OkHttpClient) epa.X.getValue();
            default:
                return q7.Companion.serializer();
        }
    }
}
