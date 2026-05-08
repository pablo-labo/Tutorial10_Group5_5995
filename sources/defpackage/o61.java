package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.rnprofile.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o61 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o61(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 0;
        int i3 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                svb svbVar = (svb) obj4;
                Function1 function1 = (Function1) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o97 o97Var = (o97) bVar.M(p97.a);
                    for (m61 m61Var : svbVar.v) {
                        String str = m61Var.d;
                        if (str == null || zve.U(str)) {
                            bVar.L(291236657);
                        } else {
                            bVar.L(293279619);
                            boolean zK = bVar.K(function1) | bVar.K(m61Var);
                            Object objV = bVar.v();
                            if (zK || objV == c0020a) {
                                objV = new q61(i2, function1, m61Var);
                                bVar.p(objV);
                            }
                            uub.a((gu5) objV, false, null, null, null, bh2.c(197582075, new tn0(i3, m61Var, o97Var), bVar), bVar, 196608, 30);
                        }
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                lj3.a((gu5) obj4, (mj3) obj3, (b) obj, ka2.L(1));
                break;
            case 2:
                o97 o97Var2 = (o97) obj4;
                String str2 = (String) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tjf tjfVar = o97Var2.j.f;
                    boolean zK2 = bVar2.K(str2);
                    Object objV2 = bVar2.v();
                    if (zK2 || objV2 == c0020a) {
                        objV2 = new d12(str2, 1);
                        bVar2.p(objV2);
                    }
                    fif.b(str2, f.a(g.f(b5e.b(e.a.b, false, (Function1) objV2), 1.0f), "HMB_Label_App_Version"), o97Var2.c.a.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar2, 0, 0, 65528);
                } else {
                    bVar2.D();
                }
                break;
            case 3:
                break;
            case 4:
                ((Integer) obj2).getClass();
                a.a((lr5) obj4, (e9a) obj3, (b) obj, ka2.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                mld.b((e8a) obj4, (pld) obj3, (b) obj, ka2.L(49));
                break;
            default:
                ((Integer) obj2).getClass();
                q9f.e(ka2.L(7), (gu5) obj3, (b) obj, (String) obj4);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ o61(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
