package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface m3a extends g4a<Long>, ese<Long> {
    long a();

    @Override // defpackage.ese
    default Long getValue() {
        return Long.valueOf(a());
    }

    @Override // defpackage.g4a
    default void setValue(Long l) {
        v(l.longValue());
    }

    void v(long j);
}
