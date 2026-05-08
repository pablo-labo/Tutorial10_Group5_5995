package defpackage;

import android.text.Spanned;
import androidx.compose.ui.layout.w;
import com.google.android.gms.internal.measurement.zzfw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oie implements rrg, w7b {
    public static final long e(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final qtc f(w.a aVar, int i, vrf vrfVar, mif mifVar, boolean z, int i2) {
        qtc qtcVarC = mifVar != null ? mifVar.c(vrfVar.b.c(i)) : qtc.e;
        float f = qtcVarC.a;
        int iX0 = aVar.x0(2.0f);
        return qtc.a(qtcVarC, z ? (i2 - f) - iX0 : f, z ? i2 - f : iX0 + f, 0.0f, 10);
    }

    public static final lb4 g(mge mgeVar, w62 w62Var, int i) {
        if (w62Var == null || lx4.f(w62Var)) {
            return null;
        }
        int size = w62Var.p().size() + i;
        if (w62Var.y()) {
            List<wxf> listSubList = mgeVar.K0().subList(i, size);
            aj3 aj3VarD = w62Var.d();
            return new lb4(w62Var, listSubList, g(mgeVar, aj3VarD instanceof w62 ? (w62) aj3VarD : null, size));
        }
        if (size != mgeVar.K0().size()) {
            yz3.o(w62Var);
        }
        return new lb4(w62Var, mgeVar.K0().subList(i, mgeVar.K0().size()), null);
    }

    public static final List h(w62 w62Var) {
        List<rxf> parameters;
        Object next;
        kwf kwfVarJ;
        List<rxf> listP = w62Var.p();
        listP.getClass();
        if (!w62Var.y() && !(w62Var.d() instanceof fv1)) {
            return listP;
        }
        int i = b04.a;
        zz3 zz3Var = zz3.b;
        List listW = a7e.W(new hh5(new cc5(new g8f(a7e.Q(v6e.O(w62Var, zz3Var), 1), pu1.d), true, qu1.d), ru1.d, z6e.a));
        Iterator it = a7e.Q(v6e.O(w62Var, zz3Var), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof t52) {
                break;
            }
        }
        t52 t52Var = (t52) next;
        if (t52Var != null && (kwfVarJ = t52Var.j()) != null) {
            parameters = kwfVarJ.getParameters();
        }
        if (parameters == null) {
            parameters = zr4.a;
        }
        if (listW.isEmpty() && parameters.isEmpty()) {
            List<rxf> listP2 = w62Var.p();
            listP2.getClass();
            return listP2;
        }
        ArrayList<rxf> arrayListH1 = z92.h1(listW, parameters);
        ArrayList arrayList = new ArrayList(t92.r0(arrayListH1, 10));
        for (rxf rxfVar : arrayListH1) {
            rxfVar.getClass();
            arrayList.add(new qx1(rxfVar, w62Var, listP.size()));
        }
        return z92.h1(listP, arrayList);
    }

    public static String i(String... strArr) {
        md2 md2Var = new md2(2);
        md2Var.b("appTrace");
        md2Var.c(strArr);
        ArrayList arrayList = (ArrayList) md2Var.a;
        return z92.W0(u63.a0(arrayList.toArray(new String[arrayList.size()])), "|", null, null, null, 62);
    }

    public static final long j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final boolean k(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean l(int i, int i2, x4d x4dVar) {
        return x4dVar == null ? ((float) ((int) (((float) i) * 1.3333334f))) >= 2048.0f && ((int) (((float) i2) * 1.3333334f)) >= 2048 : ((int) (((float) i) * 1.3333334f)) >= x4dVar.a && ((int) (((float) i2) * 1.3333334f)) >= x4dVar.b;
    }

    public static final boolean m(vs4 vs4Var, x4d x4dVar) {
        if (vs4Var == null) {
            return false;
        }
        vs4Var.b0();
        int i = vs4Var.c;
        if (i == 90 || i == 270) {
            vs4Var.b0();
            int i2 = vs4Var.f;
            vs4Var.b0();
            return l(i2, vs4Var.e, x4dVar);
        }
        vs4Var.b0();
        int i3 = vs4Var.e;
        vs4Var.b0();
        return l(i3, vs4Var.f, x4dVar);
    }

    public static void n(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzfw {
        if (!q(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !q(b3) && !q(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzfw.d();
    }

    public static void o(byte b, byte b2, byte b3, char[] cArr, int i) throws zzfw {
        if (q(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || q(b3)))) {
            throw zzfw.d();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void p(byte b, byte b2, char[] cArr, int i) throws zzfw {
        if (b < -62 || q(b2)) {
            throw zzfw.d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean q(byte b) {
        return b > -65;
    }

    @Override // defpackage.rrg
    public void a() {
    }

    @Override // defpackage.rrg
    public void b() {
    }

    @Override // defpackage.w7b
    public Object d(p7d p7dVar) {
        return ((fb6) p7dVar).b;
    }
}
