package defpackage;

import com.indeed.android.jsmappservices.util.LocationSensor;

/* JADX INFO: loaded from: classes2.dex */
public final class gud extends mj8 implements gu5<LocationSensor> {
    final /* synthetic */ xh8 $this_inject;
    final /* synthetic */ a9c $qualifier = null;
    final /* synthetic */ gu5 $parameters = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gud(cud cudVar) {
        super(0);
        this.$this_inject = cudVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.jsmappservices.util.LocationSensor, java.lang.Object] */
    @Override // defpackage.gu5
    public final LocationSensor invoke() {
        xh8 xh8Var = this.$this_inject;
        a9c a9cVar = this.$qualifier;
        return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(LocationSensor.class), a9cVar);
    }
}
