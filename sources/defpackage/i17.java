package defpackage;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class i17 implements Serializable {
    private final ImagePickerOptions options;

    public i17(ImagePickerOptions imagePickerOptions) {
        this.options = imagePickerOptions;
    }

    public final ImagePickerOptions a() {
        return this.options;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i17) && wl7.b(this.options, ((i17) obj).options);
    }

    public final int hashCode() {
        return this.options.hashCode();
    }

    public final String toString() {
        return "ImageLibraryContractOptions(options=" + this.options + ")";
    }
}
