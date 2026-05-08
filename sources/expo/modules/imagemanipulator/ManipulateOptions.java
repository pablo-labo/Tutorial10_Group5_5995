package expo.modules.imagemanipulator;

import defpackage.ftc;
import defpackage.w85;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u00020\n8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/imagemanipulator/ManipulateOptions;", "Lftc;", "<init>", "()V", "", "base64", "Z", "getBase64", "()Z", "getBase64$annotations", "", "compress", "D", "getCompress", "()D", "getCompress$annotations", "Lexpo/modules/imagemanipulator/ImageFormat;", "format", "Lexpo/modules/imagemanipulator/ImageFormat;", "getFormat", "()Lexpo/modules/imagemanipulator/ImageFormat;", "getFormat$annotations", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ManipulateOptions implements ftc {
    private final boolean base64;
    private final double compress = 1.0d;
    private final ImageFormat format = ImageFormat.JPEG;

    @w85
    public static /* synthetic */ void getBase64$annotations() {
    }

    @w85
    public static /* synthetic */ void getCompress$annotations() {
    }

    @w85
    public static /* synthetic */ void getFormat$annotations() {
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final double getCompress() {
        return this.compress;
    }

    public final ImageFormat getFormat() {
        return this.format;
    }
}
