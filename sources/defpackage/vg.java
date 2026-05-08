package defpackage;

import android.os.Bundle;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.conversations.AttachmentsRepository;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import com.indeed.android.messaging.data.conversations.OnlineStatusRepository;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.lx5;
import defpackage.s95;
import defpackage.st;
import defpackage.uh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = true;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new uh.f();
            case 1:
                ((m74) obj).getClass();
                return new st.b();
            case 2:
                ((m74) obj).getClass();
                return new dz();
            case 3:
                ((fo7) obj).getClass();
                return j6g.a;
            case 4:
                ((Boolean) obj).booleanValue();
                return j6g.a;
            case 5:
                ((EventRecord.Attachment) obj).getClass();
                return j6g.a;
            case 6:
                ((String) obj).getClass();
                return j6g.a;
            case 7:
                ((lx5.b) obj).getClass();
                return j6g.a;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                s95.d dVar = (s95.d) entry.getValue();
                dVar.getClass();
                if (System.currentTimeMillis() >= dVar.b) {
                    try {
                        dVar.a.close();
                    } catch (IOException e) {
                        s55.g(s95.e, "Failed to close expired file", e);
                    }
                    break;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                ((String) obj).getClass();
                return j6g.a;
            case 11:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case 12:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.l(s5eVar2, 4.0f);
                return j6g.a;
            case 13:
                IanInitialState ianInitialState = (IanInitialState) obj;
                f98 f98Var = new f98();
                Bundle bundle = new Bundle();
                if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.a0) {
                    bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                }
                f98Var.setArguments(bundle);
                return f98Var;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                ((ShowSearchOverlayData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.b("IndeedApplyWebViewFragment", "onShowSearchOverlay called unexpectedly", false, new Exception());
                return j6g.a;
            case 16:
                ((lx5.b) obj).getClass();
                return j6g.a;
            case 17:
                rx9 rx9Var = (rx9) obj;
                rx9Var.getClass();
                int i = 11;
                c10 c10Var = new c10(i);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(MessagingDatabase.class);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.a;
                rx9Var.a(new vge(new ue1(lveVar, yd8VarB, null, c10Var, uh8Var)));
                int i2 = 9;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(sr9.class), null, new ih2(i2), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(lr9.class), null, new mj2(9, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(dq9.class), null, new kh2(i), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(ita.class), null, new lh2(i, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(ConversationsRemoteDataSource.class), null, new ey1(i2, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(ConversationsRepository.class), null, new so0(i2), uh8Var)));
                int i3 = 8;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(AttachmentsRepository.class), null, new ov(i3, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(OnlineStatusRepository.class), null, new bj2(8, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(fnf.class), null, new zk0(7, (byte) 0), uh8Var)));
                int i4 = 10;
                zh1 zh1Var = new zh1(i4);
                yd8 yd8VarB2 = iwcVar.b(h02.class);
                uh8 uh8Var2 = uh8.b;
                rx9Var.a(new e65(new ue1(lveVar, yd8VarB2, null, zh1Var, uh8Var2)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(u67.class), null, new ph2(i), uh8Var2)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(y1e.class), null, new vb2(i3), uh8Var2)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(p9d.class), null, new cj2(i4), uh8Var2)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(i3d.class), null, new us0(7), uh8Var2)));
                int i5 = 12;
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(kta.class), null, new rh2(i5, b), uh8Var2)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(j7d.class), null, new ej2(i, b), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(d4g.class), null, new kk2(i5), uh8Var2)));
                return j6g.a;
            case 18:
                ((hp7) obj).getClass();
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                if (wl7.b(obj, Boolean.FALSE)) {
                    return new ooa(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj3 = list.get(1);
                Float f2 = obj3 != null ? (Float) obj3 : null;
                f2.getClass();
                return new ooa((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L));
            case 20:
                ((dd0) obj).getClass();
                return lv4.a;
            default:
                ooa ooaVar = (ooa) obj;
                return new de0(Float.intBitsToFloat((int) (ooaVar.a >> 32)), Float.intBitsToFloat((int) (ooaVar.a & 4294967295L)));
        }
    }
}
