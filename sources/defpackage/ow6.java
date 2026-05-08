package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import defpackage.ftg;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ow6 implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    public final /* synthetic */ o97 a;
    public final /* synthetic */ jhf b;
    public final /* synthetic */ d3a c;
    public final /* synthetic */ String d;

    public ow6(o97 o97Var, jhf jhfVar, d3a d3aVar, String str) {
        this.a = o97Var;
        this.b = jhfVar;
        this.c = d3aVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wu5
    public final j6g q(Function2<? super b, ? super Integer, ? extends j6g> function2, b bVar, Integer num) {
        Function2<? super b, ? super Integer, ? extends j6g> function22 = function2;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        function22.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.x(function22) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && bVar2.i()) {
            bVar2.D();
        } else {
            o97 o97Var = this.a;
            long j = o97Var.c.b.a;
            zdf zdfVarD = fef.d(j, j, j, j, bVar2);
            fef.a.b(this.b.a.b, function22, true, false, ftg.a.a, this.c, false, null, bh2.c(235730650, new nw6(o97Var, this.d), bVar2), null, null, null, null, null, null, zdfVarD, f.b(12.0f, 8.0f, 12.0f, 0.0f, 8), null, bVar2, ((iIntValue << 3) & 112) | 100887552, 100663296, 163520);
        }
        return j6g.a;
    }
}
