package com.datadog.android.core.internal.net;

import com.datadog.android.lint.InternalApi;
import com.datadog.android.trace.TracingHeaderType;
import defpackage.is4;
import defpackage.kc9;
import defpackage.lc9;
import defpackage.r6;
import defpackage.t92;
import defpackage.ut0;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z92;
import java.io.EOFException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
@InternalApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00172\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\bRH\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "hosts", "<init>", "(Ljava/util/Map;)V", "Lokhttp3/HttpUrl;", "url", "", "isFirstPartyUrl", "(Lokhttp3/HttpUrl;)Z", "(Ljava/lang/String;)Z", "headerTypesForUrl", "(Ljava/lang/String;)Ljava/util/Set;", "(Lokhttp3/HttpUrl;)Ljava/util/Set;", "getAllHeaderTypes", "()Ljava/util/Set;", "isEmpty", "()Z", "", "Lj6g;", "addKnownHosts$dd_sdk_android_core_release", "(Ljava/util/List;)V", "addKnownHosts", "hostsWithHeaderTypes", "addKnownHostsWithHeaderTypes$dd_sdk_android_core_release", "addKnownHostsWithHeaderTypes", "<set-?>", "knownHosts", "Ljava/util/Map;", "getKnownHosts$dd_sdk_android_core_release", "()Ljava/util/Map;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DefaultFirstPartyHostHeaderTypeResolver implements FirstPartyHostHeaderTypeResolver {
    private Map<String, ? extends Set<? extends TracingHeaderType>> knownHosts;

    public DefaultFirstPartyHostHeaderTypeResolver(Map<String, ? extends Set<? extends TracingHeaderType>> map) {
        map.getClass();
        Set<Map.Entry<String, ? extends Set<? extends TracingHeaderType>>> setEntrySet = map.entrySet();
        int iV = kc9.V(t92.r0(setEntrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            Pair pair = new Pair(r6.f(locale, str, locale), entry.getValue());
            linkedHashMap.put(pair.d(), pair.e());
        }
        this.knownHosts = linkedHashMap;
    }

    public final void addKnownHosts$dd_sdk_android_core_release(List<String> hosts) {
        hosts.getClass();
        Map<String, ? extends Set<? extends TracingHeaderType>> map = this.knownHosts;
        List<String> list = hosts;
        int iV = kc9.V(t92.r0(list, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (String str : list) {
            Locale locale = Locale.US;
            Pair pair = new Pair(r6.f(locale, str, locale), ut0.I0(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
            linkedHashMap.put(pair.d(), pair.e());
        }
        this.knownHosts = lc9.c0(map, linkedHashMap);
    }

    public final void addKnownHostsWithHeaderTypes$dd_sdk_android_core_release(Map<String, ? extends Set<? extends TracingHeaderType>> hostsWithHeaderTypes) {
        hostsWithHeaderTypes.getClass();
        Map<String, ? extends Set<? extends TracingHeaderType>> map = this.knownHosts;
        Set<Map.Entry<String, ? extends Set<? extends TracingHeaderType>>> setEntrySet = hostsWithHeaderTypes.entrySet();
        int iV = kc9.V(t92.r0(setEntrySet, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Locale locale = Locale.US;
            Pair pair = new Pair(r6.f(locale, str, locale), entry.getValue());
            linkedHashMap.put(pair.d(), pair.e());
        }
        this.knownHosts = lc9.c0(map, linkedHashMap);
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public Set<TracingHeaderType> getAllHeaderTypes() {
        return z92.E1(t92.s0(this.knownHosts.values()));
    }

    public final Map<String, Set<TracingHeaderType>> getKnownHosts$dd_sdk_android_core_release() {
        return this.knownHosts;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public Set<TracingHeaderType> headerTypesForUrl(HttpUrl url) {
        Object next;
        url.getClass();
        String str = url.d;
        Set<TracingHeaderType> set = (Set) this.knownHosts.get(str);
        if (set != null) {
            return set;
        }
        Iterator<T> it = this.knownHosts.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wve.D(str, "." + ((Map.Entry) next).getKey(), false)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        Set<TracingHeaderType> set2 = entry != null ? (Set) entry.getValue() : null;
        if (set2 != null) {
            return set2;
        }
        Set<TracingHeaderType> set3 = (Set) this.knownHosts.get("*");
        return set3 == null ? is4.a : set3;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public boolean isEmpty() {
        return this.knownHosts.isEmpty();
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public boolean isFirstPartyUrl(HttpUrl url) {
        url.getClass();
        String str = url.d;
        Set<String> setKeySet = this.knownHosts.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String str2 : setKeySet) {
                if (wl7.b(str2, "*") || wl7.b(str, str2)) {
                    return true;
                }
                if (wve.D(str, "." + str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public boolean isFirstPartyUrl(String url) throws EOFException {
        HttpUrl httpUrlC;
        url.getClass();
        HttpUrl.k.getClass();
        try {
            httpUrlC = HttpUrl.Companion.c(url);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        if (httpUrlC == null) {
            return false;
        }
        return isFirstPartyUrl(httpUrlC);
    }

    @Override // com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver
    public Set<TracingHeaderType> headerTypesForUrl(String url) throws EOFException {
        HttpUrl httpUrlC;
        url.getClass();
        HttpUrl.k.getClass();
        try {
            httpUrlC = HttpUrl.Companion.c(url);
        } catch (IllegalArgumentException unused) {
            httpUrlC = null;
        }
        if (httpUrlC == null) {
            return is4.a;
        }
        return headerTypesForUrl(httpUrlC);
    }
}
