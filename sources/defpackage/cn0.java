package defpackage;

import androidx.compose.foundation.e;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand;
import com.indeed.android.jsmappservices.bridge.ToastPosition;
import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.cd4;
import defpackage.nz0;
import defpackage.xed;
import defpackage.xh8;
import defpackage.yra;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cn0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ cn0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object value;
        switch (this.a) {
            case 0:
                xh8 xh8Var = AppStartupTimes.a;
                return (gz4) (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(gz4.class), null);
            case 1:
                return new gt0(nz0.a.a, 0);
            case 2:
                return j6g.a;
            case 3:
                return j6g.a;
            case 4:
                String str = BuildConfig.BUILD_TYPE;
                return bs4.a;
            case 5:
                return new gt0(mve.a, 0);
            case 6:
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.j = new z77(0);
                return new OkHttpClient(builder);
            case 7:
                ne4 ne4Var = e.a;
                return om3.a;
            case 8:
                return new gt0(rh7.a, 0);
            case DatadogLogGenerator.CRASH /* 9 */:
                return JSTBroadcastEvent.UserDidLogout._init_$_anonymous_();
            case 10:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 11:
                return new so8(0, 0);
            case 12:
                xed.a aVarA = ((x0g) cr8.p(x0g.class)).a();
                aVarA.p = false;
                aVarA.q = true;
                return (MessagingDatabase) aVarA.b();
            case 13:
                return web.j("com.indeed.android.tare.nav.MyJobsSubTabType", x7a.values(), new String[]{"saved", "invitations", "applied", "interviews", "archived", "ghostwriterAutoApply"}, new Annotation[][]{null, null, null, null, null, null});
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new OkHttpClient.Builder();
            case 15:
                return new rna("CANCELLED", yra.a.INSTANCE, new Annotation[0]);
            case 16:
                List<cd4.a> listD = ((ed4) ipb.b.getValue()).a.d();
                int iV = kc9.V(t92.r0(listD, 10));
                if (iV < 16) {
                    iV = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
                for (Object obj : listD) {
                    linkedHashMap.put(((cd4.a) obj).name(), obj);
                }
                return linkedHashMap;
            case 17:
                return j6g.a;
            case 18:
                gse gseVar = ced.a;
                do {
                    value = gseVar.getValue();
                    ((bed) value).getClass();
                } while (!gseVar.h(value, new bed(null, false)));
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                RNProfileScreenModule.INSTANCE.getClass();
                synchronized (RNProfileScreenModule.instanceLock) {
                    RNProfileScreenModule rNProfileScreenModule = RNProfileScreenModule.instance;
                    if (rNProfileScreenModule != null) {
                        rNProfileScreenModule.emitUploadButtonTappedInternal();
                        j6g j6gVar = j6g.a;
                    }
                    break;
                }
                return j6g.a;
            case 20:
                return new rna("com.indeed.android.jsmappservices.bridge.ResetPushPromptCooldownTimeoutCommand", ResetPushPromptCooldownTimeoutCommand.INSTANCE, new Annotation[0]);
            case 21:
                return j6g.a;
            default:
                return web.j("com.indeed.android.jsmappservices.bridge.ToastPosition", ToastPosition.values(), new String[]{"top", "center", "bottom"}, new Annotation[][]{null, null, null});
        }
    }
}
