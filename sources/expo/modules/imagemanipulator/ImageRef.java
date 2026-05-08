package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import defpackage.ohd;
import expo.modules.kotlin.sharedobjects.SharedRef;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lexpo/modules/imagemanipulator/ImageRef;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRef extends SharedRef<Bitmap> {
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRef(Bitmap bitmap, ohd ohdVar) {
        super(bitmap, ohdVar);
        bitmap.getClass();
        this.e = "image";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final int G() {
        return ((Bitmap) this.c).getAllocationByteCount();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedRef
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getE() {
        return this.e;
    }
}
