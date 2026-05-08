package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bd9 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ String $code;
        final /* synthetic */ gza $codeBlockPadding;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gza gzaVar, String str, tjf tjfVar) {
            super(2);
            this.$codeBlockPadding = gzaVar;
            this.$code = str;
            this.$style = tjfVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                long jD = ((cd9) bVar2.M(rk2.d)).d();
                hkf.a(this.$code, this.$style, androidx.compose.foundation.layout.f.e(pnb.M(e.a.b, pnb.L(0, 1, bVar2), false), this.$codeBlockPadding), jD, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, 0, null, bVar2, 0, 0, 131056);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $code;
        final /* synthetic */ tjf $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, tjf tjfVar, int i, int i2) {
            super(2);
            this.$code = str;
            this.$style = tjfVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            bd9.a(this.$code, this.$style, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<s5e, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            s5e s5eVar2 = s5eVar;
            s5eVar2.getClass();
            o5e.k(s5eVar2);
            return j6g.a;
        }
    }

    @uh3(c = "com.mikepenz.markdown.compose.elements.MarkdownCodeKt$MarkdownCodeBackground$2", f = "MarkdownCode.kt", l = {}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            return ((d) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ bj1 $border;
        final /* synthetic */ long $color;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ float $elevation;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ dce $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j, androidx.compose.ui.e eVar, dce dceVar, bj1 bj1Var, float f, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$color = j;
            this.$modifier = eVar;
            this.$shape = dceVar;
            this.$border = bj1Var;
            this.$elevation = f;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            bd9.b(this.$color, this.$modifier, this.$shape, this.$border, this.$elevation, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, y yVar, int i) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            bd9.c(this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $content;
        final /* synthetic */ y $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, y yVar, int i) {
            super(2);
            this.$content = str;
            this.$node = yVar;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            bd9.d(this.$content, this.$node, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(String str, tjf tjfVar, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(1079174087);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && cVarH.K(tjfVar)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
                int i4 = i2 & 2;
            } else if ((i2 & 2) != 0) {
                tjfVar = ((ae9) cVarH.M(rk2.e)).f();
            }
            cVarH.V();
            b(((cd9) cVarH.M(rk2.d)).e(), androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.f(e.a.b, 1.0f), 0.0f, 8.0f, 1), ggd.a(((id9) cVarH.M(rk2.g)).c()), null, 0.0f, bh2.b(cVarH, -1509917333, new a(((ud9) cVarH.M(rk2.f)).a(), str, tjfVar)), cVarH, 196656, 24);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(str, tjfVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(long r17, androidx.compose.ui.e r19, defpackage.dce r20, defpackage.bj1 r21, float r22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r23, androidx.compose.runtime.b r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd9.b(long, androidx.compose.ui.e, dce, bj1, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void c(String str, y yVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-940411456);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(yVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            a(sve.w(str.subSequence(yVar.a().get(0).c(), yVar.a().get(yVar.a().size() - 1).b()).toString()), null, cVarH, 0, 2);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new f(str, yVar, i);
        }
    }

    public static final void d(String str, y yVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        str.getClass();
        yVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-41793692);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(yVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else if (yVar.a().size() >= 3) {
            int iC = yVar.a().get(2).c();
            List<y> listA = yVar.a();
            int size = yVar.a().size() - 2;
            if (size < 2) {
                size = 2;
            }
            a(sve.w(str.subSequence(iC, listA.get(size).b()).toString()), null, cVarH, 0, 2);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new g(str, yVar, i);
        }
    }
}
