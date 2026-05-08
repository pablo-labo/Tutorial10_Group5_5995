package com.datadog.android.rum.internal.domain.scope;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.navigation.a;
import androidx.navigation.fragment.a;
import defpackage.akb;
import defpackage.e44;
import defpackage.l6;
import defpackage.q6;
import defpackage.u40;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z3;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "", "id", "", "url", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumScopeKey {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String name;
    private final String url;

    public RumScopeKey(String str, String str2, String str3) {
        q6.m(str, str2, str3);
        this.id = str;
        this.url = str2;
        this.name = str3;
    }

    public static /* synthetic */ RumScopeKey copy$default(RumScopeKey rumScopeKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rumScopeKey.id;
        }
        if ((i & 2) != 0) {
            str2 = rumScopeKey.url;
        }
        if ((i & 4) != 0) {
            str3 = rumScopeKey.name;
        }
        return rumScopeKey.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final RumScopeKey copy(String id, String url, String name) {
        id.getClass();
        url.getClass();
        name.getClass();
        return new RumScopeKey(id, url, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumScopeKey)) {
            return false;
        }
        RumScopeKey rumScopeKey = (RumScopeKey) other;
        return wl7.b(this.id, rumScopeKey.id) && wl7.b(this.url, rumScopeKey.url) && wl7.b(this.name, rumScopeKey.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.name.hashCode() + akb.d(this.id.hashCode() * 31, 31, this.url);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.url;
        return l6.i(u40.f("RumScopeKey(id=", str, ", url=", str2, ", name="), this.name, ")");
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey$Companion;", "", "()V", "from", "Lcom/datadog/android/rum/internal/domain/scope/RumScopeKey;", "key", "name", "", "resolveComponent", "Landroid/content/ComponentName;", "resolveComponentUrl", "resolveId", "resolveName", "resolveUrl", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RumScopeKey from$default(Companion companion, Object obj, String str, int i, Object obj2) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.from(obj, str);
        }

        private final ComponentName resolveComponent(Object key) {
            Intent intent;
            if (key instanceof Activity) {
                return ((Activity) key).getComponentName();
            }
            if (!(key instanceof a.C0068a) || (intent = ((a.C0068a) key).a0) == null) {
                return null;
            }
            return intent.getComponent();
        }

        private final String resolveComponentUrl(ComponentName key) {
            String packageName = key.getPackageName();
            packageName.getClass();
            if (packageName.length() == 0) {
                String className = key.getClassName();
                className.getClass();
                return className;
            }
            String className2 = key.getClassName();
            className2.getClass();
            if (wve.K(className2, key.getPackageName() + ".", false)) {
                String className3 = key.getClassName();
                className3.getClass();
                return className3;
            }
            String className4 = key.getClassName();
            className4.getClass();
            if (!zve.M(className4, JwtParser.SEPARATOR_CHAR)) {
                return z3.m(key.getPackageName(), ".", key.getClassName());
            }
            String className5 = key.getClassName();
            className5.getClass();
            return className5;
        }

        private final String resolveId(Object key) {
            if (key instanceof String) {
                return (String) key;
            }
            if (key instanceof Number) {
                return key.toString();
            }
            if (key instanceof Enum) {
                return z3.m(key.getClass().getName(), "@", ((Enum) key).name());
            }
            if (key instanceof e44.a) {
                e44.a aVar = (e44.a) key;
                return aVar.l() + "#" + aVar.W;
            }
            if (!(key instanceof a.b)) {
                return key.toString();
            }
            a.b bVar = (a.b) key;
            return bVar.l() + "#" + bVar.W;
        }

        private final String resolveName(Object key) {
            return key instanceof String ? (String) key : key instanceof Number ? key.toString() : key instanceof Enum ? ((Enum) key).name() : key instanceof e44.a ? ((e44.a) key).l() : key instanceof a.b ? ((a.b) key).l() : key.getClass().getName();
        }

        private final String resolveUrl(Object key) {
            if (key instanceof String) {
                return (String) key;
            }
            if (key instanceof Number) {
                return key.toString();
            }
            if (key instanceof Enum) {
                return z3.m(key.getClass().getName(), ".", ((Enum) key).name());
            }
            if (key instanceof e44.a) {
                return ((e44.a) key).l();
            }
            if (key instanceof a.b) {
                return ((a.b) key).l();
            }
            String canonicalName = key.getClass().getCanonicalName();
            return canonicalName == null ? key.getClass().getSimpleName() : canonicalName;
        }

        public final RumScopeKey from(Object key, String name) {
            key.getClass();
            ComponentName componentNameResolveComponent = resolveComponent(key);
            if (componentNameResolveComponent == null) {
                String strResolveId = resolveId(key);
                String strResolveUrl = resolveUrl(key);
                if (name == null) {
                    name = resolveName(key);
                }
                return new RumScopeKey(strResolveId, strResolveUrl, name);
            }
            String str = componentNameResolveComponent.getClassName() + "@" + System.identityHashCode(key);
            String strResolveComponentUrl = resolveComponentUrl(componentNameResolveComponent);
            if (name == null) {
                name = componentNameResolveComponent.getClassName();
                name.getClass();
            }
            return new RumScopeKey(str, strResolveComponentUrl, name);
        }

        private Companion() {
        }
    }
}
