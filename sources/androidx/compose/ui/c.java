package androidx.compose.ui;

import androidx.compose.ui.e;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.pxf;
import defpackage.wf7;
import defpackage.wu5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a extends mj8 implements Function1<e.b, Boolean> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(e.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    public static final class b extends mj8 implements Function2<e, e.b, e> {
        final /* synthetic */ androidx.compose.runtime.b $this_materializeImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.runtime.b bVar) {
            super(2);
            this.$this_materializeImpl = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final e invoke(e eVar, e.b bVar) {
            e eVar2 = eVar;
            e.b bVarB = bVar;
            if (bVarB instanceof androidx.compose.ui.b) {
                wu5<e, androidx.compose.runtime.b, Integer, e> wu5Var = ((androidx.compose.ui.b) bVarB).d;
                pxf.d(3, wu5Var);
                bVarB = c.b(this.$this_materializeImpl, wu5Var.q(e.a.b, this.$this_materializeImpl, 0));
            }
            return eVar2.o(bVarB);
        }
    }

    public static final e a(e eVar, Function1<? super wf7, j6g> function1, wu5<? super e, ? super androidx.compose.runtime.b, ? super Integer, ? extends e> wu5Var) {
        return eVar.o(new androidx.compose.ui.b(function1, wu5Var));
    }

    public static final e b(androidx.compose.runtime.b bVar, e eVar) {
        if (eVar.e(a.a)) {
            return eVar;
        }
        bVar.u(1219399079);
        e eVar2 = (e) eVar.c(e.a.b, new b(bVar));
        bVar.J();
        return eVar2;
    }

    public static final e c(androidx.compose.runtime.b bVar, e eVar) {
        bVar.L(439770924);
        e eVarB = b(bVar, eVar);
        bVar.F();
        return eVarB;
    }
}
