package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class ea8 implements at4<ea8> {
    public static final ba8 e = new ba8(0);
    public static final ca8 f = new ca8();
    public static final da8 g = new da8();
    public static final a h = new a();
    public final HashMap a;
    public final HashMap b;
    public final ba8 c;
    public boolean d;

    public static final class a implements mlg<Date> {
        public static final SimpleDateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // defpackage.ys4
        public final void a(Object obj, nlg nlgVar) {
            nlgVar.c(a.format((Date) obj));
        }
    }

    public ea8() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final at4 a(Class cls, kna knaVar) {
        this.a.put(cls, knaVar);
        this.b.remove(cls);
        return this;
    }
}
