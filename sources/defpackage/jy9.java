package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface jy9 {
    @h84
    default long now() {
        return nowNanos() / 1000000;
    }

    @h84
    long nowNanos();
}
