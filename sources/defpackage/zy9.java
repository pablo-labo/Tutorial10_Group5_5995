package defpackage;

import androidx.compose.animation.i;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zy9 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zy9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj6;
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar, 48);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ehdVarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    long j = o97Var.c.a.b;
                    oy9 oy9Var = (oy9) g4aVar.getValue();
                    oy9 oy9Var2 = oy9.b;
                    if (oy9Var == oy9Var2) {
                        j = o97Var.c.a.c;
                    }
                    long j2 = j;
                    Integer num = (Integer) g4aVar2.getValue();
                    String string = num != null ? num.toString() : null;
                    if (string == null) {
                        string = l.e(bVar, -2130484948, R.string.placeholder_year, bVar);
                    } else {
                        bVar.L(-2130487180);
                        bVar.F();
                    }
                    String str = string;
                    tjf tjfVar = o97Var.j.f;
                    long j3 = o97Var.e.g;
                    oy9 oy9Var3 = (oy9) g4aVar.getValue();
                    o97.c cVar = o97Var.f;
                    cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(tjfVar, j2, j3, oy9Var3 == oy9Var2 ? cVar.c : cVar.a, null, null, 0L, 0, 0L, null, null, 0, 16777208), bVar, 0, 0, 65534);
                    i.d(ghd.a, ((oy9) g4aVar.getValue()) == oy9Var2, null, null, null, null, rj2.b, bVar, 1572870, 30);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                final g gVar = (g) obj6;
                final wu5 wu5Var = (wu5) obj5;
                final svb svbVar = (svb) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q1c.d(bh2.c(-1801612766, new j1c(gVar, wu5Var, 1), bVar2), bVar2, 6);
                    q1c.d(bh2.c(-352437287, new wu5() { // from class: p1c
                        @Override // defpackage.wu5
                        public final Object q(Object obj7, Object obj8, Object obj9) {
                            b bVar3 = (b) obj8;
                            int iIntValue3 = ((Integer) obj9).intValue();
                            ((pb2) obj7).getClass();
                            if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                g gVar2 = gVar;
                                boolean zX = bVar3.x(gVar2);
                                wu5 wu5Var2 = wu5Var;
                                boolean zK = zX | bVar3.K(wu5Var2);
                                svb svbVar2 = svbVar;
                                boolean zX2 = zK | bVar3.x(svbVar2);
                                Object objV = bVar3.v();
                                if (zX2 || objV == b.a.a) {
                                    objV = new bzb(1, wu5Var2, svbVar2, gVar2);
                                    bVar3.p(objV);
                                }
                                q1c.c(48, (gu5) objV, bVar3, "Edit Link", true);
                            } else {
                                bVar3.D();
                            }
                            return j6g.a;
                        }
                    }, bVar2), bVar2, 6);
                    q1c.d(bh2.c(710751322, new e0c(gVar, wu5Var, 2), bVar2), bVar2, 6);
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
