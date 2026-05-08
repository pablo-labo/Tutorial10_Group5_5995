package com.canhub.cropper;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "FailedToLoadBitmap", "FailedToDecodeImage", "Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CropException extends Exception {
    private static final long serialVersionUID = 4933890872862969613L;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropException$FailedToDecodeImage;", "Lcom/canhub/cropper/CropException;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedToDecodeImage extends CropException {
        private static final long serialVersionUID = 3516154387706407275L;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropException$FailedToLoadBitmap;", "Lcom/canhub/cropper/CropException;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedToLoadBitmap extends CropException {
        private static final long serialVersionUID = 7791142932960927332L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToLoadBitmap(Uri uri, String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str);
            uri.getClass();
        }
    }
}
