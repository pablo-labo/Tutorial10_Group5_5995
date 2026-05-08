package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class fb5 {
    public static final char a;
    public static final char b;

    static {
        Character.toString(JwtParser.SEPARATOR_CHAR);
        char c = File.separatorChar;
        a = c;
        char c2 = '\\';
        if (c != '/') {
            if (c != '\\') {
                l5.q(String.valueOf(c));
                return;
            }
            c2 = '/';
        }
        b = c2;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }
}
