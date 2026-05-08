package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n9d {
    public final Uri a;
    public final String b;
    public final List<m07> c;
    public final String d;
    public final Uri e;
    public final boolean f;

    public /* synthetic */ n9d(Uri uri, String str, Uri uri2, int i) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? null : str, zr4.a, null, (i & 32) != 0 ? null : uri2, false);
    }

    public static n9d a(n9d n9dVar, List list, String str, int i) {
        Uri uri = n9dVar.a;
        String str2 = n9dVar.b;
        n9dVar.getClass();
        if ((i & 8) != 0) {
            list = n9dVar.c;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str = n9dVar.d;
        }
        String str3 = str;
        Uri uri2 = n9dVar.e;
        boolean z = (i & 64) != 0 ? n9dVar.f : true;
        n9dVar.getClass();
        list2.getClass();
        return new n9d(uri, str2, list2, str3, uri2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9d)) {
            return false;
        }
        n9d n9dVar = (n9d) obj;
        return wl7.b(this.a, n9dVar.a) && wl7.b(this.b, n9dVar.b) && wl7.b(this.c, n9dVar.c) && wl7.b(this.d, n9dVar.d) && wl7.b(this.e, n9dVar.e) && this.f == n9dVar.f;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int iG = ia.g(this.c, ia.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31);
        String str2 = this.d;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ResumePreviewState(stagedResumeFileUri=" + this.a + ", fileName=" + this.b + ", badFileExtension=false, pdfPageList=" + this.c + ", fileContent=" + this.d + ", imageUri=" + this.e + ", fileRenderError=" + this.f + ")";
    }

    public n9d() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public n9d(Uri uri, String str, List list, String str2, Uri uri2, boolean z) {
        list.getClass();
        this.a = uri;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = uri2;
        this.f = z;
    }
}
