package okhttp3.internal.connection;

import defpackage.u63;
import defpackage.zr4;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteSelector {
    public static final Companion i = new Companion(0);
    public final Address a;
    public final RouteDatabase b;
    public final Call c;
    public final EventListener d;
    public final List<? extends Proxy> e;
    public int f;
    public List<? extends InetSocketAddress> g;
    public final ArrayList h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Selection {
        public final ArrayList a;
        public int b;

        public Selection(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<Proxy> listK;
        routeDatabase.getClass();
        eventListener.getClass();
        this.a = address;
        this.b = routeDatabase;
        this.c = call;
        this.d = eventListener;
        zr4 zr4Var = zr4.a;
        this.e = zr4Var;
        this.g = zr4Var;
        this.h = new ArrayList();
        HttpUrl httpUrl = address.i;
        Proxy proxy = address.g;
        eventListener.proxySelectStart(call, httpUrl);
        if (proxy != null) {
            listK = u63.Z(proxy);
        } else {
            URI uriI = httpUrl.i();
            if (uriI.getHost() == null) {
                listK = Util.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = address.h.select(uriI);
                List<Proxy> list = listSelect;
                if (list == null || list.isEmpty()) {
                    listK = Util.k(Proxy.NO_PROXY);
                } else {
                    listSelect.getClass();
                    listK = Util.x(listSelect);
                }
            }
        }
        this.e = listK;
        this.f = 0;
        eventListener.proxySelectEnd(call, httpUrl, listK);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
