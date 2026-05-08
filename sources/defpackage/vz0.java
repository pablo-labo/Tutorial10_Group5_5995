package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jsmappservices.bridge.DismissApplyWebView;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.results.NativeResult;
import com.indeed.android.jsmappservices.bridge.results.NativeResultWrapper;
import defpackage.jq7;
import defpackage.l4b;
import defpackage.nz0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vz0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ vz0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new gt0(nz0.a.a, 0);
            case 1:
                return j6g.a;
            case 2:
                return web.j("com.indeed.android.tare.nav.DefaultResultT", aq3.values(), new String[]{"CLOSED"}, new Annotation[][]{null});
            case 3:
                return new rna("com.indeed.android.jsmappservices.bridge.DismissApplyWebView", DismissApplyWebView.INSTANCE, new Annotation[0]);
            case 4:
                return j6g.a;
            case 5:
                return j6g.a;
            case 6:
                return (y54) nkg.a.getValue();
            case 7:
                return new gt0(ni1.a, 0);
            case 8:
                return new rna("TermsOfService", jq7.c0.INSTANCE, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                ModalPresentationMode[] modalPresentationModeArrValues = ModalPresentationMode.values();
                modalPresentationModeArrValues.getClass();
                return new aw4(modalPresentationModeArrValues, "com.indeed.android.jsmappservices.bridge.ModalPresentationMode");
            case 10:
                NativeResultWrapper.Companion companion = NativeResultWrapper.Companion;
                return NativeResult.Companion.serializer();
            case 11:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new zw(17));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new lee());
                arrayList.add(new c83());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case 12:
                return new lxa();
            case 13:
                return new gt0(l4b.a.a, 0);
            default:
                return j6g.a;
        }
    }
}
