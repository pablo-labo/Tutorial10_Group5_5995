package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import defpackage.cz2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nf implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ nf(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                break;
            case 1:
                ((m74) obj).getClass();
                break;
            case 2:
                ((Long) obj).longValue();
                break;
            case 3:
                break;
            case 4:
                if (!((Context) ((mm2) obj).c(AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    mn1.a.getClass();
                }
                break;
            case 5:
                ((String) obj).getClass();
                break;
            case 6:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.e(s5eVar, new l92(0));
                break;
            case 7:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                break;
            case 8:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Boolean) obj).booleanValue();
                break;
            case 10:
                ((Boolean) obj).booleanValue();
                break;
            case 11:
                ((m74) obj).getClass();
                break;
            case 12:
                ld2 ld2Var = (ld2) obj;
                ld2Var.getClass();
                ld2Var.a.getClass();
                break;
            case 13:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                p5e.a(s5eVar2);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                IanInitialState ianInitialState = (IanInitialState) obj;
                z88 z88Var = new z88();
                Bundle bundle = new Bundle();
                if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.X) {
                    bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                }
                z88Var.setArguments(bundle);
                break;
            case 15:
                zk8.a(((Integer) obj).intValue());
                break;
            case 16:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.i(s5eVar3, 0);
                break;
            case 17:
                break;
            case 18:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.a = false;
                break;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                break;
            case 20:
                ((nhb) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.b("PassportSignInWebViewFragment", "onPostApplyRequest called unexpectedly", false, new Exception());
                break;
            case 21:
                s5e s5eVar4 = (s5e) obj;
                s5eVar4.getClass();
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<String> r5eVar = k5e.y;
                qf8<Object> qf8Var = o5e.a[14];
                s5eVar4.a(r5eVar, "JobSeekerProfileInitialsDisplay");
                break;
            case 22:
                String str = (String) obj;
                str.getClass();
                m2c.b(hvb.e0, str);
                break;
            case 23:
                ((xmc) obj).getClass();
                break;
            case 24:
                cz2.a aVar = (cz2.a) obj;
                aVar.getClass();
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                ((Boolean) obj).booleanValue();
                break;
            default:
                ((Boolean) obj).booleanValue();
                break;
        }
        return j6g.a;
    }
}
