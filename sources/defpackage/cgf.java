package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cgf implements ag9 {
    public final float a;
    public final gza b;

    public cgf(float f, gza gzaVar) {
        this.a = f;
        this.b = gzaVar;
    }

    public static int d(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (wl7.b(nff.c((pl7) obj5), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (wl7.b(nff.c((pl7) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pl7 pl7Var = (pl7) obj2;
                int iIntValue2 = pl7Var != null ? ((Number) function2.invoke(pl7Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (wl7.b(nff.c((pl7) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pl7 pl7Var2 = (pl7) obj3;
                int iIntValue3 = pl7Var2 != null ? ((Number) function2.invoke(pl7Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (wl7.b(nff.c((pl7) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                pl7 pl7Var3 = (pl7) obj4;
                int iIntValue4 = pl7Var3 != null ? ((Number) function2.invoke(pl7Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (wl7.b(nff.c((pl7) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                pl7 pl7Var4 = (pl7) obj;
                return mq2.g(Math.max(iIntValue, Math.max(iIntValue2, pl7Var4 != null ? ((Number) function2.invoke(pl7Var4, Integer.valueOf(i))).intValue() : 0)) + iIntValue4 + iIntValue3, mq2.b(0, 0, 15));
            }
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return 0;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(list, i, new jm0(16));
    }

    public final int b(ql7 ql7Var, List<? extends pl7> list, int i, Function2<? super pl7, ? super Integer, Integer> function2) {
        pl7 pl7Var;
        pl7 pl7Var2;
        int i2;
        int iIntValue;
        pl7 pl7Var3;
        int iIntValue2;
        pl7 pl7Var4;
        List<? extends pl7> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            pl7Var = null;
            if (i3 >= size) {
                pl7Var2 = null;
                break;
            }
            pl7Var2 = list.get(i3);
            if (wl7.b(nff.c(pl7Var2), "Leading")) {
                break;
            }
            i3++;
        }
        pl7 pl7Var5 = pl7Var2;
        if (pl7Var5 != null) {
            int iP = pl7Var5.P(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - iP;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            iIntValue = function2.invoke(pl7Var5, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                pl7Var3 = null;
                break;
            }
            pl7Var3 = list.get(i4);
            if (wl7.b(nff.c(pl7Var3), "Trailing")) {
                break;
            }
            i4++;
        }
        pl7 pl7Var6 = pl7Var3;
        if (pl7Var6 != null) {
            int iP2 = pl7Var6.P(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - iP2) < 0) {
                i2 = 0;
            }
            iIntValue2 = function2.invoke(pl7Var6, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                pl7Var4 = null;
                break;
            }
            pl7Var4 = list.get(i5);
            if (wl7.b(nff.c(pl7Var4), "Label")) {
                break;
            }
            i5++;
        }
        pl7 pl7Var7 = pl7Var4;
        int iIntValue3 = pl7Var7 != null ? function2.invoke(pl7Var7, Integer.valueOf(i2)).intValue() : 0;
        int size4 = list2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            pl7 pl7Var8 = list.get(i6);
            if (wl7.b(nff.c(pl7Var8), "TextField")) {
                int iIntValue4 = function2.invoke(pl7Var8, Integer.valueOf(i2)).intValue();
                int size5 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    pl7 pl7Var9 = list.get(i7);
                    if (wl7.b(nff.c(pl7Var9), "Hint")) {
                        pl7Var = pl7Var9;
                        break;
                    }
                    i7++;
                }
                pl7 pl7Var10 = pl7Var;
                return zff.c(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(i2)).intValue() : 0, mq2.b(0, 0, 15), ql7Var.getDensity(), this.b);
            }
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.layout.w, gg9] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.ag9
    public final bg9 c(final q qVar, List<? extends vf9> list, long j) {
        vf9 vf9Var;
        bg9 bg9Var;
        vf9 vf9Var2;
        List<? extends vf9> list2;
        int i;
        int i2;
        final ?? R;
        int i3;
        Object obj;
        final int iV;
        Object obj2;
        final cgf cgfVar = this;
        List<? extends vf9> list3 = list;
        gza gzaVar = cgfVar.b;
        int iX0 = qVar.x0(gzaVar.d());
        int iX02 = qVar.x0(gzaVar.a());
        final int iX03 = qVar.x0(2.0f);
        long jA = iq2.a(0, 0, 0, 0, 10, j);
        List<? extends vf9> list4 = list3;
        int size = list4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                vf9Var = null;
                break;
            }
            vf9Var = list3.get(i4);
            if (wl7.b(h.a(vf9Var), "Leading")) {
                break;
            }
            i4++;
        }
        vf9 vf9Var3 = vf9Var;
        final w wVarR = vf9Var3 != null ? vf9Var3.R(jA) : null;
        int i5 = wVarR != null ? wVarR.a : 0;
        int size2 = list4.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                bg9Var = null;
                vf9Var2 = null;
                break;
            }
            vf9Var2 = list3.get(i6);
            bg9Var = null;
            if (wl7.b(h.a(vf9Var2), "Trailing")) {
                break;
            }
            i6++;
        }
        vf9 vf9Var4 = vf9Var2;
        if (vf9Var4 != null) {
            list2 = list4;
            i = i5;
            i2 = 0;
            R = vf9Var4.R(mq2.j(-i5, 0, 2, jA));
        } else {
            list2 = list4;
            i = i5;
            i2 = 0;
            R = bg9Var;
        }
        int i7 = -iX02;
        int i8 = -(i + (R != 0 ? R.a : i2));
        long jI = mq2.i(i8, i7, jA);
        int size3 = list2.size();
        int i9 = i2;
        while (true) {
            if (i9 >= size3) {
                i3 = iX02;
                obj = bg9Var;
                break;
            }
            obj = list3.get(i9);
            i3 = iX02;
            if (wl7.b(h.a((vf9) obj), "Label")) {
                break;
            }
            i9++;
            iX02 = i3;
        }
        vf9 vf9Var5 = (vf9) obj;
        final ?? R2 = vf9Var5 != null ? vf9Var5.R(jI) : bg9Var;
        if (R2 != 0) {
            iV = R2.V(e20.b);
            if (iV == Integer.MIN_VALUE) {
                iV = R2.b;
            }
        } else {
            iV = 0;
        }
        final int iMax = Math.max(iV, iX0);
        long jI2 = mq2.i(i8, R2 != 0 ? (i7 - iX03) - iMax : (-iX0) - i3, iq2.a(0, 0, 0, 0, 11, j));
        int size4 = list2.size();
        int i10 = 0;
        while (i10 < size4) {
            vf9 vf9Var6 = list3.get(i10);
            final int i11 = iX0;
            if (wl7.b(h.a(vf9Var6), "TextField")) {
                final w wVarR2 = vf9Var6.R(jI2);
                long jA2 = iq2.a(0, 0, 0, 0, 14, jI2);
                int size5 = list3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj2 = bg9Var;
                        break;
                    }
                    obj2 = list3.get(i12);
                    if (wl7.b(h.a((vf9) obj2), "Hint")) {
                        break;
                    }
                    i12++;
                    list3 = list;
                }
                vf9 vf9Var7 = (vf9) obj2;
                final ?? R3 = vf9Var7 != null ? vf9Var7.R(jA2) : bg9Var;
                final int iG = mq2.g(Math.max(wVarR2.a, Math.max(R2 != 0 ? R2.a : 0, R3 != 0 ? R3.a : 0)) + (wVarR != null ? wVarR.a : 0) + (R != 0 ? R.a : 0), j);
                final int iC = zff.c(wVarR2.b, R2 != 0, iMax, wVarR != null ? wVarR.b : 0, R != 0 ? R.b : 0, R3 != 0 ? R3.b : 0, j, qVar.getDensity(), cgfVar.b);
                return qVar.Y0(iG, iC, bs4.a, new Function1() { // from class: agf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        w.a aVar = (w.a) obj3;
                        w wVar = R2;
                        int i13 = iG;
                        int i14 = iC;
                        w wVar2 = wVarR2;
                        w wVar3 = R3;
                        w wVar4 = wVarR;
                        w wVar5 = R;
                        cgf cgfVar2 = cgfVar;
                        q qVar2 = qVar;
                        if (wVar != null) {
                            int i15 = i11 - iV;
                            if (i15 < 0) {
                                i15 = 0;
                            }
                            int i16 = iMax + iX03;
                            float f = cgfVar2.a;
                            float density = qVar2.getDensity();
                            if (wVar4 != null) {
                                w.a.y(aVar, wVar4, 0, q6.b(i14 - wVar4.b, 2.0f, 1.0f));
                            }
                            if (wVar5 != null) {
                                w.a.y(aVar, wVar5, i13 - wVar5.a, q6.b(i14 - wVar5.b, 2.0f, 1.0f));
                            }
                            w.a.y(aVar, wVar, wVar4 != null ? wVar4.a : 0, gf9.b(16.0f * density) - gf9.b((r1 - i15) * f));
                            w.a.y(aVar, wVar2, wVar4 != null ? wVar4.a : 0, i16);
                            if (wVar3 != null) {
                                w.a.y(aVar, wVar3, wVar4 != null ? wVar4.a : 0, i16);
                            }
                        } else {
                            int iB = gf9.b(cgfVar2.b.d() * qVar2.getDensity());
                            if (wVar4 != null) {
                                w.a.y(aVar, wVar4, 0, q6.b(i14 - wVar4.b, 2.0f, 1.0f));
                            }
                            if (wVar5 != null) {
                                w.a.y(aVar, wVar5, i13 - wVar5.a, q6.b(i14 - wVar5.b, 2.0f, 1.0f));
                            }
                            w.a.y(aVar, wVar2, wVar4 != null ? wVar4.a : 0, iB);
                            if (wVar3 != null) {
                                w.a.y(aVar, wVar3, wVar4 != null ? wVar4.a : 0, iB);
                            }
                        }
                        return j6g.a;
                    }
                });
            }
            i10++;
            cgfVar = this;
            list3 = list;
            iX0 = i11;
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return bg9Var;
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(list, i, new mj2(13, (byte) 0));
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, new ih2(14));
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, new fn0(14, (byte) 0));
    }
}
