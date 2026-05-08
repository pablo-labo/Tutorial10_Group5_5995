package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand;
import com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand;
import com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand;
import com.indeed.android.jsmappservices.bridge.ToastStyle;
import defpackage.jq7;
import defpackage.yra;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oz0 implements gu5 {
    public final /* synthetic */ int a;

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new gt0(mve.a, 0);
            case 1:
                return new rna("com.indeed.android.jsmappservices.bridge.CanShowPushPromptCommand", CanShowPushPromptCommand.INSTANCE, new Annotation[0]);
            case 2:
                return j6g.a;
            case 3:
                return j6g.a;
            case 4:
                jte jteVar = jm2.a;
                return null;
            case 5:
                return j6g.a;
            case 6:
                return new rna("com.indeed.android.jsmappservices.bridge.GetPushAuthorizationStatusCommand", GetPushAuthorizationStatusCommand.INSTANCE, new Annotation[0]);
            case 7:
                return new gt0(mve.a, 0);
            case 8:
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return new gt0(rh7.a, 0);
            case 10:
                return new rna("RegPromo", jq7.x.INSTANCE, new Annotation[0]);
            case 11:
                return new rna("com.indeed.android.jsmappservices.bridge.MarkHomePageReadyCommand", MarkHomePageReadyCommand.INSTANCE, new Annotation[0]);
            case 12:
                return j6g.a;
            case 13:
                return new rna("COMPLETED", yra.b.INSTANCE, new Annotation[0]);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new gt0(mve.a, 0);
            case 15:
                jte jteVar2 = pmd.a;
                return null;
            case 16:
                return web.j("com.indeed.android.jsmappservices.bridge.ToastStyle", ToastStyle.values(), new String[]{"info", "warning", "error", "generic"}, new Annotation[][]{null, null, null, null});
            default:
                return j6g.a;
        }
    }
}
