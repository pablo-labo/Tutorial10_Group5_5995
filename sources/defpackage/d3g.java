package defpackage;

import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class d3g implements c3g, xh8 {
    public final Lazy a;
    public final c24 b;
    public final wm2 c;

    public static final class a extends mj8 implements gu5<LocationSensor> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d3g d3gVar) {
            super(0);
            this.$this_inject = d3gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.jsmappservices.util.LocationSensor, java.lang.Object] */
        @Override // defpackage.gu5
        public final LocationSensor invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(LocationSensor.class), a9cVar);
        }
    }

    public d3g() {
        Lazy lazyE = boa.E(qt8.a, new a(this));
        this.a = lazyE;
        this.b = new c24((LocationSensor) lazyE.getValue(), new qq2(jz0.a()));
        this.c = new wm2(4);
    }

    @Override // defpackage.c3g
    public final void a(String str) {
        wm2 wm2Var = this.c;
        wm2Var.getClass();
        gse gseVar = (gse) wm2Var.a;
        gseVar.getClass();
        gseVar.m(null, str);
    }

    @Override // defpackage.c3g
    public final boolean b() {
        return this.b.a.c();
    }

    @Override // defpackage.c3g
    public final void c(ndc ndcVar) {
        c24 c24Var = this.b;
        c24Var.getClass();
        synchronized (c24Var) {
            uqe uqeVar = c24Var.c;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            c24Var.c = null;
            c24Var.c = u63.Y(c24Var.d, null, null, new a24(c24Var, ndcVar, null), 3);
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.c3g
    public final String e() {
        return (String) ((gse) this.c.a).getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
