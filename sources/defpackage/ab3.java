package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.v94;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ab3 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ab3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                e13 e13Var = (e13) obj5;
                hw9 hw9Var = (hw9) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.W1;
                    boolean zX = bVar.x(e13Var) | bVar.x(hw9Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new s71(1, e13Var, hw9Var);
                        bVar.p(objV);
                    }
                    ev6.b(fv6Var, androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV, 15), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                ja4 ja4Var = (ja4) obj5;
                ymg ymgVar = (ymg) obj4;
                yeb yebVar = (yeb) obj;
                yeb yebVar2 = (yeb) obj2;
                ooa ooaVar = (ooa) obj3;
                ja4Var.m0 = 0L;
                if (ja4Var.g0.invoke(yebVar).booleanValue()) {
                    if (!ja4Var.l0) {
                        if (ja4Var.j0 == null) {
                            ja4Var.j0 = h22.a(Integer.MAX_VALUE, 6, null);
                        }
                        ja4Var.l0 = true;
                        u63.Y(ja4Var.Q1(), null, null, new ia4(ja4Var, null), 3);
                    }
                    beb.b(ymgVar, yebVar, 0L);
                    long jE = ooa.e(yebVar2.c, ooaVar.a);
                    go1 go1Var = ja4Var.j0;
                    if (go1Var != null) {
                        go1Var.f(new v94.c(jE));
                    }
                }
                break;
            case 2:
                gu5 gu5Var = (gu5) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objV2 = bVar2.v();
                    if (objV2 == c0020a) {
                        objV2 = new ri4(1, g4aVar);
                        bVar2.p(objV2);
                    }
                    r8g.a((Function1) objV2, (String) g4aVar.getValue(), gu5Var, bVar2, 54);
                } else {
                    bVar2.D();
                }
                break;
            default:
                String str = (String) obj5;
                o97 o97Var = (o97) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mwe.a(null, fv6.e7, null, z2b.a(R.drawable.ic_idl_plus_24, 0, bVar3), ak2.J(R.string.add_info, new Object[]{str}, bVar3), new da2(o97Var.c.a.c), bVar3, 48, 5);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
