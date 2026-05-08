package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public interface a {
        void C(long j);

        void F(long j, boolean z);

        void x(long j);
    }

    void a(a aVar);

    void b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
