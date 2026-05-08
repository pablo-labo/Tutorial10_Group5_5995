package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface w3d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        a(boolean z) {
            this.isComplete = z;
        }

        public final boolean a() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean d(n3d n3dVar);

    boolean e(n3d n3dVar);

    w3d getRoot();

    void h(n3d n3dVar);

    boolean i(n3d n3dVar);

    void j(n3d n3dVar);
}
