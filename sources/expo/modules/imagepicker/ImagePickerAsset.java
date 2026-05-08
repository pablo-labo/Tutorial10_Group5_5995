package expo.modules.imagepicker;

import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ftc;
import defpackage.w85;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0000\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b#\u0010\u0019\u001a\u0004\b!\u0010\"R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010 \u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010(\u0012\u0004\b+\u0010\u0019\u001a\u0004\b)\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b-\u0010\u0019\u001a\u0004\b,\u0010\u0017R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b/\u0010\u0019\u001a\u0004\b.\u0010\u0017R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00100\u0012\u0004\b3\u0010\u0019\u001a\u0004\b1\u00102R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00104\u0012\u0004\b7\u0010\u0019\u001a\u0004\b5\u00106R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00104\u0012\u0004\b9\u0010\u0019\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerAsset;", "Lftc;", "", "assetId", "Lexpo/modules/imagepicker/MediaType;", "type", "uri", "", "width", "height", "fileName", "", "fileSize", "mimeType", "base64", "Landroid/os/Bundle;", "exif", "duration", "rotation", "<init>", "(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getAssetId", "()Ljava/lang/String;", "getAssetId$annotations", "()V", "Lexpo/modules/imagepicker/MediaType;", "getType", "()Lexpo/modules/imagepicker/MediaType;", "getType$annotations", "getUri", "getUri$annotations", "I", "getWidth", "()I", "getWidth$annotations", "getHeight", "getHeight$annotations", "getFileName", "getFileName$annotations", "Ljava/lang/Long;", "getFileSize", "()Ljava/lang/Long;", "getFileSize$annotations", "getMimeType", "getMimeType$annotations", "getBase64", "getBase64$annotations", "Landroid/os/Bundle;", "getExif", "()Landroid/os/Bundle;", "getExif$annotations", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Integer;", "getDuration$annotations", "getRotation", "getRotation$annotations", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePickerAsset implements ftc {
    private final String assetId;
    private final String base64;
    private final Integer duration;
    private final Bundle exif;
    private final String fileName;
    private final Long fileSize;
    private final int height;
    private final String mimeType;
    private final Integer rotation;
    private final MediaType type;
    private final String uri;
    private final int width;

    public /* synthetic */ ImagePickerAsset(String str, MediaType mediaType, String str2, int i, int i2, String str3, Long l, String str4, String str5, Bundle bundle, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? MediaType.IMAGE : mediaType, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : l, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : bundle, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : num, (i3 & 2048) != 0 ? null : num2);
    }

    @w85
    public static /* synthetic */ void getAssetId$annotations() {
    }

    @w85
    public static /* synthetic */ void getBase64$annotations() {
    }

    @w85
    public static /* synthetic */ void getDuration$annotations() {
    }

    @w85
    public static /* synthetic */ void getExif$annotations() {
    }

    @w85
    public static /* synthetic */ void getFileName$annotations() {
    }

    @w85
    public static /* synthetic */ void getFileSize$annotations() {
    }

    @w85
    public static /* synthetic */ void getHeight$annotations() {
    }

    @w85
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @w85
    public static /* synthetic */ void getRotation$annotations() {
    }

    @w85
    public static /* synthetic */ void getType$annotations() {
    }

    @w85
    public static /* synthetic */ void getUri$annotations() {
    }

    @w85
    public static /* synthetic */ void getWidth$annotations() {
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Bundle getExif() {
        return this.exif;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getRotation() {
        return this.rotation;
    }

    public final MediaType getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public ImagePickerAsset(String str, MediaType mediaType, String str2, int i, int i2, String str3, Long l, String str4, String str5, Bundle bundle, Integer num, Integer num2) {
        str2.getClass();
        this.assetId = str;
        this.type = mediaType;
        this.uri = str2;
        this.width = i;
        this.height = i2;
        this.fileName = str3;
        this.fileSize = l;
        this.mimeType = str4;
        this.base64 = str5;
        this.exif = bundle;
        this.duration = num;
        this.rotation = num2;
    }

    public ImagePickerAsset() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, null, 4095, null);
    }
}
