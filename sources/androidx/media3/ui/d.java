package androidx.media3.ui;

import android.text.Html;
import defpackage.koe;
import defpackage.qz5;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static class a {
        public final String a;
        public final Map<String, String> b;

        public a(String str, Map map) {
            this.a = str;
            this.b = map;
        }
    }

    public static final class b {
        public static final koe e = new koe();
        public static final qz5 f = new qz5(1);
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public b(String str, int i, int i2, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
