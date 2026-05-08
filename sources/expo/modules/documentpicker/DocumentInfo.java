package expo.modules.documentpicker;

import android.net.Uri;
import defpackage.akb;
import defpackage.ftc;
import defpackage.r6;
import defpackage.w85;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u000fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010\u0012R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b.\u0010#\u001a\u0004\b-\u0010\u0014¨\u0006/"}, d2 = {"Lexpo/modules/documentpicker/DocumentInfo;", "Lftc;", "Landroid/net/Uri;", "uri", "", "name", "mimeType", "", "size", "lastModified", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;J)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()J", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;J)Lexpo/modules/documentpicker/DocumentInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUri", "getUri$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "getMimeType", "getMimeType$annotations", "Ljava/lang/Long;", "getSize", "getSize$annotations", "J", "getLastModified", "getLastModified$annotations", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DocumentInfo implements ftc {
    private final long lastModified;
    private final String mimeType;
    private final String name;
    private final Long size;
    private final Uri uri;

    public DocumentInfo(Uri uri, String str, String str2, Long l, long j) {
        uri.getClass();
        str.getClass();
        this.uri = uri;
        this.name = str;
        this.mimeType = str2;
        this.size = l;
        this.lastModified = j;
    }

    public static /* synthetic */ DocumentInfo copy$default(DocumentInfo documentInfo, Uri uri, String str, String str2, Long l, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = documentInfo.uri;
        }
        if ((i & 2) != 0) {
            str = documentInfo.name;
        }
        if ((i & 4) != 0) {
            str2 = documentInfo.mimeType;
        }
        if ((i & 8) != 0) {
            l = documentInfo.size;
        }
        if ((i & 16) != 0) {
            j = documentInfo.lastModified;
        }
        long j2 = j;
        return documentInfo.copy(uri, str, str2, l, j2);
    }

    @w85
    public static /* synthetic */ void getLastModified$annotations() {
    }

    @w85
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @w85
    public static /* synthetic */ void getName$annotations() {
    }

    @w85
    public static /* synthetic */ void getSize$annotations() {
    }

    @w85
    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    public final DocumentInfo copy(Uri uri, String name, String mimeType, Long size, long lastModified) {
        uri.getClass();
        name.getClass();
        return new DocumentInfo(uri, name, mimeType, size, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentInfo)) {
            return false;
        }
        DocumentInfo documentInfo = (DocumentInfo) other;
        return wl7.b(this.uri, documentInfo.uri) && wl7.b(this.name, documentInfo.name) && wl7.b(this.mimeType, documentInfo.mimeType) && wl7.b(this.size, documentInfo.size) && this.lastModified == documentInfo.lastModified;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iD = akb.d(this.uri.hashCode() * 31, 31, this.name);
        String str = this.mimeType;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.size;
        return Long.hashCode(this.lastModified) + ((iHashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    public String toString() {
        Uri uri = this.uri;
        String str = this.name;
        String str2 = this.mimeType;
        Long l = this.size;
        long j = this.lastModified;
        StringBuilder sb = new StringBuilder("DocumentInfo(uri=");
        sb.append(uri);
        sb.append(", name=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", size=");
        sb.append(l);
        sb.append(", lastModified=");
        return r6.d(j, ")", sb);
    }
}
