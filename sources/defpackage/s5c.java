package defpackage;

import defpackage.u4c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s5c {
    public final o8a a;
    public final hyf b;
    public final qne c;

    public static final class a extends s5c {
        public final u4c d;
        public final a e;
        public final a62 f;
        public final u4c.c g;
        public final boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u4c u4cVar, o8a o8aVar, hyf hyfVar, qne qneVar, a aVar) {
            super(o8aVar, hyfVar, qneVar);
            u4cVar.getClass();
            o8aVar.getClass();
            this.d = u4cVar;
            this.e = aVar;
            this.f = q8a.a(o8aVar, u4cVar.q0());
            u4c.c cVar = (u4c.c) ch5.f.c(u4cVar.p0());
            this.g = cVar == null ? u4c.c.CLASS : cVar;
            this.h = ch5.g.c(u4cVar.p0()).booleanValue();
            ch5.h.getClass();
        }

        @Override // defpackage.s5c
        public final mq5 a() {
            return this.f.a();
        }
    }

    public static final class b extends s5c {
        public final mq5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mq5 mq5Var, o8a o8aVar, hyf hyfVar, qne qneVar) {
            super(o8aVar, hyfVar, qneVar);
            mq5Var.getClass();
            o8aVar.getClass();
            this.d = mq5Var;
        }

        @Override // defpackage.s5c
        public final mq5 a() {
            return this.d;
        }
    }

    public s5c(o8a o8aVar, hyf hyfVar, qne qneVar) {
        this.a = o8aVar;
        this.b = hyfVar;
        this.c = qneVar;
    }

    public abstract mq5 a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
