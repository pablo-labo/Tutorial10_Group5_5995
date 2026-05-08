package defpackage;

import android.util.Base64;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class atf {
    public abstract String a();

    public abstract byte[] b();

    public abstract jnb c();

    public final v31 d(jnb jnbVar) {
        String strA = a();
        if (strA == null) {
            ja.k("Null backendName");
            return null;
        }
        if (jnbVar != null) {
            return new v31(strA, b(), jnbVar);
        }
        ja.k("Null priority");
        return null;
    }

    public final String toString() {
        String strA = a();
        jnb jnbVarC = c();
        String strEncodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strA);
        sb.append(", ");
        sb.append(jnbVarC);
        sb.append(", ");
        return l6.i(sb, strEncodeToString, ")");
    }
}
