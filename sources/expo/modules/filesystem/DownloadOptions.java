package expo.modules.filesystem;

import defpackage.bs4;
import defpackage.ftc;
import defpackage.w85;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006\u001f"}, d2 = {"Lexpo/modules/filesystem/DownloadOptions;", "Lftc;", "", "", "headers", "", "idempotent", "<init>", "(Ljava/util/Map;Z)V", "component1", "()Ljava/util/Map;", "component2", "()Z", "copy", "(Ljava/util/Map;Z)Lexpo/modules/filesystem/DownloadOptions;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "()V", "Z", "getIdempotent", "getIdempotent$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DownloadOptions implements ftc {
    private final Map<String, String> headers;
    private final boolean idempotent;

    public /* synthetic */ DownloadOptions(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? bs4.a : map, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadOptions copy$default(DownloadOptions downloadOptions, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = downloadOptions.headers;
        }
        if ((i & 2) != 0) {
            z = downloadOptions.idempotent;
        }
        return downloadOptions.copy(map, z);
    }

    @w85
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @w85
    public static /* synthetic */ void getIdempotent$annotations() {
    }

    public final Map<String, String> component1() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final DownloadOptions copy(Map<String, String> headers, boolean idempotent) {
        headers.getClass();
        return new DownloadOptions(headers, idempotent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadOptions)) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) other;
        return wl7.b(this.headers, downloadOptions.headers) && this.idempotent == downloadOptions.idempotent;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.idempotent) + (this.headers.hashCode() * 31);
    }

    public String toString() {
        return "DownloadOptions(headers=" + this.headers + ", idempotent=" + this.idempotent + ")";
    }

    public DownloadOptions(Map<String, String> map, boolean z) {
        map.getClass();
        this.headers = map;
        this.idempotent = z;
    }

    public DownloadOptions() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
