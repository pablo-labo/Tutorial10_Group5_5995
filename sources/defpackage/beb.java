package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class beb {
    public static final void a(final String str, final String str2, final gu5 gu5Var, final gu5 gu5Var2, final List list, final fv6 fv6Var, b bVar, final int i) {
        int i2;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        fv6Var.getClass();
        c cVarH = bVar.h(1108822780);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(R.drawable.ic_idl_open_door_24) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= cVarH.x(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.d(fv6Var.ordinal()) ? 1048576 : 524288;
        }
        int i3 = 1;
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            Integer numValueOf = Integer.valueOf(R.drawable.ic_idl_open_door_24);
            List list2 = list;
            boolean z = list2 == null || list2.isEmpty();
            int i4 = i2 >> 6;
            mv.c(str2, gu5Var, numValueOf, !z, fv6Var, bh2.c(-552613159, new i1c(i3, gu5Var2, str, list), cVarH), cVarH, (i2 & 896) | 196608 | ((i2 >> 3) & 14) | (i4 & 112) | (57344 & i4), 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: k1h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    beb.a(str, str2, gu5Var, gu5Var2, list, fv6Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ymg ymgVar, yeb yebVar, long j) {
        xmg xmgVar = ymgVar.b;
        xmg xmgVar2 = ymgVar.a;
        boolean zG = mh2.g(yebVar);
        long j2 = yebVar.b;
        if (zG) {
            se3[] se3VarArr = xmgVar2.d;
            pyd.q(null, 0, se3VarArr, se3VarArr.length);
            xmgVar2.e = 0;
            se3[] se3VarArr2 = xmgVar.d;
            pyd.q(null, 0, se3VarArr2, se3VarArr2.length);
            xmgVar.e = 0;
            ymgVar.c = 0L;
        }
        if (!mh2.i(yebVar)) {
            List list = yebVar.k;
            if (list == null) {
                list = zr4.a;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                oi6 oi6Var = (oi6) list.get(i);
                long j3 = oi6Var.a;
                long jF = ooa.f(oi6Var.c, j);
                xmgVar2.a(j3, Float.intBitsToFloat((int) (jF >> 32)));
                xmgVar.a(j3, Float.intBitsToFloat((int) (jF & 4294967295L)));
                i++;
            }
            long jF2 = ooa.f(yebVar.l, j);
            xmgVar2.a(j2, Float.intBitsToFloat((int) (jF2 >> 32)));
            xmgVar.a(j2, Float.intBitsToFloat((int) (jF2 & 4294967295L)));
        }
        if (mh2.i(yebVar) && j2 - ymgVar.c > 40) {
            se3[] se3VarArr3 = xmgVar2.d;
            pyd.q(null, 0, se3VarArr3, se3VarArr3.length);
            xmgVar2.e = 0;
            se3[] se3VarArr4 = xmgVar.d;
            pyd.q(null, 0, se3VarArr4, se3VarArr4.length);
            xmgVar.e = 0;
            ymgVar.c = 0L;
        }
        ymgVar.c = j2;
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        l5.q(str);
    }

    public static void d(Object obj) {
        e(obj, "Argument must not be null");
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ja.k(str);
    }

    public static final void f(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            h5.k(i != i2 ? w40.e("Both size ", i, " and step ", i2, " must be greater than zero.") : bg.d(i, "size ", " must be greater than zero."));
        }
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ui8 j(ui8 ui8Var) {
        ui8Var.getClass();
        if (ui8Var instanceof oyf) {
            return ((oyf) ui8Var).K();
        }
        return null;
    }

    public static final p7g k(p7g p7gVar, ui8 ui8Var) {
        p7gVar.getClass();
        ui8Var.getClass();
        return n(p7gVar, j(ui8Var));
    }

    public static final void l(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ae7.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fH = h(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fH);
                }
            }
            float fSqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : h(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fH2 = h(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fH2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fH2 / fArr11[i14];
        }
    }

    public static final Pair m(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final p7g n(p7g p7gVar, ui8 ui8Var) {
        p7gVar.getClass();
        if (p7gVar instanceof oyf) {
            return n(((oyf) p7gVar).G0(), ui8Var);
        }
        if (ui8Var == null || ui8Var.equals(p7gVar)) {
            return p7gVar;
        }
        if (p7gVar instanceof mge) {
            return new qge((mge) p7gVar, ui8Var);
        }
        if (p7gVar instanceof jh5) {
            return new mh5((jh5) p7gVar, ui8Var);
        }
        l.g();
        return null;
    }

    public static long o(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static void p(int i, int i2) {
        String strK;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strK = yid.k("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    l5.q(p6.c(i2, "negative size: "));
                    return;
                }
                strK = yid.k("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void q(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? r(i, i3, "start index") : (i2 < 0 || i2 > i3) ? r(i2, i3, "end index") : yid.k("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String r(int i, int i2, String str) {
        if (i < 0) {
            return yid.k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yid.k("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        l5.q(p6.c(i2, "negative size: "));
        return null;
    }

    public static int s(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public wxf g(rxf rxfVar, lw7 lw7Var, vxf vxfVar, ui8 ui8Var) {
        lw7Var.getClass();
        vxfVar.getClass();
        boolean z = lw7Var instanceof lw7;
        ylg ylgVar = ylg.OUT_VARIANCE;
        if (!z) {
            lw7Var.getClass();
            vxfVar.getClass();
            return new yxf(ui8Var, ylgVar);
        }
        if (!lw7Var.d) {
            lw7Var = lw7.a(lw7Var, ow7.a, false, null, null, 61);
        }
        int iOrdinal = lw7Var.c.ordinal();
        ylg ylgVar2 = ylg.INVARIANT;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new yxf(ui8Var, ylgVar2);
            }
            l.g();
            return null;
        }
        if (!rxfVar.z().a()) {
            return new yxf(b04.e(rxfVar).o(), ylgVar2);
        }
        List<rxf> parameters = ui8Var.M0().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new yxf(ui8Var, ylgVar) : kyf.k(rxfVar, lw7Var);
    }

    public View i(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (viewGroup instanceof tpc) {
            View childAt = viewGroup.getChildAt(((tpc) viewGroup).getZIndexMappedChildIndex(i));
            childAt.getClass();
            return childAt;
        }
        View childAt2 = viewGroup.getChildAt(i);
        childAt2.getClass();
        return childAt2;
    }
}
