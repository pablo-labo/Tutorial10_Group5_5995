package defpackage;

import androidx.compose.runtime.b;
import defpackage.ftg;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yy6 implements wu5<Function2<? super b, ? super Integer, ? extends j6g>, b, Integer, j6g> {
    public final /* synthetic */ String V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ d3a X;
    public final /* synthetic */ g4a<jhf> Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ fv6 a;
    public final /* synthetic */ zrd a0;
    public final /* synthetic */ ar6 b;
    public final /* synthetic */ String b0;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ o97 d;
    public final /* synthetic */ long d0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long e0;
    public final /* synthetic */ Function1<String, j6g> f;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;

    public yy6(fv6 fv6Var, ar6 ar6Var, String str, o97 o97Var, boolean z, Function1 function1, String str2, boolean z2, d3a d3aVar, g4a g4aVar, String str3, zrd zrdVar, String str4, boolean z3, long j, long j2, long j3, long j4) {
        this.a = fv6Var;
        this.b = ar6Var;
        this.c = str;
        this.d = o97Var;
        this.e = z;
        this.f = function1;
        this.V = str2;
        this.W = z2;
        this.X = d3aVar;
        this.Y = g4aVar;
        this.Z = str3;
        this.a0 = zrdVar;
        this.b0 = str4;
        this.c0 = z3;
        this.d0 = j;
        this.e0 = j2;
        this.f0 = j3;
        this.g0 = j4;
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
            String str = this.c;
            fv6 fv6Var = this.a;
            ah2 ah2Var = fv6Var == null ? null : new ah2(-1014196944, new az6(fv6Var, this.b, str), true);
            String str2 = this.Y.getValue().a.b;
            hza hzaVar = new hza(12.0f, 12.0f, 12.0f, 12.0f);
            ah2 ah2Var2 = !this.e ? null : new ah2(-803835253, new cz6(str, this.V, this.f), true);
            String str3 = this.Z;
            zrd zrdVar = this.a0;
            o97 o97Var = this.d;
            owa.a.c(str2, function22, true, this.W, ftg.a.a, this.X, false, null, bh2.c(687096810, new vy6(str3, str, zrdVar, o97Var), bVar2), ah2Var, ah2Var2, bh2.c(2059357594, new wy6(), bVar2), null, null, null, hzaVar, bh2.c(-282292683, new xy6(this.c0, this.X, this.d0, this.e0, this.f0, this.g0, o97Var), bVar2), bVar2, ((iIntValue << 3) & 112) | 100687872, 14155824, 28864);
        }
        return j6g.a;
    }
}
