package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m10 {
    public static final /* synthetic */ int a = 0;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ o44 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(gu5<j6g> gu5Var, e eVar, o44 o44Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$onDismissRequest = gu5Var;
            this.$modifier = eVar;
            this.$properties = o44Var;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            m10.a(this.$onDismissRequest, this.$modifier, this.$properties, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$modifier = eVar;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                String strV = boa.v(R.string.m3c_dialog, bVar2);
                e eVar = this.$modifier;
                int i = m10.a;
                e eVarQ = g.q(eVar, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                boolean zK = bVar2.K(strV);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new z10(strV);
                    bVar2.p(objV);
                }
                e eVarO = eVarQ.o(b5e.b(e.a.b, false, (Function1) objV));
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$content;
                ag9 ag9VarD = hl1.d(c20.a.a, true);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                e eVarC = androidx.compose.ui.c.c(bVar2, eVarO);
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
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                function2.invoke(bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ o44 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gu5<j6g> gu5Var, e eVar, o44 o44Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$onDismissRequest = gu5Var;
            this.$modifier = eVar;
            this.$properties = o44Var;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            m10.b(this.$onDismissRequest, this.$modifier, this.$properties, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    static {
        if (!((24.0f >= 0.0f) & (24.0f >= 0.0f) & (24.0f >= 0.0f) & (24.0f >= 0.0f))) {
            yd7.a("Padding must be non-negative");
        }
        f.b(0.0f, 0.0f, 0.0f, 16.0f, 7);
        f.b(0.0f, 0.0f, 0.0f, 16.0f, 7);
        f.b(0.0f, 0.0f, 0.0f, 24.0f, 7);
    }

    @sy3
    public static final void a(gu5<j6g> gu5Var, e eVar, o44 o44Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        gu5<j6g> gu5Var2;
        Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22;
        e eVar2;
        o44 o44Var2;
        androidx.compose.runtime.c cVarH = bVar.h(325249497);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.K(eVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(o44Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i3 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            function22 = function2;
            o44Var2 = o44Var;
            eVar2 = eVar;
            gu5Var2 = gu5Var;
        } else {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            e eVar3 = eVar;
            if (i5 != 0) {
                o44Var = new o44(7);
            }
            o44 o44Var3 = o44Var;
            b(gu5Var, eVar3, o44Var3, function2, cVarH, i3 & 8190, 0);
            gu5Var2 = gu5Var;
            function22 = function2;
            eVar2 = eVar3;
            o44Var2 = o44Var3;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(gu5Var2, eVar2, o44Var2, function22, i, i2);
        }
    }

    public static final void b(gu5<j6g> gu5Var, e eVar, o44 o44Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        o44 o44Var2;
        androidx.compose.runtime.c cVarH = bVar.h(-1922902937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.K(eVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(o44Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i3 & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            o44Var2 = o44Var;
        } else {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            if (i5 != 0) {
                o44Var = new o44(7);
            }
            o44 o44Var3 = o44Var;
            z60.a(gu5Var, o44Var3, bh2.c(905289008, new b(eVar, function2), cVarH), cVarH, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
            o44Var2 = o44Var3;
        }
        e eVar2 = eVar;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(gu5Var, eVar2, o44Var2, function2, i, i2);
        }
    }
}
