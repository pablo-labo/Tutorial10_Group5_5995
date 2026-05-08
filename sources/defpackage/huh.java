package defpackage;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class huh {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("EXECUTE", 1L);
        a = feature;
        Feature feature2 = new Feature("INIT", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
