package com.indeed.android.rnpathfinder.props;

import android.os.Bundle;
import defpackage.akb;
import defpackage.aq1;
import defpackage.b0;
import defpackage.e9a;
import defpackage.oec;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/indeed/android/rnpathfinder/props/RNPathfinderProps;", "Loec;", "Le9a;", "nativeContext", "", "url", "", "optionalArgs", "<init>", "(Le9a;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "component1", "()Le9a;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Le9a;Ljava/lang/String;Ljava/util/Map;)Lcom/indeed/android/rnpathfinder/props/RNPathfinderProps;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le9a;", "getNativeContext", "Ljava/lang/String;", "getUrl", "Ljava/util/Map;", "getOptionalArgs", "rnpathfinder_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RNPathfinderProps implements oec {
    private final e9a nativeContext;
    private final Map<String, String> optionalArgs;
    private final String url;

    public RNPathfinderProps(e9a e9aVar, String str, Map<String, String> map) {
        e9aVar.getClass();
        str.getClass();
        this.nativeContext = e9aVar;
        this.url = str;
        this.optionalArgs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RNPathfinderProps copy$default(RNPathfinderProps rNPathfinderProps, e9a e9aVar, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            e9aVar = rNPathfinderProps.nativeContext;
        }
        if ((i & 2) != 0) {
            str = rNPathfinderProps.url;
        }
        if ((i & 4) != 0) {
            map = rNPathfinderProps.optionalArgs;
        }
        return rNPathfinderProps.copy(e9aVar, str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final e9a getNativeContext() {
        return this.nativeContext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component3() {
        return this.optionalArgs;
    }

    public final RNPathfinderProps copy(e9a nativeContext, String url, Map<String, String> optionalArgs) {
        nativeContext.getClass();
        url.getClass();
        return new RNPathfinderProps(nativeContext, url, optionalArgs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RNPathfinderProps)) {
            return false;
        }
        RNPathfinderProps rNPathfinderProps = (RNPathfinderProps) other;
        return wl7.b(this.nativeContext, rNPathfinderProps.nativeContext) && wl7.b(this.url, rNPathfinderProps.url) && wl7.b(this.optionalArgs, rNPathfinderProps.optionalArgs);
    }

    public final e9a getNativeContext() {
        return this.nativeContext;
    }

    public final Map<String, String> getOptionalArgs() {
        return this.optionalArgs;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iD = akb.d(this.nativeContext.hashCode() * 31, 31, this.url);
        Map<String, String> map = this.optionalArgs;
        return iD + (map == null ? 0 : map.hashCode());
    }

    @Override // defpackage.oec
    public Bundle toBundle() {
        Bundle bundleA = aq1.a(new Pair("nativeContext", this.nativeContext.toBundle()), new Pair("url", this.url));
        Map<String, String> map = this.optionalArgs;
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundleA.putBundle("optionalArgs", bundle);
        }
        return bundleA;
    }

    public String toString() {
        e9a e9aVar = this.nativeContext;
        String str = this.url;
        Map<String, String> map = this.optionalArgs;
        StringBuilder sb = new StringBuilder("RNPathfinderProps(nativeContext=");
        sb.append(e9aVar);
        sb.append(", url=");
        sb.append(str);
        sb.append(", optionalArgs=");
        return b0.k(sb, map, ")");
    }

    public /* synthetic */ RNPathfinderProps(e9a e9aVar, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e9aVar, str, (i & 4) != 0 ? null : map);
    }
}
