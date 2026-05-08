package com.datadog.android.api.context;

import com.datadog.android.core.internal.utils.JsonSerializer;
import defpackage.ab8;
import defpackage.bs4;
import defpackage.ey8;
import defpackage.g7;
import defpackage.hh2;
import defpackage.ka8;
import defpackage.u40;
import defpackage.ut0;
import defpackage.wl7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006%"}, d2 = {"Lcom/datadog/android/api/context/UserInfo;", "", "", "id", "name", "email", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lka8;", "toJson$dd_sdk_android_core_release", "()Lka8;", "toJson", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/api/context/UserInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getEmail", "Ljava/util/Map;", "getAdditionalProperties", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class UserInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] RESERVED_PROPERTIES = {"id", "name", "email"};
    private final Map<String, Object> additionalProperties;
    private final String email;
    private final String id;
    private final String name;

    public /* synthetic */ UserInfo(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? bs4.a : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = userInfo.email;
        }
        if ((i & 8) != 0) {
            map = userInfo.additionalProperties;
        }
        return userInfo.copy(str, str2, str3, map);
    }

    public static final UserInfo fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public static final UserInfo fromJsonObject(ab8 ab8Var) {
        return INSTANCE.fromJsonObject(ab8Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final UserInfo copy(String id, String name, String email, Map<String, ? extends Object> additionalProperties) {
        additionalProperties.getClass();
        return new UserInfo(id, name, email, additionalProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return wl7.b(this.id, userInfo.id) && wl7.b(this.name, userInfo.name) && wl7.b(this.email, userInfo.email) && wl7.b(this.additionalProperties, userInfo.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        return this.additionalProperties.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final ka8 toJson$dd_sdk_android_core_release() {
        ab8 ab8Var = new ab8();
        String str = this.id;
        if (str != null) {
            ab8Var.l("id", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            ab8Var.l("name", str2);
        }
        String str3 = this.email;
        if (str3 != null) {
            ab8Var.l("email", str3);
        }
        for (Map.Entry<String, Object> entry : this.additionalProperties.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!ut0.f0(key, RESERVED_PROPERTIES)) {
                ab8Var.i(key, JsonSerializer.INSTANCE.toJsonElement(value));
            }
        }
        return ab8Var;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.email;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder sbF = u40.f("UserInfo(id=", str, ", name=", str2, ", email=");
        sbF.append(str3);
        sbF.append(", additionalProperties=");
        sbF.append(map);
        sbF.append(")");
        return sbF.toString();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/api/context/UserInfo$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/context/UserInfo;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/api/context/UserInfo;", "Lab8;", "jsonObject", "fromJsonObject", "(Lab8;)Lcom/datadog/android/api/context/UserInfo;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_core_release", "()[Ljava/lang/String;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserInfo fromJson(String jsonString) {
            jsonString.getClass();
            try {
                return fromJsonObject(hh2.A(jsonString).d());
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type UserInfo", e);
                return null;
            }
        }

        public final UserInfo fromJsonObject(ab8 jsonObject) {
            jsonObject.getClass();
            try {
                ka8 ka8VarM = jsonObject.m("id");
                String strG = ka8VarM != null ? ka8VarM.g() : null;
                ka8 ka8VarM2 = jsonObject.m("name");
                String strG2 = ka8VarM2 != null ? ka8VarM2.g() : null;
                ka8 ka8VarM3 = jsonObject.m("email");
                String strG3 = ka8VarM3 != null ? ka8VarM3.g() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : (ey8.b) jsonObject.a.entrySet()) {
                    if (!ut0.f0(entry.getKey(), getRESERVED_PROPERTIES$dd_sdk_android_core_release())) {
                        Object key = entry.getKey();
                        key.getClass();
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new UserInfo(strG, strG2, strG3, linkedHashMap);
            } catch (IllegalStateException e) {
                g7.n("Unable to parse json into type UserInfo", e);
                return null;
            } catch (NullPointerException e2) {
                g7.n("Unable to parse json into type UserInfo", e2);
                return null;
            } catch (NumberFormatException e3) {
                g7.n("Unable to parse json into type UserInfo", e3);
                return null;
            }
        }

        public final String[] getRESERVED_PROPERTIES$dd_sdk_android_core_release() {
            return UserInfo.RESERVED_PROPERTIES;
        }

        private Companion() {
        }
    }

    public UserInfo(String str, String str2, String str3, Map<String, ? extends Object> map) {
        map.getClass();
        this.id = str;
        this.name = str2;
        this.email = str3;
        this.additionalProperties = map;
    }

    public UserInfo() {
        this(null, null, null, null, 15, null);
    }
}
