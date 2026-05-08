package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class le6 implements jp4 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final cjg a;
    public final g4b b;
    public final boolean[] c = new boolean[4];
    public final a d;
    public final l8a e;
    public b f;
    public long g;
    public String h;
    public zpf i;
    public boolean j;
    public long k;

    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public final void a(int i, byte[] bArr, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    public static final class b {
        public final zpf a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(zpf zpfVar) {
            this.a = zpfVar;
        }

        public final void a(int i, byte[] bArr, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
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
        public final void b(int i, long j, boolean z) {
            ka2.q(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }

    public le6(cjg cjgVar) {
        this.a = cjgVar;
        a aVar = new a();
        aVar.e = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.d = aVar;
        this.k = -9223372036854775807L;
        this.e = new l8a(178);
        this.b = new g4b();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g4b r20) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le6.a(g4b):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        m8a.a(this.c);
        a aVar = this.d;
        aVar.a = false;
        aVar.c = 0;
        aVar.b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        l8a l8aVar = this.e;
        if (l8aVar != null) {
            l8aVar.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
        ka2.r(this.f);
        if (z) {
            this.f.b(0, this.g, this.j);
            b bVar = this.f;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.h = cVar.e;
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 2);
        this.i = zpfVarO;
        this.f = new b(zpfVarO);
        this.a.b(o55Var, cVar);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.k = j;
    }
}
