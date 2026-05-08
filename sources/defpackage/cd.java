package defpackage;

import android.os.Bundle;
import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.jobsearch.launch.LaunchFragment;
import com.indeed.android.jobsearch.locationselector.LocationSelectorFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.a5a;
import defpackage.cyd;
import defpackage.lx5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd(a5a a5aVar, a5a.a aVar) {
        this.a = 11;
        this.b = a5aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        boolean z = false;
        i = 0;
        int i3 = 0;
        z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fd fdVar = (fd) obj2;
                m61 m61Var = (m61) obj;
                m61Var.getClass();
                Bundle arguments = fdVar.getArguments();
                if (arguments != null && arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) {
                    z = arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
                }
                if (z) {
                    pr7 pr7VarP = jsb.p(m61Var);
                    fdVar.close();
                    Function2<? super ps7, ? super pr7, j6g> function2 = fdVar.j0;
                    if (function2 != null) {
                        function2.invoke(ps7.a, pr7VarP);
                    }
                } else {
                    yvb yvbVarQ = fdVar.Q();
                    za zaVar = new za(i2, fdVar, m61Var);
                    String str = yvbVarQ.v().a;
                    if (str != null) {
                        u63.Y(ee3.p(yvbVarQ), null, null, new vvb(yvbVarQ, str, m61Var, yvb.A(m61Var.b), zaVar, null), 3);
                    }
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((f51) obj2).p(str2);
                break;
            case 2:
                break;
            case 3:
                x1c x1cVar = (x1c) obj2;
                yz7 yz7VarA = yz7.a(x1cVar.m(), null, null, null, null, null, null, null, null, null, null, null, (String) obj, null, null, 14335);
                g4a g4aVar = x1cVar.X;
                ((gme) g4aVar).setValue(yz7VarA);
                Set<er2> set = x1cVar.m().n;
                er2 er2Var = er2.PostalCode;
                if (set.contains(er2Var)) {
                    Set setD1 = z92.D1(x1cVar.m().n);
                    setD1.remove(er2Var);
                    ((gme) g4aVar).setValue(yz7.a(x1cVar.m(), null, null, null, null, null, null, null, null, null, null, null, null, null, z92.E1(setD1), 8191));
                }
                break;
            case 4:
                ((WebSocket) obj2).e(1001, null);
                break;
            case 5:
                cj4 cj4Var = (cj4) obj2;
                String str3 = (String) obj;
                str3.getClass();
                cj4Var.R().x(str3);
                cj4Var.Q(ps7.c, null);
                break;
            case 6:
                ((GhostwriterDebugFragment) obj2).e.setValue((List) obj);
                break;
            case 7:
                LaunchFragment launchFragment = (LaunchFragment) obj2;
                if (((j6g) ((jz2) obj).a()) != null) {
                    ((m99) launchFragment.V.getValue()).d0 = true;
                }
                break;
            case 8:
                LocationSelectorFragment locationSelectorFragment = (LocationSelectorFragment) obj2;
                lx5.b bVar = (lx5.b) obj;
                qf8<Object>[] qf8VarArr = LocationSelectorFragment.f;
                bVar.getClass();
                bVar.a("changeFromLocale", d93.f().toString());
                bVar.a("stayCountry", locationSelectorFragment.E().a);
                bVar.a("proposedCountry", locationSelectorFragment.E().b);
                bVar.a("deviceLocale", String.valueOf(b23.c));
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                b bVar2 = (b) obj2;
                String str4 = (String) obj;
                str4.getClass();
                break;
            case 10:
                final nf9 nf9Var = (nf9) obj2;
                final int iIntValue = ((Integer) obj).intValue();
                aub aubVarQ = nf9Var.Q();
                u63.Y(ee3.p(aubVarQ), null, null, new ptb(aubVarQ, iIntValue, new gu5() { // from class: mf9
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        as7 as7Var = new as7(Integer.valueOf(iIntValue));
                        nf9 nf9Var2 = nf9Var;
                        nf9Var2.close();
                        Function2<? super hs7, ? super as7, j6g> function22 = nf9Var2.h0;
                        if (function22 != null) {
                            function22.invoke(hs7.a, as7Var);
                        }
                        return j6g.a;
                    }
                }, null), 3);
                break;
            case 11:
                ((a5a) obj2).p(null);
                break;
            case 12:
                wf7 wf7Var = (wf7) obj;
                wf7Var.getClass();
                wf7Var.a.b((gza) obj2, "paddingValues");
                break;
            case 13:
                l8c l8cVar = (l8c) obj2;
                String str5 = (String) obj;
                int i4 = l8c.r0;
                str5.getClass();
                d8c d8cVar = (d8c) l8cVar.k0.getValue();
                s8c s8cVar = l8cVar.m0;
                d8cVar.a(s8cVar, l8cVar.Q());
                p8c p8cVar = (p8c) l8cVar.j0.getValue();
                String string = s8cVar.toString();
                boolean zQ = l8cVar.Q();
                p8cVar.getClass();
                p8c.c(string, str5, zQ);
                l8cVar.D();
                l8cVar.P(false);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                String localizedMessage = ((p81) obj2).getCause().getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                y3bVar.b("error_message", localizedMessage);
                break;
            case 15:
                cyd cydVar = (cyd) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = jLongValue - cydVar.l;
                cydVar.l = jLongValue;
                long jC = gf9.c(j / ((double) cydVar.p));
                p3a<cyd.a> p3aVar = cydVar.m;
                if (p3aVar.e()) {
                    Object[] objArr = p3aVar.a;
                    int i5 = p3aVar.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        cyd.a aVar = (cyd.a) objArr[i6];
                        cyd.l(aVar, jC);
                        aVar.c = true;
                    }
                    csf<S> csfVar = cydVar.e;
                    if (csfVar != 0) {
                        csfVar.p();
                    }
                    int i7 = p3aVar.b;
                    Object[] objArr2 = p3aVar.a;
                    oh7 oh7VarH = nic.H(0, i7);
                    int i8 = oh7VarH.a;
                    int i9 = oh7VarH.b;
                    if (i8 <= i9) {
                        while (true) {
                            objArr2[i8 - i3] = objArr2[i8];
                            if (((cyd.a) objArr2[i8]).c) {
                                i3++;
                            }
                            if (i8 != i9) {
                                i8++;
                            }
                        }
                    }
                    pyd.q(null, i7 - i3, objArr2, i7);
                    p3aVar.b -= i3;
                }
                cyd.a aVar2 = cydVar.n;
                if (aVar2 != null) {
                    aVar2.g = cydVar.f;
                    cyd.l(aVar2, jC);
                    cydVar.o(aVar2.d);
                    if (aVar2.d == 1.0f) {
                        cydVar.n = null;
                    }
                    cydVar.n();
                }
                break;
            case 16:
                ArrayList arrayList = (ArrayList) obj2;
                w.a aVar3 = (w.a) obj;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    aVar3.r((w) arrayList.get(i10), 0, 0, 0.0f);
                }
                break;
            default:
                ((w.a) obj).r((w) obj2, 0, 0, 0.0f);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ cd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
