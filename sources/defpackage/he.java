package defpackage;

import androidx.compose.animation.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.messaging.data.conversations.Mapper;
import defpackage.je;
import defpackage.jk8;
import defpackage.lx5;
import defpackage.ph8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class he implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ he(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 6;
        int i2 = 1;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new je.b();
            case 1:
                ((dd0) obj).getClass();
                return a.c(ku4.d(zd0.d(300, 0, null, 6), 2).b(new mv4(new gsf((k65) null, new bke(new gv4(new dc(i2)), zd0.d(300, 0, null, 6)), (t12) null, (vmd) null, (LinkedHashMap) null, 61))), ku4.e(zd0.d(UiRumDebugListener.DEFAULT_ALPHA, 0, null, 6), 2).b(new s25(new gsf((k65) null, new bke(new jv4(new hs(1)), zd0.d(UiRumDebugListener.DEFAULT_ALPHA, 0, null, 6)), (t12) null, (vmd) null, (LinkedHashMap) null, 61))));
            case 2:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                y98Var.c = true;
                return j6g.a;
            case 3:
                return j6g.a;
            case 4:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("url", d93.g());
                return j6g.a;
            case 5:
                return Boolean.TRUE;
            case 6:
                ((m74) obj).getClass();
                return new zc(i2);
            case 7:
                rx9 rx9Var = (rx9) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                rx9Var.getClass();
                HashMap<String, hg7<?>> map = rx9Var.c;
                int i3 = 8;
                kk2 kk2Var = new kk2(i3);
                iwc iwcVar = fwc.a;
                yd8 yd8VarB = iwcVar.b(yba.class);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.a;
                ue1 ue1Var = new ue1(lveVar, yd8VarB, null, kk2Var, uh8Var);
                vge vgeVar = new vge(ue1Var);
                rx9Var.a(vgeVar);
                yd8[] yd8VarArr = {iwcVar.b(yba.class), iwcVar.b(j2g.class)};
                List<? extends yd8<?>> list = ue1Var.f;
                ArrayList arrayList = new ArrayList(list.size() + 2);
                arrayList.addAll(list);
                w92.x0(arrayList, yd8VarArr);
                ue1Var.f = arrayList;
                for (int i4 = 0; i4 < 2; i4++) {
                    map.put(mh2.m(yd8VarArr[i4], ue1Var.c, ue1Var.a), vgeVar);
                }
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(c87.class), null, new ih2(i), uh8Var)));
                int i5 = 7;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(r0g.class), null, new vb2(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(z0g.class), null, new cj2(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(b1g.class), null, new us0(4), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(x0g.class), null, new rh2(i5, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(t0g.class), null, new ej2(i3, b), uh8Var)));
                int i6 = 9;
                ue1 ue1Var2 = new ue1(lveVar, iwcVar.b(d1g.class), null, new kk2(i6), uh8Var);
                vge vgeVar2 = new vge(ue1Var2);
                rx9Var.a(vgeVar2);
                yd8[] yd8VarArr2 = {iwcVar.b(d1g.class), iwcVar.b(c1g.class)};
                List<? extends yd8<?>> list2 = ue1Var2.f;
                ArrayList arrayList2 = new ArrayList(list2.size() + 2);
                arrayList2.addAll(list2);
                w92.x0(arrayList2, yd8VarArr2);
                ue1Var2.f = arrayList2;
                int i7 = 0;
                while (i7 < 2) {
                    map.put(mh2.m(yd8VarArr2[i7], ue1Var2.c, ue1Var2.a), vgeVar2);
                    i7++;
                    i2 = i2;
                }
                int i8 = i2;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(e1g.class), null, new fj2(8, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(v1g.class), null, new dm0(10, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(w1g.class), null, new fj2(7, (byte) 0), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(f2g.class), null, new cm0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(i1g.class), null, new dm0(i6, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(f1g.class), null, new em0(i5), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(e3g.class), null, new fm0(i6), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(y2g.class), null, new gm0(i5, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(k2g.class), null, new hm0(i3), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(o2g.class), null, new im0(i5, b), uh8Var)));
                int i9 = 5;
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(h2g.class), null, new vj2(i9), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(q2g.class), null, new fn0(i5, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(u2g.class), null, new mj2(i, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(fed.class), null, new kh2(i), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(s2g.class), null, new lh2(i3, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(n1g.class), null, new ey1(i, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(t1g.class), null, new so0(i5), uh8Var)));
                ue1 ue1Var3 = new ue1(lveVar, iwcVar.b(q1g.class), null, new ov(i5, b), uh8Var);
                vge vgeVar3 = new vge(ue1Var3);
                rx9Var.a(vgeVar3);
                yd8 yd8VarB2 = iwcVar.b(q1g.class);
                yd8 yd8VarB3 = iwcVar.b(p1g.class);
                yd8[] yd8VarArr3 = new yd8[2];
                yd8VarArr3[0] = yd8VarB2;
                yd8VarArr3[i8] = yd8VarB3;
                List<? extends yd8<?>> list3 = ue1Var3.f;
                ArrayList arrayList3 = new ArrayList(list3.size() + 2);
                arrayList3.addAll(list3);
                w92.x0(arrayList3, yd8VarArr3);
                ue1Var3.f = arrayList3;
                for (int i10 = 0; i10 < 2; i10++) {
                    map.put(mh2.m(yd8VarArr3[i10], ue1Var3.c, ue1Var3.a), vgeVar3);
                }
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(r1g.class), null, new bj2(i9, b), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(g3g.class), null, new c10(i6), uh8Var)));
                rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(a3g.class), null, new zh1(i3), uh8Var)));
                v40.l(new ue1(lveVar, iwcVar.b(c3g.class), null, new ph2(i6), uh8Var), rx9Var);
                return j6g.a;
            case 8:
                int iIntValue = ((Integer) obj).intValue();
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                Dispatcher dispatcher = (Dispatcher) epa.V.getValue();
                dispatcher.getClass();
                builderE.a = dispatcher;
                s97 s97Var = new s97(new bo0(16));
                ArrayList arrayList4 = builderE.c;
                arrayList4.add(s97Var);
                arrayList4.add(new yy0());
                arrayList4.add(new h77());
                arrayList4.add(new f87());
                arrayList4.add(new i77());
                builderE.a(epa.c());
                builderE.e(iIntValue, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case DatadogLogGenerator.CRASH /* 9 */:
                return Mapper.mapToConversationRecord$lambda$2((jk8.a) obj);
            case 10:
                y98 y98Var2 = (y98) obj;
                y98Var2.getClass();
                y98Var2.b = true;
                y98Var2.c = true;
                return j6g.a;
            case 11:
                ((mq7) obj).getClass();
                return j6g.a;
            case 12:
                ph8.b bVar2 = (ph8.b) obj;
                bVar2.a = 1332;
                bVar2.a(Float.valueOf(0.0f), 0).b = c3c.e;
                bVar2.a(Float.valueOf(290.0f), 666);
                return j6g.a;
            case 13:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj2 = list4.get(0);
                int i11 = da2.j;
                ko2 ko2Var = wld.a;
                Boolean bool = Boolean.FALSE;
                wl7.b(obj2, bool);
                da2 da2Var = obj2 != null ? wl7.b(obj2, Boolean.FALSE) ? new da2(da2.i) : new da2(pnb.d(((Integer) obj2).intValue())) : null;
                da2Var.getClass();
                long j = da2Var.a;
                Object obj3 = list4.get(1);
                xld xldVar = wld.r;
                wl7.b(obj3, bool);
                ooa ooaVar = obj3 != null ? (ooa) xldVar.b.invoke(obj3) : null;
                ooaVar.getClass();
                long j2 = ooaVar.a;
                Object obj4 = list4.get(2);
                Float f = obj4 != null ? (Float) obj4 : null;
                f.getClass();
                return new vbe(j, j2, f.floatValue());
            case 15:
                obj.getClass();
                return new bx8(((Integer) obj).intValue());
            case 16:
                return Float.valueOf(0.0f);
            default:
                return new j94(((ce0) obj).a);
        }
    }
}
