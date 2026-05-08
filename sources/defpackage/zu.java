package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import com.indeed.android.jobsearch.R;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zu implements xu5 {
    public final /* synthetic */ g4a V;
    public final /* synthetic */ g4a W;
    public final /* synthetic */ g4a X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ g4a e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ zu(t41 t41Var, String str, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, g4a g4aVar5) {
        this.Y = t41Var;
        this.b = str;
        this.c = gu5Var;
        this.d = ibaVar;
        this.Z = hw9Var;
        this.e = g4aVar;
        this.f = g4aVar2;
        this.V = g4aVar3;
        this.W = g4aVar4;
        this.X = g4aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        Object luVar;
        g4a g4aVar;
        g4a g4aVar2;
        g4a g4aVar3;
        g4a g4aVar4;
        g4a g4aVar5;
        final g4a g4aVar6;
        final g4a g4aVar7;
        Object obj5;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj6 = this.Z;
        gu5 gu5Var = this.c;
        Object obj7 = this.Y;
        boolean z = false;
        switch (i) {
            case 0:
                final Function1 function1 = (Function1) obj7;
                b5g b5gVar = (b5g) obj6;
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                Object obj8 = objV;
                if (objV == c0020a) {
                    nf nfVar = new nf(1);
                    bVar.p(nfVar);
                    obj8 = nfVar;
                }
                to4.b(j6gVar, (Function1) obj8, bVar);
                float fB = i3c.b(u5b.e.c(), wh.f);
                boolean zK = bVar.K(gu5Var);
                Object objV2 = bVar.v();
                Object obj9 = objV2;
                if (zK || objV2 == c0020a) {
                    gd gdVar = new gd(1, gu5Var);
                    bVar.p(gdVar);
                    obj9 = gdVar;
                }
                gu5 gu5Var2 = (gu5) obj9;
                boolean zK2 = bVar.K(function1);
                Object objV3 = bVar.v();
                g4a g4aVar8 = this.e;
                g4a g4aVar9 = this.f;
                g4a g4aVar10 = this.V;
                g4a g4aVar11 = this.W;
                g4a g4aVar12 = this.X;
                if (zK2 || objV3 == c0020a) {
                    luVar = new lu(function1, g4aVar8, g4aVar9, g4aVar10, g4aVar11, g4aVar12);
                    g4aVar = g4aVar8;
                    g4aVar2 = g4aVar9;
                    g4aVar3 = g4aVar10;
                    g4aVar4 = g4aVar11;
                    g4aVar5 = g4aVar12;
                    bVar.p(luVar);
                } else {
                    luVar = objV3;
                    g4aVar2 = g4aVar9;
                    g4aVar3 = g4aVar10;
                    g4aVar4 = g4aVar11;
                    g4aVar5 = g4aVar12;
                    g4aVar = g4aVar8;
                }
                gu5 gu5Var3 = (gu5) luVar;
                iba ibaVar = this.d;
                boolean zX = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                Object obj10 = objV4;
                if (zX || objV4 == c0020a) {
                    id idVar = new id(ibaVar, 3);
                    bVar.p(idVar);
                    obj10 = idVar;
                }
                final g4a g4aVar13 = g4aVar3;
                sb1.a(this.b, gu5Var2, gu5Var3, R.string.done_button_label, null, 0, (gu5) obj10, Float.valueOf(fB), b5gVar, false, false, false, false, null, 0, bh2.c(847872361, new nu(z ? 1 : 0, b5gVar, g4aVar3), bVar), bVar, 0, 196608, 32304);
                if (b5gVar == b5g.c) {
                    bVar.L(-1583474599);
                    ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-add-patent", "error-toast", sp7.c.a.c, null, null, 24));
                    boolean zK3 = bVar.K(function1);
                    Object objV5 = bVar.v();
                    if (zK3 || objV5 == c0020a) {
                        final g4a g4aVar14 = g4aVar;
                        final g4a g4aVar15 = g4aVar2;
                        final g4a g4aVar16 = g4aVar4;
                        final g4a g4aVar17 = g4aVar5;
                        gu5 gu5Var4 = new gu5() { // from class: ou
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-patent", "refresh", null, null, 12));
                                String str = (String) g4aVar14.getValue();
                                String str2 = (String) g4aVar15.getValue();
                                function1.invoke(new n5b((tg3) g4aVar17.getValue(), (String) g4aVar13.getValue(), str, str2, (String) g4aVar16.getValue(), 1));
                                return j6g.a;
                            }
                        };
                        bVar.p(gu5Var4);
                        objV5 = gu5Var4;
                    }
                    rg0.a((gu5) objV5, bVar, 0);
                } else {
                    bVar.L(-1598679045);
                }
                bVar.F();
                return j6gVar;
            default:
                t41 t41Var = (t41) obj7;
                hw9 hw9Var = (hw9) obj6;
                d dVar = (d) obj2;
                b bVar2 = (b) obj3;
                ((Integer) obj4).getClass();
                ((bd0) obj).getClass();
                dVar.getClass();
                boolean zX2 = bVar2.x(t41Var);
                Object objV6 = bVar2.v();
                Object obj11 = objV6;
                if (zX2 || objV6 == c0020a) {
                    ty tyVar = new ty(t41Var, 1);
                    bVar2.p(tyVar);
                    obj11 = tyVar;
                }
                iwc iwcVar = fwc.a;
                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) obj11), dVar.getDefaultViewModelCreationExtras(), bVar2);
                Object objV7 = bVar2.v();
                final g4a g4aVar18 = this.e;
                Object obj12 = objV7;
                if (objV7 == c0020a) {
                    g4a g4aVarF = r.f(Boolean.valueOf(((String) g4aVar18.getValue()).length() == 0));
                    bVar2.p(g4aVarF);
                    obj12 = g4aVarF;
                }
                g4a g4aVar19 = (g4a) obj12;
                String strI = ak2.I(R.string.preferred_job_title, bVar2);
                String str = (String) g4aVar18.getValue();
                List list = (List) ((gme) f51Var.c0).getValue();
                String strI2 = ak2.I(R.string.desc_clear_text_input, bVar2);
                boolean zX3 = bVar2.x(f51Var);
                Object objV8 = bVar2.v();
                Object obj13 = objV8;
                if (zX3 || objV8 == c0020a) {
                    qi4 qi4Var = new qi4(f51Var, 1);
                    bVar2.p(qi4Var);
                    obj13 = qi4Var;
                }
                Function1 function12 = (Function1) obj13;
                boolean zK4 = bVar2.K(gu5Var);
                Object objV9 = bVar2.v();
                Object obj14 = objV9;
                if (zK4 || objV9 == c0020a) {
                    js jsVar = new js(4, gu5Var);
                    bVar2.p(jsVar);
                    obj14 = jsVar;
                }
                gu5 gu5Var5 = (gu5) obj14;
                final iba ibaVar2 = this.d;
                boolean zX4 = bVar2.x(ibaVar2);
                Object objV10 = bVar2.v();
                final g4a g4aVar20 = this.W;
                g4a g4aVar21 = this.X;
                if (zX4 || objV10 == c0020a) {
                    g4aVar6 = g4aVar21;
                    g4aVar7 = g4aVar19;
                    final g4a g4aVar22 = this.f;
                    final g4a g4aVar23 = this.V;
                    Function1 function13 = new Function1() { // from class: i78
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            g4a g4aVar24;
                            String str2 = (String) obj15;
                            str2.getClass();
                            g4a g4aVar25 = g4aVar22;
                            List list2 = (List) g4aVar25.getValue();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list2.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                g4aVar24 = g4aVar18;
                                if (!zHasNext) {
                                    break;
                                }
                                Object next = it.next();
                                String str3 = (String) next;
                                if (!wl7.b(str3, (String) g4aVar24.getValue()) && !wl7.b(str3, str2)) {
                                    arrayList.add(next);
                                }
                            }
                            g4aVar25.setValue(z92.g1(str2, arrayList));
                            g4aVar24.setValue("");
                            if (!((List) g4aVar25.getValue()).isEmpty()) {
                                g4aVar23.setValue(Boolean.TRUE);
                            }
                            if (((Boolean) g4aVar7.getValue()).booleanValue()) {
                                g4aVar20.setValue(Boolean.TRUE);
                            } else {
                                g4aVar6.setValue(str2);
                            }
                            ibaVar2.p("DESIRED_JOB_TITLES");
                            return j6g.a;
                        }
                    };
                    bVar2.p(function13);
                    obj5 = function13;
                } else {
                    g4aVar6 = g4aVar21;
                    g4aVar7 = g4aVar19;
                    obj5 = objV10;
                }
                Function1 function14 = (Function1) obj5;
                boolean zX5 = bVar2.x(ibaVar2);
                Object objV11 = bVar2.v();
                Object obj15 = objV11;
                if (zX5 || objV11 == c0020a) {
                    final g4a g4aVar24 = g4aVar7;
                    final g4a g4aVar25 = g4aVar6;
                    gu5 gu5Var6 = new gu5() { // from class: j78
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.gu5
                        public final Object invoke() {
                            if (((Boolean) g4aVar24.getValue()).booleanValue()) {
                                g4aVar20.setValue(Boolean.TRUE);
                            } else {
                                g4aVar25.setValue((String) g4aVar18.getValue());
                            }
                            ibaVar2.r();
                            return j6g.a;
                        }
                    };
                    bVar2.p(gu5Var6);
                    obj15 = gu5Var6;
                }
                e51.b(this.b, strI, null, strI2, true, false, str, list, function12, gu5Var5, function14, (gu5) obj15, null, null, null, hw9Var, 0, null, null, false, false, bVar2, 221184, 262528, 2056196);
                return j6g.a;
        }
    }

    public /* synthetic */ zu(gu5 gu5Var, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, g4a g4aVar5, iba ibaVar, b5g b5gVar, String str, Function1 function1) {
        this.b = str;
        this.c = gu5Var;
        this.Y = function1;
        this.d = ibaVar;
        this.Z = b5gVar;
        this.e = g4aVar;
        this.f = g4aVar2;
        this.V = g4aVar3;
        this.W = g4aVar4;
        this.X = g4aVar5;
    }
}
