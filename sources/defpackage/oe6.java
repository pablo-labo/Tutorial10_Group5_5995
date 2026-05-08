package defpackage;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.m8a;
import defpackage.vuf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class oe6 implements jp4 {
    public final lzd a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public zpf j;
    public a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final l8a d = new l8a(7);
    public final l8a e = new l8a(8);
    public final l8a f = new l8a(6);
    public long m = -9223372036854775807L;
    public final g4b o = new g4b();

    public static final class a {
        public final zpf a;
        public final boolean b;
        public final boolean c;
        public final h4b f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public boolean k;
        public long l;
        public boolean o;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray<m8a.m> d = new SparseArray<>();
        public final SparseArray<m8a.l> e = new SparseArray<>();
        public C0366a m = new C0366a();
        public C0366a n = new C0366a();

        /* JADX INFO: renamed from: oe6$a$a, reason: collision with other inner class name */
        public static final class C0366a {
            public boolean a;
            public boolean b;
            public m8a.m c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public a(zpf zpfVar, boolean z, boolean z2) {
            this.a = zpfVar;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
            this.g = bArr;
            this.f = new h4b(bArr, 0, 0);
            this.k = false;
            this.o = false;
            C0366a c0366a = this.n;
            c0366a.b = false;
            c0366a.a = false;
        }
    }

    public oe6(lzd lzdVar, boolean z, boolean z2) {
        this.a = lzdVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        int i;
        ka2.r(this.j);
        String str = vjg.a;
        int i2 = g4bVar.b;
        int i3 = g4bVar.c;
        byte[] bArr = g4bVar.a;
        this.g += (long) g4bVar.a();
        this.j.f(g4bVar.a(), g4bVar);
        while (true) {
            int iB = m8a.b(bArr, i2, i3, this.h);
            if (iB == i3) {
                g(i2, bArr, i3);
                return;
            }
            int i4 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i5 = iB;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                g(i2, bArr, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            b(i8, i7 < 0 ? -i7 : 0, j, this.m);
            h(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
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
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output", "sampleReader"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe6.b(int, int, long, long):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        m8a.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.c.b(0);
        a aVar = this.k;
        if (aVar != null) {
            aVar.k = false;
            aVar.o = false;
            a.C0366a c0366a = aVar.n;
            c0366a.b = false;
            c0366a.a = false;
        }
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
        ka2.r(this.j);
        String str = vjg.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.g, this.m);
            h(this.g, 9, this.m);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.i = cVar.e;
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 2);
        this.j = zpfVarO;
        this.k = new a(zpfVarO, this.b, this.c);
        this.a.a(o55Var, cVar);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r17, byte[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe6.g(int, byte[], int):void");
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        a aVar = this.k;
        boolean z = this.n;
        aVar.i = i;
        aVar.l = j2;
        aVar.j = j;
        aVar.s = z;
        if (!aVar.b || i != 1) {
            if (!aVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        a.C0366a c0366a = aVar.m;
        aVar.m = aVar.n;
        aVar.n = c0366a;
        c0366a.b = false;
        c0366a.a = false;
        aVar.h = 0;
        aVar.k = true;
    }
}
