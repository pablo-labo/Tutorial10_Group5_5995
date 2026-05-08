package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class lb8 extends zqf {

    public final class a<T> extends b9c<T> {
        public final Collection<String> b;
        public final /* synthetic */ lb8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lb8 lb8Var, Collection collection, q2 q2Var) {
            super(q2Var);
            collection.getClass();
            this.c = lb8Var;
            this.b = collection;
        }

        public final String toString() {
            return "json.sq:recordsForKeys";
        }
    }
}
