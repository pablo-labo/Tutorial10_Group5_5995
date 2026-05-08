package defpackage;

import androidx.compose.runtime.r;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgl8;", "Lbrg;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gl8 extends brg implements xh8 {
    public final g4a V;
    public final g3a W;
    public final g3a X;
    public final g3a Y;
    public final Lazy Z;
    public final Lazy a0;
    public final g3a<jz2<j6g>> b;
    public final tx5 b0;
    public final g3a<jz2<j6g>> c;
    public final g4a c0;
    public final g3a<jz2<j6g>> d;
    public final Lazy e;
    public final g4a f;

    public static final class a extends mj8 implements gu5<nig> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gl8 gl8Var) {
            super(0);
            this.$this_inject = gl8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nig] */
        @Override // defpackage.gu5
        public final nig invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(nig.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gl8 gl8Var) {
            super(0);
            this.$this_inject = gl8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<mka> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gl8 gl8Var) {
            super(0);
            this.$this_inject = gl8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, mka] */
        @Override // defpackage.gu5
        public final mka invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(mka.class), a9cVar);
        }
    }

    public gl8() {
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        this.b = g3aVar;
        g3a<jz2<j6g>> g3aVar2 = new g3a<>();
        this.c = g3aVar2;
        g3a<jz2<j6g>> g3aVar3 = new g3a<>();
        this.d = g3aVar3;
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.e = boa.E(qt8Var, aVar);
        this.f = r.f(ex4.c);
        Boolean bool = Boolean.FALSE;
        this.V = r.f(bool);
        this.W = g3aVar;
        this.X = g3aVar2;
        this.Y = g3aVar3;
        this.Z = boa.E(qt8Var, new b(this));
        this.a0 = boa.E(qt8Var, new c(this));
        this.b0 = new tx5();
        this.c0 = r.f(bool);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
