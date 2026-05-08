package expo.modules.filesystem.legacy;

import defpackage.b0;
import defpackage.ftc;
import defpackage.ia;
import defpackage.w85;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jv\u0010\u001c\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0011R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u0013R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0015R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010\u0019R.\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b:\u0010*\u001a\u0004\b9\u0010\u0011¨\u0006;"}, d2 = {"Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;", "Lftc;", "", "", "headers", "Lexpo/modules/filesystem/legacy/HttpMethod;", "httpMethod", "Lexpo/modules/filesystem/legacy/SessionType;", "sessionType", "Lexpo/modules/filesystem/legacy/FileSystemUploadType;", "uploadType", "fieldName", "mimeType", "parameters", "<init>", "(Ljava/util/Map;Lexpo/modules/filesystem/legacy/HttpMethod;Lexpo/modules/filesystem/legacy/SessionType;Lexpo/modules/filesystem/legacy/FileSystemUploadType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component2", "()Lexpo/modules/filesystem/legacy/HttpMethod;", "component3", "()Lexpo/modules/filesystem/legacy/SessionType;", "component4", "()Lexpo/modules/filesystem/legacy/FileSystemUploadType;", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(Ljava/util/Map;Lexpo/modules/filesystem/legacy/HttpMethod;Lexpo/modules/filesystem/legacy/SessionType;Lexpo/modules/filesystem/legacy/FileSystemUploadType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lexpo/modules/filesystem/legacy/FileSystemUploadOptions;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "()V", "Lexpo/modules/filesystem/legacy/HttpMethod;", "getHttpMethod", "getHttpMethod$annotations", "Lexpo/modules/filesystem/legacy/SessionType;", "getSessionType", "getSessionType$annotations", "Lexpo/modules/filesystem/legacy/FileSystemUploadType;", "getUploadType", "getUploadType$annotations", "Ljava/lang/String;", "getFieldName", "getFieldName$annotations", "getMimeType", "getMimeType$annotations", "getParameters", "getParameters$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FileSystemUploadOptions implements ftc {
    private final String fieldName;
    private final Map<String, String> headers;
    private final HttpMethod httpMethod;
    private final String mimeType;
    private final Map<String, String> parameters;
    private final SessionType sessionType;
    private final FileSystemUploadType uploadType;

    public FileSystemUploadOptions(Map<String, String> map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType fileSystemUploadType, String str, String str2, Map<String, String> map2) {
        httpMethod.getClass();
        sessionType.getClass();
        fileSystemUploadType.getClass();
        this.headers = map;
        this.httpMethod = httpMethod;
        this.sessionType = sessionType;
        this.uploadType = fileSystemUploadType;
        this.fieldName = str;
        this.mimeType = str2;
        this.parameters = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileSystemUploadOptions copy$default(FileSystemUploadOptions fileSystemUploadOptions, Map map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType fileSystemUploadType, String str, String str2, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fileSystemUploadOptions.headers;
        }
        if ((i & 2) != 0) {
            httpMethod = fileSystemUploadOptions.httpMethod;
        }
        if ((i & 4) != 0) {
            sessionType = fileSystemUploadOptions.sessionType;
        }
        if ((i & 8) != 0) {
            fileSystemUploadType = fileSystemUploadOptions.uploadType;
        }
        if ((i & 16) != 0) {
            str = fileSystemUploadOptions.fieldName;
        }
        if ((i & 32) != 0) {
            str2 = fileSystemUploadOptions.mimeType;
        }
        if ((i & 64) != 0) {
            map2 = fileSystemUploadOptions.parameters;
        }
        String str3 = str2;
        Map map3 = map2;
        String str4 = str;
        SessionType sessionType2 = sessionType;
        return fileSystemUploadOptions.copy(map, httpMethod, sessionType2, fileSystemUploadType, str4, str3, map3);
    }

    @w85
    public static /* synthetic */ void getFieldName$annotations() {
    }

    @w85
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @w85
    public static /* synthetic */ void getHttpMethod$annotations() {
    }

    @w85
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @w85
    public static /* synthetic */ void getParameters$annotations() {
    }

    @w85
    public static /* synthetic */ void getSessionType$annotations() {
    }

    @w85
    public static /* synthetic */ void getUploadType$annotations() {
    }

    public final Map<String, String> component1() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SessionType getSessionType() {
        return this.sessionType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FileSystemUploadType getUploadType() {
        return this.uploadType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> component7() {
        return this.parameters;
    }

    public final FileSystemUploadOptions copy(Map<String, String> headers, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType uploadType, String fieldName, String mimeType, Map<String, String> parameters) {
        httpMethod.getClass();
        sessionType.getClass();
        uploadType.getClass();
        return new FileSystemUploadOptions(headers, httpMethod, sessionType, uploadType, fieldName, mimeType, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileSystemUploadOptions)) {
            return false;
        }
        FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) other;
        return wl7.b(this.headers, fileSystemUploadOptions.headers) && this.httpMethod == fileSystemUploadOptions.httpMethod && this.sessionType == fileSystemUploadOptions.sessionType && this.uploadType == fileSystemUploadOptions.uploadType && wl7.b(this.fieldName, fileSystemUploadOptions.fieldName) && wl7.b(this.mimeType, fileSystemUploadOptions.mimeType) && wl7.b(this.parameters, fileSystemUploadOptions.parameters);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final FileSystemUploadType getUploadType() {
        return this.uploadType;
    }

    public int hashCode() {
        Map<String, String> map = this.headers;
        int iHashCode = (this.uploadType.hashCode() + ((this.sessionType.hashCode() + ((this.httpMethod.hashCode() + ((map == null ? 0 : map.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str = this.fieldName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map2 = this.parameters;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        Map<String, String> map = this.headers;
        HttpMethod httpMethod = this.httpMethod;
        SessionType sessionType = this.sessionType;
        FileSystemUploadType fileSystemUploadType = this.uploadType;
        String str = this.fieldName;
        String str2 = this.mimeType;
        Map<String, String> map2 = this.parameters;
        StringBuilder sb = new StringBuilder("FileSystemUploadOptions(headers=");
        sb.append(map);
        sb.append(", httpMethod=");
        sb.append(httpMethod);
        sb.append(", sessionType=");
        sb.append(sessionType);
        sb.append(", uploadType=");
        sb.append(fileSystemUploadType);
        sb.append(", fieldName=");
        ia.r(sb, str, ", mimeType=", str2, ", parameters=");
        return b0.k(sb, map2, ")");
    }

    public /* synthetic */ FileSystemUploadOptions(Map map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType fileSystemUploadType, String str, String str2, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? HttpMethod.POST : httpMethod, (i & 4) != 0 ? SessionType.BACKGROUND : sessionType, fileSystemUploadType, str, str2, map2);
    }
}
