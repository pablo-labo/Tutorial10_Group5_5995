package defpackage;

import defpackage.b32;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hn9 implements b32 {
    public final String a;

    public static final class a extends hn9 {
        public static final a b = new a("must be a member function");

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return iv7Var.Y != null;
        }
    }

    public static final class b extends hn9 {
        public static final b b = new b("must be a member or an extension function");

        @Override // defpackage.b32
        public final boolean b(iv7 iv7Var) {
            return (iv7Var.Y == null && iv7Var.X == null) ? false : true;
        }
    }

    public hn9(String str) {
        this.a = str;
    }

    @Override // defpackage.b32
    public final String a(iv7 iv7Var) {
        return b32.a.a(this, iv7Var);
    }

    @Override // defpackage.b32
    public final String getDescription() {
        return this.a;
    }
}
