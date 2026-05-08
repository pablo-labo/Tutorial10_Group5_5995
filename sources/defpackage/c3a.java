package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface c3a extends g4a<Integer>, ese<Integer> {
    int e();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ese
    default Integer getValue() {
        return Integer.valueOf(e());
    }

    void h(int i);

    default void j(int i) {
        h(i);
    }

    @Override // defpackage.g4a
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        j(num.intValue());
    }
}
