package com.datadog.android.api.net;

import defpackage.akb;
import defpackage.k20;
import defpackage.u40;
import defpackage.wl7;
import defpackage.z3;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/datadog/android/api/net/Request;", "", "id", "", "description", "url", "headers", "", "body", "", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;)V", "getBody", "()[B", "getContentType", "()Ljava/lang/String;", "getDescription", "getHeaders", "()Ljava/util/Map;", "getId", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class Request {
    private final byte[] body;
    private final String contentType;
    private final String description;
    private final Map<String, String> headers;
    private final String id;
    private final String url;

    public Request(String str, String str2, String str3, Map<String, String> map, byte[] bArr, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        bArr.getClass();
        this.id = str;
        this.description = str2;
        this.url = str3;
        this.headers = map;
        this.body = bArr;
        this.contentType = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, Map map, byte[] bArr, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = request.id;
        }
        if ((i & 2) != 0) {
            str2 = request.description;
        }
        if ((i & 4) != 0) {
            str3 = request.url;
        }
        if ((i & 8) != 0) {
            map = request.headers;
        }
        if ((i & 16) != 0) {
            bArr = request.body;
        }
        if ((i & 32) != 0) {
            str4 = request.contentType;
        }
        byte[] bArr2 = bArr;
        String str5 = str4;
        return request.copy(str, str2, str3, map, bArr2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte[] getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public final Request copy(String id, String description, String url, Map<String, String> headers, byte[] body, String contentType) {
        id.getClass();
        description.getClass();
        url.getClass();
        headers.getClass();
        body.getClass();
        return new Request(id, description, url, headers, body, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return wl7.b(this.id, request.id) && wl7.b(this.description, request.description) && wl7.b(this.url, request.url) && wl7.b(this.headers, request.headers) && wl7.b(this.body, request.body) && wl7.b(this.contentType, request.contentType);
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.body) + k20.b(this.headers, akb.d(akb.d(this.id.hashCode() * 31, 31, this.description), 31, this.url), 31)) * 31;
        String str = this.contentType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.description;
        String str3 = this.url;
        Map<String, String> map = this.headers;
        String string = Arrays.toString(this.body);
        String str4 = this.contentType;
        StringBuilder sbF = u40.f("Request(id=", str, ", description=", str2, ", url=");
        sbF.append(str3);
        sbF.append(", headers=");
        sbF.append(map);
        sbF.append(", body=");
        return z3.n(sbF, string, ", contentType=", str4, ")");
    }

    public /* synthetic */ Request(String str, String str2, String str3, Map map, byte[] bArr, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, bArr, (i & 32) != 0 ? null : str4);
    }
}
