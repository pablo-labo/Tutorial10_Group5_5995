package expo.modules.filesystem.legacy;

import defpackage.ftc;
import defpackage.w85;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u000fR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0011R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010\u0013¨\u0006,"}, d2 = {"Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;", "Lftc;", "", "md5", "cache", "", "", "headers", "Lexpo/modules/filesystem/legacy/SessionType;", "sessionType", "<init>", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/legacy/SessionType;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/Map;", "component4", "()Lexpo/modules/filesystem/legacy/SessionType;", "copy", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/legacy/SessionType;)Lexpo/modules/filesystem/legacy/DownloadOptionsLegacy;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMd5", "getMd5$annotations", "()V", "Ljava/lang/Boolean;", "getCache", "getCache$annotations", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "Lexpo/modules/filesystem/legacy/SessionType;", "getSessionType", "getSessionType$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DownloadOptionsLegacy implements ftc {
    private final Boolean cache;
    private final Map<String, String> headers;
    private final boolean md5;
    private final SessionType sessionType;

    public DownloadOptionsLegacy(boolean z, Boolean bool, Map<String, String> map, SessionType sessionType) {
        sessionType.getClass();
        this.md5 = z;
        this.cache = bool;
        this.headers = map;
        this.sessionType = sessionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadOptionsLegacy copy$default(DownloadOptionsLegacy downloadOptionsLegacy, boolean z, Boolean bool, Map map, SessionType sessionType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadOptionsLegacy.md5;
        }
        if ((i & 2) != 0) {
            bool = downloadOptionsLegacy.cache;
        }
        if ((i & 4) != 0) {
            map = downloadOptionsLegacy.headers;
        }
        if ((i & 8) != 0) {
            sessionType = downloadOptionsLegacy.sessionType;
        }
        return downloadOptionsLegacy.copy(z, bool, map, sessionType);
    }

    @w85
    public static /* synthetic */ void getCache$annotations() {
    }

    @w85
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @w85
    public static /* synthetic */ void getMd5$annotations() {
    }

    @w85
    public static /* synthetic */ void getSessionType$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCache() {
        return this.cache;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final DownloadOptionsLegacy copy(boolean md5, Boolean cache, Map<String, String> headers, SessionType sessionType) {
        sessionType.getClass();
        return new DownloadOptionsLegacy(md5, cache, headers, sessionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadOptionsLegacy)) {
            return false;
        }
        DownloadOptionsLegacy downloadOptionsLegacy = (DownloadOptionsLegacy) other;
        return this.md5 == downloadOptionsLegacy.md5 && wl7.b(this.cache, downloadOptionsLegacy.cache) && wl7.b(this.headers, downloadOptionsLegacy.headers) && this.sessionType == downloadOptionsLegacy.sessionType;
    }

    public final Boolean getCache() {
        return this.cache;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getMd5() {
        return this.md5;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.md5) * 31;
        Boolean bool = this.cache;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.headers;
        return this.sessionType.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DownloadOptionsLegacy(md5=" + this.md5 + ", cache=" + this.cache + ", headers=" + this.headers + ", sessionType=" + this.sessionType + ")";
    }

    public /* synthetic */ DownloadOptionsLegacy(boolean z, Boolean bool, Map map, SessionType sessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, bool, map, (i & 8) != 0 ? SessionType.BACKGROUND : sessionType);
    }
}
