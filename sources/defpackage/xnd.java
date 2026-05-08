package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class xnd {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final xnd b;
    public static final xnd c;
    public static final /* synthetic */ xnd[] d;

    public static final class a {
        public final KSerializer<xnd> serializer() {
            return (KSerializer) xnd.a.getValue();
        }
    }

    static {
        xnd xndVar = new xnd("COMPLETED", 0);
        b = xndVar;
        xnd xndVar2 = new xnd("CANCELLED", 1);
        c = xndVar2;
        d = new xnd[]{xndVar, xndVar2};
        Companion = new a();
        a = boa.E(qt8.b, new fc2(15));
    }

    public xnd() {
        throw null;
    }

    public static xnd valueOf(String str) {
        return (xnd) Enum.valueOf(xnd.class, str);
    }

    public static xnd[] values() {
        return (xnd[]) d.clone();
    }
}
