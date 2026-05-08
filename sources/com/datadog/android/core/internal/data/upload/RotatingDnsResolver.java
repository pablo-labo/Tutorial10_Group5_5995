package com.datadog.android.core.internal.data.upload;

import defpackage.be4;
import defpackage.h5;
import defpackage.j6g;
import defpackage.pg8;
import defpackage.wd4;
import defpackage.wl7;
import defpackage.z92;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver;", "Lokhttp3/Dns;", "delegate", "Lwd4;", "ttl", "<init>", "(Lokhttp3/Dns;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Ljava/net/InetAddress;", "list", "safeCopy", "(Ljava/util/List;)Ljava/util/List;", "Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "knownHost", "", "isValid", "(Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;)Z", "", "hostname", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/Dns;", "J", "", "knownHosts", "Ljava/util/Map;", "Companion", "ResolvedHost", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RotatingDnsResolver implements Dns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long TTL_30_MIN;
    private final Dns delegate;
    private final Map<String, ResolvedHost> knownHosts;
    private final long ttl;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0013R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "", "", "hostname", "", "Ljava/net/InetAddress;", "addresses", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lwd4;", "getAge-UwyO8pc", "()J", "getAge", "Lj6g;", "rotate", "()V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$ResolvedHost;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHostname", "Ljava/util/List;", "getAddresses", "", "resolutionTimestamp", "J", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class ResolvedHost {
        private final List<InetAddress> addresses;
        private final String hostname;
        private final long resolutionTimestamp;

        public ResolvedHost(String str, List<InetAddress> list) {
            str.getClass();
            list.getClass();
            this.hostname = str;
            this.addresses = list;
            this.resolutionTimestamp = System.nanoTime();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResolvedHost copy$default(ResolvedHost resolvedHost, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolvedHost.hostname;
            }
            if ((i & 2) != 0) {
                list = resolvedHost.addresses;
            }
            return resolvedHost.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHostname() {
            return this.hostname;
        }

        public final List<InetAddress> component2() {
            return this.addresses;
        }

        public final ResolvedHost copy(String hostname, List<InetAddress> addresses) {
            hostname.getClass();
            addresses.getClass();
            return new ResolvedHost(hostname, addresses);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolvedHost)) {
                return false;
            }
            ResolvedHost resolvedHost = (ResolvedHost) other;
            return wl7.b(this.hostname, resolvedHost.hostname) && wl7.b(this.addresses, resolvedHost.addresses);
        }

        public final List<InetAddress> getAddresses() {
            return this.addresses;
        }

        /* JADX INFO: renamed from: getAge-UwyO8pc, reason: not valid java name */
        public final long m16getAgeUwyO8pc() {
            int i = wd4.d;
            return pg8.U(System.nanoTime() - this.resolutionTimestamp, be4.NANOSECONDS);
        }

        public final String getHostname() {
            return this.hostname;
        }

        public int hashCode() {
            return this.addresses.hashCode() + (this.hostname.hashCode() * 31);
        }

        public final void rotate() {
            synchronized (this.addresses) {
                try {
                    List<InetAddress> list = this.addresses;
                    list.getClass();
                    InetAddress inetAddressRemove = list.isEmpty() ? null : list.remove(0);
                    if (inetAddressRemove != null) {
                        this.addresses.add(inetAddressRemove);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public String toString() {
            return h5.c("ResolvedHost(hostname=", this.hostname, ", addresses=", ")", this.addresses);
        }
    }

    static {
        int i = wd4.d;
        TTL_30_MIN = pg8.T(30, be4.MINUTES);
    }

    private RotatingDnsResolver(Dns dns, long j) {
        dns.getClass();
        this.delegate = dns;
        this.ttl = j;
        this.knownHosts = new LinkedHashMap();
    }

    private final boolean isValid(ResolvedHost knownHost) {
        return wd4.e(knownHost.m16getAgeUwyO8pc(), this.ttl) < 0 && !knownHost.getAddresses().isEmpty();
    }

    private final List<InetAddress> safeCopy(List<? extends InetAddress> list) {
        List<InetAddress> listZ1;
        synchronized (list) {
            listZ1 = z92.z1(list);
        }
        return listZ1;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) {
        hostname.getClass();
        ResolvedHost resolvedHost = this.knownHosts.get(hostname);
        if (resolvedHost != null && isValid(resolvedHost)) {
            resolvedHost.rotate();
            return safeCopy(resolvedHost.getAddresses());
        }
        List<InetAddress> listLookup = this.delegate.lookup(hostname);
        this.knownHosts.put(hostname, new ResolvedHost(hostname, z92.B1(listLookup)));
        return safeCopy(listLookup);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/RotatingDnsResolver$Companion;", "", "<init>", "()V", "Lwd4;", "TTL_30_MIN", "J", "getTTL_30_MIN-UwyO8pc", "()J", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getTTL_30_MIN-UwyO8pc, reason: not valid java name */
        public final long m15getTTL_30_MINUwyO8pc() {
            return RotatingDnsResolver.TTL_30_MIN;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RotatingDnsResolver(Dns dns, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dns, j);
    }

    public /* synthetic */ RotatingDnsResolver(Dns dns, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.a : dns, (i & 2) != 0 ? TTL_30_MIN : j, null);
    }
}
