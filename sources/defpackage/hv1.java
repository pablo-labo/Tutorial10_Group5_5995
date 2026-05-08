package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface hv1 extends fv1, zm9 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("DECLARATION", 0);
            a = aVar;
            a aVar2 = new a("FAKE_OVERRIDE", 1);
            b = aVar2;
            a aVar3 = new a("DELEGATION", 2);
            c = aVar3;
            a aVar4 = new a("SYNTHESIZED", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    void C0(Collection<? extends hv1> collection);

    hv1 Z(t52 t52Var, ax9 ax9Var, ws3 ws3Var);

    @Override // defpackage.fv1, defpackage.aj3
    hv1 a();

    a f();

    Collection<? extends hv1> m();
}
