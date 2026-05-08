package defpackage;

import android.net.Uri;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ja5 implements Serializable {
    private final Uri initialUri;
    private final String mimeType;
    private final eab pickerType;

    public ja5(Uri uri, String str, eab eabVar) {
        this.initialUri = uri;
        this.mimeType = str;
        this.pickerType = eabVar;
    }

    public final Uri a() {
        return this.initialUri;
    }

    public final String b() {
        return this.mimeType;
    }

    public final eab c() {
        return this.pickerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja5)) {
            return false;
        }
        ja5 ja5Var = (ja5) obj;
        return wl7.b(this.initialUri, ja5Var.initialUri) && wl7.b(this.mimeType, ja5Var.mimeType) && this.pickerType == ja5Var.pickerType;
    }

    public final int hashCode() {
        Uri uri = this.initialUri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.mimeType;
        return this.pickerType.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FilePickerContractOptions(initialUri=" + this.initialUri + ", mimeType=" + this.mimeType + ", pickerType=" + this.pickerType + ")";
    }
}
