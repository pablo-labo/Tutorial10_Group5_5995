package expo.modules.imagemanipulator;

import android.graphics.Bitmap;
import defpackage.l;
import defpackage.ojh;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/imagemanipulator/ImageFormat;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JPEG", "JPG", "PNG", "WEBP", "fileExtension", "getFileExtension", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "()Landroid/graphics/Bitmap$CompressFormat;", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageFormat implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageFormat[] $VALUES;
    public static final ImageFormat JPEG = new ImageFormat("JPEG", 0, "jpeg");
    public static final ImageFormat JPG = new ImageFormat("JPG", 1, "jpg");
    public static final ImageFormat PNG = new ImageFormat("PNG", 2, "png");
    public static final ImageFormat WEBP = new ImageFormat("WEBP", 3, "webp");
    private final String value;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageFormat.PNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageFormat.WEBP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ ImageFormat[] $values() {
        return new ImageFormat[]{JPEG, JPG, PNG, WEBP};
    }

    static {
        ImageFormat[] imageFormatArr$values = $values();
        $VALUES = imageFormatArr$values;
        $ENTRIES = ojh.k(imageFormatArr$values);
    }

    private ImageFormat(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<ImageFormat> getEntries() {
        return $ENTRIES;
    }

    public static ImageFormat valueOf(String str) {
        return (ImageFormat) Enum.valueOf(ImageFormat.class, str);
    }

    public static ImageFormat[] values() {
        return (ImageFormat[]) $VALUES.clone();
    }

    public final Bitmap.CompressFormat getCompressFormat() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (i == 3) {
            return Bitmap.CompressFormat.PNG;
        }
        if (i == 4) {
            return Bitmap.CompressFormat.WEBP;
        }
        l.g();
        return null;
    }

    public final String getFileExtension() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2) {
            return ".jpg";
        }
        if (i == 3) {
            return ".png";
        }
        if (i == 4) {
            return ".webp";
        }
        l.g();
        return null;
    }

    public final String getValue() {
        return this.value;
    }
}
