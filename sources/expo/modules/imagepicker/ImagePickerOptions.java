package expo.modules.imagepicker;

import defpackage.bw1;
import defpackage.ftc;
import defpackage.i17;
import defpackage.ut0;
import defpackage.w85;
import expo.modules.imagepicker.MediaTypes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u000f\u0012\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0004\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0004\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\u000f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R(\u0010-\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010\u000f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u0010\u0013R.\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010\u0004\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R6\u0010>\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010\u0004\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010F\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010\u0004\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010N\u001a\u00020M8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bT\u0010\u0004\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR \u0010U\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\bU\u0010\u000f\u0012\u0004\bW\u0010\u0004\u001a\u0004\bV\u0010\u0011R \u0010Y\u001a\u00020X8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010Z\u0012\u0004\b]\u0010\u0004\u001a\u0004\b[\u0010\\R \u0010^\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\b^\u0010\u000f\u0012\u0004\b`\u0010\u0004\u001a\u0004\b_\u0010\u0011R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerOptions;", "Lftc;", "Ljava/io/Serializable;", "<init>", "()V", "", "uri", "Lbw1;", "toCameraContractOptions", "(Ljava/lang/String;)Lbw1;", "Li17;", "toImageLibraryContractOptions", "()Li17;", "", "allowsEditing", "Z", "getAllowsEditing", "()Z", "setAllowsEditing", "(Z)V", "getAllowsEditing$annotations", "allowsMultipleSelection", "getAllowsMultipleSelection", "setAllowsMultipleSelection", "getAllowsMultipleSelection$annotations", "", "quality", "D", "getQuality", "()D", "setQuality", "(D)V", "getQuality$annotations", "", "selectionLimit", "I", "getSelectionLimit", "()I", "setSelectionLimit", "(I)V", "getSelectionLimit$annotations", "base64", "getBase64", "setBase64", "getBase64$annotations", "exif", "getExif", "setExif", "getExif$annotations", "", "Lexpo/modules/imagepicker/JSMediaTypes;", "mediaTypes", "[Lexpo/modules/imagepicker/JSMediaTypes;", "getMediaTypes", "()[Lexpo/modules/imagepicker/JSMediaTypes;", "setMediaTypes", "([Lexpo/modules/imagepicker/JSMediaTypes;)V", "getMediaTypes$annotations", "videoMaxDuration", "getVideoMaxDuration", "setVideoMaxDuration", "Lkotlin/Pair;", "aspect", "Lkotlin/Pair;", "getAspect", "()Lkotlin/Pair;", "setAspect", "(Lkotlin/Pair;)V", "getAspect$annotations", "Lexpo/modules/imagepicker/CropShape;", "shape", "Lexpo/modules/imagepicker/CropShape;", "getShape", "()Lexpo/modules/imagepicker/CropShape;", "setShape", "(Lexpo/modules/imagepicker/CropShape;)V", "getShape$annotations", "Lexpo/modules/imagepicker/CameraType;", "cameraType", "Lexpo/modules/imagepicker/CameraType;", "getCameraType", "()Lexpo/modules/imagepicker/CameraType;", "setCameraType", "(Lexpo/modules/imagepicker/CameraType;)V", "getCameraType$annotations", "orderedSelection", "getOrderedSelection", "getOrderedSelection$annotations", "Lexpo/modules/imagepicker/DefaultTab;", "defaultTab", "Lexpo/modules/imagepicker/DefaultTab;", "getDefaultTab", "()Lexpo/modules/imagepicker/DefaultTab;", "getDefaultTab$annotations", "legacy", "getLegacy", "getLegacy$annotations", "Lexpo/modules/imagepicker/MediaTypes;", "getNativeMediaTypes", "()Lexpo/modules/imagepicker/MediaTypes;", "nativeMediaTypes", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePickerOptions implements ftc, Serializable {
    private boolean allowsEditing;
    private boolean allowsMultipleSelection;
    private Pair<Integer, Integer> aspect;
    private boolean base64;
    private boolean exif;
    private final boolean legacy;
    private final boolean orderedSelection;
    private int selectionLimit;
    private int videoMaxDuration;
    private double quality = 1.0d;
    private JSMediaTypes[] mediaTypes = {JSMediaTypes.IMAGES};
    private CropShape shape = CropShape.RECTANGLE;
    private CameraType cameraType = CameraType.BACK;
    private final DefaultTab defaultTab = DefaultTab.PHOTOS;

    @w85
    public static /* synthetic */ void getAllowsEditing$annotations() {
    }

    @w85
    public static /* synthetic */ void getAllowsMultipleSelection$annotations() {
    }

    @w85
    public static /* synthetic */ void getAspect$annotations() {
    }

    @w85
    public static /* synthetic */ void getBase64$annotations() {
    }

    @w85
    public static /* synthetic */ void getCameraType$annotations() {
    }

    @w85
    public static /* synthetic */ void getDefaultTab$annotations() {
    }

    @w85
    public static /* synthetic */ void getExif$annotations() {
    }

    @w85
    public static /* synthetic */ void getLegacy$annotations() {
    }

    @w85
    public static /* synthetic */ void getMediaTypes$annotations() {
    }

    @w85
    public static /* synthetic */ void getOrderedSelection$annotations() {
    }

    @w85
    public static /* synthetic */ void getQuality$annotations() {
    }

    @w85
    public static /* synthetic */ void getSelectionLimit$annotations() {
    }

    @w85
    public static /* synthetic */ void getShape$annotations() {
    }

    public final boolean getAllowsEditing() {
        return this.allowsEditing;
    }

    public final boolean getAllowsMultipleSelection() {
        return this.allowsMultipleSelection;
    }

    public final Pair<Integer, Integer> getAspect() {
        return this.aspect;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final CameraType getCameraType() {
        return this.cameraType;
    }

    public final DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final boolean getExif() {
        return this.exif;
    }

    public final boolean getLegacy() {
        return this.legacy;
    }

    public final JSMediaTypes[] getMediaTypes() {
        return this.mediaTypes;
    }

    public final MediaTypes getNativeMediaTypes() {
        MediaTypes.Companion companion = MediaTypes.INSTANCE;
        JSMediaTypes[] jSMediaTypesArr = this.mediaTypes;
        companion.getClass();
        jSMediaTypesArr.getClass();
        JSMediaTypes jSMediaTypes = JSMediaTypes.VIDEOS;
        return !ut0.f0(jSMediaTypes, jSMediaTypesArr) ? MediaTypes.IMAGES : (!ut0.f0(jSMediaTypes, jSMediaTypesArr) || ut0.f0(JSMediaTypes.IMAGES, jSMediaTypesArr)) ? MediaTypes.ALL : MediaTypes.VIDEOS;
    }

    public final boolean getOrderedSelection() {
        return this.orderedSelection;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final int getSelectionLimit() {
        return this.selectionLimit;
    }

    public final CropShape getShape() {
        return this.shape;
    }

    public final int getVideoMaxDuration() {
        return this.videoMaxDuration;
    }

    public final void setAllowsEditing(boolean z) {
        this.allowsEditing = z;
    }

    public final void setAllowsMultipleSelection(boolean z) {
        this.allowsMultipleSelection = z;
    }

    public final void setAspect(Pair<Integer, Integer> pair) {
        this.aspect = pair;
    }

    public final void setBase64(boolean z) {
        this.base64 = z;
    }

    public final void setCameraType(CameraType cameraType) {
        cameraType.getClass();
        this.cameraType = cameraType;
    }

    public final void setExif(boolean z) {
        this.exif = z;
    }

    public final void setMediaTypes(JSMediaTypes[] jSMediaTypesArr) {
        jSMediaTypesArr.getClass();
        this.mediaTypes = jSMediaTypesArr;
    }

    public final void setQuality(double d) {
        this.quality = d;
    }

    public final void setSelectionLimit(int i) {
        this.selectionLimit = i;
    }

    public final void setShape(CropShape cropShape) {
        cropShape.getClass();
        this.shape = cropShape;
    }

    public final void setVideoMaxDuration(int i) {
        this.videoMaxDuration = i;
    }

    public final bw1 toCameraContractOptions(String uri) {
        uri.getClass();
        return new bw1(uri, this);
    }

    public final i17 toImageLibraryContractOptions() {
        return new i17(this);
    }
}
