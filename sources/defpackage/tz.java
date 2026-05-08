package defpackage;

import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tz implements jp4 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public zpf h;
    public zpf i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public zpf v;
    public long w;
    public final f4b b = new f4b(new byte[7], 7);
    public final g4b c = new g4b(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;

    public tz(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x020b  */
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
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g4b r24) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz.a(g4b):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 1);
        this.h = zpfVarO;
        this.v = zpfVarO;
        if (!this.a) {
            this.i = new u54();
            return;
        }
        cVar.a();
        cVar.b();
        zpf zpfVarO2 = o55Var.o(cVar.d, 5);
        this.i = zpfVarO2;
        a.C0036a c0036a = new a.C0036a();
        cVar.b();
        c0036a.a = cVar.e;
        c0036a.l = st9.p(this.f);
        c0036a.m = st9.p("application/id3");
        t40.n(c0036a, zpfVarO2);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.u = j;
    }
}
