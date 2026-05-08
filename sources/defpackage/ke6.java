package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ke6 implements jp4 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public zpf b;
    public final cjg c;
    public final String d;
    public final g4b e;
    public final l8a f;
    public final boolean[] g = new boolean[4];
    public final a h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public final void a(int i, byte[] bArr, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b + i3;
                if (length < i4) {
                    this.d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }
    }

    public ke6(cjg cjgVar, String str) {
        this.c = cjgVar;
        this.d = str;
        a aVar = new a();
        aVar.d = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.h = aVar;
        if (cjgVar != null) {
            this.f = new l8a(178);
            this.e = new g4b();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
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
    public final void a(defpackage.g4b r23) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke6.a(g4b):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        m8a.a(this.g);
        a aVar = this.h;
        aVar.a = false;
        aVar.b = 0;
        aVar.c = 0;
        l8a l8aVar = this.f;
        if (l8aVar != null) {
            l8aVar.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

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
    public final void d(boolean z) {
        ka2.r(this.b);
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.a = cVar.e;
        cVar.b();
        this.b = o55Var.o(cVar.d, 2);
        cjg cjgVar = this.c;
        if (cjgVar != null) {
            cjgVar.b(o55Var, cVar);
        }
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.m = j;
    }
}
