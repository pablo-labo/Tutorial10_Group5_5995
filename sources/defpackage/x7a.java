package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
public final class x7a {
    public static final a Companion;
    public static final Lazy<KSerializer<Object>> a;
    public static final x7a b;
    public static final /* synthetic */ x7a[] c;

    /* JADX INFO: Fake field, exist only in values array */
    x7a EF0;

    public static final class a {
        public final KSerializer<x7a> serializer() {
            return (KSerializer) x7a.a.getValue();
        }
    }

    static {
        x7a x7aVar = new x7a("SAVED", 0);
        x7a x7aVar2 = new x7a("INVITATIONS", 1);
        x7a x7aVar3 = new x7a("APPLIED", 2);
        x7a x7aVar4 = new x7a("INTERVIEWS", 3);
        x7a x7aVar5 = new x7a("ARCHIVED", 4);
        x7a x7aVar6 = new x7a("GHOSTWRITERAUTOAPPLY", 5);
        b = x7aVar6;
        c = new x7a[]{x7aVar, x7aVar2, x7aVar3, x7aVar4, x7aVar5, x7aVar6};
        Companion = new a();
        a = boa.E(qt8.b, new cn0(13));
    }

    public x7a() {
        throw null;
    }

    public static x7a valueOf(String str) {
        return (x7a) Enum.valueOf(x7a.class, str);
    }

    public static x7a[] values() {
        return (x7a[]) c.clone();
    }
}
