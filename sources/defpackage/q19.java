package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class q19 implements maa {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public static final class a {
    }

    public q19(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static final q19 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(q19.class.getClassLoader());
        if (!bundle.containsKey("stayCc")) {
            l5.q("Required argument \"stayCc\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("stayCc");
        if (string == null) {
            l5.q("Argument \"stayCc\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("moveCc")) {
            l5.q("Required argument \"moveCc\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("moveCc");
        if (string2 != null) {
            return new q19(string, string2);
        }
        l5.q("Argument \"moveCc\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q19)) {
            return false;
        }
        q19 q19Var = (q19) obj;
        return this.a.equals(q19Var.a) && this.b.equals(q19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("LocationSelectorFragmentArgs(stayCc=", this.a, ", moveCc=", this.b, ")");
    }
}
