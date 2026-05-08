package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class gqh {
    public static HashMap<String, String> f;
    public static Object k;
    public static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final HashMap<String, Boolean> g = new HashMap<>();
    public static final HashMap<String, Integer> h = new HashMap<>();
    public static final HashMap<String, Long> i = new HashMap<>();
    public static final HashMap<String, Float> j = new HashMap<>();
    public static final String[] m = new String[0];
}
