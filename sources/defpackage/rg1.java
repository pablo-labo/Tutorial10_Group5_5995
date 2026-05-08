package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class rg1 implements k07 {
    public final Bitmap a;

    public rg1(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.k07
    public final long a() {
        int allocationByteCount;
        Bitmap bitmap = this.a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                allocationByteCount = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return allocationByteCount;
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.k07
    public final boolean b() {
        return true;
    }

    @Override // defpackage.k07
    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg1) && wl7.b(this.a, ((rg1) obj).a);
    }

    @Override // defpackage.k07
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.k07
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
