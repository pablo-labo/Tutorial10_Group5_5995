package defpackage;

import android.os.Bundle;
import androidx.navigation.e;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import defpackage.cz2;
import defpackage.lx5;
import defpackage.wif;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dc(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new zc(i);
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 2:
                iw4 iw4Var = (iw4) obj;
                iw4Var.getClass();
                return iw4Var.a;
            case 3:
                ((String) obj).getClass();
                return j6g.a;
            case 4:
                ((ss2) obj).N1();
                return j6g.a;
            case 5:
                ((fo7) obj).getClass();
                return j6g.a;
            case 6:
                o5e.i((s5e) obj, 0);
                return j6g.a;
            case 7:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.e(s5eVar, new l92(1));
                return j6g.a;
            case 8:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("url", d93.g());
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.l(s5eVar2, 3.0f);
                return j6g.a;
            case 10:
                IanInitialState ianInitialState = (IanInitialState) obj;
                x88 x88Var = new x88();
                Bundle bundle = new Bundle();
                if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.Y) {
                    bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                }
                x88Var.setArguments(bundle);
                return x88Var;
            case 11:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 12:
                String str = (String) obj;
                str.getClass();
                return "'" + str + "'";
            case 13:
                e eVar = (e) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                eVar.getClass();
                eVar.n(R.id.navActionDirectlyRnOnboarding, new Bundle());
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                q6d q6dVar = (q6d) obj;
                q6dVar.getClass();
                return String.valueOf(q6dVar.a());
            case 16:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 17:
                ((ShowSearchOverlayData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.b("PassportSignInWebViewFragment", "onShowSearchOverlay called unexpectedly", false, new Exception());
                return j6g.a;
            case 18:
                iw9 iw9Var = (iw9) obj;
                iw9Var.getClass();
                return Boolean.valueOf(iw9Var != iw9.a);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return j6g.a;
            case 20:
                cz2.a aVar = (cz2.a) obj;
                aVar.getClass();
                return aVar.c;
            case 21:
                if (wl7.b(obj, Boolean.FALSE)) {
                    return new bkf(bkf.c);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj3 = list.get(1);
                ckf ckfVar = obj3 != null ? (ckf) obj3 : null;
                ckfVar.getClass();
                return new bkf(hh2.y(ckfVar.a, fFloatValue));
            case 22:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                wif.a aVar2 = obj4 != null ? (wif.a) obj4 : null;
                aVar2.getClass();
                int i2 = aVar2.a;
                Object obj5 = list2.get(1);
                Boolean bool = obj5 != null ? (Boolean) obj5 : null;
                bool.getClass();
                return new wif(i2, bool.booleanValue());
            case 23:
                iid iidVar = (iid) obj;
                iidVar.getClass();
                return Boolean.valueOf(iidVar.M1());
            case 24:
                return j6g.a;
            default:
                de0 de0Var = (de0) obj;
                return new l94((((long) Float.floatToRawIntBits(de0Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(de0Var.a)) << 32));
        }
    }
}
