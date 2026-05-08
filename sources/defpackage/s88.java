package defpackage;

import android.net.Uri;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class s88 {
    public final String a;
    public final String b;
    public final s9d c;
    public final String d;
    public final u18 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final Uri l;

    public s88(String str, String str2, s9d s9dVar, String str3, u18 u18Var, String str4, String str5, String str6, String str7, String str8, Long l, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = s9dVar;
        this.d = str3;
        this.e = u18Var;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = l;
        this.l = uri;
    }

    public static s88 a(s88 s88Var, String str, String str2, s9d s9dVar, String str3, u18 u18Var, String str4, String str5, String str6, String str7, String str8, Long l, Uri uri, int i) {
        if ((i & 1) != 0) {
            str = s88Var.a;
        }
        String str9 = str;
        if ((i & 2) != 0) {
            str2 = s88Var.b;
        }
        String str10 = str2;
        s9d s9dVar2 = (i & 4) != 0 ? s88Var.c : s9dVar;
        s88Var.getClass();
        String str11 = (i & 16) != 0 ? s88Var.d : str3;
        u18 u18Var2 = (i & 32) != 0 ? s88Var.e : u18Var;
        String str12 = (i & 64) != 0 ? s88Var.f : str4;
        String str13 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? s88Var.g : str5;
        String str14 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? s88Var.h : str6;
        String str15 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? s88Var.i : str7;
        String str16 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? s88Var.j : str8;
        s88Var.getClass();
        s88Var.getClass();
        Long l2 = (i & 8192) != 0 ? s88Var.k : l;
        Uri uri2 = (i & 16384) != 0 ? s88Var.l : uri;
        s88Var.getClass();
        return new s88(str9, str10, s9dVar2, str11, u18Var2, str12, str13, str14, str15, str16, l2, uri2);
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s88)) {
            return false;
        }
        s88 s88Var = (s88) obj;
        return wl7.b(this.a, s88Var.a) && wl7.b(this.b, s88Var.b) && wl7.b(this.c, s88Var.c) && wl7.b(this.d, s88Var.d) && this.e == s88Var.e && wl7.b(this.f, s88Var.f) && wl7.b(this.g, s88Var.g) && wl7.b(this.h, s88Var.h) && wl7.b(this.i, s88Var.i) && wl7.b(this.j, s88Var.j) && wl7.b(this.k, s88Var.k) && wl7.b(this.l, s88Var.l);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        s9d s9dVar = this.c;
        int iHashCode3 = (iHashCode2 + (s9dVar == null ? 0 : s9dVar.hashCode())) * 961;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u18 u18Var = this.e;
        int iHashCode5 = (iHashCode4 + (u18Var == null ? 0 : u18Var.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iF = ia.f(ia.f((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, false), 31, false);
        Long l = this.k;
        int iHashCode10 = (iF + (l == null ? 0 : l.hashCode())) * 31;
        Uri uri = this.l;
        return iHashCode10 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("JobseekerResumeFileState(fileName=", this.a, ", fileId=", this.b, ", source=");
        sbF.append(this.c);
        sbF.append(", fileContents=null, uploadTimestamp=");
        sbF.append(this.d);
        sbF.append(", fileType=");
        sbF.append(this.e);
        sbF.append(", mediaType=");
        sbF.append(this.f);
        sbF.append(", fileDescription=");
        ia.r(sbF, this.g, ", extension=", this.h, ", hashCode=");
        ia.r(sbF, this.i, ", clientApp=", this.j, ", isShownToEmployers=false, shouldShowResumePreviewOverlay=false, androidOsDownloadId=");
        sbF.append(this.k);
        sbF.append(", downloadedFileUri=");
        sbF.append(this.l);
        sbF.append(")");
        return sbF.toString();
    }

    public /* synthetic */ s88(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public s88() {
        this(0);
    }
}
