package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z22 {
    public static final /* synthetic */ int a = 0;

    static {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Charset charset = StandardCharsets.ISO_8859_1;
        treeMap.put(charset.name(), charset);
        Charset charset2 = StandardCharsets.US_ASCII;
        treeMap.put(charset2.name(), charset2);
        Charset charset3 = StandardCharsets.UTF_16;
        treeMap.put(charset3.name(), charset3);
        Charset charset4 = StandardCharsets.UTF_16BE;
        treeMap.put(charset4.name(), charset4);
        Charset charset5 = StandardCharsets.UTF_16LE;
        treeMap.put(charset5.name(), charset5);
        Charset charset6 = StandardCharsets.UTF_8;
        treeMap.put(charset6.name(), charset6);
        Collections.unmodifiableSortedMap(treeMap);
    }
}
