package androidx.compose.animation;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.csf;
import defpackage.ed0;
import defpackage.fhd;
import defpackage.g4a;
import defpackage.gl2;
import defpackage.gme;
import defpackage.gu5;
import defpackage.gv2;
import defpackage.i4a;
import defpackage.iq2;
import defpackage.iu4;
import defpackage.j6g;
import defpackage.ja;
import defpackage.jme;
import defpackage.ka2;
import defpackage.ku4;
import defpackage.l6;
import defpackage.lv4;
import defpackage.mj8;
import defpackage.msf;
import defpackage.mvf;
import defpackage.od0;
import defpackage.pb2;
import defpackage.pd0;
import defpackage.pm8;
import defpackage.q92;
import defpackage.qd0;
import defpackage.r25;
import defpackage.rd0;
import defpackage.rsf;
import defpackage.su4;
import defpackage.t12;
import defpackage.t8b;
import defpackage.to4;
import defpackage.tu4;
import defpackage.vf9;
import defpackage.wd;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.yc6;
import defpackage.ygg;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    public static final class a extends mj8 implements Function1<Boolean, Boolean> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<qd0, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ lv4 $enter;
        final /* synthetic */ r25 $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, String str, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$modifier = eVar;
            this.$enter = lv4Var;
            this.$exit = r25Var;
            this.$label = str;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i.e(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<Boolean, Boolean> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<qd0, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ lv4 $enter;
        final /* synthetic */ r25 $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ fhd $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(fhd fhdVar, boolean z, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, String str, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$this_AnimatedVisibility = fhdVar;
            this.$visible = z;
            this.$modifier = eVar;
            this.$enter = lv4Var;
            this.$exit = r25Var;
            this.$label = str;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i.d(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<Boolean, Boolean> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<qd0, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ lv4 $enter;
        final /* synthetic */ r25 $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ pb2 $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(pb2 pb2Var, boolean z, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, String str, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$this_AnimatedVisibility = pb2Var;
            this.$visible = z;
            this.$modifier = eVar;
            this.$enter = lv4Var;
            this.$exit = r25Var;
            this.$label = str;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i.b(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<Boolean, Boolean> {
        public static final g a = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return bool2;
        }
    }

    public static final class h extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<qd0, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ lv4 $enter;
        final /* synthetic */ r25 $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ i4a<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(i4a<Boolean> i4aVar, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, String str, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$visibleState = i4aVar;
            this.$modifier = eVar;
            this.$enter = lv4Var;
            this.$exit = r25Var;
            this.$label = str;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i.c(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.i$i, reason: collision with other inner class name */
    public static final class C0012i extends mj8 implements wu5<q, vf9, iq2, bg9> {
        final /* synthetic */ csf<T> $transition;
        final /* synthetic */ Function1<T, Boolean> $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0012i(Function1<? super T, Boolean> function1, csf<T> csfVar) {
            super(3);
            this.$visible = function1;
            this.$transition = csfVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.wu5
        public final bg9 q(q qVar, vf9 vf9Var, iq2 iq2Var) {
            long j;
            q qVar2 = qVar;
            w wVarR = vf9Var.R(iq2Var.a);
            if (!qVar2.m0() || this.$visible.invoke((T) ((gme) this.$transition.d).getValue()).booleanValue()) {
                j = (((long) wVarR.a) << 32) | (((long) wVarR.b) & 4294967295L);
            } else {
                j = 0;
            }
            return qVar2.Y0((int) (j >> 32), (int) (4294967295L & j), bs4.a, new androidx.compose.animation.j(wVarR));
        }
    }

    public static final class j extends mj8 implements Function2<iu4, iu4, Boolean> {
        public static final j a = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(iu4 iu4Var, iu4 iu4Var2) {
            iu4 iu4Var3 = iu4Var2;
            return Boolean.valueOf(iu4Var == iu4Var3 && iu4Var3 == iu4.c);
        }
    }

    public static final class k extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ wu5<qd0, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ lv4 $enter;
        final /* synthetic */ r25 $exit;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ csf<T> $transition;
        final /* synthetic */ Function1<T, Boolean> $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(csf<T> csfVar, Function1<? super T, Boolean> function1, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i) {
            super(2);
            this.$transition = csfVar;
            this.$visible = function1;
            this.$modifier = eVar;
            this.$enter = lv4Var;
            this.$exit = r25Var;
            this.$content = wu5Var;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i.f(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(csf csfVar, Function1 function1, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, Function2 function2, wu5 wu5Var, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        int i4;
        csf csfVar2;
        mvf mvfVar;
        b.a.C0020a c0020a;
        boolean z;
        boolean z2;
        csf.a aVar;
        csf.a aVar2;
        csf.a aVar3;
        csf.a aVar4;
        csf.a aVar5;
        csf.a aVar6;
        csf.a aVar7;
        csf.a aVarB;
        final r25 r25Var2;
        final lv4 lv4Var2;
        wu5 wu5Var2 = wu5Var;
        androidx.compose.runtime.c cVarH = bVar.h(1912839215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(csfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarH.K(lv4Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= cVarH.K(r25Var) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= cVarH.x(function2) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= (2097152 & i) == 0 ? cVarH.K(null) : cVarH.x(null) ? 1048576 : 524288;
        }
        if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= cVarH.x(wu5Var2) ? 8388608 : 4194304;
        }
        if (cVarH.o(i3 & 1, (4793491 & i3) != 4793490)) {
            g4a g4aVar = csfVar.d;
            rsf<S> rsfVar = csfVar.a;
            if (((Boolean) function1.invoke(((gme) g4aVar).getValue())).booleanValue() || ((Boolean) function1.invoke(rsfVar.a())).booleanValue() || csfVar.h() || csfVar.d()) {
                cVarH.L(-232323267);
                int i5 = i3 & 14;
                int i6 = i5 | 48;
                int i7 = i6 & 14;
                boolean z3 = ((i7 ^ 6) > 4 && cVarH.K(csfVar)) || (i6 & 6) == 4;
                Object objV = cVarH.v();
                b.a.C0020a c0020a2 = b.a.a;
                if (z3 || objV == c0020a2) {
                    objV = rsfVar.a();
                    cVarH.p(objV);
                }
                if (csfVar.h()) {
                    objV = rsfVar.a();
                }
                cVarH.L(1844425648);
                iu4 iu4VarG = g(csfVar, function1, objV, cVarH);
                cVarH.U(false);
                Object value = ((gme) csfVar.d).getValue();
                int i8 = i3;
                cVarH.L(1844425648);
                iu4 iu4VarG2 = g(csfVar, function1, value, cVarH);
                cVarH.U(false);
                int i9 = i7 | 3072;
                wd wdVar = msf.a;
                int i10 = (i9 & 14) ^ 6;
                boolean z4 = (i10 > 4 && cVarH.K(csfVar)) || (i9 & 6) == 4;
                Object objV2 = cVarH.v();
                if (z4 || objV2 == c0020a2) {
                    i4 = i9;
                    objV2 = new csf(new i4a(iu4VarG), csfVar, l6.i(new StringBuilder(), csfVar.c, " > EnterExitTransition"));
                    cVarH.p(objV2);
                } else {
                    i4 = i9;
                }
                csf csfVar3 = (csf) objV2;
                boolean zK = cVarH.K(csfVar3) | ((i10 > 4 && cVarH.K(csfVar)) || (i4 & 6) == 4);
                Object objV3 = cVarH.v();
                if (zK || objV3 == c0020a2) {
                    objV3 = new gv2(5, csfVar, csfVar3);
                    cVarH.p(objV3);
                }
                to4.b(csfVar3, (Function1) objV3, cVarH);
                if (csfVar.h()) {
                    csfVar3.l(iu4VarG, iu4VarG2);
                } else {
                    csfVar3.q(iu4VarG2);
                    ((gme) csfVar3.k).setValue(Boolean.FALSE);
                }
                g4a g4aVarG = r.g(function2, cVarH);
                rsf<S> rsfVar2 = csfVar3.a;
                rsf<S> rsfVar3 = csfVar3.a;
                g4a g4aVar2 = csfVar3.d;
                Object objInvoke = function2.invoke(rsfVar2.a(), ((gme) g4aVar2).getValue());
                boolean zK2 = cVarH.K(csfVar3) | cVarH.K(g4aVarG);
                Object objV4 = cVarH.v();
                if (zK2 || objV4 == c0020a2) {
                    objV4 = new pd0(csfVar3, g4aVarG, null);
                    cVarH.p(objV4);
                }
                Function2 function22 = (Function2) objV4;
                Object objV5 = cVarH.v();
                if (objV5 == c0020a2) {
                    objV5 = r.f(objInvoke);
                    cVarH.p(objV5);
                }
                g4a g4aVar3 = (g4a) objV5;
                j6g j6gVar = j6g.a;
                boolean zX = cVarH.x(function22);
                Object objV6 = cVarH.v();
                if (zX || objV6 == c0020a2) {
                    objV6 = new jme(function22, g4aVar3, null);
                    cVarH.p(objV6);
                }
                to4.d(cVarH, j6gVar, (Function2) objV6);
                Object objA = rsfVar3.a();
                iu4 iu4Var = iu4.c;
                if ((objA == iu4Var && ((gme) g4aVar2).getValue() == iu4Var) && ((Boolean) g4aVar3.getValue()).booleanValue()) {
                    cVarH.L(-230155437);
                    cVarH.U(false);
                    wu5Var2 = wu5Var;
                    z2 = false;
                } else {
                    cVarH.L(-231293261);
                    boolean z5 = i5 == 4;
                    Object objV7 = cVarH.v();
                    if (z5 || objV7 == c0020a2) {
                        objV7 = new rd0();
                        cVarH.p(objV7);
                    }
                    rd0 rd0Var = (rd0) objV7;
                    mvf mvfVar2 = ku4.a;
                    mvf mvfVar3 = q92.i0;
                    Object objV8 = cVarH.v();
                    if (objV8 == c0020a2) {
                        objV8 = su4.a;
                        cVarH.p(objV8);
                    }
                    gu5 gu5Var = (gu5) objV8;
                    boolean zK3 = cVarH.K(csfVar3);
                    Object objV9 = cVarH.v();
                    if (zK3 || objV9 == c0020a2) {
                        objV9 = r.f(lv4Var);
                        cVarH.p(objV9);
                    }
                    g4a g4aVar4 = (g4a) objV9;
                    Object objA2 = rsfVar3.a();
                    gme gmeVar = (gme) g4aVar2;
                    Object value2 = gmeVar.getValue();
                    iu4 iu4Var2 = iu4.b;
                    if (objA2 == value2 && rsfVar3.a() == iu4Var2) {
                        if (csfVar3.h()) {
                            g4aVar4.setValue(lv4Var);
                        } else {
                            g4aVar4.setValue(lv4.a);
                        }
                    } else if (gmeVar.getValue() == iu4Var2) {
                        g4aVar4.setValue(((lv4) g4aVar4.getValue()).b(lv4Var));
                    }
                    lv4 lv4Var3 = (lv4) g4aVar4.getValue();
                    boolean zK4 = cVarH.K(csfVar3);
                    Object objV10 = cVarH.v();
                    if (zK4 || objV10 == c0020a2) {
                        objV10 = r.f(r25Var);
                        cVarH.p(objV10);
                    }
                    g4a g4aVar5 = (g4a) objV10;
                    if (rsfVar3.a() == gmeVar.getValue() && rsfVar3.a() == iu4Var2) {
                        if (csfVar3.h()) {
                            g4aVar5.setValue(r25Var);
                        } else {
                            g4aVar5.setValue(r25.a);
                        }
                    } else if (gmeVar.getValue() != iu4Var2) {
                        g4aVar5.setValue(((r25) g4aVar5.getValue()).b(r25Var));
                    }
                    r25 r25Var3 = (r25) g4aVar5.getValue();
                    boolean z6 = (lv4Var3.a().b == null && r25Var3.a().b == null) ? false : true;
                    boolean z7 = (lv4Var3.a().c == null && r25Var3.a().c == null) ? false : true;
                    if (z6) {
                        cVarH.L(133838277);
                        Object objV11 = cVarH.v();
                        if (objV11 == c0020a2) {
                            objV11 = "Built-in slide";
                            cVarH.p("Built-in slide");
                        }
                        String str = (String) objV11;
                        csfVar2 = csfVar3;
                        c0020a = c0020a2;
                        z = true;
                        z2 = false;
                        csf.a aVarB2 = msf.b(csfVar2, mvfVar3, str, cVarH, 384, 0);
                        mvfVar = mvfVar3;
                        cVarH.U(false);
                        aVar = aVarB2;
                    } else {
                        csfVar2 = csfVar3;
                        mvfVar = mvfVar3;
                        c0020a = c0020a2;
                        z = true;
                        z2 = false;
                        cVarH.L(133944080);
                        cVarH.U(false);
                        aVar = null;
                    }
                    if (z7) {
                        cVarH.L(134035871);
                        mvf mvfVar4 = q92.j0;
                        Object objV12 = cVarH.v();
                        if (objV12 == c0020a) {
                            objV12 = "Built-in shrink/expand";
                            cVarH.p("Built-in shrink/expand");
                        }
                        csf.a aVarB3 = msf.b(csfVar2, mvfVar4, (String) objV12, cVarH, 384, 0);
                        cVarH.U(z2);
                        aVar2 = aVarB3;
                    } else {
                        cVarH.L(134146695);
                        cVarH.U(z2);
                        aVar2 = null;
                    }
                    if (z7) {
                        cVarH.L(134220321);
                        Object objV13 = cVarH.v();
                        if (objV13 == c0020a) {
                            objV13 = "Built-in InterruptionHandlingOffset";
                            cVarH.p("Built-in InterruptionHandlingOffset");
                        }
                        csf.a aVarB4 = msf.b(csfVar2, mvfVar, (String) objV13, cVarH, 384, 0);
                        cVarH.U(z2);
                        aVar3 = aVarB4;
                    } else {
                        cVarH.L(134390727);
                        cVarH.U(z2);
                        aVar3 = null;
                    }
                    t12 t12Var = lv4Var3.a().c;
                    t12 t12Var2 = r25Var3.a().c;
                    boolean z8 = z7 ^ z;
                    mvf mvfVar5 = q92.c0;
                    boolean z9 = (lv4Var3.a().a == null && r25Var3.a().a == null) ? z2 : z;
                    boolean z10 = (lv4Var3.a().d == null && r25Var3.a().d == null) ? z2 : z;
                    if (z9) {
                        cVarH.L(-703859581);
                        Object objV14 = cVarH.v();
                        if (objV14 == c0020a) {
                            objV14 = "Built-in alpha";
                            cVarH.p("Built-in alpha");
                        }
                        csf.a aVarB5 = msf.b(csfVar2, mvfVar5, (String) objV14, cVarH, 384, 0);
                        cVarH.U(z2);
                        aVar4 = aVarB5;
                    } else {
                        cVarH.L(-703690136);
                        cVarH.U(z2);
                        aVar4 = null;
                    }
                    if (z10) {
                        cVarH.L(-703622493);
                        Object objV15 = cVarH.v();
                        if (objV15 == c0020a) {
                            objV15 = "Built-in scale";
                            cVarH.p("Built-in scale");
                        }
                        aVar5 = aVar4;
                        csf.a aVarB6 = msf.b(csfVar2, mvfVar5, (String) objV15, cVarH, 384, 0);
                        cVarH.U(z2);
                        aVar6 = aVarB6;
                    } else {
                        aVar5 = aVar4;
                        cVarH.L(-703453048);
                        cVarH.U(z2);
                        aVar6 = null;
                    }
                    if (z10) {
                        cVarH.L(-703375392);
                        aVar7 = aVar6;
                        aVarB = msf.b(csfVar2, ku4.a, "TransformOriginInterruptionHandling", cVarH, 384, 0);
                        cVarH.U(z2);
                    } else {
                        aVar7 = aVar6;
                        cVarH.L(-703203064);
                        cVarH.U(z2);
                        aVarB = null;
                    }
                    boolean zX2 = cVarH.x(aVar5) | cVarH.K(lv4Var3) | cVarH.K(r25Var3) | cVarH.x(aVar7) | cVarH.K(csfVar2) | cVarH.x(aVarB);
                    Object objV16 = cVarH.v();
                    if (zX2 || objV16 == c0020a) {
                        r25Var2 = r25Var3;
                        final csf.a aVar8 = aVar5;
                        final csf.a aVar9 = aVar7;
                        final csf csfVar4 = csfVar2;
                        final csf.a aVar10 = aVarB;
                        lv4Var2 = lv4Var3;
                        objV16 = new yc6() { // from class: ju4
                            /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
                            @Override // defpackage.yc6
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.nu4 a() {
                                /*
                                    r8 = this;
                                    csf$a r0 = r1
                                    lv4 r1 = r4
                                    r25 r2 = r5
                                    r3 = 0
                                    if (r0 == 0) goto L18
                                    lu4 r4 = new lu4
                                    r4.<init>(r1, r2)
                                    mu4 r5 = new mu4
                                    r5.<init>(r1, r2)
                                    csf$a$a r0 = r0.a(r4, r5)
                                    goto L19
                                L18:
                                    r0 = r3
                                L19:
                                    csf$a r4 = r2
                                    if (r4 == 0) goto L2c
                                    ou4 r5 = new ou4
                                    r5.<init>(r1, r2)
                                    pu4 r6 = new pu4
                                    r6.<init>(r1, r2)
                                    csf$a$a r4 = r4.a(r5, r6)
                                    goto L2d
                                L2c:
                                    r4 = r3
                                L2d:
                                    csf r5 = r3
                                    rsf<S> r5 = r5.a
                                    java.lang.Object r5 = r5.a()
                                    iu4 r6 = defpackage.iu4.a
                                    if (r5 != r6) goto L5b
                                    gsf r5 = r1.a()
                                    vmd r5 = r5.d
                                    if (r5 == 0) goto L49
                                    long r5 = r5.b
                                    mrf r7 = new mrf
                                    r7.<init>(r5)
                                    goto L7a
                                L49:
                                    gsf r5 = r2.a()
                                    vmd r5 = r5.d
                                    if (r5 == 0) goto L59
                                    long r5 = r5.b
                                    mrf r7 = new mrf
                                    r7.<init>(r5)
                                    goto L7a
                                L59:
                                    r7 = r3
                                    goto L7a
                                L5b:
                                    gsf r5 = r2.a()
                                    vmd r5 = r5.d
                                    if (r5 == 0) goto L6b
                                    long r5 = r5.b
                                    mrf r7 = new mrf
                                    r7.<init>(r5)
                                    goto L7a
                                L6b:
                                    gsf r5 = r1.a()
                                    vmd r5 = r5.d
                                    if (r5 == 0) goto L59
                                    long r5 = r5.b
                                    mrf r7 = new mrf
                                    r7.<init>(r5)
                                L7a:
                                    csf$a r8 = r6
                                    if (r8 == 0) goto L89
                                    ru4 r3 = new ru4
                                    r3.<init>(r7, r1, r2)
                                    qu4 r1 = defpackage.qu4.a
                                    csf$a$a r3 = r8.a(r1, r3)
                                L89:
                                    nu4 r8 = new nu4
                                    r8.<init>(r0, r4, r3)
                                    return r8
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ju4.a():nu4");
                            }
                        };
                        cVarH.p(objV16);
                    } else {
                        r25Var2 = r25Var3;
                        lv4Var2 = lv4Var3;
                    }
                    yc6 yc6Var = (yc6) objV16;
                    boolean zA = cVarH.a(z8) | cVarH.K(gu5Var);
                    Object objV17 = cVarH.v();
                    if (zA || objV17 == c0020a) {
                        objV17 = new tu4(gu5Var, z8);
                        cVarH.p(objV17);
                    }
                    e.a aVar11 = e.a.b;
                    androidx.compose.ui.e eVarO = androidx.compose.ui.graphics.a.a(aVar11, (Function1) objV17).o(new EnterExitTransitionElement(csfVar2, aVar2, aVar3, aVar, lv4Var2, r25Var2, gu5Var, yc6Var));
                    cVarH.L(-7429769);
                    cVarH.U(z2);
                    androidx.compose.ui.e eVarO2 = eVar.o(eVarO.o(aVar11));
                    Object objV18 = cVarH.v();
                    if (objV18 == c0020a) {
                        objV18 = new ed0(rd0Var);
                        cVarH.p(objV18);
                    }
                    ed0 ed0Var = (ed0) objV18;
                    int iHashCode = Long.hashCode(cVarH.T);
                    t8b t8bVarP = cVarH.P();
                    androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, eVarO2);
                    gl2.j.getClass();
                    pm8.a aVar12 = gl2.a.b;
                    cVarH.B();
                    if (cVarH.S) {
                        cVarH.y(aVar12);
                    } else {
                        cVarH.n();
                    }
                    ygg.y(cVarH, ed0Var, gl2.a.g);
                    ygg.y(cVarH, t8bVarP, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                        ja.h(iHashCode, cVarH, iHashCode, c0251a);
                    }
                    ygg.y(cVarH, eVarC, gl2.a.d);
                    wu5Var2 = wu5Var;
                    wu5Var2.q(rd0Var, cVarH, Integer.valueOf((i8 >> 18) & 112));
                    cVarH.U(true);
                    cVarH.U(z2);
                }
                cVarH.U(z2);
            } else {
                cVarH.L(-230149485);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new od0(csfVar, function1, eVar, lv4Var, r25Var, function2, wu5Var2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.pb2 r17, boolean r18, androidx.compose.ui.e r19, defpackage.lv4 r20, defpackage.r25 r21, java.lang.String r22, defpackage.wu5<? super defpackage.qd0, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r23, androidx.compose.runtime.b r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.i.b(pb2, boolean, androidx.compose.ui.e, lv4, r25, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.i4a<java.lang.Boolean> r16, androidx.compose.ui.e r17, defpackage.lv4 r18, defpackage.r25 r19, java.lang.String r20, defpackage.wu5<? super defpackage.qd0, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r21, androidx.compose.runtime.b r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.i.c(i4a, androidx.compose.ui.e, lv4, r25, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(defpackage.fhd r20, boolean r21, androidx.compose.ui.e r22, defpackage.lv4 r23, defpackage.r25 r24, java.lang.String r25, defpackage.wu5<? super defpackage.qd0, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r26, androidx.compose.runtime.b r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.i.d(fhd, boolean, androidx.compose.ui.e, lv4, r25, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(boolean r16, androidx.compose.ui.e r17, defpackage.lv4 r18, defpackage.r25 r19, java.lang.String r20, defpackage.wu5<? super defpackage.qd0, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r21, androidx.compose.runtime.b r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.i.e(boolean, androidx.compose.ui.e, lv4, r25, java.lang.String, wu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final <T> void f(csf<T> csfVar, Function1<? super T, Boolean> function1, androidx.compose.ui.e eVar, lv4 lv4Var, r25 r25Var, wu5<? super qd0, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        lv4 lv4Var2;
        r25 r25Var2;
        androidx.compose.runtime.c cVarH = bVar.h(1706321816);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(csfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            lv4Var2 = lv4Var;
            i2 |= cVarH.K(lv4Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            lv4Var2 = lv4Var;
        }
        if ((i & 24576) == 0) {
            r25Var2 = r25Var;
            i2 |= cVarH.K(r25Var2) ? 16384 : 8192;
        } else {
            r25Var2 = r25Var;
        }
        if ((i & 196608) == 0) {
            i2 |= cVarH.x(wu5Var) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new C0012i(function1, csfVar);
                cVarH.p(objV);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.layout.i.a(eVar, (wu5) objV);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = j.a;
                cVarH.p(objV2);
            }
            a(csfVar, function1, eVarA, lv4Var2, r25Var2, (Function2) objV2, wu5Var, cVarH, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new k(csfVar, function1, eVar, lv4Var, r25Var, wu5Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final iu4 g(csf csfVar, Function1 function1, Object obj, androidx.compose.runtime.b bVar) {
        bVar.A(-422486105, csfVar);
        boolean zH = csfVar.h();
        rsf<S> rsfVar = csfVar.a;
        iu4 iu4Var = iu4.a;
        iu4 iu4Var2 = iu4.c;
        iu4 iu4Var3 = iu4.b;
        if (zH) {
            bVar.L(-212146657);
            bVar.F();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                iu4Var = iu4Var3;
            } else if (((Boolean) function1.invoke(rsfVar.a())).booleanValue()) {
                iu4Var = iu4Var2;
            }
        } else {
            bVar.L(-211872524);
            Object objV = bVar.v();
            if (objV == b.a.a) {
                objV = r.f(Boolean.FALSE);
                bVar.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (((Boolean) function1.invoke(rsfVar.a())).booleanValue()) {
                g4aVar.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                iu4Var = iu4Var3;
            } else if (((Boolean) g4aVar.getValue()).booleanValue()) {
                iu4Var = iu4Var2;
            }
            bVar.F();
        }
        bVar.I();
        return iu4Var;
    }
}
