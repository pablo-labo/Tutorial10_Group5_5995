package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {
    public final int reason;

    public UnsupportedDrmException() {
        this.reason = 1;
    }

    public UnsupportedDrmException(int i, Exception exc) {
        super(exc);
        this.reason = i;
    }
}
