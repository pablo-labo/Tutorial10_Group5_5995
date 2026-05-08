package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.csf;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f6f {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final long f;

    public static final class a extends mj8 implements wu5<pb2, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $icon;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $styledText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ah2 ah2Var, Function2 function2) {
            super(3);
            this.$styledText = ah2Var;
            this.$icon = function2;
        }

        @Override // defpackage.wu5
        public final j6g q(pb2 pb2Var, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 17) == 16 && bVar2.i()) {
                bVar2.D();
            } else {
                f6f.d(this.$styledText, this.$icon, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $icon;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ long $selectedContentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $text;
        final /* synthetic */ long $unselectedContentColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, long j, long j2, d3a d3aVar, int i, int i2) {
            super(2);
            this.$selected = z;
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z2;
            this.$text = function2;
            this.$icon = function22;
            this.$selectedContentColor = j;
            this.$unselectedContentColor = j2;
            this.$interactionSource = d3aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            f6f.b(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$text, this.$icon, this.$selectedContentColor, this.$unselectedContentColor, this.$interactionSource, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ pa7 $ripple;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.ui.e eVar, boolean z, d3a d3aVar, pa7 pa7Var, boolean z2, gu5<j6g> gu5Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$modifier = eVar;
            this.$selected = z;
            this.$interactionSource = d3aVar;
            this.$ripple = pa7Var;
            this.$enabled = z2;
            this.$onClick = gu5Var;
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.selection.a.a(this.$modifier, this.$selected, this.$interactionSource, this.$ripple, this.$enabled, new qed(4), this.$onClick), 1.0f);
                wu5<pb2, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$content;
                ob2 ob2VarA = mb2.a(vs0.e, c20.a.n, bVar2, 54);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarF);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ob2VarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                wu5Var.q(qb2.a, bVar2, 6);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ long $selectedContentColor;
        final /* synthetic */ long $unselectedContentColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z, gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z2, long j, long j2, d3a d3aVar, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$selected = z;
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z2;
            this.$selectedContentColor = j;
            this.$unselectedContentColor = j2;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            f6f.a(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$selectedContentColor, this.$unselectedContentColor, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$text = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                cif.a(tjf.a(pzf.a(tmb.d, bVar2), 0L, 0L, null, null, null, 0L, 3, 0L, null, null, 0, 16744447), this.$text, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ long $activeColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $inactiveColor;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(long j, long j2, boolean z, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$activeColor = j;
            this.$inactiveColor = j2;
            this.$selected = z;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            f6f.c(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements wu5<csf.b<Boolean>, androidx.compose.runtime.b, Integer, jf5<da2>> {
        public static final g a = new g(3);

        @Override // defpackage.wu5
        public final jf5<da2> q(csf.b<Boolean> bVar, androidx.compose.runtime.b bVar2, Integer num) {
            androidx.compose.runtime.b bVar3 = bVar2;
            num.intValue();
            bVar3.L(-899623535);
            dvf dvfVar = bVar.c(Boolean.FALSE, Boolean.TRUE) ? new dvf(150, 100, bf4.c) : zd0.d(100, 0, bf4.c, 2);
            bVar3.F();
            return dvfVar;
        }
    }

    static {
        ra2 ra2Var = tmb.a;
        a = tmb.b;
        b = 72.0f;
        c = 16.0f;
        d = 14.0f;
        e = 6.0f;
        f = hh2.t(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r23, defpackage.gu5<defpackage.j6g> r24, androidx.compose.ui.e r25, boolean r26, long r27, long r29, defpackage.d3a r31, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r32, androidx.compose.runtime.b r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6f.a(boolean, gu5, androidx.compose.ui.e, boolean, long, long, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(boolean r27, defpackage.gu5<defpackage.j6g> r28, androidx.compose.ui.e r29, boolean r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r32, long r33, long r35, defpackage.d3a r37, androidx.compose.runtime.b r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f6f.b(boolean, gu5, androidx.compose.ui.e, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, d3a, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(long j, long j2, boolean z, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        long j3;
        androidx.compose.runtime.c cVarH = bVar.h(735731848);
        if ((i & 6) == 0) {
            i2 = (cVarH.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j2;
            i2 |= cVarH.e(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
        } else {
            int i3 = i2 >> 6;
            csf csfVarE = msf.e(Boolean.valueOf(z), null, cVarH, i3 & 14, 2);
            gme gmeVar = (gme) csfVarE.d;
            boolean zBooleanValue = ((Boolean) gmeVar.getValue()).booleanValue();
            cVarH.L(-1997025499);
            long j4 = zBooleanValue ? j : j3;
            cVarH.U(false);
            ta2 ta2VarF = da2.f(j4);
            boolean zK = cVarH.K(ta2VarF);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                objV = (lvf) ib2.a.invoke(ta2VarF);
                cVarH.p(objV);
            }
            lvf lvfVar = (lvf) objV;
            boolean zBooleanValue2 = ((Boolean) csfVarE.a.a()).booleanValue();
            cVarH.L(-1997025499);
            long j5 = zBooleanValue2 ? j : j3;
            cVarH.U(false);
            da2 da2Var = new da2(j5);
            boolean zBooleanValue3 = ((Boolean) gmeVar.getValue()).booleanValue();
            cVarH.L(-1997025499);
            long j6 = zBooleanValue3 ? j : j3;
            cVarH.U(false);
            rm2.a(qs2.a.a(new da2(((da2) msf.c(csfVarE, da2Var, new da2(j6), g.a.q(csfVarE.f(), cVarH, 0), lvfVar, cVarH, 0).getValue()).a)), function2, cVarH, (i3 & 112) | 8);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new f(j, j3, z, function2, i);
        }
    }

    public static final void d(Function2 function2, Function2 function22, androidx.compose.runtime.b bVar, int i) {
        int i2;
        int i3;
        boolean z;
        androidx.compose.runtime.c cVarH = bVar.h(514131524);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function22) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            int i4 = i2 & 14;
            boolean z2 = (i4 == 4) | ((i2 & 112) == 32);
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new g6f(function2, function22);
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9Var, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            cVarH.L(871566271);
            af1 af1Var = c20.a.a;
            if (function2 != null) {
                i3 = i2;
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.f.h(h.b(aVar, "text"), c, 0.0f, 2);
                ag9 ag9VarD = hl1.d(af1Var, false);
                int iG2 = cVarH.G();
                t8b t8bVarP2 = cVarH.P();
                androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD, dVar);
                ygg.y(cVarH, t8bVarP2, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                    ja.h(iG2, cVarH, iG2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar);
                function2.invoke(cVarH, Integer.valueOf(i4));
                cVarH.U(true);
            } else {
                i3 = i2;
            }
            boolean z3 = false;
            cVarH.U(false);
            cVarH.L(871570579);
            if (function22 != null) {
                androidx.compose.ui.e eVarB = h.b(aVar, "icon");
                ag9 ag9VarD2 = hl1.d(af1Var, false);
                int iG3 = cVarH.G();
                t8b t8bVarP3 = cVarH.P();
                androidx.compose.ui.e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarB);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ag9VarD2, dVar);
                ygg.y(cVarH, t8bVarP3, fVar);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                    ja.h(iG3, cVarH, iG3, c0251a);
                }
                ygg.y(cVarH, eVarC3, eVar);
                function22.invoke(cVarH, Integer.valueOf((i3 >> 3) & 14));
                z = true;
                cVarH.U(true);
                z3 = false;
            } else {
                z = true;
            }
            cVarH.U(z3);
            cVarH.U(z);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new h6f(function2, function22, i);
        }
    }
}
