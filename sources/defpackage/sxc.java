package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class sxc {
    public final a<String, Pattern> a;

    public static class a<K, V> {
        public rxc a;
        public int b;
    }

    public sxc(int i) {
        a<String, Pattern> aVar = new a<>();
        aVar.b = i;
        aVar.a = new rxc(aVar, akb.a(i, 4, 3, 1));
        this.a = aVar;
    }

    public final Pattern a(String str) {
        Object obj;
        a<String, Pattern> aVar = this.a;
        synchronized (aVar) {
            obj = aVar.a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        a<String, Pattern> aVar2 = this.a;
        synchronized (aVar2) {
            aVar2.a.put(str, patternCompile);
        }
        return patternCompile;
    }
}
