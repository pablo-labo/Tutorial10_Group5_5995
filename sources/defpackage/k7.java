package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.yoga.YogaNative;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.results.ActionOverflowResult;
import com.indeed.android.jsmappservices.bridge.results.ActionOverflowResultAction;
import com.indeed.android.jsmappservices.bridge.results.ShowSearchOverlayResult;
import defpackage.du4;
import defpackage.oq7;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k7 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ k7(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ActionOverflowResult.Companion companion = ActionOverflowResult.Companion;
                return ActionOverflowResultAction.Companion.serializer();
            case 1:
                Map<String, Number> map = sc3.q;
                return "Sampling priority unset, can't lock it";
            case 2:
                return j6g.a;
            case 3:
                return n3f.Companion.serializer();
            case 4:
                ne4 ne4Var = nx6.a;
                return Boolean.FALSE;
            case 5:
                String string = UUID.randomUUID().toString();
                string.getClass();
                return string.substring(0, 13);
            case 6:
                return new gt0(rh7.a, 0);
            case 7:
                return new gt0(du4.a.a, 0);
            case 8:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tare.nav.JSTModalScreenResult", iwcVar.b(oq7.class), new yd8[]{iwcVar.b(oq7.a.class), iwcVar.b(oq7.b.class), iwcVar.b(oq7.d.class), iwcVar.b(oq7.e.class), iwcVar.b(oq7.f.class), iwcVar.b(oq7.g.class), iwcVar.b(oq7.h.class), iwcVar.b(oq7.i.class), iwcVar.b(oq7.j.class), iwcVar.b(oq7.k.class), iwcVar.b(oq7.l.class)}, new KSerializer[]{oq7.a.C0372a.a, oq7.b.a.a, oq7.d.a.a, oq7.e.a.a, oq7.f.a.a, oq7.g.a.a, oq7.h.a.a, oq7.i.a.a, oq7.j.a.a, oq7.k.a.a, oq7.l.a.a}, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                return j6g.a;
            case 11:
                return bs4.a;
            case 12:
                epa epaVar = epa.a;
                return epa.a().a();
            case 13:
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                m2c.a(hvb.a);
                return j6g.a;
            case 15:
                return new by8(mve.a, rh7.a);
            case 16:
                d6h d6hVar = new d6h();
                YogaNative.jni_YGConfigSetPointScaleFactorJNI(d6hVar.a, 0.0f);
                YogaNative.jni_YGConfigSetErrataJNI(d6hVar.a, h6h.ALL.a());
                return d6hVar;
            case 17:
                ShowSearchOverlayResult.Companion companion2 = ShowSearchOverlayResult.Companion;
                return SearchType.Companion.serializer();
            case 18:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return new mfb(fwc.a.b(e4f.class), new Annotation[0]);
            case 20:
                jte jteVar = b4g.a;
                return Boolean.FALSE;
            case 21:
                return new pxc(".*\\baccounts\\.google\\.com$");
            default:
                return io7.Companion.serializer();
        }
    }
}
