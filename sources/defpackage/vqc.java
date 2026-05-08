package defpackage;

import defpackage.i64;
import defpackage.vr1;
import defpackage.x54;

/* JADX INFO: loaded from: classes.dex */
public final class vqc implements x54 {
    public final pa5 a;
    public final i64 b;

    public static final class a {
        public final i64.a a;

        public a(i64.a aVar) {
            this.a = aVar;
        }

        public final b a() {
            i64.c cVarP;
            i64.a aVar = this.a;
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                aVar.a(true);
                cVarP = i64Var.p(aVar.a.a);
            }
            if (cVarP != null) {
                return new b(cVarP);
            }
            return null;
        }

        public final w5b b() {
            return this.a.b(0);
        }
    }

    public static final class b implements x54.b {
        public final i64.c a;

        public b(i64.c cVar) {
            this.a = cVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.a.close();
        }

        @Override // x54.b
        public final w5b getData() {
            i64.c cVar = this.a;
            if (!cVar.b) {
                return cVar.a.c.get(1);
            }
            r6.g("snapshot is closed");
            return null;
        }

        @Override // x54.b
        public final w5b getMetadata() {
            i64.c cVar = this.a;
            if (!cVar.b) {
                return cVar.a.c.get(0);
            }
            r6.g("snapshot is closed");
            return null;
        }

        @Override // x54.b
        public final a p1() {
            i64.a aVarH;
            i64.c cVar = this.a;
            i64 i64Var = i64.this;
            synchronized (i64Var) {
                cVar.close();
                aVarH = i64Var.h(cVar.a.a);
            }
            if (aVarH != null) {
                return new a(aVarH);
            }
            return null;
        }
    }

    public vqc(long j, y03 y03Var, pa5 pa5Var, w5b w5bVar) {
        this.a = pa5Var;
        this.b = new i64(j, y03Var, pa5Var, w5bVar);
    }

    @Override // defpackage.x54
    public final b a(String str) {
        vr1 vr1Var = vr1.c;
        i64.c cVarP = this.b.p(vr1.a.c(str).e("SHA-256").m());
        if (cVarP != null) {
            return new b(cVarP);
        }
        return null;
    }

    @Override // defpackage.x54
    public final a b(String str) {
        vr1 vr1Var = vr1.c;
        i64.a aVarH = this.b.h(vr1.a.c(str).e("SHA-256").m());
        if (aVarH != null) {
            return new a(aVarH);
        }
        return null;
    }

    @Override // defpackage.x54
    public final pa5 getFileSystem() {
        return this.a;
    }
}
