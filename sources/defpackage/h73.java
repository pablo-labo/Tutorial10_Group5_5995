package defpackage;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h73 implements Serializable {
    private final ImagePickerOptions options;
    private final String sourceUri;

    public h73(String str, ImagePickerOptions imagePickerOptions) {
        imagePickerOptions.getClass();
        this.sourceUri = str;
        this.options = imagePickerOptions;
    }

    public final ImagePickerOptions a() {
        return this.options;
    }

    public final String b() {
        return this.sourceUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h73)) {
            return false;
        }
        h73 h73Var = (h73) obj;
        return wl7.b(this.sourceUri, h73Var.sourceUri) && wl7.b(this.options, h73Var.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + (this.sourceUri.hashCode() * 31);
    }

    public final String toString() {
        return "CropImageContractOptions(sourceUri=" + this.sourceUri + ", options=" + this.options + ")";
    }
}
