package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class td9 {

    public static final class a extends mj8 implements xu5<Integer, y, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tp1 $bulletHandler;
        final /* synthetic */ String $content;
        final /* synthetic */ float $listItemBottom;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tp1 tp1Var, String str, tjf tjfVar, float f) {
            super(4);
            this.$bulletHandler = tp1Var;
            this.$content = str;
            this.$style = tjfVar;
            this.$listItemBottom = f;
        }

        @Override // defpackage.xu5
        public final j6g j(Integer num, y yVar, androidx.compose.runtime.b bVar, Integer num2) {
            int iIntValue = num.intValue();
            y yVar2 = yVar;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            yVar2.getClass();
            e.a aVar = e.a.b;
            androidx.compose.ui.e eVarF = g.f(aVar, 1.0f);
            tp1 tp1Var = this.$bulletHandler;
            String str = this.$content;
            tjf tjfVar = this.$style;
            float f = this.$listItemBottom;
            bVar2.u(693286680);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
            bVar2.u(-1323940314);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            ah2 ah2VarA = hm8.a(eVarF);
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar2);
            } else {
                bVar2.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(bVar2, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(bVar2, t8bVarM, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ah2VarA.q(new ake(bVar2), bVar2, 0);
            bVar2.u(2058660585);
            kd9 kd9Var = zd9.z;
            y yVarR = boa.r(yVar2, kd9Var);
            if (yVarR != null) {
                boa.w(yVarR, str);
            }
            hkf.a(tp1Var.a(kd9Var, iIntValue), tjfVar, null, ((cd9) bVar2.M(rk2.d)).b(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, 0, null, bVar2, 0, 0, 131060);
            androidx.compose.ui.e eVarJ = f.j(aVar, 0.0f, 0.0f, 0.0f, f, 7);
            bVar2.u(-483455358);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
            bVar2.u(-1323940314);
            int iG2 = bVar2.G();
            t8b t8bVarM2 = bVar2.m();
            ah2 ah2VarA2 = hm8.a(eVarJ);
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar2);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ob2VarA, dVar);
            ygg.y(bVar2, t8bVarM2, fVar);
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG2))) {
                uz.g(iG2, bVar2, iG2, c0251a);
            }
            ah2VarA2.q(new ake(bVar2), bVar2, 0);
            bVar2.u(2058660585);
            rd9.b(yVar2, (fd9) bVar2.M(rk2.k), str, false, bVar2, 24582 | (iIntValue2 & 112), 0);
            bVar2.J();
            bVar2.q();
            bVar2.J();
            bVar2.J();
            bVar2.J();
            bVar2.q();
            bVar2.J();
            bVar2.J();
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ int $level;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, y yVar, tjf tjfVar, int i, int i2, int i3) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$style = tjfVar;
            this.$level = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            td9.a(this.$content, this.$node, this.$style, this.$level, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ xu5<Integer, y, androidx.compose.runtime.b, Integer, j6g> $item;
        final /* synthetic */ int $level;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, y yVar, tjf tjfVar, int i, xu5<? super Integer, ? super y, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var, int i2, int i3) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$style = tjfVar;
            this.$level = i;
            this.$item = xu5Var;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            td9.b(this.$content, this.$node, this.$style, this.$level, this.$item, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements xu5<Integer, y, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ String $content;
        final /* synthetic */ float $listItemBottom;
        final /* synthetic */ tp1 $orderedListHandler;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tp1 tp1Var, String str, tjf tjfVar, float f) {
            super(4);
            this.$orderedListHandler = tp1Var;
            this.$content = str;
            this.$style = tjfVar;
            this.$listItemBottom = f;
        }

        @Override // defpackage.xu5
        public final j6g j(Integer num, y yVar, androidx.compose.runtime.b bVar, Integer num2) {
            int iIntValue = num.intValue();
            y yVar2 = yVar;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            yVar2.getClass();
            e.a aVar = e.a.b;
            androidx.compose.ui.e eVarF = g.f(aVar, 1.0f);
            tp1 tp1Var = this.$orderedListHandler;
            String str = this.$content;
            tjf tjfVar = this.$style;
            float f = this.$listItemBottom;
            bVar2.u(693286680);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
            bVar2.u(-1323940314);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            ah2 ah2VarA = hm8.a(eVarF);
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar2);
            } else {
                bVar2.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(bVar2, ehdVarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(bVar2, t8bVarM, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ah2VarA.q(new ake(bVar2), bVar2, 0);
            bVar2.u(2058660585);
            kd9 kd9Var = zd9.C;
            y yVarR = boa.r(yVar2, kd9Var);
            if (yVarR != null) {
                boa.w(yVarR, str);
            }
            hkf.a(tp1Var.a(kd9Var, iIntValue), tjfVar, null, ((cd9) bVar2.M(rk2.d)).b(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, 0, null, bVar2, 0, 0, 131060);
            androidx.compose.ui.e eVarJ = f.j(aVar, 0.0f, 0.0f, 0.0f, f, 7);
            bVar2.u(-483455358);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
            bVar2.u(-1323940314);
            int iG2 = bVar2.G();
            t8b t8bVarM2 = bVar2.m();
            ah2 ah2VarA2 = hm8.a(eVarJ);
            if (bVar2.j() == null) {
                pg8.B();
                throw null;
            }
            bVar2.B();
            if (bVar2.f()) {
                bVar2.y(aVar2);
            } else {
                bVar2.n();
            }
            ygg.y(bVar2, ob2VarA, dVar);
            ygg.y(bVar2, t8bVarM2, fVar);
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG2))) {
                uz.g(iG2, bVar2, iG2, c0251a);
            }
            ah2VarA2.q(new ake(bVar2), bVar2, 0);
            bVar2.u(2058660585);
            rd9.b(yVar2, (fd9) bVar2.M(rk2.k), str, false, bVar2, 24582 | (iIntValue2 & 112), 0);
            bVar2.J();
            bVar2.q();
            bVar2.J();
            bVar2.J();
            bVar2.J();
            bVar2.q();
            bVar2.J();
            bVar2.J();
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $content;
        final /* synthetic */ int $level;
        final /* synthetic */ y $node;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, y yVar, tjf tjfVar, int i, int i2, int i3) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$style = tjfVar;
            this.$level = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            td9.c(this.$content, this.$node, this.$style, this.$level, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final void a(String str, y yVar, tjf tjfVar, int i, androidx.compose.runtime.b bVar, int i2, int i3) {
        int i4;
        String str2;
        y yVar2;
        tjf tjfVar2;
        int i5;
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1466335022);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cVarH.K(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= cVarH.x(yVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && cVarH.K(tjfVar)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= cVarH.d(i) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i4 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            i5 = i;
            tjfVar2 = tjfVar;
            yVar2 = yVar;
            str2 = str;
        } else {
            cVarH.v0();
            if ((i2 & 1) == 0 || cVarH.c0()) {
                if ((i3 & 4) != 0) {
                    tjfVar = ((ae9) cVarH.M(rk2.e)).h();
                    i4 &= -897;
                }
                if (i6 != 0) {
                    i = 0;
                }
            } else {
                cVarH.D();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            }
            tjf tjfVar3 = tjfVar;
            int i7 = i;
            cVarH.V();
            b(str, yVar, tjfVar3, i7, bh2.b(cVarH, -613025383, new a((tp1) cVarH.M(rk2.a), str, tjfVar3, ((ud9) cVarH.M(rk2.f)).d())), cVarH, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            str2 = str;
            yVar2 = yVar;
            tjfVar2 = tjfVar3;
            i5 = i7;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(str2, yVar2, tjfVar2, i5, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r21, defpackage.y r22, defpackage.tjf r23, int r24, defpackage.xu5<? super java.lang.Integer, ? super defpackage.y, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r25, androidx.compose.runtime.b r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td9.b(java.lang.String, y, tjf, int, xu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(String str, y yVar, tjf tjfVar, int i, androidx.compose.runtime.b bVar, int i2, int i3) {
        int i4;
        String str2;
        y yVar2;
        tjf tjfVar2;
        int i5;
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1917322623);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cVarH.K(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= cVarH.x(yVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && cVarH.K(tjfVar)) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= cVarH.d(i) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i4 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            i5 = i;
            tjfVar2 = tjfVar;
            yVar2 = yVar;
            str2 = str;
        } else {
            cVarH.v0();
            if ((i2 & 1) == 0 || cVarH.c0()) {
                if ((i3 & 4) != 0) {
                    tjfVar = ((ae9) cVarH.M(rk2.e)).e();
                    i4 &= -897;
                }
                if (i6 != 0) {
                    i = 0;
                }
            } else {
                cVarH.D();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            }
            tjf tjfVar3 = tjfVar;
            int i7 = i;
            cVarH.V();
            b(str, yVar, tjfVar3, i7, bh2.b(cVarH, 1881659508, new d((tp1) cVarH.M(rk2.b), str, tjfVar3, ((ud9) cVarH.M(rk2.f)).d())), cVarH, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 0);
            str2 = str;
            yVar2 = yVar;
            tjfVar2 = tjfVar3;
            i5 = i7;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e(str2, yVar2, tjfVar2, i5, i2, i3);
        }
    }
}
