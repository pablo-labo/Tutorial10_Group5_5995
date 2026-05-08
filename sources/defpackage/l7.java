package defpackage;

import androidx.compose.runtime.d;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand;
import com.indeed.android.jsmappservices.bridge.results.ActionOverflowResultAction;
import com.indeed.android.rnprofile.RNProfileModalNativeModule;
import com.indeed.android.tare.broadcast.DataName;
import defpackage.eq7;
import defpackage.v03;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l7 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ l7(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ActionOverflowResultAction[] actionOverflowResultActionArrValues = ActionOverflowResultAction.values();
                actionOverflowResultActionArrValues.getClass();
                return new aw4(actionOverflowResultActionArrValues, "com.indeed.android.jsmappservices.bridge.results.ActionOverflowResultAction");
            case 1:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
            case 2:
                long jG = pnb.g(4284612846L);
                long jG2 = pnb.g(4281794739L);
                long jG3 = pnb.g(4278442694L);
                long jG4 = pnb.g(4278290310L);
                long j = da2.e;
                long jG5 = pnb.g(4289724448L);
                long j2 = da2.b;
                return new kb2(jG, jG2, jG3, jG4, j, j, jG5, j, j2, j2, j2, j, true);
            case 3:
                d.d("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 4:
                return DataName._init_$_anonymous_();
            case 5:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat;
            case 6:
                return j6g.a;
            case 7:
                return j6g.a;
            case 8:
                return new rna("com.indeed.android.jsmappservices.bridge.IsGeolocationGrantedCommand", IsGeolocationGrantedCommand.INSTANCE, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                return new gt0(rh7.a, 0);
            case 10:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tare.nav.JSTIndeedApplyResult", iwcVar.b(eq7.class), new yd8[]{iwcVar.b(eq7.a.class), iwcVar.b(eq7.c.class)}, new KSerializer[]{new rna("Cancel", eq7.a.INSTANCE, new Annotation[0]), eq7.c.a.a}, new Annotation[0]);
            case 11:
                return aq3.Companion.serializer();
            case 12:
                return j6g.a;
            case 13:
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                epa epaVar = epa.a;
                return epa.a().a();
            case 16:
                m2c.b(hvb.a, "");
                return j6g.a;
            case 17:
                RNProfileModalNativeModule.INSTANCE.getClass();
                gu5 gu5Var = RNProfileModalNativeModule.onHideModalCallback;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 18:
                return goe.d;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 20:
                return UiThreadUtil.mainHandler_delegate$lambda$0();
            default:
                return ho7.Companion.serializer();
        }
    }
}
