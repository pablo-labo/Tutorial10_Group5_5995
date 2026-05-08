package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ay1 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                wu5<pb2, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$content;
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
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

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ ux1 $colors;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ zx1 $elevation;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.e eVar, dce dceVar, ux1 ux1Var, zx1 zx1Var, bj1 bj1Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$shape = dceVar;
            this.$colors = ux1Var;
            this.$elevation = zx1Var;
            this.$border = bj1Var;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ay1.b(this.$modifier, this.$shape, this.$colors, this.$elevation, this.$border, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                wu5<pb2, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$content;
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
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
        final /* synthetic */ bj1 $border;
        final /* synthetic */ ux1 $colors;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ zx1 $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, dce dceVar, ux1 ux1Var, zx1 zx1Var, bj1 bj1Var, d3a d3aVar, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = ux1Var;
            this.$elevation = zx1Var;
            this.$border = bj1Var;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ay1.a(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ ux1 $colors;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ zx1 $elevation;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(androidx.compose.ui.e eVar, dce dceVar, ux1 ux1Var, zx1 zx1Var, bj1 bj1Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$shape = dceVar;
            this.$colors = ux1Var;
            this.$elevation = zx1Var;
            this.$border = bj1Var;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ay1.d(this.$modifier, this.$shape, this.$colors, this.$elevation, this.$border, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ ux1 $colors;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ zx1 $elevation;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, boolean z, dce dceVar, ux1 ux1Var, zx1 zx1Var, bj1 bj1Var, d3a d3aVar, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = ux1Var;
            this.$elevation = zx1Var;
            this.$border = bj1Var;
            this.$interactionSource = d3aVar;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ay1.c(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$border, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r27, androidx.compose.ui.e r28, boolean r29, defpackage.dce r30, defpackage.ux1 r31, defpackage.zx1 r32, defpackage.bj1 r33, defpackage.d3a r34, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r35, androidx.compose.runtime.b r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.a(gu5, androidx.compose.ui.e, boolean, dce, ux1, zx1, bj1, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r21, defpackage.dce r22, defpackage.ux1 r23, defpackage.zx1 r24, defpackage.bj1 r25, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.b(androidx.compose.ui.e, dce, ux1, zx1, bj1, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.gu5<defpackage.j6g> r27, androidx.compose.ui.e r28, boolean r29, defpackage.dce r30, defpackage.ux1 r31, defpackage.zx1 r32, defpackage.bj1 r33, defpackage.d3a r34, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r35, androidx.compose.runtime.b r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.c(gu5, androidx.compose.ui.e, boolean, dce, ux1, zx1, bj1, d3a, wu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void d(androidx.compose.ui.e eVar, dce dceVar, ux1 ux1Var, zx1 zx1Var, bj1 bj1Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, androidx.compose.runtime.b bVar, int i, int i2) {
        androidx.compose.ui.e eVar2;
        int i3;
        dce dceVar2;
        ux1 ux1Var2;
        zx1 zx1Var2;
        bj1 bj1Var2;
        wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var2;
        dce dceVarA;
        ux1 ux1Var3;
        zx1 zx1Var3;
        androidx.compose.ui.e eVar3;
        dce dceVar3;
        zx1 zx1Var4;
        bj1 bj1VarC;
        ux1 ux1Var4;
        dce dceVar4;
        ux1 ux1Var5;
        zx1 zx1Var5;
        bj1 bj1Var3;
        int i4;
        int i5;
        androidx.compose.runtime.c cVarH = bVar.h(740336179);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            eVar2 = eVar;
        } else if ((i & 6) == 0) {
            eVar2 = eVar;
            i3 = (cVarH.K(eVar2) ? 4 : 2) | i;
        } else {
            eVar2 = eVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                dceVar2 = dceVar;
                int i7 = cVarH.K(dceVar2) ? 32 : 16;
                i3 |= i7;
            } else {
                dceVar2 = dceVar;
            }
            i3 |= i7;
        } else {
            dceVar2 = dceVar;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ux1Var2 = ux1Var;
                if (cVarH.K(ux1Var2)) {
                    i5 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
                i3 |= i5;
            } else {
                ux1Var2 = ux1Var;
            }
            i5 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            i3 |= i5;
        } else {
            ux1Var2 = ux1Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                zx1Var2 = zx1Var;
                if (cVarH.K(zx1Var2)) {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                zx1Var2 = zx1Var;
            }
            i4 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            i3 |= i4;
        } else {
            zx1Var2 = zx1Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                bj1Var2 = bj1Var;
                int i8 = cVarH.K(bj1Var2) ? 16384 : 8192;
                i3 |= i8;
            } else {
                bj1Var2 = bj1Var;
            }
            i3 |= i8;
        } else {
            bj1Var2 = bj1Var;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            wu5Var2 = wu5Var;
        } else {
            wu5Var2 = wu5Var;
            if ((i & 196608) == 0) {
                i3 |= cVarH.x(wu5Var2) ? 131072 : 65536;
            }
        }
        if ((74899 & i3) == 74898 && cVarH.i()) {
            cVarH.D();
            dceVar4 = dceVar2;
            ux1Var5 = ux1Var2;
            zx1Var5 = zx1Var2;
            bj1Var3 = bj1Var2;
        } else {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                androidx.compose.ui.e eVar4 = i6 != 0 ? e.a.b : eVar2;
                if ((i2 & 2) != 0) {
                    dceVarA = fde.a(pce.e, cVarH);
                    i3 &= -113;
                } else {
                    dceVarA = dceVar2;
                }
                if ((i2 & 4) != 0) {
                    qa2 qa2Var = (qa2) cVarH.M(sa2.a);
                    ux1 ux1Var6 = qa2Var.O;
                    if (ux1Var6 == null) {
                        ra2 ra2Var = ra2.Y;
                        ux1Var3 = new ux1(sa2.c(qa2Var, ra2Var), sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), sa2.c(qa2Var, ra2Var), da2.b(sa2.a(qa2Var, sa2.c(qa2Var, ra2Var)), 0.38f));
                        qa2Var.O = ux1Var3;
                    } else {
                        ux1Var3 = ux1Var6;
                    }
                    i3 &= -897;
                } else {
                    ux1Var3 = ux1Var2;
                }
                if ((i2 & 8) != 0) {
                    zx1Var3 = new zx1(0.0f, 6.0f);
                    i3 &= -7169;
                } else {
                    zx1Var3 = zx1Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    eVar3 = eVar4;
                    dceVar3 = dceVarA;
                    zx1Var4 = zx1Var3;
                    bj1VarC = wx1.c(false, cVarH, 1);
                } else {
                    eVar3 = eVar4;
                    dceVar3 = dceVarA;
                    zx1Var4 = zx1Var3;
                    bj1VarC = bj1Var2;
                }
                ux1Var4 = ux1Var3;
            } else {
                cVarH.D();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                eVar3 = eVar2;
                dceVar3 = dceVar2;
                ux1Var4 = ux1Var2;
                zx1Var4 = zx1Var2;
                bj1VarC = bj1Var2;
            }
            cVarH.V();
            b(eVar3, dceVar3, ux1Var4, zx1Var4, bj1VarC, wu5Var2, cVarH, i3 & 524286, 0);
            eVar2 = eVar3;
            dceVar4 = dceVar3;
            ux1Var5 = ux1Var4;
            zx1Var5 = zx1Var4;
            bj1Var3 = bj1VarC;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e(eVar2, dceVar4, ux1Var5, zx1Var5, bj1Var3, wu5Var, i, i2);
        }
    }
}
