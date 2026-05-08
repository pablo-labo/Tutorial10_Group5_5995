package okhttp3;

import defpackage.ut0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Dns;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Dns {
    public static final Dns a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/Dns$Companion;", "", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ int a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public final List<InetAddress> lookup(String str) throws UnknownHostException {
                str.getClass();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    allByName.getClass();
                    return ut0.E0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i = Companion.a;
        a = new Companion.DnsSystem();
    }

    List<InetAddress> lookup(String str);
}
