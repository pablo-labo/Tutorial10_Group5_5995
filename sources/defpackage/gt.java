package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vw6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt(g4a g4aVar, g4a g4aVar2) {
        this.a = 1;
        this.b = g4aVar;
        this.c = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vw6 bVar;
        Object next;
        int i = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    String strI = ak2.I(R.string.state, bVar2);
                    if (zve.U((String) g4aVar.getValue())) {
                        bVar2.L(1561565787);
                        bVar = new vw6.a(ak2.I(R.string.state, bVar2));
                        bVar2.F();
                    } else {
                        bVar2.L(1561695956);
                        bVar2.F();
                        bVar = new vw6.b((String) g4aVar.getValue());
                    }
                    vw6 vw6Var = bVar;
                    boolean zX = bVar2.x(ibaVar);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new ac(ibaVar, 3);
                        bVar2.p(objV);
                    }
                    yw6.a(vw6Var, (gu5) objV, null, strI, null, false, null, bVar2, 100663302, 0, 1768);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                ((g4a) obj3).setValue((String) obj);
                ((g4a) obj4).setValue((String) obj2);
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                vk7.b((e8a) obj4, (mk7) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                e8a e8aVar = (e8a) obj4;
                Map map = (Map) obj3;
                b bVar3 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vk7.d(e8aVar, v7a.c(map, j7f.d, bVar3), bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                dyb dybVar = (dyb) obj4;
                faa faaVar = (faa) obj3;
                b bVar4 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iOrdinal = dybVar.ordinal();
                    if (iOrdinal == 0) {
                        bVar4.L(2056030650);
                        faaVar.d(0, bVar4);
                        bVar4.F();
                    } else if (iOrdinal == 1) {
                        bVar4.L(2056032862);
                        faaVar.c(0, bVar4);
                        bVar4.F();
                    } else {
                        if (iOrdinal != 2) {
                            bVar4.L(2056028851);
                            bVar4.F();
                            l.g();
                            return null;
                        }
                        bVar4.L(2056035033);
                        faaVar.e(0, bVar4);
                        bVar4.F();
                    }
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                kub.c((cub) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 6:
                return RNTareBridge.createResumeFormOnCompletionPromise$lambda$151((Promise) obj4, (RNTareBridge) obj3, obj, obj2);
            case 7:
                ((Integer) obj2).getClass();
                ile.a((ah2) obj4, (Function2) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                g4a g4aVar2 = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                Iterator<T> it = ((vsb) obj4).g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((sjb) next).a.equals(str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                sjb sjbVar = (sjb) next;
                List list = (List) g4aVar2.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (!((sjb) obj5).a.equals(sjbVar != null ? sjbVar.a : null)) {
                        arrayList.add(obj5);
                    }
                }
                g4aVar2.setValue(arrayList);
                if (zBooleanValue && sjbVar != null) {
                    g4aVar2.setValue(z92.g1(sjbVar, (List) g4aVar2.getValue()));
                }
                return j6g.a;
        }
    }

    public /* synthetic */ gt(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ gt(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
