package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k5e {
    public static final r5e<List<String>> a = new r5e<>("ContentDescription", b.a, true);
    public static final r5e<String> b = new r5e<>("StateDescription", 0);
    public static final r5e<r2c> c = new r5e<>("ProgressBarRangeInfo", 0);
    public static final r5e<String> d = new r5e<>("PaneTitle", i.a, true);
    public static final r5e<j6g> e = new r5e<>("SelectableGroup", 0);
    public static final r5e<i92> f = new r5e<>("CollectionInfo", 0);
    public static final r5e<l92> g = new r5e<>("CollectionItemInfo", 0);
    public static final r5e<j6g> h = new r5e<>("Heading", 0);
    public static final r5e<j6g> i = new r5e<>("Disabled", 0);
    public static final r5e<tz8> j = new r5e<>("LiveRegion", 0);
    public static final r5e<Boolean> k = new r5e<>("Focused", 0);
    public static final r5e<Boolean> l = new r5e<>("IsContainer", 0);
    public static final r5e<Boolean> m = new r5e<>("IsTraversalGroup");
    public static final r5e<Boolean> n = new r5e<>("IsSensitiveData");
    public static final r5e<j6g> o = new r5e<>("InvisibleToUser", e.a);
    public static final r5e<j6g> p = new r5e<>("HideFromAccessibility", d.a);
    public static final r5e<jt2> q = new r5e<>("ContentType", c.a);
    public static final r5e<rs2> r = new r5e<>("ContentDataType", a.a);
    public static final r5e<Float> s = new r5e<>("TraversalIndex", n.a);
    public static final r5e<lrd> t = new r5e<>("HorizontalScrollAxisRange", 0);
    public static final r5e<lrd> u = new r5e<>("VerticalScrollAxisRange", 0);
    public static final r5e<j6g> v = new r5e<>("IsPopup", g.a, true);
    public static final r5e<j6g> w = new r5e<>("IsDialog", f.a, true);
    public static final r5e<qed> x = new r5e<>("Role", j.a, true);
    public static final r5e<String> y = new r5e<>("TestTag", l.a, false);
    public static final r5e<j6g> z = new r5e<>("LinkTestMarker", h.a, false);
    public static final r5e<List<le0>> A = new r5e<>("Text", m.a, true);
    public static final r5e<le0> B = new r5e<>("TextSubstitution");
    public static final r5e<Boolean> C = new r5e<>("IsShowingTextSubstitution");
    public static final r5e<le0> D = new r5e<>("InputText", 0);
    public static final r5e<le0> E = new r5e<>("EditableText", 0);
    public static final r5e<kjf> F = new r5e<>("TextSelectionRange", 0);
    public static final r5e<s37> G = new r5e<>("ImeAction", 0);
    public static final r5e<Boolean> H = new r5e<>("Selected", 0);
    public static final r5e<inf> I = new r5e<>("ToggleableState", 0);
    public static final r5e<j6g> J = new r5e<>("Password", 0);
    public static final r5e<String> K = new r5e<>("Error", 0);
    public static final r5e<Function1<Object, Integer>> L = new r5e<>("IndexForKey");
    public static final r5e<Boolean> M = new r5e<>("IsEditable");
    public static final r5e<Integer> N = new r5e<>("MaxTextLength");
    public static final r5e<dce> O = new r5e<>("Shape", k.a, false);

    public static final class a extends mj8 implements Function2<rs2, rs2, rs2> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final rs2 invoke(rs2 rs2Var, rs2 rs2Var2) {
            return rs2Var;
        }
    }

    public static final class b extends mj8 implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class c extends mj8 implements Function2<jt2, jt2, jt2> {
        public static final c a = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final jt2 invoke(jt2 jt2Var, jt2 jt2Var2) {
            return jt2Var;
        }
    }

    public static final class d extends mj8 implements Function2<j6g, j6g, j6g> {
        public static final d a = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(j6g j6gVar, j6g j6gVar2) {
            return j6gVar;
        }
    }

    public static final class e extends mj8 implements Function2<j6g, j6g, j6g> {
        public static final e a = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(j6g j6gVar, j6g j6gVar2) {
            return j6gVar;
        }
    }

    public static final class f extends mj8 implements Function2<j6g, j6g, j6g> {
        public static final f a = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(j6g j6gVar, j6g j6gVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class g extends mj8 implements Function2<j6g, j6g, j6g> {
        public static final g a = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(j6g j6gVar, j6g j6gVar2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class h extends mj8 implements Function2<j6g, j6g, j6g> {
        public static final h a = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(j6g j6gVar, j6g j6gVar2) {
            return j6gVar;
        }
    }

    public static final class i extends mj8 implements Function2<String, String, String> {
        public static final i a = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    public static final class j extends mj8 implements Function2<qed, qed, qed> {
        public static final j a = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final qed invoke(qed qedVar, qed qedVar2) {
            qed qedVar3 = qedVar;
            int i = qedVar2.a;
            return qedVar3;
        }
    }

    public static final class k extends mj8 implements Function2<dce, dce, dce> {
        public static final k a = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final dce invoke(dce dceVar, dce dceVar2) {
            return dceVar;
        }
    }

    public static final class l extends mj8 implements Function2<String, String, String> {
        public static final l a = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    public static final class m extends mj8 implements Function2<List<? extends le0>, List<? extends le0>, List<? extends le0>> {
        public static final m a = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends le0> invoke(List<? extends le0> list, List<? extends le0> list2) {
            List<? extends le0> list3 = list;
            List<? extends le0> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class n extends mj8 implements Function2<Float, Float, Float> {
        public static final n a = new n(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Float f, Float f2) {
            Float f3 = f;
            f2.floatValue();
            return f3;
        }
    }
}
