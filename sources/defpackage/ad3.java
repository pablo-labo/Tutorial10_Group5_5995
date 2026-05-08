package defpackage;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ad3 {

    /* JADX INFO: Add missing generic type declarations: [N] */
    public static class a<N> extends b<N, Boolean> {
        public final /* synthetic */ Function1 a;
        public final /* synthetic */ boolean[] b;

        public a(Function1 function1, boolean[] zArr) {
            this.a = function1;
            this.b = zArr;
        }

        @Override // ad3.d
        public final Object a() {
            return Boolean.valueOf(this.b[0]);
        }

        @Override // ad3.d
        public final boolean c(N n) {
            boolean zBooleanValue = ((Boolean) this.a.invoke(n)).booleanValue();
            boolean[] zArr = this.b;
            if (zBooleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    public static abstract class b<N, R> implements d<N, R> {
        @Override // ad3.d
        public void b(N n) {
        }
    }

    public interface c<N> {
        Iterable<? extends N> d(N n);
    }

    public interface d<N, R> {
        R a();

        void b(N n);

        boolean c(N n);
    }

    public static class e<N> {
        public final HashSet a = new HashSet();
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[0] = "predicate";
                break;
            case 10:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, b bVar) {
        e eVar = new e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(it.next(), cVar, eVar, bVar);
        }
        return bVar.a();
    }

    public static void c(Object obj, c cVar, e eVar, b bVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (eVar.a.add(obj) && bVar.c(obj)) {
            Iterator it = cVar.d(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), cVar, eVar, bVar);
            }
            bVar.b(obj);
        }
    }

    public static <N> Boolean d(Collection<N> collection, c<N> cVar, Function1<N, Boolean> function1) {
        if (function1 != null) {
            return (Boolean) b(collection, cVar, new a(function1, new boolean[1]));
        }
        a(9);
        throw null;
    }
}
