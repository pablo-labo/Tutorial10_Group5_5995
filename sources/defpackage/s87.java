package defpackage;

import android.content.Context;
import defpackage.v03;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class s87 implements xh8 {
    public static final Lazy<s87> f = boa.E(qt8.a, new b(new a()));
    public final Context a;
    public final e13 b;
    public final d2f c;
    public final Lazy d;
    public final Lazy e;

    public static final class a implements xh8 {
        public static e5g a(gz4 gz4Var, eke ekeVar) {
            gz4Var.getClass();
            ekeVar.getClass();
            s87 value = s87.f.getValue();
            value.getClass();
            u63.Y(value.b, null, null, new t87(value, ekeVar, null), 3);
            return ekeVar.a(gz4Var);
        }

        public static void b(gz4 gz4Var, dpe dpeVar) {
            gz4Var.getClass();
            s87 value = s87.f.getValue();
            value.getClass();
            u63.Y(value.b, null, null, new u87(value, dpeVar, null), 3);
        }

        @Override // defpackage.xh8
        public final vh8 getKoin() {
            return xh8.a.a();
        }
    }

    public static final class b extends mj8 implements gu5<s87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s87] */
        @Override // defpackage.gu5
        public final s87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s87.class), a9cVar);
        }
    }

    public s87(Context context) {
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
        this.a = context;
        this.b = eu2VarA;
        this.c = new d2f(new nv(this, 10));
        z87 z87Var = new z87(this);
        qt8 qt8Var = qt8.a;
        this.d = boa.E(qt8Var, z87Var);
        this.e = boa.E(qt8Var, new a97(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s87.a(pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
