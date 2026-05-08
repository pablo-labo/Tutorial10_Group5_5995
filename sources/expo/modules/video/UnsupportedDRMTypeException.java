package expo.modules.video;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.video.enums.DRMType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/video/UnsupportedDRMTypeException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnsupportedDRMTypeException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedDRMTypeException(DRMType dRMType) {
        super("DRM type `" + dRMType + "` is not supported on Android", null);
        dRMType.getClass();
    }
}
