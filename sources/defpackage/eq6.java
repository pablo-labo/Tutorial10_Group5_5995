package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class eq6 implements maa {
    public final IanInitialState a;
    public final boolean b;
    public final boolean c;

    public eq6(IanInitialState ianInitialState, boolean z, boolean z2) {
        this.a = ianInitialState;
        this.b = z;
        this.c = z2;
    }

    public static final eq6 fromBundle(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(eq6.class.getClassLoader());
        IanInitialState ianInitialState = null;
        if (bundle.containsKey("initialState")) {
            if (!Parcelable.class.isAssignableFrom(IanInitialState.class) && !Serializable.class.isAssignableFrom(IanInitialState.class)) {
                b0.u(IanInitialState.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            ianInitialState = (IanInitialState) bundle.get("initialState");
        }
        return new eq6(ianInitialState, bundle.containsKey("fromOnboarding") ? bundle.getBoolean("fromOnboarding") : false, bundle.containsKey("fromRegPromo") ? bundle.getBoolean("fromRegPromo") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq6)) {
            return false;
        }
        eq6 eq6Var = (eq6) obj;
        return wl7.b(this.a, eq6Var.a) && this.b == eq6Var.b && this.c == eq6Var.c;
    }

    public final int hashCode() {
        IanInitialState ianInitialState = this.a;
        return Boolean.hashCode(this.c) + ia.f((ianInitialState == null ? 0 : ianInitialState.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IanMainFragmentArgs(initialState=");
        sb.append(this.a);
        sb.append(", fromOnboarding=");
        sb.append(this.b);
        sb.append(", fromRegPromo=");
        return z3.o(sb, this.c, ")");
    }

    public eq6() {
        this(null, false, false);
    }
}
