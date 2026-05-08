package defpackage;

import org.apache.avro.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x34 implements kx5<x34> {
    public static final x34 a;
    public static final x34 b;
    public static final g c;
    public static final /* synthetic */ x34[] d;

    static {
        x34 x34Var = new x34("LANDSCAPE", 0);
        a = x34Var;
        x34 x34Var2 = new x34("PORTRAIT", 1);
        b = x34Var2;
        d = new x34[]{x34Var, x34Var2};
        c = j6.d("{\"type\":\"enum\",\"name\":\"DeviceOrientations\",\"namespace\":\"com.indeed.signals.schema.jsma.evergreen\",\"symbols\":[\"LANDSCAPE\",\"PORTRAIT\"]}");
    }

    public x34() {
        throw null;
    }

    public static x34 valueOf(String str) {
        return (x34) Enum.valueOf(x34.class, str);
    }

    public static x34[] values() {
        return (x34[]) d.clone();
    }

    @Override // defpackage.xw5
    public final g a() {
        return c;
    }
}
