package androidx.compose.ui.layout;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.bg9;
import defpackage.bxe;
import defpackage.gl2;
import defpackage.gu5;
import defpackage.iq2;
import defpackage.j6g;
import defpackage.ja;
import defpackage.ka2;
import defpackage.m74;
import defpackage.mj8;
import defpackage.pm8;
import defpackage.t8b;
import defpackage.to4;
import defpackage.wl7;
import defpackage.ygg;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final a a = new a();

    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<bxe, iq2, bg9> $measurePolicy;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.e eVar, Function2<? super bxe, ? super iq2, ? extends bg9> function2, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$measurePolicy = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            d0.a(this.$modifier, this.$measurePolicy, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ e0 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var) {
            super(0);
            this.$state = e0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
        @Override // defpackage.gu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g invoke() {
            /*
                r15 = this;
                androidx.compose.ui.layout.e0 r15 = r15.$state
                androidx.compose.ui.layout.j r15 = r15.a()
                pm8 r0 = r15.a
                java.util.List r1 = r0.E()
                j4a$a r1 = (j4a.a) r1
                j4a<T> r1 = r1.a
                int r1 = r1.c
                int r2 = r15.c0
                if (r2 == r1) goto L74
                z3a<pm8, androidx.compose.ui.layout.j$b> r15 = r15.f
                java.lang.Object[] r1 = r15.c
                long[] r15 = r15.a
                int r2 = r15.length
                int r2 = r2 + (-2)
                r3 = 7
                r4 = 0
                if (r2 < 0) goto L5d
                r5 = r4
            L24:
                r6 = r15[r5]
                long r8 = ~r6
                long r8 = r8 << r3
                long r8 = r8 & r6
                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r8 = r8 & r10
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L58
                int r8 = r5 - r2
                int r8 = ~r8
                int r8 = r8 >>> 31
                r9 = 8
                int r8 = 8 - r8
                r10 = r4
            L3d:
                if (r10 >= r8) goto L56
                r11 = 255(0xff, double:1.26E-321)
                long r11 = r11 & r6
                r13 = 128(0x80, double:6.32E-322)
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 >= 0) goto L52
                int r11 = r5 << 3
                int r11 = r11 + r10
                r11 = r1[r11]
                androidx.compose.ui.layout.j$b r11 = (androidx.compose.ui.layout.j.b) r11
                r12 = 1
                r11.d = r12
            L52:
                long r6 = r6 >> r9
                int r10 = r10 + 1
                goto L3d
            L56:
                if (r8 != r9) goto L5d
            L58:
                if (r5 == r2) goto L5d
                int r5 = r5 + 1
                goto L24
            L5d:
                pm8 r15 = r0.V
                if (r15 == 0) goto L6b
                um8 r15 = r0.u0
                boolean r15 = r15.e
                if (r15 != 0) goto L74
                defpackage.pm8.h0(r0, r4, r3)
                goto L74
            L6b:
                boolean r15 = r0.G()
                if (r15 != 0) goto L74
                defpackage.pm8.j0(r0, r4, r3)
            L74:
                j6g r15 = defpackage.j6g.a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.d0.c.invoke():java.lang.Object");
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<bxe, iq2, bg9> $measurePolicy;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ e0 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e0 e0Var, androidx.compose.ui.e eVar, Function2<? super bxe, ? super iq2, ? extends bg9> function2, int i, int i2) {
            super(2);
            this.$state = e0Var;
            this.$modifier = eVar;
            this.$measurePolicy = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            d0.b(this.$state, this.$modifier, this.$measurePolicy, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Function2<? super bxe, ? super iq2, ? extends bg9> function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        Function2<? super bxe, ? super iq2, ? extends bg9> function22;
        androidx.compose.runtime.c cVarH = bVar.h(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            androidx.compose.ui.e eVar2 = eVar;
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new e0();
                cVarH.p(objV);
            }
            function22 = function2;
            b((e0) objV, eVar2, function22, cVarH, (i3 << 3) & 1008, 0);
            eVar = eVar2;
        } else {
            function22 = function2;
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(eVar, function22, i, i2);
        }
    }

    public static final void b(e0 e0Var, androidx.compose.ui.e eVar, Function2<? super bxe, ? super iq2, ? extends bg9> function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-511989831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.x(e0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            int iHashCode = Long.hashCode(cVarH.T);
            c.b bVarH = cVarH.H();
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            t8b t8bVarP = cVarH.P();
            pm8.a aVar = pm8.G0;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, e0Var, e0Var.c);
            ygg.y(cVarH, bVarH, e0Var.d);
            ygg.y(cVarH, function2, e0Var.e);
            gl2.j.getClass();
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            ygg.y(cVarH, eVarC, gl2.a.d);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            cVarH.U(true);
            if (cVarH.i()) {
                cVarH.L(-1259216055);
                cVarH.U(false);
            } else {
                cVarH.L(-1259274676);
                boolean zX = cVarH.x(e0Var);
                Object objV = cVarH.v();
                if (zX || objV == b.a.a) {
                    objV = new c(e0Var);
                    cVarH.p(objV);
                }
                m74 m74Var = to4.a;
                cVarH.E((gu5) objV);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d(e0Var, eVar2, function2, i, i2);
        }
    }
}
