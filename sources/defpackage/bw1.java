package defpackage;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bw1 implements Serializable {
    private final ImagePickerOptions options;
    private final String uri;

    public bw1(String str, ImagePickerOptions imagePickerOptions) {
        this.uri = str;
        this.options = imagePickerOptions;
    }

    public final ImagePickerOptions a() {
        return this.options;
    }

    public final String b() {
        return this.uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw1)) {
            return false;
        }
        bw1 bw1Var = (bw1) obj;
        return wl7.b(this.uri, bw1Var.uri) && wl7.b(this.options, bw1Var.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + (this.uri.hashCode() * 31);
    }

    public final String toString() {
        return "CameraContractOptions(uri=" + this.uri + ", options=" + this.options + ")";
    }
}
