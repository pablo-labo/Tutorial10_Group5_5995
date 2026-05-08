package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface x2a extends g4a<Float>, ese<Float> {
    float g();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ese
    default Float getValue() {
        return Float.valueOf(g());
    }

    default void k(float f) {
        q(f);
    }

    void q(float f);

    @Override // defpackage.g4a
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        k(f.floatValue());
    }
}
