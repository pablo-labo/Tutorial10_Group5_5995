package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.j63;
import defpackage.jq7;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qr0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ qr0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ApplyResult[] applyResultArrValues = ApplyResult.values();
                applyResultArrValues.getClass();
                return new aw4(applyResultArrValues, "com.indeed.android.jsmappservices.bridge.results.ApplyResult");
            case 1:
                return new gt0(j63.a.a, 0);
            case 2:
                return j6g.a;
            case 3:
                return io7.Companion.serializer();
            case 4:
                return new gt0(mve.a, 0);
            case 5:
                return JSTBroadcastEvent.DataUpdated._childSerializers$_anonymous_();
            case 6:
                return new rna("Profile", jq7.u.INSTANCE, new Annotation[0]);
            case 7:
                return j6g.a;
            case 8:
                return sa8.a(new nf(18));
            case DatadogLogGenerator.CRASH /* 9 */:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new k7(12));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new lee());
                arrayList.add(new h77());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case 10:
                return new rna("com.indeed.android.jsmappservices.bridge.OpenPushNotificationAuthorizationSettingsCommand", OpenPushNotificationAuthorizationSettingsCommand.INSTANCE, new Annotation[0]);
            case 11:
                return j6g.a;
            case 12:
                return new f8d();
            case 13:
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ne4 ne4Var = q4e.a;
                return null;
            case 15:
                return new lh7(0L);
            default:
                return j6g.a;
        }
    }
}
