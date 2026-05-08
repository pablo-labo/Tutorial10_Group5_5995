package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface v2a extends g4a<Double>, ese<Double> {
    double c();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ese
    default Double getValue() {
        return Double.valueOf(c());
    }

    default void l(double d) {
        m(d);
    }

    void m(double d);

    @Override // defpackage.g4a
    /* bridge */ /* synthetic */ default void setValue(Double d) {
        l(d.doubleValue());
    }
}
