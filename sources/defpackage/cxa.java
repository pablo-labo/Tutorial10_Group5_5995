package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cxa implements ag9 {
    public final Function1<kie, j6g> a;
    public final float b;
    public final gza c;

    public cxa(Function1 function1, float f, gza gzaVar) {
        this.a = function1;
        this.b = f;
        this.c = gzaVar;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(ql7Var, list, i, new cm0(10));
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
        int iIntValue3 = pl7Var7 != null ? function2.invoke(pl7Var7, Integer.valueOf(w74.u(i2, this.b, i))).intValue() : 0;
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
                return ywa.c(iIntValue, iIntValue2, iIntValue4, iIntValue3, pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(i2)).intValue() : 0, this.b, mq2.b(0, 0, 15), ql7Var.getDensity(), this.c);
            }
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return 0;
    }

    @Override // defpackage.ag9
    public final bg9 c(final q qVar, List<? extends vf9> list, long j) {
        vf9 vf9Var;
        vf9 vf9Var2;
        vf9 vf9Var3;
        gza gzaVar;
        int i;
        long j2;
        List<? extends vf9> list2;
        String str;
        vf9 vf9Var4;
        final cxa cxaVar = this;
        gza gzaVar2 = cxaVar.c;
        int iX0 = qVar.x0(gzaVar2.a());
        long jA = iq2.a(0, 0, 0, 0, 10, j);
        List<? extends vf9> list3 = list;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                vf9Var = null;
                break;
            }
            vf9Var = list.get(i2);
            if (wl7.b(h.a(vf9Var), "Leading")) {
                break;
            }
            i2++;
        }
        vf9 vf9Var5 = vf9Var;
        w wVarR = vf9Var5 != null ? vf9Var5.R(jA) : null;
        int i3 = wVarR != null ? wVarR.a : 0;
        int size2 = list3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                vf9Var2 = null;
                break;
            }
            vf9Var2 = list.get(i4);
            if (wl7.b(h.a(vf9Var2), "Trailing")) {
                break;
            }
            i4++;
        }
        vf9 vf9Var6 = vf9Var2;
        char c = 2;
        w wVarR2 = vf9Var6 != null ? vf9Var6.R(mq2.j(-i3, 0, 2, jA)) : null;
        int i5 = i3 + (wVarR2 != null ? wVarR2.a : 0);
        int iX02 = qVar.x0(gzaVar2.c(qVar.getLayoutDirection())) + qVar.x0(gzaVar2.b(qVar.getLayoutDirection()));
        int i6 = -i5;
        int i7 = -iX0;
        long jI = mq2.i(w74.u(i6 - iX02, cxaVar.b, -iX02), i7, jA);
        int size3 = list3.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                vf9Var3 = null;
                break;
            }
            vf9Var3 = list.get(i8);
            char c2 = c;
            if (wl7.b(h.a(vf9Var3), "Label")) {
                break;
            }
            i8++;
            c = c2;
        }
        vf9 vf9Var7 = vf9Var3;
        w wVarR3 = vf9Var7 != null ? vf9Var7.R(jI) : null;
        if (wVarR3 != null) {
            float f = wVarR3.a;
            float f2 = wVarR3.b;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
            gzaVar = gzaVar2;
            i = i7;
            j2 = (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
        } else {
            gzaVar = gzaVar2;
            i = i7;
            j2 = 0;
        }
        cxaVar.a.invoke(new kie(j2));
        long jA2 = iq2.a(0, 0, 0, 0, 11, mq2.i(i6, i - Math.max((wVarR3 != null ? wVarR3.b : 0) / 2, qVar.x0(gzaVar.d())), j));
        int size4 = list3.size();
        int i9 = 0;
        while (true) {
            String str2 = "Collection contains no element matching the predicate.";
            if (i9 >= size4) {
                fz8.c("Collection contains no element matching the predicate.");
                r40.e();
                return null;
            }
            vf9 vf9Var8 = list.get(i9);
            if (wl7.b(h.a(vf9Var8), "TextField")) {
                final w wVarR4 = vf9Var8.R(jA2);
                long jA3 = iq2.a(0, 0, 0, 0, 14, jA2);
                List<? extends vf9> list4 = list;
                int size5 = list4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        list2 = list4;
                        str = str2;
                        vf9Var4 = null;
                        break;
                    }
                    vf9Var4 = list.get(i10);
                    list2 = list4;
                    str = str2;
                    if (wl7.b(h.a(vf9Var4), "Hint")) {
                        break;
                    }
                    i10++;
                    list4 = list2;
                    str2 = str;
                }
                vf9 vf9Var9 = vf9Var4;
                final w wVarR5 = vf9Var9 != null ? vf9Var9.R(jA3) : null;
                final w wVar = wVarR2;
                final int iD = ywa.d(wVarR != null ? wVarR.a : 0, wVarR2 != null ? wVarR2.a : 0, wVarR4.a, wVarR3 != null ? wVarR3.a : 0, wVarR5 != null ? wVarR5.a : 0, cxaVar.b, j, qVar.getDensity(), cxaVar.c);
                final int iC = ywa.c(wVarR != null ? wVarR.b : 0, wVar != null ? wVar.b : 0, wVarR4.b, wVarR3 != null ? wVarR3.b : 0, wVarR5 != null ? wVarR5.b : 0, cxaVar.b, j, qVar.getDensity(), cxaVar.c);
                int size6 = list2.size();
                int i11 = 0;
                while (i11 < size6) {
                    vf9 vf9Var10 = list.get(i11);
                    if (wl7.b(h.a(vf9Var10), "border")) {
                        final w wVarR6 = vf9Var10.R(mq2.a(iD != Integer.MAX_VALUE ? iD : 0, iD, iC != Integer.MAX_VALUE ? iC : 0, iC));
                        final w wVar2 = wVarR;
                        final w wVar3 = wVarR3;
                        return qVar.Y0(iD, iC, bs4.a, new Function1() { // from class: axa
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                w.a aVar = (w.a) obj;
                                cxa cxaVar2 = cxaVar;
                                float f3 = cxaVar2.b;
                                q qVar2 = qVar;
                                float density = qVar2.getDensity();
                                vl8 layoutDirection = qVar2.getLayoutDirection();
                                gza gzaVar3 = cxaVar2.c;
                                int i12 = ywa.b;
                                int iB = gf9.b(gzaVar3.d() * density);
                                int iB2 = gf9.b(f.d(gzaVar3, layoutDirection) * density);
                                float f4 = 12.0f * density;
                                int i13 = iC;
                                w wVar4 = wVar2;
                                if (wVar4 != null) {
                                    w.a.y(aVar, wVar4, 0, q6.b(i13 - wVar4.b, 2.0f, 1.0f));
                                }
                                w wVar5 = wVar;
                                if (wVar5 != null) {
                                    w.a.y(aVar, wVar5, iD - wVar5.a, q6.b(i13 - wVar5.b, 2.0f, 1.0f));
                                }
                                w wVar6 = wVar3;
                                if (wVar6 != null) {
                                    w.a.y(aVar, wVar6, gf9.b(wVar4 == null ? 0.0f : (1.0f - f3) * (wVar4.a - f4)) + iB2, w74.u(iB, f3, -(wVar6.b / 2)));
                                }
                                w.a.y(aVar, wVarR4, wVar4 != null ? wVar4.a : 0, Math.max(iB, (wVar6 != null ? wVar6.b : 0) / 2));
                                w wVar7 = wVarR5;
                                if (wVar7 != null) {
                                    w.a.y(aVar, wVar7, wVar4 != null ? wVar4.a : 0, Math.max(iB, (wVar6 != null ? wVar6.b : 0) / 2));
                                }
                                w.a.w(aVar, wVarR6, 0L);
                                return j6g.a;
                            }
                        });
                    }
                    i11++;
                    wVarR = wVarR;
                    wVarR3 = wVarR3;
                    cxaVar = this;
                    wVar = wVar;
                }
                fz8.c(str);
                r40.e();
                return null;
            }
            i9++;
            wVarR = wVarR;
            wVarR3 = wVarR3;
            cxaVar = this;
            jA2 = jA2;
        }
    }

    public final int d(ql7 ql7Var, List<? extends pl7> list, int i, Function2<? super pl7, ? super Integer, Integer> function2) {
        pl7 pl7Var;
        pl7 pl7Var2;
        pl7 pl7Var3;
        pl7 pl7Var4;
        List<? extends pl7> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            pl7 pl7Var5 = list.get(i2);
            if (wl7.b(nff.c(pl7Var5), "TextField")) {
                int iIntValue = function2.invoke(pl7Var5, Integer.valueOf(i)).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    pl7Var = null;
                    if (i3 >= size2) {
                        pl7Var2 = null;
                        break;
                    }
                    pl7Var2 = list.get(i3);
                    if (wl7.b(nff.c(pl7Var2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pl7 pl7Var6 = pl7Var2;
                int iIntValue2 = pl7Var6 != null ? function2.invoke(pl7Var6, Integer.valueOf(i)).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        pl7Var3 = null;
                        break;
                    }
                    pl7Var3 = list.get(i4);
                    if (wl7.b(nff.c(pl7Var3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pl7 pl7Var7 = pl7Var3;
                int iIntValue3 = pl7Var7 != null ? function2.invoke(pl7Var7, Integer.valueOf(i)).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        pl7Var4 = null;
                        break;
                    }
                    pl7Var4 = list.get(i5);
                    if (wl7.b(nff.c(pl7Var4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                pl7 pl7Var8 = pl7Var4;
                int iIntValue4 = pl7Var8 != null ? function2.invoke(pl7Var8, Integer.valueOf(i)).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    pl7 pl7Var9 = list.get(i6);
                    if (wl7.b(nff.c(pl7Var9), "Hint")) {
                        pl7Var = pl7Var9;
                        break;
                    }
                    i6++;
                }
                pl7 pl7Var10 = pl7Var;
                return ywa.d(iIntValue4, iIntValue3, iIntValue, iIntValue2, pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(i)).intValue() : 0, this.b, mq2.b(0, 0, 15), ql7Var.getDensity(), this.c);
            }
        }
        fz8.c("Collection contains no element matching the predicate.");
        r40.e();
        return 0;
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(ql7Var, list, i, new em0(11));
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, new fm0(13));
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, new fj2(12, (byte) 0));
    }
}
