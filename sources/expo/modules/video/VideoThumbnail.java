package expo.modules.video;

import android.graphics.Bitmap;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lexpo/modules/video/VideoThumbnail;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoThumbnail extends SharedRef<Bitmap> {
    public final int V;
    public final int W;
    public final String X;
    public final long e;
    public final long f;

    public VideoThumbnail(Bitmap bitmap, long j, long j2) {
        super(bitmap, null);
        this.e = j;
        this.f = j2;
        this.V = bitmap.getWidth();
        this.W = bitmap.getHeight();
        this.X = "image";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final int G() {
        return ((Bitmap) this.c).getByteCount();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedRef
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getX() {
        return this.X;
    }
}
