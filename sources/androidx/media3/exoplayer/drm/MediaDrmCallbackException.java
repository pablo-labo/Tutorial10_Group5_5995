package androidx.media3.exoplayer.drm;

import android.net.Uri;
import defpackage.gf3;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final gf3 dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(gf3 gf3Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.dataSpec = gf3Var;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
