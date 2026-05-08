package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kn2 implements oyd {
    public final Object a;
    public final Object b;

    public kn2(Function1 function1) {
        this.a = function1;
        this.b = new ConcurrentHashMap();
    }

    @Override // defpackage.oyd
    public int D(int i) {
        do {
            i = ((e1h) this.b).i(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    public Object a(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ((Function1) this.a).invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }

    @Override // defpackage.oyd
    public int l(int i) {
        CharSequence charSequence = (CharSequence) this.a;
        do {
            i = ((e1h) this.b).h(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.oyd
    public int q(int i) {
        do {
            i = ((e1h) this.b).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i)));
        return i;
    }

    @Override // defpackage.oyd
    public int r(int i) {
        do {
            i = ((e1h) this.b).h(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    public kn2(CharSequence charSequence, e1h e1hVar) {
        this.a = charSequence;
        this.b = e1hVar;
    }
}
