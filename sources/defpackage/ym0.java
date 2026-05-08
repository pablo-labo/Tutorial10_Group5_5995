package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService;
import com.indeed.android.jobsearch.backend.util.ProctorTests;
import com.indeed.android.jobsearch.backend.util.a;
import com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand;
import com.indeed.android.tare.broadcast.ApplyType;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.sp7;
import defpackage.yra;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ym0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ym0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws IOException {
        switch (this.a) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return ApplyType._init_$_anonymous_();
            case 2:
                return (AutoCompleteApiService) jz0.a.b(AutoCompleteApiService.class);
            case 3:
                return n3f.Companion.serializer();
            case 4:
                return j6g.a;
            case 5:
                return new rna("com.indeed.android.jsmappservices.bridge.GetNativeAppInfoCommand", GetNativeAppInfoCommand.INSTANCE, new Annotation[0]);
            case 6:
                return j6g.a;
            case 7:
                return ho7.Companion.serializer();
            case 8:
                return new gt0(mve.a, 0);
            case DatadogLogGenerator.CRASH /* 9 */:
                return JSTBroadcastEvent.FormCompleted._childSerializers$_anonymous_();
            case 10:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 11:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tare.nav.OnboardingResultT", iwcVar.b(yra.class), new yd8[]{iwcVar.b(yra.a.class), iwcVar.b(yra.b.class)}, new KSerializer[]{new rna("CANCELLED", yra.a.INSTANCE, new Annotation[0]), new rna("COMPLETED", yra.b.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 12:
                Lazy lazy = a.a;
                URL resource = a.class.getResource("/com.indeed.android.jobsearch.proctor/DroidProctorGroups.proctor.json");
                if (resource == null) {
                    r6.g("Could not read built-in file /com.indeed.android.jobsearch.proctor/DroidProctorGroups.proctor.json");
                    return null;
                }
                Charset charset = a32.b;
                InputStream inputStreamOpenStream = resource.openStream();
                try {
                    inputStreamOpenStream.getClass();
                    byte[] bArrU = wg2.U(inputStreamOpenStream);
                    inputStreamOpenStream.close();
                    String str = new String(bArrU, charset);
                    try {
                        ra8 ra8Var = a.b;
                        ra8Var.getClass();
                        Map<String, ProctorTests.TestSpec> tests = ((ProctorTests) ra8Var.c(ProctorTests.INSTANCE.serializer(), str)).getTests();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, ProctorTests.TestSpec> entry : tests.entrySet()) {
                            if (wl7.b(entry.getValue().isHotLoadSafe(), Boolean.TRUE)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        return linkedHashMap.keySet();
                    } catch (SerializationException e) {
                        ArrayList arrayList = lz2.a;
                        lz2.b("InitServiceHelper", "Unable to serialize DroidProctorGroups.proctor.json", false, e);
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        ArrayList arrayList2 = lz2.a;
                        lz2.b("InitServiceHelper", "DroidProctorGroups.proctor.json is not a valid instance of " + ProctorTests.INSTANCE, false, e2);
                        throw e2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c0h.q(inputStreamOpenStream, th);
                        throw th2;
                    }
                }
            case 13:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "hamburger-menu", null, null, 12));
                ((j2g) cr8.p(j2g.class)).a();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                return new lh7(0L);
            default:
                return j6g.a;
        }
    }
}
