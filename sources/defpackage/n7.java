package defpackage;

import android.os.Build;
import android.os.StatFs;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import com.wlappdebug.r;
import defpackage.eq7;
import defpackage.n3f;
import defpackage.y54;
import java.io.File;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n7 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ n7(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        long jE;
        switch (this.a) {
            case 0:
                q7[] q7VarArrValues = q7.values();
                q7VarArrValues.getClass();
                return new aw4(q7VarArrValues, "com.indeed.android.rnmessaging.api.logging.ActionType");
            case 1:
                return new rna("com.indeed.android.messaging.ui.preview.AttachmentDownloadPreviewRoute", qw0.INSTANCE, new Annotation[0]);
            case 2:
                return new gt0(ni1.a, 0);
            case 3:
                return new rna("Cancel", eq7.a.INSTANCE, new Annotation[0]);
            case 4:
                return aq3.Companion.serializer();
            case 5:
                return j6g.a;
            case 6:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 7:
                epa epaVar = epa.a;
                ((r.b) epa.d.getValue()).b(BuildConfig.VERSION_NAME, "initService.appVersion");
                d2f d2fVar = ajg.a;
                return ajg.a((String) ajg.a.getValue());
            case 8:
                m2c.a(hvb.Z);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ScreenDummyLayoutHelper.a aVar = ScreenDummyLayoutHelper.Y;
                return "[RNScreens] Context was null-ed before dummy layout was initialized";
            case 10:
                return new ede(0);
            case 11:
                n3f.a.c[] cVarArrValues = n3f.a.c.values();
                cVarArrValues.getClass();
                return new aw4(cVarArrValues, "com.indeed.android.tel.model.TELActionParam.APIAction.HttpMethod");
            case 12:
                AppStartupTimes appStartupTimes = AppStartupTimes.a;
                AppStartupTimes.a("webview_user_agent_start");
                String str = Build.VERSION.RELEASE;
                str.getClass();
                String str2 = Build.MODEL;
                str2.getClass();
                String str3 = Build.ID;
                str3.getClass();
                String str4 = "Mozilla/5.0 (Linux; Android " + str + "; " + str2 + " Build/" + str3 + "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/0.0.0.0 Mobile Safari/537.36";
                AppStartupTimes.a("webview_user_agent_end");
                return str4;
            default:
                y54.a aVar2 = new y54.a();
                w5b w5bVarH = pa5.b.h("coil3_disk_cache");
                double d = aVar2.b;
                if (d > 0.0d) {
                    try {
                        File file = w5bVarH.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        jE = nic.E((long) (d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), aVar2.c, aVar2.d);
                    } catch (Exception unused) {
                        jE = aVar2.c;
                    }
                    break;
                } else {
                    jE = 0;
                }
                return new wqc(jE, aVar2.e, aVar2.a, w5bVarH);
        }
    }
}
