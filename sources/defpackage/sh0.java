package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.NoDataException;
import defpackage.pua;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import pua.a;

/* JADX INFO: loaded from: classes.dex */
public final class sh0<D extends pua.a> {
    public final UUID a;
    public final pua<D> b;
    public final D c;
    public final List<iw4> d;
    public final ApolloException e;
    public final Map<String, Object> f;
    public final k15 g;
    public final boolean h;

    public static final class a<D extends pua.a> {
        public final pua<D> a;
        public UUID b;
        public final D c;
        public final List<iw4> d;
        public final Map<String, ? extends Object> e;
        public ApolloException f;
        public k15 g;
        public boolean h;

        public a(pua<D> puaVar, UUID uuid, D d, List<iw4> list, Map<String, ? extends Object> map, ApolloException apolloException) {
            puaVar.getClass();
            uuid.getClass();
            this.a = puaVar;
            this.b = uuid;
            this.c = d;
            this.d = list;
            this.e = map;
            this.f = apolloException;
            this.g = wr4.a;
        }

        public final void a(k15 k15Var) {
            k15Var.getClass();
            this.g = this.g.d(k15Var);
        }

        public final sh0<D> b() {
            UUID uuid = this.b;
            k15 k15Var = this.g;
            Map map = this.e;
            if (map == null) {
                map = bs4.a;
            }
            ApolloException apolloException = this.f;
            boolean z = this.h;
            return new sh0<>(uuid, this.a, this.c, this.d, apolloException, map, k15Var, z);
        }
    }

    public sh0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sh0(UUID uuid, pua puaVar, pua.a aVar, List list, ApolloException apolloException, Map map, k15 k15Var, boolean z) {
        this.a = uuid;
        this.b = puaVar;
        this.c = aVar;
        this.d = list;
        this.e = apolloException;
        this.f = map;
        this.g = k15Var;
        this.h = z;
    }

    public final D a() {
        if (b()) {
            List<iw4> list = this.d;
            list.getClass();
            throw new ApolloGraphQLException((iw4) z92.O0(list));
        }
        ApolloException apolloException = this.e;
        if (apolloException != null) {
            throw new DefaultApolloException("An exception happened", apolloException);
        }
        D d = this.c;
        if (d != null) {
            return d;
        }
        throw new NoDataException(apolloException);
    }

    public final boolean b() {
        List<iw4> list = this.d;
        return !(list == null || list.isEmpty());
    }

    public final a<D> c() {
        a<D> aVar = new a<>(this.b, this.a, this.c, this.d, this.f, this.e);
        aVar.a(this.g);
        aVar.h = this.h;
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApolloResponse(operationName=");
        pua<D> puaVar = this.b;
        sb.append(puaVar.name());
        sb.append(", data=");
        String strR = "null";
        sb.append(this.c == null ? "null" : puaVar.name().concat(".Data"));
        sb.append(", errors=");
        List<iw4> list = this.d;
        sb.append(list != null ? Integer.valueOf(list.size()) : "null");
        sb.append(", exception=");
        ApolloException apolloException = this.e;
        if (apolloException != null) {
            strR = fwc.a.b(apolloException.getClass()).r();
            if (strR == null) {
                strR = "true";
            }
        }
        return w40.f(sb, strR, ')');
    }
}
