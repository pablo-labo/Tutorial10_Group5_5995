package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.jq7;
import defpackage.njg;
import defpackage.sp7;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cp0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ cp0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                return new iu2(yd8VarB, new KSerializer[0]);
            case 1:
                return j6g.a;
            case 2:
                return EventRecord.Attachment._childSerializers$_anonymous_();
            case 3:
                return new gt0(mve.a, 0);
            case 4:
                return new gt0(d4f.Companion.serializer(), 0);
            case 5:
                return j6g.a;
            case 6:
                return new gt0(mve.a, 0);
            case 7:
                return new gt0(ni1.a, 0);
            case 8:
                return new gt0(ni1.a, 0);
            case DatadogLogGenerator.CRASH /* 9 */:
                return new rna("CCPA", jq7.d.INSTANCE, new Annotation[0]);
            case 10:
                return yra.Companion.serializer();
            case 11:
                return j6g.a;
            case 12:
                return ya8.b;
            case 13:
                epa epaVar = epa.a;
                return epa.a().a();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "hamburger-menu", null, null, 12));
                ((j2g) cr8.p(j2g.class)).a();
                return j6g.a;
            case 15:
                return j6g.a;
            case 16:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("ResumePreviewOptionsBottomSheetFragment", "save-as", null, null, 12));
                return j6g.a;
            case 17:
                jte jteVar = kkd.a;
                return null;
            case 18:
                return rjf.b;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return j6g.a;
            default:
                return new gt0(njg.a.a, 0);
        }
    }
}
