package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sp7 {
    public final Function1<hr7, j6g> a;

    public static final class a extends sp7 {
        public final String b;
        public final String c;
        public final List<String> d;

        public a(int i) {
            super(null);
            this.b = "messagingConversation";
            this.c = "composeBox";
            this.d = zr4.a;
        }
    }

    public static final class b extends sp7 {
        public final String b;
        public final String c;
        public final List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, List list, Function1 function1, int i) {
            super((i & 8) != 0 ? null : function1);
            list = (i & 4) != 0 ? zr4.a : list;
            this.b = str;
            this.c = str2;
            this.d = list;
        }
    }

    public static final class d extends sp7 {
        public final String b;
        public final String c;
        public final cq7 d;
        public final dq7 e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, cq7 cq7Var, dq7 dq7Var, String str3) {
            super(null);
            str3.getClass();
            this.b = str;
            this.c = str2;
            this.d = cq7Var;
            this.e = dq7Var;
            this.f = str3;
        }
    }

    public static final class e extends sp7 {
        public final String b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final /* synthetic */ a[] a = {new a("FORWARD", 0), new a("BACK", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            a EF5;

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) a.clone();
            }
        }

        public e(String str, String str2) {
            super(null);
            this.b = str;
            this.c = str2;
        }
    }

    public static final class h extends sp7 {
        public final String b;
        public final String c;
        public final List<String> d;

        /* JADX WARN: Illegal instructions before constructor call */
        public h(int i, String str, String str2, Function1 function1) {
            function1 = (i & 8) != 0 ? null : function1;
            str2.getClass();
            super(function1);
            this.b = str;
            this.c = str2;
            this.d = zr4.a;
        }
    }

    public sp7(Function1 function1) {
        this.a = function1;
    }

    public static final class f extends sp7 {
        public final String b;
        public final List<String> c;

        public /* synthetic */ f(int i, String str, List list, Function1 function1) {
            this(str, (i & 2) != 0 ? zr4.a : list, (i & 4) != 0 ? null : function1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, List<String> list, Function1<? super hr7, j6g> function1) {
            super(function1);
            str.getClass();
            list.getClass();
            this.b = str;
            this.c = list;
        }
    }

    public static final class g extends sp7 {
        public final String b;
        public final String c;
        public final List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, List<String> list, Function1<? super hr7, j6g> function1) {
            super(function1);
            str.getClass();
            str2.getClass();
            list.getClass();
            this.b = str;
            this.c = str2;
            this.d = list;
        }

        public /* synthetic */ g(String str, String str2, List list, Function1 function1, int i) {
            this(str, str2, (i & 4) != 0 ? zr4.a : list, (i & 8) != 0 ? null : function1);
        }
    }

    public static final class c extends sp7 {
        public final String b;
        public final String c;
        public final a d;
        public final List<String> e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final a d;
            public static final a e;
            public static final /* synthetic */ a[] f;

            static {
                a aVar = new a("ALERT", 0);
                a = aVar;
                a aVar2 = new a("BANNER", 1);
                b = aVar2;
                a aVar3 = new a("TOAST", 2);
                c = aVar3;
                a aVar4 = new a("SUB_TAB", 3);
                d = aVar4;
                a aVar5 = new a("MENU_OPTION", 4);
                e = aVar5;
                f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f.clone();
            }
        }

        public /* synthetic */ c(String str, String str2, a aVar, List list, Function1 function1, int i) {
            this(str, str2, aVar, (i & 8) != 0 ? zr4.a : list, (i & 16) != 0 ? null : function1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, a aVar, List<String> list, Function1<? super hr7, j6g> function1) {
            super(function1);
            aVar.getClass();
            list.getClass();
            this.b = str;
            this.c = str2;
            this.d = aVar;
            this.e = list;
        }
    }
}
