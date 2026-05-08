package defpackage;

import defpackage.j29;
import defpackage.kma;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nw7 {
    public static final nw7 d;
    public final ic8 a;
    public final Function1<mq5, v2d> b;
    public final boolean c;

    public /* synthetic */ class a extends qv5 implements Function1<mq5, v2d> {
        public static final a a = new a(1, lv7.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

        @Override // kotlin.jvm.functions.Function1
        public final v2d invoke(mq5 mq5Var) {
            mq5 mq5Var2 = mq5Var;
            mq5Var2.getClass();
            mq5 mq5Var3 = lv7.a;
            kma.a.getClass();
            up1 up1Var = kma.a.b;
            cj8 cj8Var = new cj8(1, 7, 20);
            up1Var.getClass();
            v2d v2dVar = (v2d) ((j29.j) up1Var.d).invoke(mq5Var2);
            if (v2dVar != null) {
                return v2dVar;
            }
            up1 up1Var2 = lv7.c;
            up1Var2.getClass();
            mv7 mv7Var = (mv7) ((j29.j) up1Var2.d).invoke(mq5Var2);
            if (mv7Var == null) {
                return v2d.IGNORE;
            }
            cj8 cj8Var2 = mv7Var.b;
            return (cj8Var2 == null || cj8Var2.d - cj8Var.d > 0) ? mv7Var.a : mv7Var.c;
        }
    }

    static {
        mq5 mq5Var = lv7.a;
        cj8 cj8Var = cj8.e;
        cj8Var.getClass();
        mv7 mv7Var = lv7.d;
        cj8 cj8Var2 = mv7Var.b;
        v2d v2dVar = (cj8Var2 == null || cj8Var2.d - cj8Var.d > 0) ? mv7Var.a : mv7Var.c;
        v2dVar.getClass();
        d = new nw7(new ic8(v2dVar, v2dVar == v2d.WARN ? null : v2dVar), a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nw7(ic8 ic8Var, Function1<? super mq5, ? extends v2d> function1) {
        function1.getClass();
        this.a = ic8Var;
        this.b = function1;
        this.c = ic8Var.d || function1.invoke(lv7.a) == v2d.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + this.b + ')';
    }
}
