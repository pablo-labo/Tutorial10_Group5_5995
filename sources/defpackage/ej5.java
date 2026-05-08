package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ej5 {

    public static final class a implements ag9 {
        public final /* synthetic */ vm8 a;
        public final /* synthetic */ float b;
        public final /* synthetic */ pie c;
        public final /* synthetic */ float d;
        public final /* synthetic */ j89 e;
        public final /* synthetic */ j89 f;
        public final /* synthetic */ yi5 g;

        /* JADX INFO: renamed from: ej5$a$a, reason: collision with other inner class name */
        public static final class C0218a extends mj8 implements Function1<w.a, j6g> {
            final /* synthetic */ yi5 $crossAxisAlignment;
            final /* synthetic */ List<Integer> $crossAxisPositions;
            final /* synthetic */ List<Integer> $crossAxisSizes;
            final /* synthetic */ j89 $lastLineMainAxisAlignment;
            final /* synthetic */ j89 $mainAxisAlignment;
            final /* synthetic */ int $mainAxisLayoutSize;
            final /* synthetic */ float $mainAxisSpacing;
            final /* synthetic */ vm8 $orientation;
            final /* synthetic */ List<List<w>> $sequences;
            final /* synthetic */ q $this_Layout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0218a(ArrayList arrayList, q qVar, float f, j89 j89Var, j89 j89Var2, vm8 vm8Var, int i, yi5 yi5Var, ArrayList arrayList2, ArrayList arrayList3) {
                super(1);
                this.$sequences = arrayList;
                this.$this_Layout = qVar;
                this.$mainAxisSpacing = f;
                this.$mainAxisAlignment = j89Var;
                this.$lastLineMainAxisAlignment = j89Var2;
                this.$orientation = vm8Var;
                this.$mainAxisLayoutSize = i;
                this.$crossAxisAlignment = yi5Var;
                this.$crossAxisSizes = arrayList2;
                this.$crossAxisPositions = arrayList3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(w.a aVar) {
                vm8 vm8Var;
                j89 j89Var;
                Iterator it;
                int i;
                q qVar;
                int i2;
                int iRound;
                w.a aVar2 = aVar;
                aVar2.getClass();
                List<List<w>> list = this.$sequences;
                q qVar2 = this.$this_Layout;
                float f = this.$mainAxisSpacing;
                j89 j89Var2 = this.$mainAxisAlignment;
                j89 j89Var3 = this.$lastLineMainAxisAlignment;
                vm8 vm8Var2 = this.$orientation;
                int i3 = this.$mainAxisLayoutSize;
                yi5 yi5Var = this.$crossAxisAlignment;
                List<Integer> list2 = this.$crossAxisSizes;
                List<Integer> list3 = this.$crossAxisPositions;
                Iterator it2 = list.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u63.o0();
                        throw null;
                    }
                    List list4 = (List) next;
                    int i6 = 0;
                    int size = list4.size();
                    List<List<w>> list5 = list;
                    int[] iArr = new int[size];
                    Iterator it3 = it2;
                    j89 j89Var4 = j89Var2;
                    int i7 = 0;
                    while (true) {
                        vm8Var = vm8.a;
                        j89Var = j89Var3;
                        if (i7 >= size) {
                            break;
                        }
                        w wVar = (w) list4.get(i7);
                        iArr[i7] = (vm8Var2 == vm8Var ? wVar.a : wVar.b) + (i7 < list4.size() + (-1) ? qVar2.x0(f) : 0);
                        i7++;
                        j89Var3 = j89Var;
                    }
                    int i8 = 1;
                    vs0.l lVarA = i4 < u63.J(list5) ? j89Var4.a() : j89Var.a();
                    int[] iArr2 = new int[size];
                    float f2 = f;
                    for (int i9 = 0; i9 < size; i9++) {
                        iArr2[i9] = 0;
                    }
                    lVarA.c(qVar2, i3, iArr, iArr2);
                    Iterator it4 = list4.iterator();
                    int i10 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            u63.o0();
                            throw null;
                        }
                        w wVar2 = (w) next2;
                        int iOrdinal = yi5Var.ordinal();
                        if (iOrdinal != 0) {
                            it = it4;
                            if (iOrdinal == i8) {
                                iRound = i6;
                            } else {
                                if (iOrdinal != 2) {
                                    l.g();
                                    return null;
                                }
                                iRound = list2.get(i4).intValue() - (vm8Var2 == vm8Var ? wVar2.b : wVar2.a);
                            }
                            i = i10;
                            qVar = qVar2;
                            i2 = i5;
                        } else {
                            it = it4;
                            long jG = hh1.g(i6, list2.get(i4).intValue() - (vm8Var2 == vm8Var ? wVar2.b : wVar2.a));
                            i = i10;
                            qVar = qVar2;
                            i2 = i5;
                            iRound = (int) (((((long) Math.round(1.0f * (((int) (jG & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round((((int) (jG >> 32)) / 2.0f) * 1.0f)) << 32)) & 4294967295L);
                        }
                        if (vm8Var2 == vm8Var) {
                            aVar2.r(wVar2, iArr2[i], list3.get(i4).intValue() + iRound, 0.0f);
                        } else {
                            aVar2.r(wVar2, list3.get(i4).intValue() + iRound, iArr2[i], 0.0f);
                        }
                        i5 = i2;
                        i10 = i11;
                        it4 = it;
                        qVar2 = qVar;
                        i6 = 0;
                        i8 = 1;
                    }
                    list = list5;
                    i4 = i5;
                    it2 = it3;
                    j89Var2 = j89Var4;
                    j89Var3 = j89Var;
                    f = f2;
                    qVar2 = qVar2;
                }
                return j6g.a;
            }
        }

        public a(vm8 vm8Var, float f, pie pieVar, float f2, j89 j89Var, j89 j89Var2, yi5 yi5Var) {
            this.a = vm8Var;
            this.b = f;
            this.c = pieVar;
            this.d = f2;
            this.e = j89Var;
            this.f = j89Var2;
            this.g = yi5Var;
        }

        public static final void b(ArrayList arrayList, juc jucVar, q qVar, float f, ArrayList arrayList2, ArrayList arrayList3, juc jucVar2, ArrayList arrayList4, juc jucVar3, juc jucVar4) {
            if (!arrayList.isEmpty()) {
                jucVar.element = qVar.x0(f) + jucVar.element;
            }
            arrayList.add(z92.z1(arrayList2));
            arrayList3.add(Integer.valueOf(jucVar2.element));
            arrayList4.add(Integer.valueOf(jucVar.element));
            jucVar.element += jucVar2.element;
            jucVar3.element = Math.max(jucVar3.element, jucVar4.element);
            arrayList2.clear();
            jucVar4.element = 0;
            jucVar2.element = 0;
        }

        @Override // defpackage.ag9
        public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
            return super.a(ql7Var, list, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
        @Override // defpackage.ag9
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.bg9 c(androidx.compose.ui.layout.q r22, java.util.List<? extends defpackage.vf9> r23, long r24) {
            /*
                Method dump skipped, instruction units count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ej5.a.c(androidx.compose.ui.layout.q, java.util.List, long):bg9");
        }

        @Override // defpackage.ag9
        public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
            return super.e(ql7Var, list, i);
        }

        @Override // defpackage.ag9
        public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
            return super.f(ql7Var, list, i);
        }

        @Override // defpackage.ag9
        public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
            return super.h(ql7Var, list, i);
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ yi5 $crossAxisAlignment;
        final /* synthetic */ float $crossAxisSpacing;
        final /* synthetic */ j89 $lastLineMainAxisAlignment;
        final /* synthetic */ j89 $mainAxisAlignment;
        final /* synthetic */ pie $mainAxisSize;
        final /* synthetic */ float $mainAxisSpacing;
        final /* synthetic */ e $modifier;
        final /* synthetic */ vm8 $orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, vm8 vm8Var, pie pieVar, j89 j89Var, float f, yi5 yi5Var, float f2, j89 j89Var2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$modifier = eVar;
            this.$orientation = vm8Var;
            this.$mainAxisSize = pieVar;
            this.$mainAxisAlignment = j89Var;
            this.$mainAxisSpacing = f;
            this.$crossAxisAlignment = yi5Var;
            this.$crossAxisSpacing = f2;
            this.$lastLineMainAxisAlignment = j89Var2;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ej5.a(this.$modifier, this.$orientation, this.$mainAxisSize, this.$mainAxisAlignment, this.$mainAxisSpacing, this.$crossAxisAlignment, this.$crossAxisSpacing, this.$lastLineMainAxisAlignment, this.$content, bVar, this.$$changed | 1);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ yi5 $crossAxisAlignment;
        final /* synthetic */ float $crossAxisSpacing;
        final /* synthetic */ j89 $lastLineMainAxisAlignment;
        final /* synthetic */ j89 $mainAxisAlignment;
        final /* synthetic */ pie $mainAxisSize;
        final /* synthetic */ float $mainAxisSpacing;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e eVar, pie pieVar, j89 j89Var, float f, yi5 yi5Var, float f2, j89 j89Var2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$mainAxisSize = pieVar;
            this.$mainAxisAlignment = j89Var;
            this.$mainAxisSpacing = f;
            this.$crossAxisAlignment = yi5Var;
            this.$crossAxisSpacing = f2;
            this.$lastLineMainAxisAlignment = j89Var2;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ej5.b(this.$modifier, this.$mainAxisSize, this.$mainAxisAlignment, this.$mainAxisSpacing, this.$crossAxisAlignment, this.$crossAxisSpacing, this.$lastLineMainAxisAlignment, this.$content, bVar, this.$$changed | 1, this.$$default);
            return j6g.a;
        }
    }

    public static final void a(e eVar, vm8 vm8Var, pie pieVar, j89 j89Var, float f, yi5 yi5Var, float f2, j89 j89Var2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(1107216104);
        if ((i & 14) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= cVarH.K(vm8Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= cVarH.K(pieVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 7168) == 0) {
            i2 |= cVarH.K(j89Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((57344 & i) == 0) {
            i2 |= cVarH.c(f) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= cVarH.K(yi5Var) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= cVarH.c(f2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= cVarH.K(j89Var2) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= cVarH.K(function2) ? 67108864 : 33554432;
        }
        if (((191739611 & i2) ^ 38347922) == 0 && cVarH.i()) {
            cVarH.D();
        } else {
            a aVar = new a(vm8Var, f, pieVar, f2, j89Var, j89Var2, yi5Var);
            cVarH.u(1376089394);
            iy3 iy3Var = (iy3) cVarH.M(um2.h);
            vl8 vl8Var = (vl8) cVarH.M(um2.n);
            opg opgVar = (opg) cVarH.M(um2.s);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            ah2 ah2Var = new ah2(-2123382363, new gm8(eVar), true);
            int i3 = (((((i2 << 3) & 112) | ((i2 >> 24) & 14)) << 9) & 7168) | 6;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            cVarH.y = false;
            ygg.y(cVarH, aVar, gl2.a.g);
            ygg.y(cVarH, iy3Var, gl2.a.e);
            ygg.y(cVarH, vl8Var, gl2.a.h);
            ygg.y(cVarH, opgVar, gl2.a.i);
            cVarH.y = cVarH.z >= 0;
            ah2Var.q(new ake(cVarH), cVarH, 0);
            cVarH.u(2058660585);
            function2.invoke(cVarH, Integer.valueOf((i3 >> 9) & 14));
            cVarH.U(false);
            cVarH.U(true);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW == null) {
            return;
        }
        iVarW.d = new b(eVar, vm8Var, pieVar, j89Var, f, yi5Var, f2, j89Var2, function2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r22, defpackage.pie r23, defpackage.j89 r24, float r25, defpackage.yi5 r26, float r27, defpackage.j89 r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r29, androidx.compose.runtime.b r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej5.b(androidx.compose.ui.e, pie, j89, float, yi5, float, j89, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }
}
