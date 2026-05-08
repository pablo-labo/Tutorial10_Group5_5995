package defpackage;

import defpackage.b32;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iad implements b32 {
    public final Function1<ei8, ui8> a;
    public final String b;

    public static final class a extends iad {
        public static final a c = new a("Boolean", sp8.d);
    }

    public static final class b extends iad {
        public static final b c = new b("Int", jad.b);
    }

    public static final class c extends iad {
        public static final c c = new c("Unit", kad.b);
    }

    public iad(String str, Function1 function1) {
        this.a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.b32
    public final String a(iv7 iv7Var) {
        return b32.a.a(this, iv7Var);
    }

    @Override // defpackage.b32
    public final boolean b(iv7 iv7Var) {
        return wl7.b(iv7Var.V, this.a.invoke(b04.e(iv7Var)));
    }

    @Override // defpackage.b32
    public final String getDescription() {
        return this.b;
    }
}
