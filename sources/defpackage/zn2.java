package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zn2 {
    public static final BitSet a;
    public static final BitSet b;
    public static final BitSet c;
    public static final BitSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;

    static {
        BitSet bitSet = new BitSet();
        a = bitSet;
        bitSet.set(500, 600);
        BitSet bitSet2 = new BitSet();
        b = bitSet2;
        bitSet2.set(DataOkHttpUploader.HTTP_BAD_REQUEST, 500);
        BitSet bitSet3 = new BitSet();
        c = bitSet3;
        bitSet3.set(2, 17);
        BitSet bitSet4 = new BitSet();
        d = bitSet4;
        bitSet4.set(1, 17);
        new BitSet().set(0, 1);
        e = new LinkedHashSet(Arrays.asList(npf.a, npf.f));
        f = new LinkedHashSet(Arrays.asList(u3c.DATADOG));
        new HashSet(Arrays.asList("SHA1", "SHA-1", "MD2", "MD5", "RIPEMD128", "MD4"));
    }
}
