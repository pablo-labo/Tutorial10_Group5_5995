package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
public abstract class l3f {
    public static final a Companion = new a();
    public static final Lazy<KSerializer<Object>> d = boa.E(qt8.b, new ag3(12));
    public final String a;
    public final Boolean b;
    public final String c;

    public static final class a {
        public final KSerializer<l3f> serializer() {
            return (KSerializer) l3f.d.getValue();
        }
    }

    public /* synthetic */ l3f(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public l3f() {
    }
}
