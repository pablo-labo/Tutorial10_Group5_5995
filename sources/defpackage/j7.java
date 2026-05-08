package defpackage;

import com.datadog.android.Datadog;
import com.datadog.android.log.Logger;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ModuleSpec;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.ActionOverflowData;
import com.indeed.android.jsmappservices.bridge.ActionOverflowData$ActionOverflowRow$$serializer;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import defpackage.cy1;
import defpackage.dd9;
import defpackage.fl1;
import defpackage.gq1;
import defpackage.jq7;
import defpackage.k77;
import defpackage.kd6;
import defpackage.n3f;
import defpackage.oq6;
import defpackage.oy7;
import defpackage.pv0;
import defpackage.sx8;
import defpackage.tq6;
import defpackage.vcf;
import defpackage.vx1;
import defpackage.y74;
import defpackage.z7f;
import defpackage.zg6;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j7 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ j7(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ActionOverflowData.Companion companion = ActionOverflowData.Companion;
                return new gt0(ActionOverflowData$ActionOverflowRow$$serializer.INSTANCE, 0);
            case 1:
                Map<String, Number> map = sc3.q;
                return "Can't set sampling priority to unset";
            case 2:
                return new Logger.Builder(Datadog.getInstance("dd-jsma")).setNetworkInfoEnabled(false).setLogcatLogsEnabled(true).setBundleWithTraceEnabled(false).setBundleWithRumEnabled(false).setName("ANDROID_JOBSEARCH").build();
            case 3:
                return Long.valueOf(System.currentTimeMillis());
            case 4:
                return j6g.a;
            case 5:
                ne4 ne4Var = fw6.a;
                return null;
            case 6:
                return new gt0(mve.a, 0);
            case 7:
                return jq7.n.Companion.serializer();
            case 8:
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return pv0.a.a;
            case 10:
                int i = fma.s0;
                return new d8c(w8c.c);
            case 11:
                epa epaVar = epa.a;
                return epa.a().a();
            case 12:
                lr5 lr5Var = m2c.e;
                if (lr5Var == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("ProfileViewModelBridge", "FragmentManager is null, cannot show profile options bottom sheet", false, null, 12);
                } else {
                    ((i1g) cr8.p(i1g.class)).a(lr5Var, new ksb());
                }
                return j6g.a;
            case 13:
                int i2 = 1;
                ModuleSpec.Companion companion2 = ModuleSpec.INSTANCE;
                return lc9.a0(new Pair(RNGestureHandlerRootViewManager.REACT_CLASS, companion2.viewManagerSpec(new r89(i2))), new Pair(RNGestureHandlerButtonViewManager.REACT_CLASS, companion2.viewManagerSpec(new s89(i2))));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new rna("com.indeed.android.messaging.ui.report.spam.ReportSpamRoute", a3d.INSTANCE, new Annotation[0]);
            case 15:
                ShowSearchOverlayData.Companion companion3 = ShowSearchOverlayData.INSTANCE;
                return SearchType.Companion.serializer();
            case 16:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tel.model.TELActionParam", iwcVar.b(n3f.class), new yd8[]{iwcVar.b(n3f.a.class), iwcVar.b(n3f.c.class), iwcVar.b(n3f.d.class), iwcVar.b(n3f.e.class)}, new KSerializer[]{n3f.a.C0327a.a, n3f.c.a.a, n3f.d.a.a, n3f.e.a.a}, new Annotation[0]);
            case 17:
                iwc iwcVar2 = fwc.a;
                return new atd("com.indeed.android.tel.model.TELComponent", iwcVar2.b(d4f.class), new yd8[]{iwcVar2.b(fl1.class), iwcVar2.b(gq1.class), iwcVar2.b(vx1.class), iwcVar2.b(cy1.class), iwcVar2.b(y74.class), iwcVar2.b(kd6.class), iwcVar2.b(zg6.class), iwcVar2.b(oq6.class), iwcVar2.b(tq6.class), iwcVar2.b(k77.class), iwcVar2.b(oy7.class), iwcVar2.b(sx8.class), iwcVar2.b(dd9.class), iwcVar2.b(z7f.class), iwcVar2.b(vcf.class)}, new KSerializer[]{fl1.a.a, gq1.a.a, vx1.a.a, cy1.a.a, y74.a.a, kd6.a.a, zg6.a.a, oq6.a.a, tq6.a.a, k77.a.a, oy7.a.a, sx8.a.a, dd9.a.a, z7f.a.a, vcf.a.a}, new Annotation[0]);
            case 18:
                return p7.Companion.serializer();
            default:
                return new mg5();
        }
    }
}
