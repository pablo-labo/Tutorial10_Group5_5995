package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class a32 {
    public static final a32 a = new a32();
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        b = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
