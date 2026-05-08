package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l5e {
    public static final r5e<Boolean> a = new r5e<>("TestTagsAsResourceId", b.a, false);
    public static final r5e<String> b = new r5e<>("AccessibilityClassName", a.a, true);

    public static final class a extends mj8 implements Function2<String, String, String> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    public static final class b extends mj8 implements Function2<Boolean, Boolean, Boolean> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }
}
