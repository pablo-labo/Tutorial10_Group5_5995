package defpackage;

import android.net.Uri;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.MediaType;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class u7b {
    public final List<Pair<MediaType, Uri>> a;
    public final ImagePickerOptions b;

    /* JADX WARN: Multi-variable type inference failed */
    public u7b(List<? extends Pair<? extends MediaType, ? extends Uri>> list, ImagePickerOptions imagePickerOptions) {
        list.getClass();
        imagePickerOptions.getClass();
        this.a = list;
        this.b = imagePickerOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7b)) {
            return false;
        }
        u7b u7bVar = (u7b) obj;
        return wl7.b(this.a, u7bVar.a) && wl7.b(this.b, u7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingMediaPickingResult(data=" + this.a + ", options=" + this.b + ")";
    }
}
