package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bxa implements ag9 {
    public final Function1<kie, j6g> a;
    public final boolean b;
    public final float c;
    public final gza d;

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
        final /* synthetic */ int $totalHeight;
        final /* synthetic */ w $trailingPlaceable;
        final /* synthetic */ int $width;
        final /* synthetic */ bxa this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, w wVar9, bxa bxaVar, q qVar) {
            super(1);
            this.$totalHeight = i;
            this.$width = i2;
            this.$leadingPlaceable = wVar;
            this.$trailingPlaceable = wVar2;
            this.$prefixPlaceable = wVar3;
            this.$suffixPlaceable = wVar4;
            this.$textFieldPlaceable = wVar5;
            this.$labelPlaceable = wVar6;
            this.$placeholderPlaceable = wVar7;
            this.$containerPlaceable = wVar8;
            this.$supportingPlaceable = wVar9;
            this.this$0 = bxaVar;
            this.$this_measure = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            int i;
            w.a aVar2 = aVar;
            int i2 = this.$totalHeight;
            int i3 = this.$width;
            w wVar = this.$leadingPlaceable;
            w wVar2 = this.$trailingPlaceable;
            w wVar3 = this.$prefixPlaceable;
            w wVar4 = this.$suffixPlaceable;
            w wVar5 = this.$textFieldPlaceable;
            w wVar6 = this.$labelPlaceable;
            w wVar7 = this.$placeholderPlaceable;
            w wVar8 = this.$containerPlaceable;
            w wVar9 = this.$supportingPlaceable;
            bxa bxaVar = this.this$0;
            float f = bxaVar.c;
            boolean z = bxaVar.b;
            float density = this.$this_measure.getDensity();
            vl8 layoutDirection = this.$this_measure.getLayoutDirection();
            gza gzaVar = this.this$0.d;
            int i4 = vwa.b;
            w.a.w(aVar2, wVar8, 0L);
            float f2 = qef.b;
            int i5 = i2 - (wVar9 != null ? wVar9.b : 0);
            int iB = gf9.b(gzaVar.d() * density);
            int iB2 = gf9.b(f.d(gzaVar, layoutDirection) * density);
            float f3 = qef.c * density;
            if (wVar != null) {
                i = iB2;
                w.a.y(aVar2, wVar, 0, q6.b(i5 - wVar.b, 2.0f, 1.0f));
            } else {
                i = iB2;
            }
            if (wVar6 != null) {
                w.a.y(aVar2, wVar6, gf9.b(wVar == null ? 0.0f : (1.0f - f) * (wVar.a - f3)) + i, w74.u(z ? q6.b(i5 - wVar6.b, 2.0f, 1.0f) : iB, f, -(wVar6.b / 2)));
            }
            if (wVar3 != null) {
                w.a.y(aVar2, wVar3, wVar != null ? wVar.a : 0, vwa.e(z, i5, iB, wVar6, wVar3));
            }
            int i6 = (wVar != null ? wVar.a : 0) + (wVar3 != null ? wVar3.a : 0);
            w.a.y(aVar2, wVar5, i6, vwa.e(z, i5, iB, wVar6, wVar5));
            if (wVar7 != null) {
                w.a.y(aVar2, wVar7, i6, vwa.e(z, i5, iB, wVar6, wVar7));
            }
            if (wVar4 != null) {
                w.a.y(aVar2, wVar4, (i3 - (wVar2 != null ? wVar2.a : 0)) - wVar4.a, vwa.e(z, i5, iB, wVar6, wVar4));
            }
            if (wVar2 != null) {
                w.a.y(aVar2, wVar2, i3 - wVar2.a, q6.b(i5 - wVar2.b, 2.0f, 1.0f));
            }
            if (wVar9 != null) {
                w.a.y(aVar2, wVar9, 0, i5);
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

    /* JADX WARN: Multi-variable type inference failed */
    public bxa(Function1<? super kie, j6g> function1, boolean z, float f, gza gzaVar) {
        this.a = function1;
        this.b = z;
        this.c = f;
        this.d = gzaVar;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(ql7Var, list, i, b.a);
    }

    public final int b(ql7 ql7Var, List<? extends pl7> list, int i, Function2<? super pl7, ? super Integer, Integer> function2) {
        pl7 pl7Var;
        int i2;
        int iIntValue;
        pl7 pl7Var2;
        int iIntValue2;
        pl7 pl7Var3;
        pl7 pl7Var4;
        int iIntValue3;
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
            int iP = pl7Var8.P(Integer.MAX_VALUE);
            int i6 = vwa.b;
            i2 = i == Integer.MAX_VALUE ? i : i - iP;
            iIntValue = function2.invoke(pl7Var8, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                pl7Var2 = null;
                break;
            }
            pl7Var2 = list.get(i7);
            if (wl7.b(qef.e(pl7Var2), "Trailing")) {
                break;
            }
            i7++;
        }
        pl7 pl7Var9 = pl7Var2;
        if (pl7Var9 != null) {
            int iP2 = pl7Var9.P(Integer.MAX_VALUE);
            int i8 = vwa.b;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iP2;
            }
            iIntValue2 = function2.invoke(pl7Var9, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                pl7Var3 = null;
                break;
            }
            pl7Var3 = list.get(i9);
            if (wl7.b(qef.e(pl7Var3), "Label")) {
                break;
            }
            i9++;
        }
        pl7 pl7Var10 = pl7Var3;
        int iIntValue4 = pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(w74.u(i2, this.c, i))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                pl7Var4 = null;
                break;
            }
            pl7Var4 = list.get(i10);
            if (wl7.b(qef.e(pl7Var4), "Prefix")) {
                break;
            }
            i10++;
        }
        pl7 pl7Var11 = pl7Var4;
        if (pl7Var11 != null) {
            iIntValue3 = function2.invoke(pl7Var11, Integer.valueOf(i2)).intValue();
            int iP3 = pl7Var11.P(Integer.MAX_VALUE);
            int i11 = vwa.b;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iP3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                i3 = 0;
                pl7Var5 = null;
                break;
            }
            pl7Var5 = list.get(i12);
            i3 = 0;
            if (wl7.b(qef.e(pl7Var5), "Suffix")) {
                break;
            }
            i12++;
        }
        pl7 pl7Var12 = pl7Var5;
        if (pl7Var12 != null) {
            int iIntValue5 = function2.invoke(pl7Var12, Integer.valueOf(i2)).intValue();
            int iP4 = pl7Var12.P(Integer.MAX_VALUE);
            int i13 = vwa.b;
            if (i2 != Integer.MAX_VALUE) {
                i2 -= iP4;
            }
            i4 = iIntValue5;
        } else {
            i4 = i3;
        }
        int size6 = list.size();
        for (int i14 = i3; i14 < size6; i14++) {
            pl7 pl7Var13 = list.get(i14);
            if (wl7.b(qef.e(pl7Var13), "TextField")) {
                int iIntValue6 = function2.invoke(pl7Var13, Integer.valueOf(i2)).intValue();
                int size7 = list.size();
                int i15 = i3;
                while (true) {
                    if (i15 >= size7) {
                        pl7Var6 = null;
                        break;
                    }
                    pl7Var6 = list.get(i15);
                    if (wl7.b(qef.e(pl7Var6), "Hint")) {
                        break;
                    }
                    i15++;
                }
                pl7 pl7Var14 = pl7Var6;
                int iIntValue7 = pl7Var14 != null ? function2.invoke(pl7Var14, Integer.valueOf(i2)).intValue() : i3;
                int size8 = list.size();
                int i16 = i3;
                while (true) {
                    if (i16 >= size8) {
                        pl7Var7 = null;
                        break;
                    }
                    pl7 pl7Var15 = list.get(i16);
                    if (wl7.b(qef.e(pl7Var15), "Supporting")) {
                        pl7Var7 = pl7Var15;
                        break;
                    }
                    i16++;
                }
                pl7 pl7Var16 = pl7Var7;
                return vwa.c(iIntValue, iIntValue2, iIntValue3, i4, iIntValue6, iIntValue4, iIntValue7, pl7Var16 != null ? function2.invoke(pl7Var16, Integer.valueOf(i)).intValue() : i3, this.c, qef.a, ql7Var.getDensity(), this.d);
            }
        }
        s6.j("Collection contains no element matching the predicate.");
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r11v29, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r9v43 */
    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        vf9 vf9Var;
        bg9 bg9Var;
        vf9 vf9Var2;
        Object obj;
        int i;
        ?? R;
        Object obj2;
        ?? r29;
        int i2;
        ?? R2;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        int i4;
        bxa bxaVar = this;
        List<? extends vf9> list2 = list;
        gza gzaVar = bxaVar.d;
        int iX0 = qVar.x0(gzaVar.a());
        long jA = iq2.a(0, 0, 0, 0, 10, j);
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                vf9Var = null;
                break;
            }
            vf9Var = list2.get(i5);
            if (wl7.b(h.a(vf9Var), "Leading")) {
                break;
            }
            i5++;
        }
        vf9 vf9Var3 = vf9Var;
        w wVarR = vf9Var3 != null ? vf9Var3.R(jA) : null;
        float f = qef.b;
        int i6 = wVarR != null ? wVarR.a : 0;
        int iMax = Math.max(0, wVarR != null ? wVarR.b : 0);
        int size2 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                bg9Var = null;
                vf9Var2 = null;
                break;
            }
            vf9Var2 = list2.get(i7);
            bg9Var = null;
            if (wl7.b(h.a(vf9Var2), "Trailing")) {
                break;
            }
            i7++;
        }
        vf9 vf9Var4 = vf9Var2;
        ?? R3 = vf9Var4 != null ? vf9Var4.R(mq2.j(-i6, 0, 2, jA)) : bg9Var;
        int i8 = i6 + (R3 != 0 ? R3.a : 0);
        int iMax2 = Math.max(iMax, R3 != 0 ? R3.b : 0);
        int size3 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj = bg9Var;
                break;
            }
            obj = list2.get(i9);
            if (wl7.b(h.a((vf9) obj), "Prefix")) {
                break;
            }
            i9++;
        }
        vf9 vf9Var5 = (vf9) obj;
        if (vf9Var5 != null) {
            i = i8;
            R = vf9Var5.R(mq2.j(-i8, 0, 2, jA));
        } else {
            i = i8;
            R = bg9Var;
        }
        int i10 = (R != 0 ? R.a : 0) + i;
        int iMax3 = Math.max(iMax2, R != 0 ? R.b : 0);
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj2 = bg9Var;
                break;
            }
            obj2 = list2.get(i11);
            int i12 = size4;
            if (wl7.b(h.a((vf9) obj2), "Suffix")) {
                break;
            }
            i11++;
            size4 = i12;
        }
        vf9 vf9Var6 = (vf9) obj2;
        if (vf9Var6 != null) {
            r29 = R;
            i2 = i10;
            R2 = vf9Var6.R(mq2.j(-i10, 0, 2, jA));
        } else {
            r29 = R;
            i2 = i10;
            R2 = bg9Var;
        }
        int i13 = i2 + (R2 != 0 ? R2.a : 0);
        int iMax4 = Math.max(iMax3, R2 != 0 ? R2.b : 0);
        int iX02 = qVar.x0(gzaVar.c(qVar.getLayoutDirection())) + qVar.x0(gzaVar.b(qVar.getLayoutDirection()));
        int i14 = -i13;
        int iU = w74.u(i14 - iX02, bxaVar.c, -iX02);
        int i15 = -iX0;
        long jI = mq2.i(iU, i15, jA);
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                i3 = iX0;
                obj3 = bg9Var;
                break;
            }
            obj3 = list2.get(i16);
            int i17 = i16;
            i3 = iX0;
            if (wl7.b(h.a((vf9) obj3), "Label")) {
                break;
            }
            i16 = i17 + 1;
            iX0 = i3;
        }
        vf9 vf9Var7 = (vf9) obj3;
        ?? R4 = vf9Var7 != null ? vf9Var7.R(jI) : bg9Var;
        bxaVar.a.invoke(new kie(R4 != 0 ? oie.e(R4.a, R4.b) : 0L));
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                obj4 = bg9Var;
                break;
            }
            obj4 = list2.get(i18);
            int i19 = size6;
            if (wl7.b(h.a((vf9) obj4), "Supporting")) {
                break;
            }
            i18++;
            size6 = i19;
        }
        vf9 vf9Var8 = (vf9) obj4;
        int iK = vf9Var8 != null ? vf9Var8.K(iq2.j(j)) : 0;
        int iMax5 = Math.max((R4 != 0 ? R4.b : 0) / 2, qVar.x0(gzaVar.d()));
        int i20 = (i15 - iMax5) - iK;
        int i21 = iMax5;
        long jA2 = iq2.a(0, 0, 0, 0, 11, mq2.i(i14, i20, j));
        int size7 = list2.size();
        int i22 = 0;
        while (i22 < size7) {
            vf9 vf9Var9 = list2.get(i22);
            int i23 = size7;
            int i24 = i21;
            if (wl7.b(h.a(vf9Var9), "TextField")) {
                w wVarR2 = vf9Var9.R(jA2);
                long jA3 = iq2.a(0, 0, 0, 0, 14, jA2);
                int size8 = list2.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size8) {
                        obj5 = bg9Var;
                        break;
                    }
                    obj5 = list2.get(i25);
                    int i26 = size8;
                    int i27 = i25;
                    if (wl7.b(h.a((vf9) obj5), "Hint")) {
                        break;
                    }
                    i25 = i27 + 1;
                    size8 = i26;
                }
                vf9 vf9Var10 = (vf9) obj5;
                ?? R5 = vf9Var10 != null ? vf9Var10.R(jA3) : bg9Var;
                int iMax6 = Math.max(iMax4, Math.max(wVarR2.b, R5 != 0 ? R5.b : 0) + i24 + i3);
                ?? r11 = r29;
                int iD = vwa.d(wVarR != null ? wVarR.a : 0, R3 != 0 ? R3.a : 0, r29 != 0 ? r11.a : 0, R2 != 0 ? R2.a : 0, wVarR2.a, R4 != 0 ? R4.a : 0, R5 != 0 ? R5.a : 0, bxaVar.c, j, qVar.getDensity(), bxaVar.d);
                int i28 = 0;
                long jA4 = iq2.a(0, iD, 0, 0, 9, mq2.j(0, -iMax6, 1, jA));
                int i29 = iD;
                ?? R6 = vf9Var8 != null ? vf9Var8.R(jA4) : bg9Var;
                int i30 = R6 != 0 ? R6.b : 0;
                if (wVarR != null) {
                    i4 = 0;
                    i28 = wVarR.b;
                } else {
                    i4 = 0;
                }
                ?? r292 = R4;
                int iC = vwa.c(i28, R3 != 0 ? R3.b : i4, r11 != 0 ? r11.b : i4, R2 != 0 ? R2.b : i4, wVarR2.b, R4 != 0 ? R4.b : i4, R5 != 0 ? R5.b : i4, R6 != 0 ? R6.b : i4, bxaVar.c, j, qVar.getDensity(), bxaVar.d);
                int i31 = iC - i30;
                int size9 = list2.size();
                int i32 = i4;
                ?? r2 = R6;
                ?? r112 = r11;
                while (i32 < size9) {
                    vf9 vf9Var11 = list2.get(i32);
                    if (wl7.b(h.a(vf9Var11), "Container")) {
                        w wVarR3 = vf9Var11.R(mq2.a(i29 != Integer.MAX_VALUE ? i29 : i4, i29, i31 != Integer.MAX_VALUE ? i31 : i4, i31));
                        w wVar = wVarR;
                        ?? r5 = r112;
                        ?? r113 = r2;
                        int i33 = i29;
                        return qVar.Y0(i33, iC, bs4.a, new c(iC, i33, wVar, R3, r5, R2, wVarR2, r292, R5, wVarR3, r113, bxaVar, qVar));
                    }
                    ?? r0 = r112;
                    i32++;
                    i29 = i29;
                    r2 = r2;
                    r112 = r0;
                    r292 = r292;
                    wVarR2 = wVarR2;
                    bxaVar = this;
                    list2 = list;
                }
                s6.j("Collection contains no element matching the predicate.");
                return bg9Var;
            }
            i22++;
            bxaVar = this;
            list2 = list;
            size7 = i23;
            i21 = i24;
        }
        s6.j("Collection contains no element matching the predicate.");
        return bg9Var;
    }

    public final int d(ql7 ql7Var, List<? extends pl7> list, int i, Function2<? super pl7, ? super Integer, Integer> function2) {
        pl7 pl7Var;
        pl7 pl7Var2;
        pl7 pl7Var3;
        pl7 pl7Var4;
        pl7 pl7Var5;
        pl7 pl7Var6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pl7 pl7Var7 = list.get(i2);
            if (wl7.b(qef.e(pl7Var7), "TextField")) {
                int iIntValue = function2.invoke(pl7Var7, Integer.valueOf(i)).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    pl7Var = null;
                    if (i3 >= size2) {
                        pl7Var2 = null;
                        break;
                    }
                    pl7Var2 = list.get(i3);
                    if (wl7.b(qef.e(pl7Var2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pl7 pl7Var8 = pl7Var2;
                int iIntValue2 = pl7Var8 != null ? function2.invoke(pl7Var8, Integer.valueOf(i)).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        pl7Var3 = null;
                        break;
                    }
                    pl7Var3 = list.get(i4);
                    if (wl7.b(qef.e(pl7Var3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pl7 pl7Var9 = pl7Var3;
                int iIntValue3 = pl7Var9 != null ? function2.invoke(pl7Var9, Integer.valueOf(i)).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        pl7Var4 = null;
                        break;
                    }
                    pl7Var4 = list.get(i5);
                    if (wl7.b(qef.e(pl7Var4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                pl7 pl7Var10 = pl7Var4;
                int iIntValue4 = pl7Var10 != null ? function2.invoke(pl7Var10, Integer.valueOf(i)).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        pl7Var5 = null;
                        break;
                    }
                    pl7Var5 = list.get(i6);
                    if (wl7.b(qef.e(pl7Var5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                pl7 pl7Var11 = pl7Var5;
                int iIntValue5 = pl7Var11 != null ? function2.invoke(pl7Var11, Integer.valueOf(i)).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        pl7Var6 = null;
                        break;
                    }
                    pl7Var6 = list.get(i7);
                    if (wl7.b(qef.e(pl7Var6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                pl7 pl7Var12 = pl7Var6;
                int iIntValue6 = pl7Var12 != null ? function2.invoke(pl7Var12, Integer.valueOf(i)).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    pl7 pl7Var13 = list.get(i8);
                    if (wl7.b(qef.e(pl7Var13), "Hint")) {
                        pl7Var = pl7Var13;
                        break;
                    }
                    i8++;
                }
                pl7 pl7Var14 = pl7Var;
                return vwa.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, pl7Var14 != null ? function2.invoke(pl7Var14, Integer.valueOf(i)).intValue() : 0, this.c, qef.a, ql7Var.getDensity(), this.d);
            }
        }
        s6.j("Collection contains no element matching the predicate.");
        return 0;
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        return d(ql7Var, list, i, e.a);
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
