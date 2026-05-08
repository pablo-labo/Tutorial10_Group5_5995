package defpackage;

import java.util.function.Function;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class woe implements Function {
    public final /* synthetic */ zoe a;
    public final /* synthetic */ g b;

    public /* synthetic */ woe(zoe zoeVar, g gVar) {
        this.a = zoeVar;
        this.b = gVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        g gVar = this.b;
        String str = (String) obj;
        ClassLoader classLoader = this.a.a;
        try {
            return l62.a(classLoader, zoe.v(gVar));
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder(str);
            for (int iLastIndexOf = str.lastIndexOf(46); iLastIndexOf != -1; iLastIndexOf = str.lastIndexOf(46, iLastIndexOf - 1)) {
                sb.setCharAt(iLastIndexOf, '$');
                try {
                    return l62.a(classLoader, sb.toString());
                } catch (ClassNotFoundException unused2) {
                }
            }
            return zoe.u;
        }
    }
}
