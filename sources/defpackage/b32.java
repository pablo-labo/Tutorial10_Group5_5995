package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface b32 {

    public static final class a {
        public static String a(b32 b32Var, iv7 iv7Var) {
            if (b32Var.b(iv7Var)) {
                return null;
            }
            return b32Var.getDescription();
        }
    }

    String a(iv7 iv7Var);

    boolean b(iv7 iv7Var);

    String getDescription();
}
