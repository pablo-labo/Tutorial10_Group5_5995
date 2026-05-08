package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {
    public static final a a = new a();

    public class a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
