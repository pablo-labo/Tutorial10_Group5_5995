package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class g62 {
    public static final Logger a = Logger.getLogger(g62.class.getName());

    public static InputStream a(String str) {
        InputStream resourceAsStream = g62.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
