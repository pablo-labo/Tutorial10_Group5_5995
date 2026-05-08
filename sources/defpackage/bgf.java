package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bgf implements ag9 {
    public final boolean a;
    public final float b;
    public final gza c;

    public static final class a extends mj8 implements Function2<pl7, Integer, Integer> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(pl7 pl7Var, Integer num) {
            return Integer.valueOf(pl7Var.w(num.intValue()));
        }
    }

    public static final class b extends mj8 implements Function2<pl7, Integer, Integer> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(pl7 pl7Var, Integer num) {
            return Integer.valueOf(pl7Var.P(num.intValue()));
        }
    }

    public static final class c extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $containerPlaceable;
        final /* synthetic */ w $labelPlaceable;
        final /* synthetic */ w $leadingPlaceable;
        final /* synthetic */ w $placeholderPlaceable;
        final /* synthetic */ w $prefixPlaceable;
        final /* synthetic */ w $suffixPlaceable;
        final /* synthetic */ w $supportingPlaceable;
        final /* synthetic */ w $textFieldPlaceable;
        final /* synthetic */ q $this_measure;
        final /* synthetic */ int $topPaddingValue;
        final /* synthetic */ int $totalHeight;
        final /* synthetic */ w $trailingPlaceable;
        final /* synthetic */ int $width;
        final /* synthetic */ bgf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w wVar, int i, int i2, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, w wVar9, bgf bgfVar, int i3, q qVar) {
            super(1);
            this.$labelPlaceable = wVar;
            this.$width = i;
            this.$totalHeight = i2;
            this.$textFieldPlaceable = wVar2;
            this.$placeholderPlaceable = wVar3;
            this.$leadingPlaceable = wVar4;
            this.$trailingPlaceable = wVar5;
            this.$prefixPlaceable = wVar6;
            this.$suffixPlaceable = wVar7;
            this.$containerPlaceable = wVar8;
            this.$supportingPlaceable = wVar9;
            this.this$0 = bgfVar;
            this.$topPaddingValue = i3;
            this.$this_measure = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            float f;
            w.a aVar2 = aVar;
            w wVar = this.$labelPlaceable;
            int i = this.$width;
            int i2 = this.$totalHeight;
            w wVar2 = this.$textFieldPlaceable;
            if (wVar != null) {
                w wVar3 = this.$placeholderPlaceable;
                w wVar4 = this.$leadingPlaceable;
                w wVar5 = this.$trailingPlaceable;
                w wVar6 = this.$prefixPlaceable;
                w wVar7 = this.$suffixPlaceable;
                w wVar8 = this.$containerPlaceable;
                w wVar9 = this.$supportingPlaceable;
                bgf bgfVar = this.this$0;
                boolean z = bgfVar.a;
                int i3 = wVar.b + this.$topPaddingValue;
                float f2 = bgfVar.b;
                float density = this.$this_measure.getDensity();
                w.a.w(aVar2, wVar8, 0L);
                float f3 = qef.b;
                int i4 = i2 - (wVar9 != null ? wVar9.b : 0);
                if (wVar4 != null) {
                    f = 1.0f;
                    w.a.y(aVar2, wVar4, 0, q6.b(i4 - wVar4.b, 2.0f, 1.0f));
                } else {
                    f = 1.0f;
                }
                w.a.y(aVar2, wVar, wVar4 != null ? wVar4.a : 0, (z ? q6.b(i4 - wVar.b, 2.0f, f) : gf9.b(qef.b * density)) - gf9.b((r0 - r7) * f2));
                if (wVar6 != null) {
                    w.a.y(aVar2, wVar6, wVar4 != null ? wVar4.a : 0, i3);
                }
                int i5 = (wVar4 != null ? wVar4.a : 0) + (wVar6 != null ? wVar6.a : 0);
                w.a.y(aVar2, wVar2, i5, i3);
                if (wVar3 != null) {
                    w.a.y(aVar2, wVar3, i5, i3);
                }
                if (wVar7 != null) {
                    w.a.y(aVar2, wVar7, (i - (wVar5 != null ? wVar5.a : 0)) - wVar7.a, i3);
                }
                if (wVar5 != null) {
                    w.a.y(aVar2, wVar5, i - wVar5.a, q6.b(i4 - wVar5.b, 2.0f, 1.0f));
                }
                if (wVar9 != null) {
                    w.a.y(aVar2, wVar9, 0, i4);
                }
            } else {
                w wVar10 = this.$placeholderPlaceable;
                w wVar11 = this.$leadingPlaceable;
                w wVar12 = this.$trailingPlaceable;
                w wVar13 = this.$prefixPlaceable;
                w wVar14 = this.$suffixPlaceable;
                w wVar15 = this.$containerPlaceable;
                w wVar16 = this.$supportingPlaceable;
                boolean z2 = this.this$0.a;
                float density2 = this.$this_measure.getDensity();
                gza gzaVar = this.this$0.c;
                w.a.w(aVar2, wVar15, 0L);
                float f4 = qef.b;
                int i6 = i2 - (wVar16 != null ? wVar16.b : 0);
                int iB = gf9.b(gzaVar.d() * density2);
                if (wVar11 != null) {
                    w.a.y(aVar2, wVar11, 0, q6.b(i6 - wVar11.b, 2.0f, 1.0f));
                }
                if (wVar13 != null) {
                    w.a.y(aVar2, wVar13, wVar11 != null ? wVar11.a : 0, wff.d(z2, i6, iB, wVar13));
                }
                int i7 = (wVar11 != null ? wVar11.a : 0) + (wVar13 != null ? wVar13.a : 0);
                w.a.y(aVar2, wVar2, i7, wff.d(z2, i6, iB, wVar2));
                if (wVar10 != null) {
                    w.a.y(aVar2, wVar10, i7, wff.d(z2, i6, iB, wVar10));
                }
                if (wVar14 != null) {
                    w.a.y(aVar2, wVar14, (i - (wVar12 != null ? wVar12.a : 0)) - wVar14.a, wff.d(z2, i6, iB, wVar14));
                }
                if (wVar12 != null) {
                    w.a.y(aVar2, wVar12, i - wVar12.a, q6.b(i6 - wVar12.b, 2.0f, 1.0f));
                }
                if (wVar16 != null) {
                    w.a.y(aVar2, wVar16, 0, i6);
                }
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<pl7, Integer, Integer> {
        public static final d a = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(pl7 pl7Var, Integer num) {
            return Integer.valueOf(pl7Var.K(num.intValue()));
        }
    }

    public static final class e extends mj8 implements Function2<pl7, Integer, Integer> {
        public static final e a = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(pl7 pl7Var, Integer num) {
            return Integer.valueOf(pl7Var.O(num.intValue()));
        }
    }

    public bgf(boolean z, float f, gza gzaVar) {
        this.a = z;
        this.b = f;
        this.c = gzaVar;
    }

    public static int d(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (wl7.b(qef.e((pl7) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (wl7.b(qef.e((pl7) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pl7 pl7Var = (pl7) obj2;
                int iIntValue2 = pl7Var != null ? ((Number) function2.invoke(pl7Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (wl7.b(qef.e((pl7) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pl7 pl7Var2 = (pl7) obj3;
                int iIntValue3 = pl7Var2 != null ? ((Number) function2.invoke(pl7Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (wl7.b(qef.e((pl7) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                pl7 pl7Var3 = (pl7) obj4;
                int iIntValue4 = pl7Var3 != null ? ((Number) function2.invoke(pl7Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (wl7.b(qef.e((pl7) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                pl7 pl7Var4 = (pl7) obj5;
                int iIntValue5 = pl7Var4 != null ? ((Number) function2.invoke(pl7Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (wl7.b(qef.e((pl7) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                pl7 pl7Var5 = (pl7) obj6;
                int iIntValue6 = pl7Var5 != null ? ((Number) function2.invoke(pl7Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (wl7.b(qef.e((pl7) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                pl7 pl7Var6 = (pl7) obj;
                int i9 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i9, Math.max((pl7Var6 != null ? ((Number) function2.invoke(pl7Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, iq2.j(qef.a));
            }
        }
        s6.j("Collection contains no element matching the predicate.");
        return 0;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(list, i, b.a);
    }

    public final int b(ql7 ql7Var, List<? extends pl7> list, int i, Function2<? super pl7, ? super Integer, Integer> function2) {
        pl7 pl7Var;
        int iP;
        int iIntValue;
        pl7 pl7Var2;
        int iIntValue2;
        pl7 pl7Var3;
        pl7 pl7Var4;
        int i2;
        int i3;
        pl7 pl7Var5;
        int i4;
        pl7 pl7Var6;
        pl7 pl7Var7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                pl7Var = null;
                break;
            }
            pl7Var = list.get(i5);
            if (wl7.b(qef.e(pl7Var), "Leading")) {
                break;
            }
            i5++;
        }
        pl7 pl7Var8 = pl7Var;
        if (pl7Var8 != null) {
            iP = i == Integer.MAX_VALUE ? i : i - pl7Var8.P(Integer.MAX_VALUE);
            iIntValue = function2.invoke(pl7Var8, Integer.valueOf(i)).intValue();
        } else {
            iP = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                pl7Var2 = null;
                break;
            }
            pl7Var2 = list.get(i6);
            if (wl7.b(qef.e(pl7Var2), "Trailing")) {
                break;
            }
            i6++;
        }
        pl7 pl7Var9 = pl7Var2;
        if (pl7Var9 != null) {
            int iP2 = pl7Var9.P(Integer.MAX_VALUE);
            if (iP != Integer.MAX_VALUE) {
                iP -= iP2;
            }
            iIntValue2 = function2.invoke(pl7Var9, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                pl7Var3 = null;
                break;
            }
            pl7Var3 = list.get(i7);
            if (wl7.b(qef.e(pl7Var3), "Label")) {
                break;
            }
            i7++;
        }
        pl7 pl7Var10 = pl7Var3;
        int iIntValue3 = pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(iP)).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                pl7Var4 = null;
                break;
            }
            pl7Var4 = list.get(i8);
            if (wl7.b(qef.e(pl7Var4), "Prefix")) {
                break;
            }
            i8++;
        }
        pl7 pl7Var11 = pl7Var4;
        if (pl7Var11 != null) {
            int iIntValue4 = function2.invoke(pl7Var11, Integer.valueOf(iP)).intValue();
            int iP3 = pl7Var11.P(Integer.MAX_VALUE);
            if (iP != Integer.MAX_VALUE) {
                iP -= iP3;
            }
            i2 = iIntValue4;
        } else {
            i2 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                i3 = 0;
                pl7Var5 = null;
                break;
            }
            pl7Var5 = list.get(i9);
            i3 = 0;
            if (wl7.b(qef.e(pl7Var5), "Suffix")) {
                break;
            }
            i9++;
        }
        pl7 pl7Var12 = pl7Var5;
        if (pl7Var12 != null) {
            int iIntValue5 = function2.invoke(pl7Var12, Integer.valueOf(iP)).intValue();
            int iP4 = pl7Var12.P(Integer.MAX_VALUE);
            if (iP != Integer.MAX_VALUE) {
                iP -= iP4;
            }
            i4 = iIntValue5;
        } else {
            i4 = i3;
        }
        int size6 = list.size();
        for (int i10 = i3; i10 < size6; i10++) {
            pl7 pl7Var13 = list.get(i10);
            if (wl7.b(qef.e(pl7Var13), "TextField")) {
                int iIntValue6 = function2.invoke(pl7Var13, Integer.valueOf(iP)).intValue();
                int size7 = list.size();
                int i11 = i3;
                while (true) {
                    if (i11 >= size7) {
                        pl7Var6 = null;
                        break;
                    }
                    pl7Var6 = list.get(i11);
                    if (wl7.b(qef.e(pl7Var6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                pl7 pl7Var14 = pl7Var6;
                int iIntValue7 = pl7Var14 != null ? function2.invoke(pl7Var14, Integer.valueOf(iP)).intValue() : i3;
                int size8 = list.size();
                int i12 = i3;
                while (true) {
                    if (i12 >= size8) {
                        pl7Var7 = null;
                        break;
                    }
                    pl7 pl7Var15 = list.get(i12);
                    if (wl7.b(qef.e(pl7Var15), "Supporting")) {
                        pl7Var7 = pl7Var15;
                        break;
                    }
                    i12++;
                }
                pl7 pl7Var16 = pl7Var7;
                return wff.c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i2, i4, iIntValue7, pl7Var16 != null ? function2.invoke(pl7Var16, Integer.valueOf(i)).intValue() : i3, this.b, qef.a, ql7Var.getDensity(), this.c);
            }
        }
        s6.j("Collection contains no element matching the predicate.");
        return i3;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        vf9 vf9Var;
        vf9 vf9Var2;
        vf9 vf9Var3;
        w wVar;
        w wVarR;
        w wVar2;
        vf9 vf9Var4;
        w wVar3;
        w wVarR2;
        int i;
        int i2;
        vf9 vf9Var5;
        vf9 vf9Var6;
        int i3;
        vf9 vf9Var7;
        List<? extends vf9> list2 = list;
        gza gzaVar = this.c;
        int iX0 = qVar.x0(gzaVar.d());
        int iX02 = qVar.x0(gzaVar.a());
        long jA = iq2.a(0, 0, 0, 0, 10, j);
        int size = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                vf9Var = null;
                break;
            }
            vf9Var = list2.get(i4);
            if (wl7.b(h.a(vf9Var), "Leading")) {
                break;
            }
            i4++;
        }
        vf9 vf9Var8 = vf9Var;
        w wVarR3 = vf9Var8 != null ? vf9Var8.R(jA) : null;
        float f = qef.b;
        int i5 = wVarR3 != null ? wVarR3.a : 0;
        int iMax = Math.max(0, wVarR3 != null ? wVarR3.b : 0);
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                vf9Var2 = null;
                break;
            }
            vf9Var2 = list2.get(i6);
            if (wl7.b(h.a(vf9Var2), "Trailing")) {
                break;
            }
            i6++;
        }
        vf9 vf9Var9 = vf9Var2;
        w wVarR4 = vf9Var9 != null ? vf9Var9.R(mq2.j(-i5, 0, 2, jA)) : null;
        int i7 = i5 + (wVarR4 != null ? wVarR4.a : 0);
        int iMax2 = Math.max(iMax, wVarR4 != null ? wVarR4.b : 0);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                vf9Var3 = null;
                break;
            }
            vf9Var3 = list2.get(i8);
            if (wl7.b(h.a(vf9Var3), "Prefix")) {
                break;
            }
            i8++;
        }
        vf9 vf9Var10 = vf9Var3;
        if (vf9Var10 != null) {
            wVar = wVarR4;
            wVarR = vf9Var10.R(mq2.j(-i7, 0, 2, jA));
        } else {
            wVar = wVarR4;
            wVarR = null;
        }
        int i9 = i7 + (wVarR != null ? wVarR.a : 0);
        int iMax3 = Math.max(iMax2, wVarR != null ? wVarR.b : 0);
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                wVar2 = wVarR;
                vf9Var4 = null;
                break;
            }
            vf9Var4 = list2.get(i10);
            wVar2 = wVarR;
            if (wl7.b(h.a(vf9Var4), "Suffix")) {
                break;
            }
            i10++;
            wVarR = wVar2;
        }
        vf9 vf9Var11 = vf9Var4;
        if (vf9Var11 != null) {
            wVar3 = wVar;
            wVarR2 = vf9Var11.R(mq2.j(-i9, 0, 2, jA));
        } else {
            wVar3 = wVar;
            wVarR2 = null;
        }
        int i11 = i9 + (wVarR2 != null ? wVarR2.a : 0);
        int iMax4 = Math.max(iMax3, wVarR2 != null ? wVarR2.b : 0);
        int i12 = -i11;
        long jI = mq2.i(i12, -iX02, jA);
        int size5 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                i = iX02;
                i2 = i12;
                vf9Var5 = null;
                break;
            }
            vf9Var5 = list2.get(i13);
            i = iX02;
            i2 = i12;
            if (wl7.b(h.a(vf9Var5), "Label")) {
                break;
            }
            i13++;
            i12 = i2;
            iX02 = i;
        }
        vf9 vf9Var12 = vf9Var5;
        w wVarR5 = vf9Var12 != null ? vf9Var12.R(jI) : null;
        int size6 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size6) {
                vf9Var6 = null;
                break;
            }
            vf9Var6 = list2.get(i14);
            if (wl7.b(h.a(vf9Var6), "Supporting")) {
                break;
            }
            i14++;
        }
        vf9 vf9Var13 = vf9Var6;
        int iK = vf9Var13 != null ? vf9Var13.K(iq2.j(j)) : 0;
        int i15 = (wVarR5 != null ? wVarR5.b : 0) + iX0;
        w wVar4 = wVar2;
        w wVar5 = wVar3;
        long j2 = jA;
        int i16 = i15;
        long jI2 = mq2.i(i2, ((-i16) - i) - iK, iq2.a(0, 0, 0, 0, 11, j));
        int size7 = list2.size();
        int i17 = 0;
        while (i17 < size7) {
            vf9 vf9Var14 = list2.get(i17);
            if (wl7.b(h.a(vf9Var14), "TextField")) {
                w wVarR6 = vf9Var14.R(jI2);
                long jA2 = iq2.a(0, 0, 0, 0, 14, jI2);
                int size8 = list2.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        i3 = i16;
                        vf9Var7 = null;
                        break;
                    }
                    vf9Var7 = list2.get(i18);
                    i3 = i16;
                    if (wl7.b(h.a(vf9Var7), "Hint")) {
                        break;
                    }
                    i18++;
                    i16 = i3;
                }
                vf9 vf9Var15 = vf9Var7;
                w wVarR7 = vf9Var15 != null ? vf9Var15.R(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(wVarR6.b, wVarR7 != null ? wVarR7.b : 0) + i3 + i);
                int i19 = wVarR3 != null ? wVarR3.a : 0;
                int i20 = wVar5 != null ? wVar5.a : 0;
                int i21 = (wVar4 != null ? wVar4.a : 0) + (wVarR2 != null ? wVarR2.a : 0);
                int iMax6 = Math.max(Math.max(wVarR6.a + i21, Math.max((wVarR7 != null ? wVarR7.a : 0) + i21, wVarR5 != null ? wVarR5.a : 0)) + i19 + i20, iq2.j(j));
                int i22 = iMax6;
                w wVarR8 = vf9Var13 != null ? vf9Var13.R(iq2.a(0, iMax6, 0, 0, 9, mq2.j(0, -iMax5, 1, j2))) : null;
                int i23 = wVarR8 != null ? wVarR8.b : 0;
                bgf bgfVar = this;
                w wVar6 = wVarR3;
                int iC = wff.c(wVarR6.b, wVarR5 != null ? wVarR5.b : 0, wVarR3 != null ? wVarR3.b : 0, wVar5 != null ? wVar5.b : 0, wVar4 != null ? wVar4.b : 0, wVarR2 != null ? wVarR2.b : 0, wVarR7 != null ? wVarR7.b : 0, wVarR8 != null ? wVarR8.b : 0, bgfVar.b, j, qVar.getDensity(), bgfVar.c);
                int i24 = iC - i23;
                int size9 = list2.size();
                int i25 = 0;
                while (i25 < size9) {
                    vf9 vf9Var16 = list2.get(i25);
                    w wVar7 = wVarR5;
                    w wVar8 = wVarR6;
                    if (wl7.b(h.a(vf9Var16), "Container")) {
                        w wVarR9 = vf9Var16.R(mq2.a(i22 != Integer.MAX_VALUE ? i22 : 0, i22, i24 != Integer.MAX_VALUE ? i24 : 0, i24));
                        int i26 = i22;
                        w wVar9 = wVarR2;
                        w wVar10 = wVarR8;
                        int i27 = iC;
                        return qVar.Y0(i26, i27, bs4.a, new c(wVar7, i26, i27, wVar8, wVarR7, wVar6, wVar5, wVar4, wVar9, wVarR9, wVar10, bgfVar, iX0, qVar));
                    }
                    wVarR5 = wVar7;
                    i25++;
                    iC = iC;
                    wVarR8 = wVarR8;
                    bgfVar = this;
                    i22 = i22;
                    wVar4 = wVar4;
                    wVarR6 = wVar8;
                    wVar5 = wVar5;
                    wVarR2 = wVarR2;
                    list2 = list;
                }
                s6.j("Collection contains no element matching the predicate.");
                return null;
            }
            i17++;
            wVar4 = wVar4;
            j2 = j2;
            wVar5 = wVar5;
            i16 = i16;
            jI2 = jI2;
            wVarR2 = wVarR2;
            list2 = list;
        }
        s6.j("Collection contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(list, i, e.a);
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, a.a);
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        return b(ql7Var, list, i, d.a);
    }
}
