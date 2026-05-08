package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ae1 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ ah2 b;

    public ae1(String str, ah2 ah2Var) {
        this.a = str;
        this.b = ah2Var;
    }

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
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = this.a;
            boolean zK = bVar2.K(str);
            Object objV = bVar2.v();
            if (zK || objV == b.a.a) {
                objV = new zd1(str, 0);
                bVar2.p(objV);
            }
            e eVarB = b5e.b(e.a.b, false, (Function1) objV);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(bVar2.k());
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarB);
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
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                uz.g(iHashCode, bVar2, iHashCode, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            this.b.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
