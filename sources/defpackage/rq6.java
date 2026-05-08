package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rq6 {

    public static final class a extends mj8 implements Function1<s5e, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            o5e.i(s5eVar, 0);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                e eVarO = g.o(e.a.b, 40.0f, 40.0f);
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$content;
                ag9 ag9VarD = hl1.d(c20.a.e, false);
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
        final /* synthetic */ nq6 $colors;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gu5<j6g> gu5Var, e eVar, boolean z, dce dceVar, nq6 nq6Var, d3a d3aVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$shape = dceVar;
            this.$colors = nq6Var;
            this.$interactionSource = d3aVar;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            rq6.a(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ nq6 $colors;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gu5<j6g> gu5Var, e eVar, boolean z, nq6 nq6Var, d3a d3aVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z;
            this.$colors = nq6Var;
            this.$interactionSource = d3aVar;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            rq6.b(this.$onClick, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r24, androidx.compose.ui.e r25, boolean r26, defpackage.dce r27, defpackage.nq6 r28, defpackage.d3a r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r30, androidx.compose.runtime.b r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq6.a(gu5, androidx.compose.ui.e, boolean, dce, nq6, d3a, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.gu5<defpackage.j6g> r25, androidx.compose.ui.e r26, boolean r27, defpackage.nq6 r28, defpackage.d3a r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r30, androidx.compose.runtime.b r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq6.b(gu5, androidx.compose.ui.e, boolean, nq6, d3a, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }
}
