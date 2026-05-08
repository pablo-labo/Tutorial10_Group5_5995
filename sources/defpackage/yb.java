package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.j6e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yb(int i, is8 is8Var) {
        this.a = 8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new yc(b);
            case 1:
                ((m74) obj).getClass();
                return new us();
            case 2:
                ((m74) obj).getClass();
                return new cv();
            case 3:
                ((m74) obj).getClass();
                return new jw();
            case 4:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.e(s5eVar, new l92(1));
                return j6g.a;
            case 5:
                return Boolean.valueOf(ConversationsRemoteDataSource.sendConversationMessage$lambda$5((j6e.a) obj));
            case 6:
                rx9 rx9Var = (rx9) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                rx9Var.getClass();
                int i = 7;
                dm0 dm0Var = new dm0(i, b);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(mfa.class);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.a;
                rx9Var.a(new vge(new ue1(lveVar, yd8VarB, null, dm0Var, uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(mga.class), null, new em0(6), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(tga.class), null, new fm0(8), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(cy3.class), null, new hm0(i), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(qga.class), null, new im0(6, (byte) 0), uh8Var)));
                v40.l(new ue1(lveVar, iwcVar.b(aud.class), null, new jm0(5), uh8Var), rx9Var);
                return j6g.a;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                int i2 = LaunchActivity.e1;
                zk8.a(iIntValue);
                return j6g.a;
            case 8:
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.i(s5eVar2, 0);
                return j6g.a;
            case 10:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return (wqd) sqdVar;
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 12:
                rx9 rx9Var2 = (rx9) obj;
                rx9Var2.getClass();
                dm0 dm0Var2 = new dm0(17, b);
                iwc iwcVar2 = fwc.a;
                yd8 yd8VarB2 = iwcVar2.b(as9.class);
                lve lveVar2 = zpd.c;
                uh8 uh8Var2 = uh8.a;
                ue1 ue1Var = new ue1(lveVar2, yd8VarB2, null, dm0Var2, uh8Var2);
                vge vgeVar = new vge(ue1Var);
                rx9Var2.a(vgeVar);
                yd8 yd8VarB3 = iwcVar2.b(jr7.class);
                ue1Var.f = z92.g1(yd8VarB3, ue1Var.f);
                String strM = mh2.m(yd8VarB3, null, lveVar2);
                HashMap<String, hg7<?>> map = rx9Var2.c;
                map.put(strM, vgeVar);
                ue1 ue1Var2 = new ue1(lveVar2, iwcVar2.b(h6a.class), null, new em0(13), uh8Var2);
                vge vgeVar2 = new vge(ue1Var2);
                rx9Var2.a(vgeVar2);
                yd8 yd8VarB4 = iwcVar2.b(jr7.class);
                ue1Var2.f = z92.g1(yd8VarB4, ue1Var2.f);
                map.put(mh2.m(yd8VarB4, null, lveVar2), vgeVar2);
                ue1 ue1Var3 = new ue1(lveVar2, iwcVar2.b(ssb.class), null, new fm0(19), uh8Var2);
                vge vgeVar3 = new vge(ue1Var3);
                rx9Var2.a(vgeVar3);
                yd8[] yd8VarArr = {iwcVar2.b(jr7.class), iwcVar2.b(ssb.class)};
                List<? extends yd8<?>> list = ue1Var3.f;
                ArrayList arrayList = new ArrayList(list.size() + 2);
                arrayList.addAll(list);
                w92.x0(arrayList, yd8VarArr);
                ue1Var3.f = arrayList;
                for (int i3 = 0; i3 < 2; i3++) {
                    map.put(mh2.m(yd8VarArr[i3], ue1Var3.c, ue1Var3.a), vgeVar3);
                }
                ue1 ue1Var4 = new ue1(lveVar2, iwcVar2.b(cbc.class), null, new gm0(11, b), uh8Var2);
                vge vgeVar4 = new vge(ue1Var4);
                rx9Var2.a(vgeVar4);
                yd8 yd8VarB5 = iwcVar2.b(jr7.class);
                ue1Var4.f = z92.g1(yd8VarB5, ue1Var4.f);
                map.put(mh2.m(yd8VarB5, null, lveVar2), vgeVar4);
                ue1 ue1Var5 = new ue1(lveVar2, iwcVar2.b(jed.class), null, new hm0(16), uh8Var2);
                vge vgeVar5 = new vge(ue1Var5);
                rx9Var2.a(vgeVar5);
                yd8 yd8VarB6 = iwcVar2.b(jr7.class);
                ue1Var5.f = z92.g1(yd8VarB6, ue1Var5.f);
                map.put(mh2.m(yd8VarB6, null, lveVar2), vgeVar5);
                return j6g.a;
            case 13:
                dgf dgfVar = (dgf) obj;
                Integer numB = dgfVar.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue2 = numB.intValue();
                long j = dgfVar.f;
                int i4 = kjf.c;
                return new tx3(((int) (j & 4294967295L)) - iIntValue2, 0);
            default:
                return new ce0(((Float) obj).floatValue());
        }
    }

    public /* synthetic */ yb(int i) {
        this.a = i;
    }
}
