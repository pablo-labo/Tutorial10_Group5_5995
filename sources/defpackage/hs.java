package defpackage;

import android.os.Bundle;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.cz2;
import defpackage.ei4;
import defpackage.le0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hs implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hs(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rif rifVarB;
        foe foeVar;
        byte b = 0;
        switch (this.a) {
            case 0:
                ((m74) obj).getClass();
                return new ws();
            case 1:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 2:
                iw4 iw4Var = (iw4) obj;
                iw4Var.getClass();
                return iw4Var.a;
            case 3:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj;
                savedJobsDto.getClass();
                Long l = h4.j(savedJobsDto).b;
                return Long.valueOf(l != null ? l.longValue() : 0L);
            case 4:
                ((fo7) obj).getClass();
                return j6g.a;
            case 5:
                cz2.a aVar = (cz2.a) obj;
                aVar.getClass();
                return aVar.a;
            case 6:
                Exception exc = (Exception) obj;
                exc.getClass();
                throw exc;
            case 7:
                ((m74) obj).getClass();
                return new ei4.c();
            case 8:
                synchronized (ame.c) {
                    List<? extends Function1<Object, j6g>> list = ame.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(obj);
                    }
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                IanInitialState ianInitialState = (IanInitialState) obj;
                ro7 ro7Var = new ro7();
                Bundle bundle = new Bundle();
                if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.b0) {
                    bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                }
                ro7Var.setArguments(bundle);
                return ro7Var;
            case 10:
                rx9 rx9Var = (rx9) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                rx9Var.getClass();
                fj2 fj2Var = new fj2(9, (byte) 0);
                lve lveVar = zpd.c;
                uh8 uh8Var = uh8.b;
                iwc iwcVar = fwc.a;
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(zee.class), null, fj2Var, uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(m99.class), null, new cm0(8), uh8Var)));
                rx9Var.a(new e65(new ue1(lveVar, iwcVar.b(fj6.class), null, new dm0(11, b == true ? 1 : 0), uh8Var)));
                return j6g.a;
            case 11:
                ((Integer) obj).getClass();
                go8 go8Var = uo8.a;
                return zr4.a;
            case 12:
                ((DisplayToastData) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.h("PassportSignInWebViewFragment", "onDisplayToast called unexpectedly", null, 12);
                return j6g.a;
            case 13:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((dd0) obj).getClass();
                return lv4.a;
            case 15:
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                ls8.d(ls8Var, 15, null, gk2.b, 6);
                return j6g.a;
            case 16:
                le0.c cVar = (le0.c) obj;
                T t = cVar.a;
                if (!(t instanceof rx8) || (rifVarB = ((rx8) t).b()) == null || (rifVarB.a == null && rifVarB.b == null && rifVarB.c == null && rifVarB.d == null)) {
                    return u63.k(cVar);
                }
                T t2 = cVar.a;
                t2.getClass();
                rif rifVarB2 = ((rx8) t2).b();
                if (rifVarB2 == null || (foeVar = rifVarB2.a) == null) {
                    foeVar = new foe(0L, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65535);
                }
                return u63.k(cVar, new le0.c(foeVar, cVar.b, cVar.c));
            case 17:
                return Integer.valueOf(-((Integer) obj).intValue());
            default:
                kie kieVar = (kie) obj;
                return new de0(Float.intBitsToFloat((int) (kieVar.a >> 32)), Float.intBitsToFloat((int) (kieVar.a & 4294967295L)));
        }
    }
}
