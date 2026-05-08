package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.z88;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh(o97 o97Var, ux8 ux8Var) {
        this.a = 10;
        this.b = ux8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                List list = (List) g4aVar.getValue();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!wl7.b((String) obj4, str)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = null;
                }
                g4aVar.setValue(arrayList);
                if (zBooleanValue) {
                    List list2 = (List) g4aVar.getValue();
                    g4aVar.setValue(list2 != null ? z92.g1(str, list2) : null);
                }
                return j6g.a;
            case 1:
                b0d b0dVar = (b0d) obj3;
                ((Integer) obj).getClass();
                if (obj2 instanceof wk2) {
                    wk2 wk2Var = (wk2) obj2;
                    a4a<wk2> a4aVarA = b0dVar.h;
                    if (a4aVarA == null) {
                        a4aVarA = nnd.a();
                        b0dVar.h = a4aVarA;
                    }
                    a4aVarA.k(wk2Var);
                    b0dVar.f.b(wk2Var);
                }
                if (obj2 instanceof l0d) {
                    b0dVar.e((l0d) obj2);
                }
                if (obj2 instanceof i) {
                    ((i) obj2).c();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                ((rh4) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 3:
                ut5 ut5Var = (ut5) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.animation.i.e(((Boolean) ((gme) ut5Var.N().b).getValue()).booleanValue(), null, ku4.d(null, 3), ku4.e(null, 3), null, bh2.c(-116312302, new pt5(ut5Var, z ? 1 : 0), bVar), bVar, 200064, 18);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                a86.c((aod) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 5:
                fv6 fv6Var = (fv6) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    du6.b(bh2.c(-1409387352, new n03(fv6Var, i2), bVar2), bVar2, 384);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 6:
                f3f f3fVar = (f3f) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = z88.m0;
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zK = bVar3.K(f3fVar);
                    Object objV = bVar3.v();
                    if (zK || objV == b.a.a) {
                        objV = new z88.a(f3fVar, null);
                        bVar3.p(objV);
                    }
                    to4.d(bVar3, f3fVar, (Function2) objV);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 7:
                ((Integer) obj2).getClass();
                int i4 = ura.l0;
                ((ura) obj3).O(ka2.L(1), (b) obj);
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                g5b.b((ModalWebview) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                s7b.d((t7b) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 10:
                ux8 ux8Var = (ux8) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e eVarF = f.f(g.f(e.a.b, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.j, bVar4, 6);
                    int iHashCode = Long.hashCode(bVar4.k());
                    t8b t8bVarM = bVar4.m();
                    e eVarC = c.c(bVar4, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA, gl2.a.g);
                    ygg.y(bVar4, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar4, iHashCode, c0251a);
                    }
                    ygg.y(bVar4, eVarC, gl2.a.d);
                    String str2 = ux8Var.b;
                    qxb.b(str2, str2, bVar4, 0);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                cyb.a((gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                VideoPlayer videoPlayer = (VideoPlayer) obj3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                videoPlayer.X.k0(zBooleanValue2 ? 0.0f : videoPlayer.e0);
                videoPlayer.s0(new a.f(zBooleanValue2, bool));
                return j6g.a;
        }
    }

    public /* synthetic */ kh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ kh(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
