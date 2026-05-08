package defpackage;

import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kw9 {

    public static final class a extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ bv9 $dialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bv9 bv9Var) {
            super(1);
            this.$dialog = bv9Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            this.$dialog.show();
            return new jw9(this.$dialog);
        }
    }

    public static final class b extends mj8 implements gu5<j6g> {
        final /* synthetic */ bv9 $dialog;
        final /* synthetic */ vl8 $layoutDirection;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ fw9 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bv9 bv9Var, gu5<j6g> gu5Var, fw9 fw9Var, vl8 vl8Var) {
            super(0);
            this.$dialog = bv9Var;
            this.$onDismissRequest = gu5Var;
            this.$properties = fw9Var;
            this.$layoutDirection = vl8Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$dialog.d(this.$onDismissRequest, this.$properties, this.$layoutDirection);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ fw9 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gu5<j6g> gu5Var, fw9 fw9Var, zb0<Float, ce0> zb0Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$onDismissRequest = gu5Var;
            this.$properties = fw9Var;
            this.$predictiveBackProgress = zb0Var;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            kw9.a(this.$onDismissRequest, this.$properties, this.$predictiveBackProgress, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ ese<Function2<androidx.compose.runtime.b, Integer, j6g>> $currentContent$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g4a g4aVar) {
            super(2);
            this.$currentContent$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarB = b5e.b(e.a.b, false, lw9.a);
                ese<Function2<androidx.compose.runtime.b, Integer, j6g>> eseVar = this.$currentContent$delegate;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarB);
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
                eseVar.getValue().invoke(bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements gu5<UUID> {
        public static final e a = new e(0);

        @Override // defpackage.gu5
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r22, defpackage.fw9 r23, defpackage.zb0<java.lang.Float, defpackage.ce0> r24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r25, androidx.compose.runtime.b r26, int r27) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw9.a(gu5, fw9, zb0, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int):void");
    }
}
