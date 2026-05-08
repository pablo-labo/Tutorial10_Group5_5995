package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface fx9<Model, Data> {

    public static class a<Data> {
        public final kg8 a;
        public final List<kg8> b;
        public final ke3<Data> c;

        public a() {
            throw null;
        }

        public a(kg8 kg8Var, ke3<Data> ke3Var) {
            List<kg8> list = Collections.EMPTY_LIST;
            beb.e(kg8Var, "Argument must not be null");
            this.a = kg8Var;
            beb.e(list, "Argument must not be null");
            this.b = list;
            beb.e(ke3Var, "Argument must not be null");
            this.c = ke3Var;
        }
    }

    a<Data> a(Model model, int i, int i2, ova ovaVar);

    boolean b(Model model);
}
