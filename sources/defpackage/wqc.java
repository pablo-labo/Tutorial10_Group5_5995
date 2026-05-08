package defpackage;

import defpackage.l64;
import defpackage.vr1;
import defpackage.y54;

/* JADX INFO: loaded from: classes.dex */
public final class wqc implements y54 {
    public final pa5 a;
    public final l64 b;

    public static final class a implements y54.b {
        public final l64.b a;

        public a(l64.b bVar) {
            this.a = bVar;
        }

        @Override // y54.b
        public final void a() {
            this.a.a(false);
        }

        @Override // y54.b
        public final b b() {
            l64.d dVarP;
            l64.b bVar = this.a;
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                bVar.a(true);
                dVarP = l64Var.p(bVar.a.a);
            }
            if (dVarP != null) {
                return new b(dVarP);
            }
            return null;
        }
    }

    public static final class b implements y54.c {
        public final l64.d a;

        public b(l64.d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.a.close();
        }

        @Override // y54.c
        public final a g1() {
            l64.b bVarH;
            l64.d dVar = this.a;
            l64 l64Var = l64.this;
            synchronized (l64Var.W) {
                dVar.close();
                bVarH = l64Var.h(dVar.a.a);
            }
            if (bVarH != null) {
                return new a(bVarH);
            }
            return null;
        }

        @Override // y54.c
        public final w5b getData() {
            l64.d dVar = this.a;
            if (!dVar.b) {
                return dVar.a.c.get(1);
            }
            r6.g("snapshot is closed");
            return null;
        }

        @Override // y54.c
        public final w5b getMetadata() {
            l64.d dVar = this.a;
            if (!dVar.b) {
                return dVar.a.c.get(0);
            }
            r6.g("snapshot is closed");
            return null;
        }
    }

    public wqc(long j, y03 y03Var, pa5 pa5Var, w5b w5bVar) {
        this.a = pa5Var;
        this.b = new l64(j, y03Var, pa5Var, w5bVar);
    }

    @Override // defpackage.y54
    public final a a(String str) {
        vr1 vr1Var = vr1.c;
        l64.b bVarH = this.b.h(vr1.a.c(str).e("SHA-256").m());
        if (bVarH != null) {
            return new a(bVarH);
        }
        return null;
    }

    @Override // defpackage.y54
    public final b b(String str) {
        vr1 vr1Var = vr1.c;
        l64.d dVarP = this.b.p(vr1.a.c(str).e("SHA-256").m());
        if (dVarP != null) {
            return new b(dVarP);
        }
        return null;
    }

    @Override // defpackage.y54
    public final pa5 getFileSystem() {
        return this.a;
    }
}
