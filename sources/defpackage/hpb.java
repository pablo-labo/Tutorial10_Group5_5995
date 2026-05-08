package defpackage;

import com.wlproctor.common.model.TestBucket;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hpb {
    public static final a Companion = new a();
    public static final hpb c;
    public final Map<String, TestBucket> a;
    public final Map<String, TestBucket> b;

    public static final class a {
    }

    static {
        bs4 bs4Var = bs4.a;
        c = new hpb("", bs4Var, bs4Var);
    }

    public hpb(String str, Map<String, TestBucket> map, Map<String, TestBucket> map2) {
        str.getClass();
        map.getClass();
        map2.getClass();
        this.a = map;
        this.b = map2;
    }
}
