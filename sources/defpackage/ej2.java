package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import defpackage.lb3;
import defpackage.lh0;
import defpackage.rx8;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ej2 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fif.b(ak2.I(R.string.ccl_search_placeholder_text, bVar), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 131070);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f17.a(z2b.a(R.drawable.ic_profile_resume_migration, 0, bVar2), null, null, null, null, 0.0f, null, bVar2, 48, 124);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nof.d("TARE SDK Debug", bVar3, 6);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new hub();
            case 4:
                return Integer.valueOf(DynamicFromMap.asInt$lambda$3((ReadableMap) obj, (String) obj2));
            case 5:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new hn0();
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new r9a();
            case 7:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                epa epaVar = epa.a;
                OkHttpClient okHttpClient = (OkHttpClient) epa.Z.getValue();
                String strA = d93.a();
                String strP = r03.p(d93.f());
                okHttpClient.getClass();
                String strConcat = "https://apis.indeed.com/".concat(((ep7) cr8.p(ep7.class)).a() == rp7.b ? "graphql/e2eqa" : "graphql");
                aqe aqeVar = new aqe();
                lh0.a aVar = new lh0.a();
                d2f d2fVar = hpa.a;
                aVar.m = new dd8(okHttpClient);
                aVar.n = new vr3(okHttpClient);
                aVar.l = strConcat;
                aVar.b("indeed-co", strA);
                aVar.b("indeed-locale", strP);
                aVar.b("indeed-api-key", "87a0749e1d2ea18f2cfe899d32d63a9a5d417e571991de20daaa66fb7bee8ad6");
                fl3 fl3Var = new fl3(aqeVar, cr8.f, b95.a);
                ArrayList<ph0> arrayListD = aVar.d();
                if (!arrayListD.isEmpty()) {
                    for (ph0 ph0Var : arrayListD) {
                    }
                }
                ArrayList arrayListD2 = aVar.d();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListD2) {
                    if (obj3 instanceof uh0) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList2 = aVar.b;
                    if (!zHasNext) {
                        lh0.a.c(aVar, new cug(fl3Var));
                        lh0.a.c(aVar, k85.a);
                        lh0.a.c(aVar, new ih0(fl3Var));
                        aVar.a(new f5h());
                        aVar.j = aVar.j.d(new gt1());
                        aVar.a(new e84());
                        mb3 mb3Var = og3.a;
                        eg3 eg3Var = eg3.b;
                        mb3Var.getClass();
                        lb3.a aVar2 = aVar.a;
                        aVar2.getClass();
                        aVar2.a.put(mb3Var.d, eg3Var);
                        mb3 mb3Var2 = nmf.a;
                        xp xpVar = xp.c;
                        mb3Var2.getClass();
                        aVar2.getClass();
                        aVar2.a.put(mb3Var2.d, xpVar);
                        lh0.a aVar3 = new lh0.a();
                        lb3 lb3VarA = aVar2.a();
                        lb3.a aVar4 = aVar3.a;
                        aVar4.a.clear();
                        aVar4.a.putAll(lb3VarA.e);
                        aVar3.b.addAll(arrayList2);
                        aVar3.c.addAll(aVar.c);
                        aVar3.d.addAll(aVar.d);
                        aVar3.e.addAll(aVar.e);
                        k15 k15Var = aVar.j;
                        k15Var.getClass();
                        aVar3.j = k15Var;
                        aVar3.k = aVar.k;
                        aVar3.l = aVar.l;
                        aVar3.m = aVar.m;
                        ArrayList arrayList3 = aVar.g;
                        arrayList3.getClass();
                        ArrayList arrayList4 = aVar3.f;
                        arrayList4.clear();
                        arrayList4.addAll(arrayList3);
                        aVar3.n = aVar.n;
                        ArrayList arrayList5 = aVar.i;
                        arrayList5.getClass();
                        ArrayList arrayList6 = aVar3.h;
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                        aVar3.o = aVar.o;
                        return new lh0(aVar3);
                    }
                    uh0 uh0Var = (uh0) it.next();
                    uh0Var.getClass();
                    arrayList2.remove(uh0Var);
                }
                break;
            case 8:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new u0g();
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new dca((gsa) qpdVar2.a(null, fwc.a.b(gsa.class), null));
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new j7d(0);
            case 12:
                ((Integer) obj2).getClass();
                shb.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                rx8.b bVar4 = (rx8.b) obj2;
                return u63.k(bVar4.a, wld.a(bVar4.b, wld.i, (vld) obj));
            case 15:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new tjd((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new c16((f88) qpdVar4.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ ej2(int i, byte b) {
        this.a = i;
    }
}
